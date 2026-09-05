/**
 * 
 * ============================================================
 * CREATING A CLASS AND OBJECT IN JAVA
 * ============================================================
 *
 * Java is an Object-Oriented Programming language.
 *
 * A class is used to design an object.
 *
 * An object is created from a class and is used to access
 * the variables and methods of that class.
 *
 *
 * ============================================================
 * CLASS
 * ============================================================
 *
 * A class is a blueprint or design.
 *
 * Inside a class, we can create:
 *
 * Variables -> What an object knows (data/properties)
 * Methods -> What an object does (behavior/actions)
 *
 * Example:
 *
 * class Calculator {
 * 
 * int a; // Variable
 * public int add(int n1, int n2) {
 * return n1 + n2;
 * }
 *
 * }
 *
 *
 * ============================================================
 * OBJECT
 * ============================================================
 *
 * A class is only a design.
 *
 * To use the methods and variables of a class, we need
 * to create an object.
 *
 * Syntax:
 *
 * ClassName referenceVariable = new ClassName();
 *
 * Example:
 *
 * Calculator calc = new Calculator();
 *
 * Here:
 *
 * Calculator -> Class name / Object type
 * calc -> Reference variable
 * new -> Creates a new object
 * Calculator() -> Creates an object using the class design
 *
 *
 * ============================================================
 * CALLING A METHOD USING AN OBJECT
 * ============================================================
 *
 * After creating the object, we can call its methods
 * using the reference variable.
 *
 * Syntax:
 *
 * referenceVariable.methodName();
 *
 * Example:
 *
 * calc.add(4, 5);
 *
 *
 * ============================================================
 * PASSING VALUES TO A METHOD
 * ============================================================
 *
 * If a method needs values to perform an operation,
 * we pass the values when calling the method.
 *
 * Example:
 *
 * calc.add(num1, num2);
 *
 * The values are received by:
 *
 * public int add(int n1, int n2)
 *
 * num1 -> Passed to n1
 * num2 -> Passed to n2
 *
 * ============================================================
 * IMPORTANT
 * ============================================================
 *
 * A class -> Design or blueprint.
 *
 * An object -> Instance created from a class.
 *
 * Variables -> Store data.
 *
 * Methods -> Perform actions.
 *
 * new keyword -> Creates a new object.
 *
 * Reference variable -> Used to access the object's methods and variables.
 *
 * ============================================================
 * KEY POINTS TO REMEMBER
 * ============================================================
 *
 * 1. A class can contain variables and methods.
 *
 * 2. A class is used as a blueprint for creating objects.
 *
 * 3. Use the new keyword to create an object.
 *
 * 4. Use the reference variable to access methods.
 *
 * 5. Values can be passed to methods as parameters.
 *
 *
 * ============================================================
 * QUICK SUMMARY
 * ============================================================
 *
 * Class -> Blueprint or design
 *
 * Object -> Instance of a class
 *
 * Variable -> Stores data
 *
 * Method -> Performs an action
 *
 * new -> Creates an object
 *
 * calc.add() -> Calls a method using an object
 *
 * ============================================================
 */

class Calculator {
    public int add(int n1, int n2) {
        // int a;
        // System.out.println("in add");
        // return 0;

        // int r=num1+num2;
        // return r;

        int r = n1 + n2;
        return r;
    }
}

class ClassAndObjectPractical {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;

        /*
         * Calculator -> Class name
         * calc -> Reference variable
         * = -> Assignment operator
         * new -> Creates a new object
         * Calculator() -> Constructor call
         */
        Calculator calc = new Calculator();
        int result = calc.add(4, 5);

        // calc.add();
        // int result=calc.add();
        // int result=num1+num2;
        System.out.println(result);

    }
}

// Object Oriented programming
// Object - Properties and Beahaviors

// Class