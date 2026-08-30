/**
 * ============================================================
 * JAVA LOGICAL OPERATORS
 * ============================================================
 *
 * Logical operators are used to combine multiple conditions
 * and produce a single boolean result.
 *
 * A condition normally produces:
 *
 * true
 * false
 *
 * Logical operators allow us to combine these conditions.
 *
 * Example:
 *
 * x > y
 * a < b
 *
 * Each condition produces true or false.
 *
 * We can combine them using logical operators.
 *
 *
 * ============================================================
 * 1. TYPES OF LOGICAL OPERATORS
 * ============================================================
 *
 * Java provides three basic logical operations:
 *
 * AND
 * OR
 * NOT
 *
 *
 * Their operators are:
 *
 * && -> Logical AND
 * || -> Logical OR
 * ! -> Logical NOT
 *
 *
 * ============================================================
 * 2. LOGICAL AND (&&)
 * ============================================================
 *
 * AND is used when ALL conditions must be true.
 *
 * Example:
 *
 * condition1 && condition2
 *
 * The result is true only when BOTH conditions are true.
 *
 *
 * Truth Table:
 *
 * Condition 1 Condition 2 Result
 * --------------------------------------
 * true true true
 * true false false
 * false true false
 * false false false
 *
 *
 * Remember:
 *
 * AND -> Both must be true.
 *
 *
 * Example:
 *
 * int x = 7;
 * int y = 5;
 *
 * int a = 5;
 * int b = 9;
 *
 * boolean result = x > y && a > b;
 *
 * First condition:
 *
 * x > y
 * 7 > 5
 * true
 *
 * Second condition:
 *
 * a > b
 * 5 > 9
 * false
 *
 * Therefore:
 *
 * true && false
 * = false
 *
 *
 * ============================================================
 * 3. LOGICAL OR (||)
 * ============================================================
 *
 * OR is used when at least ONE condition must be true.
 *
 * Example:
 *
 * condition1 || condition2
 *
 * The result is false only when BOTH conditions are false.
 *
 *
 * Truth Table:
 *
 * Condition 1 Condition 2 Result
 * --------------------------------------
 * true true true
 * true false true
 * false true true
 * false false false
 *
 *
 * Remember:
 *
 * OR -> At least one must be true.
 *
 *
 * Example:
 *
 * int x = 7;
 * int y = 5;
 *
 * int a = 5;
 * int b = 9;
 *
 * boolean result = x > y || a > b;
 *
 * First condition:
 *
 * x > y
 * 7 > 5
 * true
 *
 * Second condition:
 *
 * a > b
 * 5 > 9
 * false
 *
 * Therefore:
 *
 * true || false
 * = true
 *
 *
 * ============================================================
 * 4. LOGICAL NOT (!)
 * ============================================================
 *
 * NOT is used to reverse a boolean value.
 *
 * true -> false
 * false -> true
 *
 * Example:
 *
 * boolean result = false;
 *
 * !result
 *
 * Result:
 *
 * true
 *
 *
 * Another example:
 *
 * boolean result = true;
 *
 * !result
 *
 * Result:
 *
 * false
 *
 *
 * Truth Table:
 *
 * Condition Result
 * -------------------
 * true false
 * false true
 *
 *
 * Remember:
 *
 * ! -> Reverse the boolean value.
 *
 *
 * ============================================================
 * 5. SHORT-CIRCUIT OPERATORS
 * ============================================================
 *
 * Java provides short-circuit versions of AND and OR:
 *
 * && -> Short-circuit AND
 * || -> Short-circuit OR
 *
 * These operators can avoid evaluating unnecessary
 * conditions.
 *
 *
 * ============================================================
 * 6. SHORT-CIRCUIT AND (&&)
 * ============================================================
 *
 * Consider:
 *
 * condition1 && condition2
 *
 * If condition1 is false, the final result must be false.
 *
 * Therefore Java does not need to check condition2.
 *
 * Example:
 *
 * false && condition2
 *
 * Result:
 *
 * false
 *
 * Since the first condition is already false, checking
 * the second condition cannot change the result.
 *
 * This is called SHORT-CIRCUIT evaluation.
 *
 *
 * Example:
 *
 * int x = 7;
 * int y = 5;
 *
 * boolean result = x < y && a > b;
 *
 * First condition:
 *
 * 7 < 5
 * false
 *
 * Because this is AND and the first condition is false,
 * Java can skip checking the second condition.
 *
 *
 * ============================================================
 * 7. SHORT-CIRCUIT OR (||)
 * ============================================================
 *
 * Consider:
 *
 * condition1 || condition2
 *
 * If condition1 is true, the final result must be true.
 *
 * Therefore Java does not need to check condition2.
 *
 * Example:
 *
 * true || condition2
 *
 * Result:
 *
 * true
 *
 * Since the first condition is already true, checking
 * the second condition cannot change the result.
 *
 * This is also called SHORT-CIRCUIT evaluation.
 *
 *
 * ============================================================
 * 8. WHY IS IT CALLED SHORT-CIRCUIT?
 * ============================================================
 *
 * Java can stop evaluating conditions as soon as the
 * final result is already known.
 *
 * For AND:
 *
 * false && anything
 *
 * -> false
 *
 * So Java can stop after finding false.
 *
 *
 * For OR:
 *
 * true || anything
 *
 * -> true
 *
 * So Java can stop after finding true.
 *
 *
 * This can save unnecessary computation.
 *
 *
 * ============================================================
 * 9. USING NOT WITH A BOOLEAN VARIABLE
 * ============================================================
 *
 * Example:
 *
 * boolean r = true;
 *
 * boolean s = !r;
 *
 * Since:
 *
 * r = true
 *
 * Therefore:
 *
 * !r = false
 *
 * So:
 *
 * s = false
 *
 *
 * Another example:
 *
 * boolean r = false;
 *
 * boolean s = !r;
 *
 * Result:
 *
 * s = true
 *
 *
 * ============================================================
 * 10. COMPLETE EXAMPLE
 * ============================================================
 *
 * int x = 7;
 * int y = 5;
 *
 * int a = 5;
 * int b = 9;
 *
 * boolean result;
 *
 *
 * AND:
 *
 * result = x > y && a > b;
 *
 * System.out.println(result);
 *
 * Output:
 *
 * false
 *
 *
 * OR:
 *
 * result = x > y || a > b;
 *
 * System.out.println(result);
 *
 * Output:
 *
 * true
 *
 *
 * NOT:
 *
 * result = !(a > b);
 *
 * Since:
 *
 * a > b
 * 5 > 9
 * false
 *
 * NOT reverses it:
 *
 * !false
 * = true
 *
 * Output:
 *
 * true
 *
 *
 * ============================================================
 * 11. LOGICAL OPERATORS - QUICK TABLE
 * ============================================================
 *
 * Operator Name Meaning
 *
 * && AND Both true
 * || OR At least one true
 * ! NOT Reverse the result
 *
 *
 * ============================================================
 * 12. AND VS OR
 * ============================================================
 *
 * AND:
 *
 * Both conditions must be true.
 *
 * true && true
 * = true
 *
 *
 * OR:
 *
 * At least one condition must be true.
 *
 * true || false
 * = true
 *
 *
 * Easy way to remember:
 *
 * AND -> ALL conditions must be true.
 *
 * OR -> ANY condition can be true.
 *
 *
 * ============================================================
 * 13. RELATIONAL + LOGICAL OPERATORS
 * ============================================================
 *
 * Relational operators create boolean conditions.
 *
 * Example:
 *
 * x > y
 *
 * Result:
 *
 * true / false
 *
 * Logical operators can then combine those conditions.
 *
 * Example:
 *
 * x > y && a > b
 *
 * Here:
 *
 * x > y -> Condition 1
 * a > b -> Condition 2
 *
 * && -> Combines both conditions
 *
 *
 * ============================================================
 * 14. MULTIPLE CONDITIONS
 * ============================================================
 *
 * More than two conditions can also be combined.
 *
 * Example:
 *
 * boolean result =
 * x > y && a > b && x != a;
 *
 * Multiple conditions can be connected using logical
 * operators.
 *
 * Similarly:
 *
 * boolean result =
 * x > y || a > b || x == a;
 *
 *
 * The number of conditions depends on the requirement.
 *
 *
 * ============================================================
 * 15. IMPORTANT DIFFERENCE
 * ============================================================
 *
 * Single operators:
 *
 * & -> Bitwise AND
 * | -> Bitwise OR
 *
 * Short-circuit logical operators:
 *
 * && -> Logical AND
 * || -> Logical OR
 *
 * For conditions, the commonly used operators are:
 *
 * &&
 * ||
 *
 * NOTE:
 *
 * The detailed difference between bitwise operators and
 * logical operators will be covered separately.
 *
 *
 * ============================================================
 * KEY POINTS TO REMEMBER
 * ============================================================
 *
 * 1. Logical operators are used to combine boolean
 * conditions.
 *
 * 2. && is the logical AND operator.
 *
 * 3. || is the logical OR operator.
 *
 * 4. ! is the logical NOT operator.
 *
 * 5. AND returns true only when both conditions are true.
 *
 * 6. OR returns true when at least one condition is true.
 *
 * 7. NOT reverses true to false and false to true.
 *
 * 8. && and || are short-circuit operators.
 *
 * 9. For &&, if the first condition is false, the second
 * condition may not be evaluated.
 *
 * 10. For ||, if the first condition is true, the second
 * condition may not be evaluated.
 *
 * 11. Relational operators produce boolean values.
 *
 * 12. Logical operators can combine those boolean values.
 *
 * 13. Logical operators are very important when working with
 * if-else statements and loops.
 *
 *
 * ============================================================
 * QUICK SUMMARY
 * ============================================================
 *
 * && -> AND
 * Both conditions must be true.
 *
 * || -> OR
 * At least one condition must be true.
 *
 * ! -> NOT
 * Reverses true/false.
 *
 *
 * Example:
 *
 * int x = 7;
 * int y = 5;
 *
 * boolean result = x > y && x != y;
 *
 * // true && true
 * // true
 *
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
