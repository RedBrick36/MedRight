/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.redbrick.medright;

import java.awt.*;
import java.io.*;
import java.nio.file.*;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;
import java.sql.*;
import java.time.*;
import java.time.temporal.*;
import java.util.logging.*;
import javax.swing.*;

/**
 *
 * @author RedBrick
 */
public class DatabaseOps {

    private static Connection con;
    private static DatabaseMetaData dbmd;
    private static ResultSet rs;

    public static void getStateOfDatabase (Connection con) throws
            SQLException {
        try {
            UIManager.setLookAndFeel (
                    "javax.swing.plaf.metal.MetalLookAndFeel");
        }
        catch ( ClassNotFoundException | InstantiationException |
                IllegalAccessException |
                javax.swing.UnsupportedLookAndFeelException ex ) {
            java.util.logging.Logger.getLogger (SetUserTimesGUI.class.
                    getName ()).
                    log (java.util.logging.Level.SEVERE,
                         null,
                         ex);
        }
        CallableStatement state;
        try {
            state = con.prepareCall ("SELECT * from APP.TREATMENTS");
            state.execute ();
            dbmd = con.getMetaData ();
            rs = dbmd.getTables (null,
                                 "APPS",
                                 "TREATMENTS",
                                 null);
            while ( rs.next () ) {
                int uuid = rs.getInt (1);
                String type = rs.getString (2);
                String name = rs.getString (3);
                String condition = rs.getString (4);
                double dose = rs.getDouble (5);
                String measure = rs.getString (6);
                boolean reminder = rs.getBoolean (7);
                boolean monday = rs.getBoolean (8);
                boolean tuesday = rs.getBoolean (9);
                boolean wednesday = rs.getBoolean (10);
                boolean thursday = rs.getBoolean (11);
                boolean friday = rs.getBoolean (12);
                boolean saturday = rs.getBoolean (13);
                boolean sunday = rs.getBoolean (14);
                boolean am = rs.getBoolean (15);
                boolean midam = rs.getBoolean (16);
                boolean noon = rs.getBoolean (17);
                boolean midaft = rs.getBoolean (18);
                boolean afternoon = rs.getBoolean (19);
                boolean evening = rs.getBoolean (20);
                boolean bedtime = rs.getBoolean (21);
                boolean midofnight = rs.getBoolean (22);
                boolean allDays = rs.getBoolean (23);
                boolean allTimes = rs.getBoolean (24);
                boolean asNeeded = rs.getBoolean (25);
                int leadTime = rs.getInt (26);
                String otf = rs.getString (27);
                System.out.println (uuid + ", " + type + ", " + name
                        + ", " + condition + ", " + dose + ", "
                        + measure + ", " + reminder + ", " + monday
                        + ", " + tuesday + ", " + wednesday + ", "
                        + thursday + ", " + friday + ", " + saturday
                        + ", " + sunday + ", " + am + ", " + midam
                        + ", " + noon + ", " + midaft + ", "
                        + afternoon + ", " + evening + ", " + bedtime
                        + ", " + midofnight + ", " + allDays + ", "
                        + allTimes + ", " + asNeeded + ", " + leadTime
                        + ", " + otf + ", ");
                state.close ();
                rs.close ();
            }
        }
        catch ( SQLException err ) {
            System.out.println ("Error executing SQL: " + err.
                    getMessage ());
        }
        catch ( Exception err ) {
            System.out.println ("Other Error: " + err.getMessage ());
        }
    }
    private CallableStatement backup;
    private CallableStatement checkDB;
    private CallableStatement cs;
    private Path currentPath = null;
    private String filetime;
    private CallableStatement freeze;
    private Path newPath = null;
    private LocalDateTime now;
    private Statement statement;
    private boolean status;
    private CallableStatement unfreeze;

    public DatabaseOps () {

    }

    public boolean backupDatabase (Connection con) throws SQLException {

        try {
            this.freeze = con.prepareCall (
                    "CALL SYSCS_UTIL.SYSCS_FREEZE_DATABASE()");
            this.freeze.execute ();
            this.freeze.close ();

            this.backup = con.prepareCall (
                    "CALL SYSCS_UTIL.SYSCS_BACKUP_DATABASE(?)");
            this.backup.setString (1,
                                   "./DBaseBackups");
            this.backup.execute ();
            this.backup.close ();

            this.unfreeze = con.prepareCall (
                    "CALL SYSCS_UTIL.SYSCS_UNFREEZE_DATABASE()");
            this.unfreeze.execute ();
            this.unfreeze.close ();
        }
        catch ( SQLException err ) {
            System.out.println ("Error backing up database " + err.
                    getMessage ());
        }
        return true;
    }

    public boolean backupDatabaseTables (Connection con) throws
            SQLException {
        try {
            this.status = false;
            this.currentPath = Paths.get ("backup.db");
            this.status = Files.exists (this.currentPath);
            if ( this.status ) {

                this.now = LocalDateTime.now ();
                this.now = this.now.truncatedTo (ChronoUnit.MINUTES);
                this.filetime = this.now.toString ();
                this.newPath = Paths.get ("backup. " + this.filetime
                        + ".db");
                try {
                    Files.move (this.currentPath,
                                this.newPath,
                                REPLACE_EXISTING);
                    System.out.println (
                            "DBase Backup File Successfully Moved");
                }
                catch ( IOException ex ) {
                    Logger.getLogger (DatabaseOps.class.getName ()).
                            log (Level.SEVERE,
                                 null,
                                 ex);
                }
            }
            else {
                this.statement = con.createStatement ();
                this.status = this.statement.execute (
                        "CALL SYSCS_UTIL.SYSCS_EXPORT_TABLE(null,'TREATMENTS','./backup.db',null,null,null)");
                System.out.println (
                        "Database Table Backed Up Successfully.");
            }
        }
        catch ( SQLException err ) {
            System.out.println ("SQL Error: " + err.getMessage ());
        }
        this.statement.closeOnCompletion ();
        return this.status;
    }

    public boolean clearDatabaseTable (Connection con) throws
            SQLException {

        try {
            int rowsAffected;
            this.statement = con.createStatement ();
            rowsAffected = this.statement.executeUpdate (
                    "DELETE FROM TREATMENTS");
            System.out.println (
                    "Database Table Treatements Cleared Successfully.");

        }
        catch ( SQLException err ) {
            System.out.println ("SQL Error: " + err.getMessage ());
        }
        this.statement.closeOnCompletion ();
        return this.status;
    }

    public Connection createDatabaseConnection () throws
            ClassNotFoundException, InstantiationException,
            IllegalAccessException {

        try {
            UIManager.setLookAndFeel (
                    "javax.swing.plaf.metal.MetalLookAndFeel");
        }
        catch ( ClassNotFoundException | InstantiationException |
                IllegalAccessException |
                javax.swing.UnsupportedLookAndFeelException ex ) {
            java.util.logging.Logger.getLogger (SetUserTimesGUI.class.
                    getName ()).
                    log (java.util.logging.Level.SEVERE,
                         null,
                         ex);
        }
        try {
            Class.forName ("org.apache.derby.jdbc.EmbeddedDriver");
            JOptionPane.showMessageDialog (null,
                                           "Successfully located and instantiated Embedded Driver...    ");
        }
        catch ( ClassNotFoundException | HeadlessException err ) {
            JOptionPane.showMessageDialog (null,
                                           err);
        }
        try {
            con = DriverManager.getConnection (
                    "jdbc:derby:/Users/RedBrick/NetBeansProjects/MedRight/treatments;create=true;user=app;password=root");
            JOptionPane.showMessageDialog (null,
                                           "Successfully connected to DB...    ");
        }
        catch ( SQLException | HeadlessException err ) {
            System.out.println ("" + err.getMessage ());
        }
        return con;
    }

    public boolean createTableIfNecessary (Connection con) throws
            SQLException, InstantiationException,
            ClassNotFoundException, IllegalAccessException {
        try {
            dbmd = con.getMetaData ();
            rs = dbmd.getTables (null,
                                 "APPS",
                                 "TREATMENTS",
                                 null);
            if ( !rs.next () ) {
                System.out.println (
                        "Table already exists -- skipping creation of TREATMENTS table     ");
            }
            else {
                System.out.println (
                        "Table does not already exist. Creating it now.     ");
                this.cs = con.prepareCall (
                        "CREATE TABLE TREATMENTS (uuid INTEGER default 0 primary key, type VARCHAR(10), name VARCHAR(40), condition VARCHAR(45), dose DOUBLE default 0, measure VARCHAR(11), reminder BOOLEAN default false, monday BOOLEAN default false, tuesday BOOLEAN default false, wednesday BOOLEAN default false, thursday BOOLEAN default false, friday BOOLEAN default false, saturday BOOLEAN default false, sunday BOOLEAN default false, am BOOLEAN default false, midam BOOLEAN default false, noon BOOLEAN default false, midaft BOOLEAN default false, afternoon BOOLEAN default false, evening BOOLEAN default false, bedtime BOOLEAN default false, midofnight BOOLEAN default false, allDays BOOLEAN default false, allTimes BOOLEAN default false, asNeeded BOOLEAN default false, leadTime INTEGER default 0, otf VARCHAR(20))");
                this.cs.execute ();
                this.cs.close ();
                rs.close ();
            }
        }
        catch ( SQLException err ) {
            JOptionPane.showMessageDialog (null,
                                           err);
        }
        return true;
    }

    public boolean restoreDatabaseTable (Connection con) throws
            SQLException {

        try {
            this.statement = con.createStatement ();
            this.status = this.statement.execute (
                    "CALL SYSCS_UTIL.SYSCS_IMPORT_TABLE (null,'TREATMENTS','./backup.db',null,null,null,0)");
            System.out.println (
                    "Database Table Restored Successfully.");
        }
        catch ( SQLException err ) {
            System.out.println ("SQL Error: " + err.getMessage ());
        }
        this.statement.closeOnCompletion ();
        return this.status;
    }

    public boolean runDbaseChecks (Connection con) throws SQLException {

        try {
            this.checkDB = con.prepareCall (
                    "VALUES SYSCS_UTIL.SYSCS_CHECK_TABLE('APP', 'TREATMENTS')");
            this.checkDB.execute ();
            this.checkDB.close ();
            System.out.println (
                    "Table Treatements checked Successfully.");
        }
        catch ( SQLException err ) {
            System.out.println ("SQL Error: " + err.getMessage ());
        }
        return true;
    }
}
