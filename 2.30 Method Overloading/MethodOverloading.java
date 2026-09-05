/**
 * 
 * ============================================================
 * METHOD OVERLOADING
 * ============================================================
 *
 * Method Overloading means having multiple methods with the
 * same name but different parameters.
 *
 * It is useful when we want to perform similar operations
 * with different inputs.
 *
 *
 * ============================================================
 * WHY METHOD OVERLOADING?
 * ============================================================
 *
 * Sometimes we may want to perform the same operation with
 * different numbers of values.
 *
 * For example:
 *
 * One time -> Add 2 numbers
 * Another time -> Add 3 numbers
 *
 * Instead of creating completely different method names,
 * we can use the same method name with different parameters.
 *
 *
 * ============================================================
 * HOW METHOD OVERLOADING WORKS
 * ============================================================
 *
 * The method name can be the same.
 *
 * The parameters must be different.
 *
 * Parameters can be different in:
 *
 * 1. Number of parameters
 *
 * Example:
 *
 * add() -> Accepts 2 values
 * add() -> Accepts 3 values
 *
 *
 * 2. Type of parameters
 *
 * Example:
 *
 * add() -> Accepts int values
 * add() -> Accepts double values
 *
 *
 * ============================================================
 * IMPORTANT RULE
 * ============================================================
 *
 * Same Method Name + Different Parameters = Method Overloading
 *
 *
 * ============================================================
 * RETURN TYPE
 * ============================================================
 *
 * Changing only the return type does NOT create Method Overloading.
 *
 * The difference must be in the parameters.
 *
 * REMEMBER:
 *
 * Java checks the method name and parameters to distinguish overloaded methods.
 *
 *
 * ============================================================
 * COMMON ERROR
 * ============================================================
 *
 * If two methods have:
 *
 * Same method name
 * Same number of parameters
 * Same parameter types
 *
 * Java will give a Duplicate Method Error.
 *
 * Changing only parameter variable names does not make the
 * methods different.
 *
 *
 * ============================================================
 * KEY POINTS TO REMEMBER
 * ============================================================
 *
 * 1. Method Overloading allows multiple methods with the same name.
 *
 * 2. The parameters must be different.
 *
 * 3. Parameters can differ in number.
 *
 * 4. Parameters can differ in type.
 *
 * 5. Changing only the return type is not Method Overloading.
 *
 *
 * ============================================================
 * QUICK SUMMARY
 * ============================================================
 *
 * Same method name
 * * Different parameters
 * = Method Overloading
 *
 * Same method name
 * * Same parameters
 * = Duplicate Method Error
 *
 * ============================================================
 */

class Calculator {
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public double add(double n1, int n2) {
        return n1 + n2;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int r1 = obj.add(3, 4);
        System.out.println(r1);
    }
}