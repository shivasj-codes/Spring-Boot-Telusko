/**
 * ============================================================
 * TYPE CONVERSION, TYPE CASTING & TYPE PROMOTION
 * ============================================================
 *
 * Every variable in Java has:
 *
 *     1. A name
 *     2. A data type
 *     3. A value
 *
 * Examples:
 *
 *     int a = 256;
 *     byte b = 12;
 *
 * Here:
 *
 *     int / byte -> Data type
 *     a / b     -> Variable name
 *     256 / 12  -> Value
 *
 *
 * ============================================================
 * 1. CAN WE CHANGE THE TYPE OF A VARIABLE?
 * ============================================================
 *
 * Once a variable is declared with a particular data type,
 * its type cannot be changed.
 *
 * Example:
 *
 *     int a = 10;
 *
 * 'a' will remain an int variable.
 *
 * We cannot change 'a' itself from int to byte.
 *
 * However, we can assign the value of one variable to
 * another variable of a different type, depending on whether
 * the conversion is allowed.
 *
 *
 * ============================================================
 * 2. WIDENING CONVERSION
 * ============================================================
 *
 * Widening conversion happens when a value of a smaller
 * data type is assigned to a larger data type.
 *
 * Example:
 *
 *     byte b = 12;
 *     int a = b;
 *
 * This works because byte has a smaller range and int has
 * a larger range.
 *
 * Concept:
 *
 *     byte  -> int
 *     Small -> Larger
 *
 * Java can perform this conversion automatically.
 *
 * This is called:
 *
 *     Implicit Conversion
 *
 *
 * ============================================================
 * 3. NARROWING CONVERSION
 * ============================================================
 *
 * Narrowing conversion happens when we try to convert a
 * value from a larger data type to a smaller data type.
 *
 * Example:
 *
 *     int a = 12;
 *     byte b = a;       // ERROR
 *
 * Even though 12 can fit inside byte, Java does not
 * automatically convert the int variable to byte.
 *
 * Why?
 *
 * The compiler only knows that 'a' is an int.
 * It cannot assume that the value will always fit
 * inside the smaller byte range.
 *
 * Therefore, explicit conversion is required.
 *
 *
 * ============================================================
 * 4. TYPE CASTING
 * ============================================================
 *
 * Type casting means explicitly converting a value from
 * one data type to another data type.
 *
 * Syntax:
 *
 *     targetType variable = (targetType) value;
 *
 * Example:
 *
 *     int a = 12;
 *     byte b = (byte) a;
 *
 * Here:
 *
 *     (byte)
 *         -> Explicitly tells Java to convert the value
 *            into byte.
 *
 * This is called:
 *
 *     Type Casting
 *
 *
 * ============================================================
 * 5. IMPLICIT CONVERSION VS EXPLICIT CASTING
 * ============================================================
 *
 * Implicit Conversion:
 *
 *     Java performs the conversion automatically.
 *
 * Example:
 *
 *     byte b = 12;
 *     int a = b;
 *
 *
 * Explicit Casting:
 *
 *     Programmer explicitly tells Java to perform
 *     the conversion.
 *
 * Example:
 *
 *     int a = 12;
 *     byte b = (byte) a;
 *
 *
 * Remember:
 *
 *     Automatic conversion -> Conversion
 *     Explicit conversion  -> Casting
 *
 *
 * ============================================================
 * 6. CASTING AN INTEGER TO BYTE
 * ============================================================
 *
 * Example:
 *
 *     int a = 12;
 *     byte b = (byte) a;
 *
 * Output:
 *
 *     12
 *
 * This works because 12 is within the byte range.
 *
 * byte range:
 *
 *     -128 to 127
 *
 *
 * ============================================================
 * 7. WHAT HAPPENS WHEN THE VALUE IS OUT OF RANGE?
 * ============================================================
 *
 * Consider:
 *
 *     int a = 257;
 *     byte b = (byte) a;
 *
 * 257 is outside the byte range.
 *
 * byte has a total of 256 possible values:
 *
 *     -128 to 127
 *
 * When the integer value is cast to byte, the value
 * wraps around based on the byte range.
 *
 * 257 % 256 = 1
 *
 * Therefore:
 *
 *     b = 1
 *
 * Example:
 *
 *     int a = 257;
 *     byte b = (byte) a;
 *
 *     System.out.println(b);
 *
 * Output:
 *
 *     1
 *
 *
 * ============================================================
 * 8. CASTING FLOAT TO INT
 * ============================================================
 *
 * A floating-point value can also be explicitly converted
 * to an integer.
 *
 * Example:
 *
 *     float f = 5.6f;
 *     int x = (int) f;
 *
 * Output:
 *
 *     5
 *
 * The decimal part is lost during the conversion.
 *
 *     5.6
 *      ↓
 *      5
 *
 * IMPORTANT:
 *
 * Casting a floating-point value to an integer does not
 * round the value.
 *
 * The fractional part is discarded.
 *
 *
 * ============================================================
 * 9. EXAMPLE OF FLOAT CASTING
 * ============================================================
 *
 *     float f = 5.6f;
 *
 *     int x = (int) f;
 *
 *     System.out.println(x);
 *
 * Output:
 *
 *     5
 *
 * The '.6' is lost.
 *
 *
 * ============================================================
 * 10. NOT EVERY DATA TYPE CAN BE CONVERTED
 * ============================================================
 *
 * Type conversion is not possible between every pair
 * of data types.
 *
 * Example:
 *
 *     char
 *     boolean
 *
 * These cannot be freely converted into each other.
 *
 * boolean only represents:
 *
 *     true
 *     false
 *
 * It cannot be converted into a character or integer
 * using normal numeric casting rules.
 *
 *
 * ============================================================
 * 11. INTEGER TYPES AND FLOATING-POINT TYPES
 * ============================================================
 *
 * Numeric types can participate in many conversions.
 *
 * Integer types:
 *
 *     byte
 *     short
 *     int
 *     long
 *
 * Floating-point types:
 *
 *     float
 *     double
 *
 * Depending on the direction of conversion, Java may
 * perform the conversion automatically or require
 * explicit casting.
 *
 *
 * ============================================================
 * 12. JAVA SINGLE-FILE SOURCE-CODE EXECUTION
 * ============================================================
 *
 * Normally, Java development involves two steps:
 *
 *     1. Compile
 *     2. Run
 *
 * Traditional approach:
 *
 *     javac Hello.java
 *     java Hello
 *
 * The first command compiles the source code.
 *
 * The second command runs the compiled class.
 *
 *
 * Java also provides a single-file source-code mode.
 *
 * Example:
 *
 *     java Hello.java
 *
 * This allows a single Java source file to be launched
 * directly without separately typing the compile command.
 *
 * NOTE:
 *
 * This is mainly useful for learning and simple
 * single-file programs.
 *
 * For larger projects, normal project build tools and
 * compilation workflows are used.
 *
 *
 * ============================================================
 * 13. TYPE PROMOTION
 * ============================================================
 *
 * Type promotion occurs when Java automatically promotes
 * smaller data types to a larger type during an operation.
 *
 * Example:
 *
 *     byte a = 10;
 *     byte b = 30;
 *
 *     int result = a * b;
 *
 * The multiplication is performed after the byte values
 * are promoted to int.
 *
 *     10 * 30 = 300
 *
 * The result is an int.
 *
 *
 * ============================================================
 * 14. WHY DOES TYPE PROMOTION HAPPEN?
 * ============================================================
 *
 * Consider:
 *
 *     byte a = 10;
 *     byte b = 30;
 *
 *     int result = a * b;
 *
 * The result is:
 *
 *     300
 *
 * But 300 cannot be stored in a byte because byte has
 * the range:
 *
 *     -128 to 127
 *
 * Java therefore promotes the values involved in the
 * arithmetic operation to int.
 *
 * So:
 *
 *     byte * byte
 *           ↓
 *         int
 *
 *
 * ============================================================
 * 15. TYPE PROMOTION EXAMPLE
 * ============================================================
 *
 *     byte a = 10;
 *     byte b = 30;
 *
 *     int result = a * b;
 *
 *     System.out.println(result);
 *
 * Output:
 *
 *     300
 *
 * Here:
 *
 *     a      -> byte
 *     b      -> byte
 *     a * b  -> int
 *     result -> int
 *
 *
 * ============================================================
 * 16. CONVERSION VS CASTING VS PROMOTION
 * ============================================================
 *
 * Conversion:
 *
 *     Changing a value from one type to another.
 *
 *
 * Implicit Conversion:
 *
 *     Java performs the conversion automatically.
 *
 * Example:
 *
 *     byte b = 10;
 *     int a = b;
 *
 *
 * Type Casting:
 *
 *     Programmer explicitly performs the conversion.
 *
 * Example:
 *
 *     int a = 12;
 *     byte b = (byte) a;
 *
 *
 * Type Promotion:
 *
 *     Java automatically promotes smaller types to a
 *     larger type during certain operations.
 *
 * Example:
 *
 *     byte a = 10;
 *     byte b = 30;
 *     int result = a * b;
 *
 *
 * ============================================================
 * 17. IMPORTANT EXAMPLES
 * ============================================================
 *
 * Widening / Implicit Conversion:
 *
 *     byte b = 12;
 *     int a = b;
 *
 *
 * Narrowing / Casting:
 *
 *     int a = 12;
 *     byte b = (byte) a;
 *
 *
 * Out-of-range Casting:
 *
 *     int a = 257;
 *     byte b = (byte) a;
 *
 *     // b becomes 1
 *
 *
 * Floating-Point Casting:
 *
 *     float f = 5.6f;
 *     int x = (int) f;
 *
 *     // x becomes 5
 *
 *
 * Type Promotion:
 *
 *     byte a = 10;
 *     byte b = 30;
 *     int result = a * b;
 *
 *     // result = 300
 *
 *
 * ============================================================
 * 18. EASY WAY TO REMEMBER
 * ============================================================
 *
 * Widening:
 *
 *     Small type
 *          ↓
 *     Larger type
 *
 *     byte -> int
 *
 *     Usually automatic.
 *
 *
 * Narrowing:
 *
 *     Larger type
 *          ↓
 *     Smaller type
 *
 *     int -> byte
 *
 *     Requires explicit casting.
 *
 *
 * Type Casting:
 *
 *     (targetType) value
 *
 * Example:
 *
 *     byte b = (byte) a;
 *
 *
 * Type Promotion:
 *
 *     Smaller types
 *          ↓
 *       Operation
 *          ↓
 *       Larger type
 *
 *
 * ============================================================
 * 19. KEY POINTS TO REMEMBER
 * ============================================================
 *
 * 1. A variable's declared type cannot be changed.
 *
 * 2. A value can sometimes be converted from one data type
 *    to another.
 *
 * 3. Widening conversion generally happens automatically.
 *
 * 4. Narrowing conversion generally requires explicit casting.
 *
 * 5. Casting uses parentheses before the value.
 *
 *        (byte) a
 *
 * 6. Casting a float to int removes the fractional part.
 *
 *        5.6 -> 5
 *
 * 7. Casting an out-of-range integer to byte can cause the
 *    value to wrap around.
 *
 *        257 -> 1
 *
 * 8. byte has a range of -128 to 127.
 *
 * 9. byte values are promoted to int during arithmetic
 *    operations.
 *
 * 10. Type promotion happens automatically during certain
 *     operations.
 *
 * 11. Conversion is automatic when Java performs the
 *     conversion for you.
 *
 * 12. Casting is explicit because the programmer tells Java
 *     to perform the conversion.
 *
 *
 * ============================================================
 * QUICK SUMMARY
 * ============================================================
 *
 *     Conversion
 *         -> Changing a value from one type to another.
 *
 *     Implicit Conversion
 *         -> Java performs the conversion automatically.
 *
 *     Type Casting
 *         -> Programmer explicitly performs the conversion.
 *
 *     Widening
 *         -> Smaller type to larger type.
 *
 *     Narrowing
 *         -> Larger type to smaller type.
 *
 *     Type Promotion
 *         -> Smaller numeric types are promoted during
 *            certain operations.
 *
 *     Example:
 *
 *         byte b = 12;
 *         int a = b;
 *
 *         int x = (int) 5.6f;
 *
 *         byte n = (byte) 257;
 *
 *         byte p = 10;
 *         byte q = 30;
 *         int result = p * q;
 *
 * ============================================================
 */

public class TypeConversion {

	public static void main(String[] args) {
		byte b=127;
		int a=b;
		System.out.println(b);
		System.out.println(a);
		
		byte b1=125;
		int a0=b1;
		System.out.println(b1);
		System.out.println(a0);
		
		int aa=257;
		byte k=(byte)aa;
		
		float f=5.6f;
		int t=(int)f;
		
		int a2=2567;
		byte b2=(byte)a;
		System.out.println(k);
		
		byte a3=10;
		byte b4=20;
		int g=a*b;
		System.out.println(g);
	
	}

}
