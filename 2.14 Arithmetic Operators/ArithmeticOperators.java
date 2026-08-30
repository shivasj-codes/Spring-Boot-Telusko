/**
 * ============================================================
 * JAVA OPERATORS
 * ============================================================
 *
 * Operators are symbols used to perform operations on values
 * and variables.
 *
 * Examples:
 *
 *     +
 *     -
 *     *
 *     /
 *     %
 *
 * These operators can be used to perform arithmetic operations.
 *
 *
 * ============================================================
 * 1. ARITHMETIC OPERATORS
 * ============================================================
 *
 * Arithmetic operators are used to perform mathematical
 * operations.
 *
 * The basic arithmetic operators are:
 *
 *     +   -> Addition
 *     -   -> Subtraction
 *     *   -> Multiplication
 *     /   -> Division
 *     %   -> Modulus (Remainder)
 *
 *
 * Example:
 *
 *     int num1 = 7;
 *     int num2 = 5;
 *
 *
 * ------------------------------------------------------------
 * ADDITION
 * ------------------------------------------------------------
 *
 *     int result = num1 + num2;
 *
 *     7 + 5 = 12
 *
 *
 * ------------------------------------------------------------
 * SUBTRACTION
 * ------------------------------------------------------------
 *
 *     int result = num1 - num2;
 *
 *     7 - 5 = 2
 *
 *
 * ------------------------------------------------------------
 * MULTIPLICATION
 * ------------------------------------------------------------
 *
 *     int result = num1 * num2;
 *
 *     7 * 5 = 35
 *
 *
 * ------------------------------------------------------------
 * DIVISION
 * ------------------------------------------------------------
 *
 *     int result = num1 / num2;
 *
 *     7 / 5 = 1
 *
 * When two integers are divided, the result contains only
 * the integer quotient.
 *
 *
 * ------------------------------------------------------------
 * MODULUS
 * ------------------------------------------------------------
 *
 * The modulus operator (%) returns the remainder of a division.
 *
 *     int result = num1 % num2;
 *
 *     7 % 5 = 2
 *
 * When:
 *
 *     7 / 5
 *
 * Quotient:
 *
 *     1
 *
 * Remainder:
 *
 *     2
 *
 * Therefore:
 *
 *     /  -> Quotient
 *     %  -> Remainder
 *
 *
 * ============================================================
 * 2. ASSIGNMENT OPERATOR
 * ============================================================
 *
 * The assignment operator (=) is used to assign a value
 * to a variable.
 *
 * Example:
 *
 *     int num = 7;
 *
 * Here:
 *
 *     7 is assigned to num.
 *
 *
 * Assignment can also be used with an operation.
 *
 * Example:
 *
 *     int num = 7;
 *
 *     num = num + 2;
 *
 * The steps are:
 *
 *     num = 7 + 2;
 *     num = 9;
 *
 *
 * ============================================================
 * 3. COMPOUND ASSIGNMENT OPERATORS
 * ============================================================
 *
 * Java provides shorthand operators for performing an
 * operation and assigning the result back to the same
 * variable.
 *
 * Instead of:
 *
 *     num = num + 2;
 *
 * We can write:
 *
 *     num += 2;
 *
 *
 * The common compound assignment operators are:
 *
 *     +=
 *     -=
 *     *=
 *     /=
 *     %=
 *
 *
 * ------------------------------------------------------------
 * ADD AND ASSIGN
 * ------------------------------------------------------------
 *
 *     int num = 7;
 *
 *     num += 2;
 *
 * This is equivalent to:
 *
 *     num = num + 2;
 *
 * Result:
 *
 *     num = 9
 *
 *
 * ------------------------------------------------------------
 * SUBTRACT AND ASSIGN
 * ------------------------------------------------------------
 *
 *     int num = 7;
 *
 *     num -= 2;
 *
 * This is equivalent to:
 *
 *     num = num - 2;
 *
 * Result:
 *
 *     num = 5
 *
 *
 * ------------------------------------------------------------
 * MULTIPLY AND ASSIGN
 * ------------------------------------------------------------
 *
 *     int num = 7;
 *
 *     num *= 2;
 *
 * This is equivalent to:
 *
 *     num = num * 2;
 *
 *
 * ------------------------------------------------------------
 * DIVIDE AND ASSIGN
 * ------------------------------------------------------------
 *
 *     int num = 10;
 *
 *     num /= 2;
 *
 * This is equivalent to:
 *
 *     num = num / 2;
 *
 *
 * ------------------------------------------------------------
 * MODULUS AND ASSIGN
 * ------------------------------------------------------------
 *
 *     int num = 7;
 *
 *     num %= 5;
 *
 * This is equivalent to:
 *
 *     num = num % 5;
 *
 * Result:
 *
 *     num = 2
 *
 *
 * ============================================================
 * 4. INCREMENT OPERATOR
 * ============================================================
 *
 * The increment operator (++) increases a value by 1.
 *
 * Example:
 *
 *     int num = 7;
 *
 *     num++;
 *
 * Result:
 *
 *     num = 8
 *
 * This is equivalent to:
 *
 *     num = num + 1;
 *
 *
 * ============================================================
 * 5. DECREMENT OPERATOR
 * ============================================================
 *
 * The decrement operator (--) decreases a value by 1.
 *
 * Example:
 *
 *     int num = 7;
 *
 *     num--;
 *
 * Result:
 *
 *     num = 6
 *
 * This is equivalent to:
 *
 *     num = num - 1;
 *
 *
 * ============================================================
 * 6. PRE-INCREMENT
 * ============================================================
 *
 * When ++ is written BEFORE the variable, it is called
 * pre-increment.
 *
 * Syntax:
 *
 *     ++num
 *
 * Pre-increment means:
 *
 *     1. Increment the value first.
 *     2. Then use/fetch the value.
 *
 * Example:
 *
 *     int num = 7;
 *
 *     int result = ++num;
 *
 * Steps:
 *
 *     num becomes 8
 *     result gets 8
 *
 * Therefore:
 *
 *     num    = 8
 *     result = 8
 *
 *
 * ============================================================
 * 7. POST-INCREMENT
 * ============================================================
 *
 * When ++ is written AFTER the variable, it is called
 * post-increment.
 *
 * Syntax:
 *
 *     num++
 *
 * Post-increment means:
 *
 *     1. Use/fetch the current value first.
 *     2. Then increment the value.
 *
 * Example:
 *
 *     int num = 7;
 *
 *     int result = num++;
 *
 * Steps:
 *
 *     result gets 7
 *     num becomes 8
 *
 * Therefore:
 *
 *     num    = 8
 *     result = 7
 *
 *
 * ============================================================
 * 8. PRE-INCREMENT VS POST-INCREMENT
 * ============================================================
 *
 * The important difference appears when the increment
 * operation is used as part of another expression.
 *
 *
 * PRE-INCREMENT:
 *
 *     int num = 7;
 *     int result = ++num;
 *
 * First increment:
 *
 *     num = 8
 *
 * Then assign:
 *
 *     result = 8
 *
 *
 * POST-INCREMENT:
 *
 *     int num = 7;
 *     int result = num++;
 *
 * First assign/fetch:
 *
 *     result = 7
 *
 * Then increment:
 *
 *     num = 8
 *
 *
 * Quick comparison:
 *
 *     ++num
 *         -> Increment first, then use the value.
 *
 *     num++
 *         -> Use the value first, then increment.
 *
 *
 * IMPORTANT:
 *
 * If used as a standalone statement:
 *
 *     num++;
 *
 * and:
 *
 *     ++num;
 *
 * both increase num by 1.
 *
 * The difference becomes important when the value is being
 * used in another expression or assignment.
 *
 *
 * ============================================================
 * 9. PRE-DECREMENT AND POST-DECREMENT
 * ============================================================
 *
 * The same concept applies to decrement operators.
 *
 *
 * PRE-DECREMENT:
 *
 *     --num
 *
 *     1. Decrement first.
 *     2. Then use the value.
 *
 *
 * POST-DECREMENT:
 *
 *     num--
 *
 *     1. Use the current value first.
 *     2. Then decrement.
 *
 *
 * Example:
 *
 *     int num = 7;
 *
 *     int result = --num;
 *
 * Result:
 *
 *     num = 6
 *     result = 6
 *
 *
 * Example:
 *
 *     int num = 7;
 *
 *     int result = num--;
 *
 * Result:
 *
 *     result = 7
 *     num = 6
 *
 *
 * ============================================================
 * 10. ARITHMETIC OPERATORS - QUICK TABLE
 * ============================================================
 *
 *     Operator     Name             Example
 *
 *        +         Addition         a + b
 *        -         Subtraction      a - b
 *        *         Multiplication   a * b
 *        /         Division         a / b
 *        %         Modulus          a % b
 *
 *
 * ============================================================
 * 11. COMPOUND ASSIGNMENT - QUICK TABLE
 * ============================================================
 *
 *     Operator     Equivalent
 *
 *     a += b       a = a + b
 *     a -= b       a = a - b
 *     a *= b       a = a * b
 *     a /= b       a = a / b
 *     a %= b       a = a % b
 *
 *
 * ============================================================
 * 12. INCREMENT / DECREMENT - QUICK TABLE
 * ============================================================
 *
 *     Operator     Meaning
 *
 *     ++num        Pre-increment
 *     num++        Post-increment
 *     --num        Pre-decrement
 *     num--        Post-decrement
 *
 *
 * ============================================================
 * 13. COMPLETE EXAMPLE
 * ============================================================
 *
 *     int num1 = 7;
 *     int num2 = 5;
 *
 *     int addition = num1 + num2;
 *     int subtraction = num1 - num2;
 *     int multiplication = num1 * num2;
 *     int division = num1 / num2;
 *     int remainder = num1 % num2;
 *
 *     System.out.println(addition);
 *     System.out.println(subtraction);
 *     System.out.println(multiplication);
 *     System.out.println(division);
 *     System.out.println(remainder);
 *
 *
 * ============================================================
 * 14. IMPORTANT CONCEPT
 * ============================================================
 *
 * Arithmetic operators:
 *
 *     +  -  *  /  %
 *
 * are used to perform mathematical operations.
 *
 * Assignment operators:
 *
 *     =  +=  -=  *=  /=  %=
 *
 * are used to assign values.
 *
 * Increment/decrement operators:
 *
 *     ++  --
 *
 * are used to increase or decrease a value by 1.
 *
 *
 * ============================================================
 * KEY POINTS TO REMEMBER
 * ============================================================
 *
 * 1. + is used for addition.
 *
 * 2. - is used for subtraction.
 *
 * 3. * is used for multiplication.
 *
 * 4. / is used for division.
 *
 * 5. % is used to find the remainder.
 *
 * 6. +=, -=, *=, /= and %= are shorthand assignment
 *    operators.
 *
 * 7. ++ increases a value by 1.
 *
 * 8. -- decreases a value by 1.
 *
 * 9. ++num is pre-increment.
 *
 * 10. num++ is post-increment.
 *
 * 11. --num is pre-decrement.
 *
 * 12. num-- is post-decrement.
 *
 * 13. Pre-increment changes the value before it is used.
 *
 * 14. Post-increment uses the value first and then changes it.
 *
 * 15. Pre-decrement changes the value before it is used.
 *
 * 16. Post-decrement uses the value first and then changes it.
 *
 *
 * ============================================================
 * QUICK SUMMARY
 * ============================================================
 *
 *     +       -> Addition
 *     -       -> Subtraction
 *     *       -> Multiplication
 *     /       -> Division
 *     %       -> Remainder
 *
 *     +=      -> Add and assign
 *     -=      -> Subtract and assign
 *     *=      -> Multiply and assign
 *     /=      -> Divide and assign
 *     %=      -> Modulus and assign
 *
 *     ++num   -> Increment first, then use
 *     num++   -> Use first, then increment
 *
 *     --num   -> Decrement first, then use
 *     num--   -> Use first, then decrement
 *
 * ============================================================
 */

public class ArithmeticOperators {

	public static void main(String[] args) {
/**		int num1=7;
		int num2=5;
		int result=num1+num2;
		System.out.println(result);
**/	
		
/**
		int num1=7;
		int num2=5;
		int result=num1-num2;
		System.out.println(result);
**/
		
/**		
		int num1=7;
		int num2=5;
		int result=num1*num2;
		System.out.println(result);
**/
		
/**
		int num1=7;
		int num2=5;
		int result=num1/num2;
		System.out.println(result);
**/
		
/**
		int num1=7;
		int num2=5;
		int result=num1%num2;
		System.out.println(result);
**/
		
		int num=7;
//		num=num+2;
//		num+=2;
//		num*=2;
		
		num++;    //post increment
		++num;    //pre increment
		num--;    //post decrement
		--num;	  //pre decrement
		System.out.println(num);
		
		int result=num++; //fetch the value and then increment
		System.out.println(result);		
	
	}

}

