/**
 * 
 * ============================================================
 * JVM MEMORY - STACK AND HEAP
 * ============================================================
 *
 * Inside the JVM, memory is mainly discussed using two areas:
 *
 * Stack Memory
 * Heap Memory
 *
 *
 * ============================================================
 * STACK MEMORY
 * ============================================================
 *
 * Stack memory follows:
 *
 * LIFO -> Last In, First Out
 *
 * Example:
 *
 * If values enter in this order:
 *
 * 5 -> 6 -> 7
 *
 * The last value entered is accessed first:
 *
 * 7 -> 6 -> 5
 *
 *
 * ============================================================
 * METHODS AND STACK MEMORY
 * ============================================================
 *
 * Every method has its own stack area.
 *
 * Local variables belong to the method where they are declared.
 *
 * Example:
 *
 * main() method -> Has its own stack
 *
 * add() method -> Has its own stack
 *
 * When add() is called, its local variables such as
 * n1 and n2 are stored in its method stack.
 *
 *
 * ============================================================
 * TYPES OF VARIABLES
 * ============================================================
 *
 * Local Variable:
 *
 * A variable declared inside a method.
 *
 * Example:
 *
 * n1 and n2 -> Local variables of the add() method
 *
 *
 * Instance Variable:
 *
 * A variable declared inside a class but outside methods.
 *
 * Example:
 *
 * num -> Instance variable of the Calculator class
 *
 *
 * ============================================================
 * HEAP MEMORY
 * ============================================================
 *
 * Objects are created in Heap Memory.
 *
 * When we use:
 *
 * new Calculator()
 *
 * A new Calculator object is created in the Heap.
 *
 * Instance variables belong to the object and are stored
 * with that object in Heap Memory.
 *
 *
 * ============================================================
 * REFERENCE VARIABLE
 * ============================================================
 *
 * Example:
 *
 * Calculator obj = new Calculator();
 *
 * obj is NOT the actual object.
 *
 * obj is a reference variable.
 *
 * The actual Calculator object is created in Heap Memory.
 *
 * The reference variable is used to access that object.
 *
 *
 * ============================================================
 * STACK AND HEAP CONNECTION
 * ============================================================
 *
 * The reference variable is stored in the method stack.
 *
 * The actual object is created in Heap Memory.
 *
 * The reference connects to the object.
 *
 * Simple flow:
 *
 * Stack
 * |
 * | Reference
 * ↓
 * Heap
 * |
 * ↓
 * Object
 *
 * When we use:
 *
 * obj.add()
 *
 * Java uses the reference to access the object and call
 * the required method.
 *
 *
 * ============================================================
 * MULTIPLE OBJECTS
 * ============================================================
 *
 * We can create multiple objects from the same class.
 *
 * Each object is separate and independent.
 *
 * Even if two objects have the same instance variable
 * values, they are still different objects.
 *
 * Changing one object's instance variable does not affect
 * the other object.
 *
 * REMEMBER:
 *
 * One class -> Can create multiple objects
 *
 * Each object -> Has its own instance data
 *
 *
 * ============================================================
 * IMPORTANT
 * ============================================================
 *
 * Local variables -> Related to methods and Stack Memory
 *
 * Objects -> Created in Heap Memory
 *
 * Instance variables -> Belong to objects
 *
 * Reference variables -> Used to access objects
 *
 *
 * ============================================================
 * KEY POINTS TO REMEMBER
 * ============================================================
 *
 * 1. JVM memory includes Stack and Heap memory areas.
 *
 * 2. Stack follows LIFO (Last In, First Out).
 *
 * 3. Every method has its own stack area.
 *
 * 4. Local variables belong to their methods.
 *
 * 5. Objects are created in Heap Memory.
 *
 * 6. Instance variables belong to objects.
 *
 * 7. A reference variable is not the actual object.
 *
 * 8. Multiple objects are separate and independent.
 *
 *
 * ============================================================
 * QUICK SUMMARY
 * ============================================================
 *
 * Stack -> Method-related memory and local variables
 *
 * Heap -> Objects and instance variables
 *
 * Local Variable -> Declared inside a method
 *
 * Instance Variable -> Declared inside a class
 *
 * Reference Variable -> Used to access an object
 *
 * ============================================================
 */

class Calculator {

    // Instance variable (belongs to each Calculator object)
    int num = 5;

    // n1 and n2 are called method parameters. They behave like local variables
    // because they can only be accessed inside the add() method.
    public int add(int n1, int n2) {

        // Accessing and printing the instance variable
        System.out.println(num);

        // Returning the addition of the method parameters
        return n1 + n2;
    }
}

public class StackAndHeap {

    // variables declared inside main() are local variables. Even though obj is a
    // local variable, the object it refers to contains an instance variable
    public static void main(String[] args) {

        // Local variable (exists only inside the main() method)
        int data = 10;

        // Creating the first Calculator object - Local variable
        Calculator obj = new Calculator();

        // Creating the second Calculator object - Local variable
        Calculator obj1 = new Calculator();

        // Local variable r1 stores the returned value from add()
        int r1 = obj.add(3, 4);

        // Changing the instance variable of obj only
        obj.num = 8;

        // Prints 8
        System.out.println(obj.num);

        // Prints 5 because obj1 has its own instance variable
        System.out.println(obj1.num);
    }
}
