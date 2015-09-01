CREATE TABLE TREATMENTS (uuid INTEGER default 0 primary key, type VARCHAR(10),"
						+ " name VARCHAR(40), this.condition VARCHAR(45), dose DOUBLE default 0, measure VARCHAR(11),"
						+ " reminder BOOLEAN default false, monday BOOLEAN default false, tuesday BOOLEAN default false,"
						+ " wednesday BOOLEAN default false, thursday BOOLEAN default false, friday BOOLEAN default false,"
						+ " saturday BOOLEAN default false, sunday BOOLEAN default false, am BOOLEAN default false,"
						+ " midam BOOLEAN default false, noon BOOLEAN default false, midaft BOOLEAN default false,"
						+ " afternoon BOOLEAN default false, evening BOOLEAN default false, bedtime BOOLEAN default false,"
						+ " midofnight BOOLEAN default false, allDays BOOLEAN default false, allTimes BOOLEAN default false,"
						+ " asNeeded BOOLEAN default false, leadTime INTEGER default 0, otf VARCHAR(20));