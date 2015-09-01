package org.redbrick.medright;

public enum TType {

/**
 * This enumeration data type definition declares the five options
 * available
 * for the "type" field in the Treatment class.
 *
 * By providing an enum in place of a simple String for type, we can
 * ensure
 * that only certain values are acceptable. It also allows for a
 * direct
 * comparison of value to a String variable without the use of
 * .equals(string2) being used in the expression
 *
 */

PILL, LIQUID, TOPICAL, INJECTION, SUPPLEMENT;
}
