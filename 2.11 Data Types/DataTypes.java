/**
 * ============================================================
 * JAVA DATA TYPES - PRIMITIVE DATA TYPES
 * ============================================================
 *
 * A data type specifies what kind of data a variable can store.
 *
 * Example:
 *
 * int num = 9;
 *
 * Here:
 * int -> data type
 * num -> variable name
 * 9 -> value
 *
 *
 * ============================================================
 * 1. CATEGORIES OF DATA TYPES
 * ============================================================
 *
 * Java data types can be broadly divided into two categories:
 *
 * 1. Primitive Data Types
 * 2. Non-Primitive Data Types
 *
 * Primitive data types are the basic, built-in data types provided by Java.
 *
 *
 * Primitive data types are commonly used to store:
 *
 * - Integer numbers
 * - Decimal numbers
 * - Characters
 * - True/False values
 *
 *
 * ============================================================
 * 2. PRIMITIVE DATA TYPES
 * ============================================================
 *
 * Java has 8 primitive data types:
 *
 * Integer Types:
 * byte
 * short
 * int
 * long
 *
 * Floating-Point Types:
 * float
 * double
 *
 * Character Type:
 * char
 *
 * Boolean Type:
 * boolean
 *
 *
 * ============================================================
 * 3. INTEGER DATA TYPES
 * ============================================================
 *
 * Integer types are used to store whole numbers.
 *
 * Examples:
 *
 * 10
 * 500
 * -25
 * 100000
 *
 * Java provides four integer data types:
 *
 * byte
 * short
 * int
 * long
 *
 *
 * ------------------------------------------------------------
 * BYTE
 * ------------------------------------------------------------
 *
 * byte uses 1 byte of memory.
 *
 * 1 byte = 8 bits
 *
 * Range:
 *
 * -2^7 to 2^7 - 1
 *
 * -128 to 127
 *
 * Example:
 *
 * byte by = 127;
 *
 * The value must be within the byte range.
 *
 * Example:
 *
 * byte by = 128; // ERROR
 *
 * 128 is outside the range of byte.
 *
 * Use byte when the value is small and fits within
 * the byte range.
 *
 *
 * ------------------------------------------------------------
 * SHORT
 * ------------------------------------------------------------
 *
 * short uses 2 bytes of memory.
 *
 * 2 bytes = 16 bits
 *
 * Range:
 *
 * -2^15 to 2^15 - 1
 *
 * Example:
 *
 * short sh = 558;
 *
 * short can store a larger range than byte but a smaller
 * range than int.
 *
 *
 * ------------------------------------------------------------
 * INT
 * ------------------------------------------------------------
 *
 * int uses 4 bytes of memory.
 *
 * 4 bytes = 32 bits
 *
 * Range:
 *
 * -2^31 to 2^31 - 1
 *
 * Example:
 *
 * int num1 = 9;
 *
 * int is commonly used when working with normal whole numbers.
 *
 *
 * ------------------------------------------------------------
 * LONG
 * ------------------------------------------------------------
 *
 * long uses 8 bytes of memory.
 *
 * 8 bytes = 64 bits
 *
 * Range:
 *
 * -2^63 to 2^63 - 1
 *
 * Example:
 *
 * long l = 58541L;
 *
 * The 'L' suffix can be used to explicitly indicate that
 * the number is a long value.
 *
 *
 * ============================================================
 * 4. INTEGER DATA TYPES - QUICK COMPARISON
 * ============================================================
 *
 * byte -> 1 byte -> -2^7 to 2^7 - 1
 * short -> 2 bytes -> -2^15 to 2^15 - 1
 * int -> 4 bytes -> -2^31 to 2^31 - 1
 * long -> 8 bytes -> -2^63 to 2^63 - 1
 *
 *
 * Remember:
 *
 * More bytes -> Larger range
 *
 *
 * ============================================================
 * 5. FLOATING-POINT DATA TYPES
 * ============================================================
 *
 * Floating-point types are used to store decimal values.
 *
 * Examples:
 *
 * 5.8
 * 6.5
 * 126.5678
 *
 * Java provides two floating-point data types:
 *
 * float
 * double
 *
 *
 * ------------------------------------------------------------
 * FLOAT
 * ------------------------------------------------------------
 *
 * float uses 4 bytes of memory.
 *
 * float is useful when you need decimal values with
 * limited precision.
 *
 * Example:
 *
 * float f = 5.8f;
 *
 * IMPORTANT:
 *
 * A decimal value such as 5.8 is treated as a double
 * by default in Java.
 *
 * Therefore:
 *
 * float f = 5.8; // ERROR
 *
 * We explicitly add 'f':
 *
 * float f = 5.8f; // CORRECT
 *
 *
 * ------------------------------------------------------------
 * DOUBLE
 * ------------------------------------------------------------
 *
 * double uses 8 bytes of memory.
 *
 * double provides more precision than float.
 *
 * Example:
 *
 * double d = 5.8;
 *
 * Decimal values are treated as double by default.
 *
 * Therefore this works:
 *
 * double d = 5.8;
 *
 * No 'd' is required.
 *
 *
 * ============================================================
 * 6. FLOAT VS DOUBLE
 * ============================================================
 *
 * float -> 4 bytes
 * double -> 8 bytes
 *
 * float:
 * - Uses less memory
 * - Has less precision
 *
 * double:
 * - Uses more memory
 * - Provides more precision
 * - Is the default type for decimal values in Java
 *
 *
 * Example:
 *
 * float f = 5.8f;
 * double d = 5.8;
 *
 *
 * ============================================================
 * 7. CHARACTER - char
 * ============================================================
 *
 * char is used to store a single character.
 *
 * Example:
 *
 * char c = 'k';
 *
 * A char uses 2 bytes of memory.
 *
 * 2 bytes = 16 bits
 *
 * Java uses Unicode for characters.
 *
 * Unicode allows Java to represent characters from
 * many languages around the world.
 *
 *
 * IMPORTANT:
 *
 * char uses SINGLE QUOTES:
 *
 * char c = 'k'; // CORRECT
 *
 * Double quotes are used for Strings:
 *
 * "k" // String
 *
 * Therefore:
 *
 * char c = "k"; // ERROR
 *
 *
 * A char stores only ONE character.
 *
 * Examples:
 *
 * char c1 = 'A';
 * char c2 = 'k';
 * char c3 = '8';
 *
 * A digit can also be stored as a character.
 *
 *
 * ============================================================
 * 8. BOOLEAN
 * ============================================================
 *
 * boolean is used to represent a true or false condition.
 *
 * It can have only two values:
 *
 * true
 * false
 *
 * Example:
 *
 * boolean b = true;
 *
 * Another example:
 *
 * boolean isJavaEasy = false;
 *
 *
 * IMPORTANT:
 *
 * Java does NOT use 0 and 1 as boolean values.
 *
 * In Java:
 *
 * true -> true
 * false -> false
 *
 * Do not use:
 *
 * boolean b = 1; // ERROR
 * boolean b = 0; // ERROR
 *
 *
 * Boolean values are commonly used with conditions.
 *
 *
 * ============================================================
 * 9. COMPLETE EXAMPLE
 * ============================================================
 *
 * int num1 = 9;
 *
 * byte by = 127;
 *
 * short sh = 558;
 *
 * long l = 58541L;
 *
 * float f = 5.8f;
 *
 * double d = 5.8;
 *
 * char c = 'k';
 *
 * boolean b = true;
 *
 *
 * ============================================================
 * 10. IMPORTANT SUFFIXES
 * ============================================================
 *
 * Some values can require a suffix to specify their type.
 *
 * Long:
 *
 * long l = 58541L;
 *
 * Float:
 *
 * float f = 5.8f;
 *
 * Double:
 *
 * double d = 5.8;
 *
 * For decimal values:
 *
 * 5.8 -> double by default
 * 5.8f -> float
 *
 *
 * ============================================================
 * 11. EASY WAY TO REMEMBER
 * ============================================================
 *
 * Integer:
 *
 * byte -> short -> int -> long
 *
 * Small --------------------> Large
 *
 *
 * Decimal:
 *
 * float -> double
 *
 * Less precision -----------> More precision
 *
 *
 * Character:
 *
 * char -> one character
 *
 *
 * Boolean:
 *
 * boolean -> true / false
 *
 *
 * ============================================================
 * 12. KEY POINTS TO REMEMBER
 * ============================================================
 *
 * 1. Java has 8 primitive data types.
 *
 * 2. Integer types:
 *
 * byte, short, int, long
 *
 * 3. Floating-point types:
 *
 * float, double
 *
 * 4. Character type:
 *
 * char
 *
 * 5. Boolean type:
 *
 * boolean
 *
 * 6. int uses 4 bytes.
 *
 * 7. long uses 8 bytes.
 *
 * 8. short uses 2 bytes.
 *
 * 9. byte uses 1 byte.
 *
 * 10. float uses 4 bytes.
 *
 * 11. double uses 8 bytes.
 *
 * 12. char uses 2 bytes.
 *
 * 13. Decimal values are double by default.
 *
 * 14. Use 'f' to explicitly specify a float value.
 *
 * 15. Use 'L' to explicitly specify a long value.
 *
 * 16. char uses single quotes.
 *
 * 17. String values use double quotes.
 *
 * 18. boolean accepts only true or false.
 *
 *
 * ============================================================
 * 13. ONE-LINE SUMMARY
 * ============================================================
 *
 * byte -> Small integer
 * short -> Integer larger than byte
 * int -> Normal integer
 * long -> Large integer
 * float -> Decimal with less precision
 * double -> Decimal with more precision
 * char -> Single character
 * boolean -> true or false
 *
 * ============================================================
 */

public class DataTypes {

	public static void main(String[] args) {
		int num1 = 9;
		byte by = 127;
		short sh = 558;
		long l = 5854l;

		float f = 5.8f;
		double d = 5.8;

		char c = 'k';

		boolean b = true;

		System.out.println(num1);
		System.out.println(by);
		System.out.println(sh);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(b);

	}

}