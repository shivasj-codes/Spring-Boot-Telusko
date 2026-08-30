/**
 * ============================================================
 * JAVA LITERALS
 * ============================================================
 *
 * A literal is a fixed value that is directly written in
 * the Java source code.
 *
 * Examples:
 *
 *     int num = 9;
 *
 * Here:
 *     int -> data type
 *     num -> variable
 *     9   -> literal
 *
 * The value 9 is called a literal because it is the actual
 * value written directly in the code.
 *
 *
 * ============================================================
 * 1. INTEGER LITERALS
 * ============================================================
 *
 * Integer literals are whole-number values.
 *
 * Examples:
 *
 *     int num1 = 9;
 *     int num2 = 100;
 *     int num3 = 345678;
 *
 * The value must be within the range supported by the selected data type.
 *
 *
 * ============================================================
 * 2. DECIMAL INTEGER LITERALS
 * ============================================================
 *
 * Normal integer numbers are written using the decimal number system.
 *
 * Decimal numbers use BASE 10.
 *
 * Examples:
 *
 *     9
 *     100
 *     5000
 *
 * These are decimal literals.
 *
 *
 * ============================================================
 * 3. BINARY LITERALS
 * ============================================================
 *
 * Java allows us to write integer values in binary format.
 *
 * Binary uses BASE 2.
 *
 * To specify a binary literal, use:
 *
 *     0b
 *
 * or:
 *
 *     0B
 *
 * Example:
 *
 *     int num1 = 0b101;
 *
 * Binary:
 *
 *     101
 *
 * Decimal equivalent:
 *
 *     5
 *
 * Example:
 *
 *     System.out.println(num1);
 *
 * Output:
 *
 *     5
 *
 *
 * ============================================================
 * 4. HEXADECIMAL LITERALS
 * ============================================================
 *
 * Java also allows integer values to be written in
 * hexadecimal format.
 *
 * Hexadecimal uses BASE 16.
 *
 * To specify a hexadecimal literal, use:
 *
 *     0x
 *
 * or:
 *
 *     0X
 *
 * Example:
 *
 *     int num1 = 0x7E;
 *
 * Hexadecimal digits can contain:
 *
 *     0 - 9
 *     A - F
 *
 * Example:
 *
 *     0x7E
 *
 * Decimal equivalent:
 *
 *     126
 *
 *
 * ============================================================
 * 5. UNDERSCORE IN NUMERIC LITERALS
 * ============================================================
 *
 * Java allows underscores (_) to be placed between digits
 * in numeric literals.
 *
 * This makes large numbers easier to read and count.
 *
 * Example:
 *
 *     int num = 1_000_000;
 *
 * Instead of:
 *
 *     int num = 1000000;
 *
 * The underscore does not change the actual value.
 *
 *     1_000_000
 *
 * is the same value as:
 *
 *     1000000
 *
 * The underscore is mainly for better readability.
 *
 * Example:
 *
 *     long accountNumber = 345_678_945_678L;
 *
 * The output is still:
 *
 *     345678945678
 *
 *
 * ============================================================
 * 6. FLOATING-POINT LITERALS
 * ============================================================
 *
 * Floating-point literals are used for decimal values.
 *
 * Examples:
 *
 *     5.8
 *     56.5
 *     126.5678
 *
 * A decimal value such as 5.8 is treated as a double
 * by default in Java.
 *
 * Example:
 *
 *     double d = 5.8;
 *
 * This works because 5.8 is a double literal by default.
 *
 *
 * ============================================================
 * 7. INTEGER VALUE ASSIGNED TO DOUBLE
 * ============================================================
 *
 * An integer literal can be assigned to a double.
 *
 * Example:
 *
 *     double d = 56;
 *
 * Here:
 *
 *     56 -> integer literal
 *
 * Java automatically converts the integer value to double
 * when assigning it to the double variable.
 *
 *
 * ============================================================
 * 8. SCIENTIFIC NOTATION
 * ============================================================
 *
 * Java supports scientific notation using 'e' or 'E'.
 *
 * Example:
 *
 *     double num = 12e10;
 *
 * This represents:
 *
 *     12 × 10^10
 *
 * Java automatically represents the value according to the
 * floating-point representation.
 *
 * Scientific notation is useful when working with very
 * large or very small numbers.
 *
 *
 * ============================================================
 * 9. BOOLEAN LITERALS
 * ============================================================
 *
 * Boolean literals have only two possible values:
 *
 *     true
 *     false
 *
 * Examples:
 *
 *     boolean b1 = true;
 *     boolean b2 = false;
 *
 * IMPORTANT:
 *
 * Java does NOT use 1 and 0 as boolean values.
 *
 * Correct:
 *
 *     boolean b = true;
 *     boolean b = false;
 *
 * Incorrect:
 *
 *     boolean b = 1;     // ERROR
 *     boolean b = 0;     // ERROR
 *
 *
 * ============================================================
 * 10. CHARACTER LITERALS
 * ============================================================
 *
 * A character literal represents a single character.
 *
 * Character literals use SINGLE QUOTES.
 *
 * Example:
 *
 *     char c = 'a';
 *
 * Other examples:
 *
 *     char c1 = 'A';
 *     char c2 = '8';
 *
 * A character can also be a digit.
 *
 * IMPORTANT:
 *
 * A char stores only one character.
 *
 * Example:
 *
 *     char c = 'a';      // CORRECT
 *
 *
 * ============================================================
 * 11. CHARACTER AS A NUMBER
 * ============================================================
 *
 * In Java, a char can also participate in numeric operations.
 *
 * Example:
 *
 *     char c = 'a';
 *
 *     c++;
 *
 * After incrementing:
 *
 *     c becomes 'b'
 *
 * The ++ operation changes the character to the next
 * character value.
 *
 * Example:
 *
 *     char c = 'a';
 *     c++;
 *
 *     System.out.println(c);
 *
 * Output:
 *
 *     b
 *
 *
 * Another way:
 *
 *     c = c + 1;
 *
 * The character value is incremented by 1.
 *
 *
 * ============================================================
 * 12. STRING LITERALS
 * ============================================================
 *
 * Java also has String literals.
 *
 * A sequence of characters written inside double quotes
 * is a String literal.
 *
 * Example:
 *
 *     "Hello World"
 *
 * Example:
 *
 *     String message = "Hello World";
 *
 * Here:
 *
 *     "Hello World" -> String literal
 *
 * String literals use DOUBLE QUOTES.
 *
 *
 * ============================================================
 * 13. CHARACTER VS STRING LITERAL
 * ============================================================
 *
 * Character:
 *
 *     char c = 'a';
 *
 *     Single quotes
 *     One character
 *
 *
 * String:
 *
 *     String name = "Java";
 *
 *     Double quotes
 *     Sequence of characters
 *
 *
 * Remember:
 *
 *     'a'      -> Character literal
 *     "a"      -> String literal
 *     "Java"   -> String literal
 *
 *
 * ============================================================
 * 14. IMPORTANT LITERAL TYPES
 * ============================================================
 *
 * Integer literals:
 *
 *     9
 *     100
 *     0b101
 *     0x7E
 *
 * Floating-point literals:
 *
 *     5.8
 *     12e10
 *
 * Character literals:
 *
 *     'a'
 *     '8'
 *
 * Boolean literals:
 *
 *     true
 *     false
 *
 * String literals:
 *
 *     "Hello World"
 *
 *
 * ============================================================
 * 15. QUICK COMPARISON
 * ============================================================
 *
 *     Literal Type       Example
 *
 *     Integer            9
 *     Binary             0b101
 *     Hexadecimal        0x7E
 *     Decimal            5.8
 *     Scientific         12e10
 *     Character          'a'
 *     Boolean            true
 *     String             "Hello World"
 *
 *
 * ============================================================
 * 16. KEY POINTS TO REMEMBER
 * ============================================================
 *
 * 1. A literal is a fixed value written directly in
 *    Java source code.
 *
 * 2. Normal integer literals use the decimal system (base 10).
 *
 * 3. Binary literals use the 0b or 0B prefix.
 *
 * 4. Hexadecimal literals use the 0x or 0X prefix.
 *
 * 5. Underscores can be used to make large numeric literals
 *    easier to read.
 *
 * 6. Underscores do not change the actual numeric value.
 *
 * 7. Decimal floating-point values are double by default.
 *
 * 8. Scientific notation can be written using e or E.
 *
 * 9. Boolean literals are only true and false.
 *
 * 10. Java does not use 0 and 1 as boolean values.
 *
 * 11. Character literals use single quotes.
 *
 * 12. String literals use double quotes.
 *
 * 13. A char can participate in numeric operations.
 *
 * 14. Using c++ on a character moves it to the next
 *     character value.
 *
 *
 * ============================================================
 * QUICK SUMMARY
 * ============================================================
 *
 *     Literal
 *         -> A fixed value written directly in source code.
 *
 *     9
 *         -> Integer literal
 *
 *     0b101
 *         -> Binary literal
 *
 *     0x7E
 *         -> Hexadecimal literal
 *
 *     1_000_000
 *         -> Numeric literal with underscore for readability
 *
 *     5.8
 *         -> Double literal by default
 *
 *     12e10
 *         -> Scientific notation
 *
 *     'a'
 *         -> Character literal
 *
 *     true / false
 *         -> Boolean literals
 *
 *     "Hello World"
 *         -> String literal
 *
 * ============================================================
 */

public class hello {

	public static void main(String[] args) {
	int num1=0b101;
	System.out.println(num1);
	
	int num2=0x7E;
	System.out.println(num2);
	
	int num3=10_00_00_000;
	System.out.println(num3);
	
	float num4=56;
	System.out.println(num4);
	
	double num5=56;
	System.out.println(num5);
	
	double num6=12e10;
	System.out.println(num6);
	
	// boolean num7= 1;
	// System.out.println(num7);
	
	char c='a';
	System.out.println(c);
	c++;
	
	char c1='a';
	c1++;
	System.out.println(c1);
	}

}
