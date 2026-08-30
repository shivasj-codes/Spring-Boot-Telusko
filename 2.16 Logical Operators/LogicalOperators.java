/**
 * ============================================================
 * JAVA RELATIONAL OPERATORS
 * ============================================================
 *
 * Relational operators are used to compare two values.
 *
 * The result of a relational operation is always a boolean
 * value:
 *
 * true
 * false
 *
 * Example:
 *
 * 7 < 5
 *
 * Result:
 *
 * false
 *
 * Example:
 *
 * 5 < 6
 *
 * Result:
 *
 * true
 *
 *
 * ============================================================
 * 1. RELATIONAL OPERATORS
 * ============================================================
 *
 * Java provides the following relational operators:
 *
 * < Less than
 * > Greater than
 * == Equal to
 * != Not equal to
 * <= Less than or equal to
 * >= Greater than or equal to
 *
 *
 * ============================================================
 * 2. LESS THAN (<)
 * ============================================================
 *
 * The < operator checks whether the first value is less than
 * the second value.
 *
 * Example:
 *
 * 5 < 6
 *
 * Result:
 *
 * true
 *
 * Example:
 *
 * 6 < 5
 *
 * Result:
 *
 * false
 *
 *
 * ============================================================
 * 3. GREATER THAN (>)
 * ============================================================
 *
 * The > operator checks whether the first value is greater
 * than the second value.
 *
 * Example:
 *
 * 6 > 5
 *
 * Result:
 *
 * true
 *
 * Example:
 *
 * 5 > 6
 *
 * Result:
 *
 * false
 *
 *
 * ============================================================
 * 4. EQUAL TO (==)
 * ============================================================
 *
 * The == operator is used to compare two values.
 *
 * IMPORTANT:
 *
 * = -> Assignment operator
 * == -> Comparison operator
 *
 * Example:
 *
 * int x = 6;
 *
 * Here '=' assigns 6 to x.
 *
 * To check whether two values are equal:
 *
 * x == y
 *
 * Example:
 *
 * 6 == 6
 *
 * Result:
 *
 * true
 *
 * Example:
 *
 * 6 == 5
 *
 * Result:
 *
 * false
 *
 *
 * ============================================================
 * 5. NOT EQUAL TO (!=)
 * ============================================================
 *
 * The != operator checks whether two values are not equal.
 *
 * Example:
 *
 * 6 != 5
 *
 * Result:
 *
 * true
 *
 * Example:
 *
 * 6 != 6
 *
 * Result:
 *
 * false
 *
 * The ! symbol represents NOT in this operator.
 *
 *
 * ============================================================
 * 6. LESS THAN OR EQUAL TO (<=)
 * ============================================================
 *
 * The <= operator checks whether the first value is:
 *
 * 1. Less than the second value
 * OR
 * 2. Equal to the second value
 *
 * Example:
 *
 * 5 <= 6
 *
 * Result:
 *
 * true
 *
 * Example:
 *
 * 6 <= 6
 *
 * Result:
 *
 * true
 *
 * Example:
 *
 * 7 <= 6
 *
 * Result:
 *
 * false
 *
 *
 * ============================================================
 * 7. GREATER THAN OR EQUAL TO (>=)
 * ============================================================
 *
 * The >= operator checks whether the first value is:
 *
 * 1. Greater than the second value
 * OR
 * 2. Equal to the second value
 *
 * Example:
 *
 * 7 >= 6
 *
 * Result:
 *
 * true
 *
 * Example:
 *
 * 6 >= 6
 *
 * Result:
 *
 * true
 *
 * Example:
 *
 * 5 >= 6
 *
 * Result:
 *
 * false
 *
 *
 * ============================================================
 * 8. RELATIONAL OPERATORS - QUICK TABLE
 * ============================================================
 *
 * Operator Meaning
 *
 * < Less than
 * > Greater than
 * == Equal to
 * != Not equal to
 * <= Less than or equal to
 * >= Greater than or equal to
 *
 *
 * ============================================================
 * 9. RELATIONAL OPERATORS RETURN BOOLEAN
 * ============================================================
 *
 * Relational operators always produce a boolean result.
 *
 * Example:
 *
 * int x = 6;
 * int y = 5;
 *
 * boolean result = x < y;
 *
 * Since:
 *
 * 6 < 5
 *
 * is false:
 *
 * result = false;
 *
 *
 * Example:
 *
 * boolean result = x > y;
 *
 * Since:
 *
 * 6 > 5
 *
 * is true:
 *
 * result = true;
 *
 *
 * ============================================================
 * 10. USING RELATIONAL OPERATORS IN CODE
 * ============================================================
 *
 * Example:
 *
 * int x = 6;
 * int y = 5;
 *
 * boolean result = x < y;
 *
 * System.out.println(result);
 *
 * Output:
 *
 * false
 *
 *
 * Example:
 *
 * int x = 6;
 * int y = 5;
 *
 * boolean result = x > y;
 *
 * System.out.println(result);
 *
 * Output:
 *
 * true
 *
 *
 * ============================================================
 * 11. COMPARING EQUAL VALUES
 * ============================================================
 *
 * Example:
 *
 * int x = 6;
 * int y = 6;
 *
 * boolean result = x == y;
 *
 * Output:
 *
 * true
 *
 * If:
 *
 * int x = 6;
 * int y = 5;
 *
 * boolean result = x == y;
 *
 * Output:
 *
 * false
 *
 *
 * ============================================================
 * 12. COMPARING DOUBLE VALUES
 * ============================================================
 *
 * Relational operators can also be used with other
 * primitive numeric values such as double.
 *
 * Example:
 *
 * double x = 8.8;
 * double y = 9.8;
 *
 * boolean result = x <= y;
 *
 * Output:
 *
 * true
 *
 * Example:
 *
 * boolean result = x > y;
 *
 * Output:
 *
 * false
 *
 *
 * ============================================================
 * 13. ASSIGNMENT VS EQUALITY
 * ============================================================
 *
 * This is one of the most important things to remember.
 *
 *
 * Assignment:
 *
 * =
 *
 * Used to assign a value.
 *
 * Example:
 *
 * int x = 5;
 *
 *
 * Equality comparison:
 *
 * ==
 *
 * Used to compare two values.
 *
 * Example:
 *
 * x == 5
 *
 *
 * Remember:
 *
 * = -> Put/assign a value
 * == -> Compare two values
 *
 *
 * ============================================================
 * 14. RELATIONAL OPERATORS WITH TWO CONDITIONS
 * ============================================================
 *
 * Relational operators can be used to create individual
 * conditions.
 *
 * Example:
 *
 * int x = 8;
 * int y = 6;
 *
 * x < y
 *
 * This is one condition.
 *
 * Another condition can be:
 *
 * int a = 8;
 * int b = 6;
 *
 * a < b
 *
 * When we need to combine multiple conditions, Java provides
 * logical operators.
 *
 * Example:
 *
 * condition1 && condition2
 *
 * Logical operators are used to combine conditions.
 *
 * NOTE:
 *
 * The detailed use of logical operators is covered separately.
 *
 *
 * ============================================================
 * 15. WHY RELATIONAL OPERATORS ARE IMPORTANT
 * ============================================================
 *
 * Programs frequently need to compare values and make
 * decisions based on those comparisons.
 *
 * Examples:
 *
 * Is age greater than 18?
 * Is marks greater than or equal to 40?
 * Are two values equal?
 * Are two values different?
 *
 * Relational operators provide the comparison needed for
 * these types of conditions.
 *
 *
 * ============================================================
 * KEY POINTS TO REMEMBER
 * ============================================================
 *
 * 1. Relational operators are used to compare values.
 *
 * 2. The result of a relational operation is always
 * boolean:
 *
 * true
 * false
 *
 * 3. < means less than.
 *
 * 4. > means greater than.
 *
 * 5. == means equal to.
 *
 * 6. != means not equal to.
 *
 * 7. <= means less than or equal to.
 *
 * 8. >= means greater than or equal to.
 *
 * 9. '=' is an assignment operator.
 *
 * 10. '==' is a comparison operator.
 *
 * 11. Relational operators can be used with primitive
 * numeric values.
 *
 * 12. Relational operators are important for creating
 * conditions in programs.
 *
 *
 * ============================================================
 * QUICK SUMMARY
 * ============================================================
 *
 * < -> Less than
 * > -> Greater than
 * == -> Equal to
 * != -> Not equal to
 * <= -> Less than or equal to
 * >= -> Greater than or equal to
 *
 *
 * = -> Assignment
 * == -> Comparison
 *
 *
 * Example:
 *
 * int x = 6;
 * int y = 5;
 *
 * boolean result = x > y;
 *
 * System.out.println(result);
 *
 * Output:
 *
 * true
 *
 * ============================================================
 */

public class LogicalOperators {
	public static void main(String[] args) {
		int x = 7;
		int y = 5;
		int a = 5;
		int b = 9;

		// boolean result= x>y && a<b ;
		// boolean result= x>y || a<b ;
		// boolean result= x>y && a>b ;
		// boolean result= x>y || a>b ;
		// boolean result= x<y && a<b ;
		// boolean result= x<y || a<b ;
		// boolean result= x<y || a<b || a>1 ;

		// System.out.println(result);

		boolean result = a > b;
		System.out.println(!result);
	}

}
