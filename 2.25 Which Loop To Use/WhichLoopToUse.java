/**
 * ============================================================
 * WHICH LOOP SHOULD WE USE IN JAVA?
 * ============================================================
 *
 * Java provides three commonly used loops:
 *
 * 1. while loop
 * 2. do-while loop
 * 3. for loop
 *
 * All loops are used to repeat a block of code.
 *
 * In many situations, all three loops can perform similar
 * tasks.
 *
 * The choice of loop depends on the requirement.
 *
 *
 * ============================================================
 * 1. FOR LOOP - WHEN TO USE
 * ============================================================
 *
 * A for loop is generally useful when we know how many
 * iterations we want to perform.
 *
 * Example:
 *
 * Print numbers from 1 to 100.
 *
 * Here, we know:
 *
 * Starting point -> 1
 * Ending point -> 100
 * Increment -> +1
 *
 * Therefore, a for loop is a good choice.
 *
 * Example:
 *
 * for (int i = 1; i <= 100; i++) {
 * System.out.println(i);
 * }
 *
 *
 * ============================================================
 * 2. WHY FOR LOOP IS USEFUL
 * ============================================================
 *
 * A for loop contains three important parts in one place:
 *
 * 1. Initialization
 * 2. Condition
 * 3. Increment / Decrement
 *
 * Syntax:
 *
 * for (initialization; condition; increment/decrement) {
 *
 * / Code
 *
 * }
 *
 * Example:
 *
 * for (int i = 1; i <= 5; i++) {
 * System.out.println(i);
 * }
 *
 * Here:
 *
 * int i = 1 -> Initialization
 * i <= 5 -> Condition
 * i++ -> Increment
 *
 *
 * ============================================================
 * 3. WHILE LOOP - WHEN TO USE
 * ============================================================
 *
 * A while loop is useful when the number of iterations is
 * not known in advance.
 *
 * Example:
 *
 * Reading a file.
 *
 * When reading a file, we may not know how many characters
 * or records are present.
 *
 * We continue reading until we reach:
 *
 * End of File
 *
 * Therefore, a while loop makes sense.
 *
 *
 * Concept:
 *
 * Start reading
 * ↓
 * Is data available?
 * ↓
 * Yes -> Continue
 * No -> Stop
 *
 *
 * ============================================================
 * 4. WHILE LOOP EXAMPLE
 * ============================================================
 *
 * A while loop continues as long as its condition is true.
 *
 * Example:
 *
 * while (condition) {
 *
 * / Code
 *
 * }
 *
 * The number of iterations does not always need to be known
 * before starting the loop.
 *
 *
 * ============================================================
 * 5. WHILE LOOP FOR FILE, DATABASE AND NETWORK OPERATIONS
 * ============================================================
 *
 * A while loop can make sense when working with situations
 * where we continue until there is no more data.
 *
 * Examples mentioned:
 *
 * Files
 * Databases
 * Network operations
 *
 * The loop can continue while data is available.
 *
 *
 * ============================================================
 * 6. CAN A FOR LOOP WORK LIKE A WHILE LOOP?
 * ============================================================
 *
 * Yes.
 *
 * A for loop can also be written without initialization
 * and increment/decrement.
 *
 * Example:
 *
 * for (; condition ;) {
 *
 * / Code
 *
 * }
 *
 * This can behave similarly to a while loop.
 *
 * Example:
 *
 * int i = 1;
 *
 * for (; i <= 5;) {
 * System.out.println(i);
 * i++;
 * }
 *
 * Here:
 *
 * Initialization -> Outside the for loop
 * Condition -> Inside the for loop
 * Increment -> Inside the loop body
 *
 *
 * ============================================================
 * 7. DO-WHILE LOOP - WHEN TO USE
 * ============================================================
 *
 * A do-while loop is useful when you want the code to execute
 * at least once.
 *
 * Even if the condition is false initially, the code inside
 * the do block will execute once.
 *
 * Structure:
 *
 * do {
 *
 * / Code executes first
 *
 * } while (condition);
 *
 *
 * ============================================================
 * 8. IMPORTANT FEATURE OF DO-WHILE LOOP
 * ============================================================
 *
 * while loop:
 *
 * First checks the condition
 * Then executes the code
 *
 *
 * do-while loop:
 *
 * First executes the code
 * Then checks the condition
 *
 *
 * Therefore:
 *
 * do-while
 * -> Executes at least once
 *
 *
 * ============================================================
 * 9. WHICH LOOP IS USED MOST OFTEN?
 * ============================================================
 *
 * According to the lesson:
 *
 * for loop
 *
 * is generally used most frequently.
 *
 * This is especially useful when the number of iterations
 * is known.
 *
 * Example:
 *
 * Print from 1 to 100.
 *
 *
 * ============================================================
 * 10. WHICH LOOP FOR READING DATA?
 * ============================================================
 *
 * According to the lesson:
 *
 * while loop
 *
 * makes sense when reading:
 *
 * Files
 * Databases
 * Network data
 *
 * This is because we may not know in advance how much data
 * is available.
 *
 *
 * ============================================================
 * 11. WHICH LOOP FOR AT LEAST ONE EXECUTION?
 * ============================================================
 *
 * Use:
 *
 * do-while loop
 *
 * when the code must execute at least once, even if the
 * condition is initially false.
 *
 *
 * ============================================================
 * 12. LOOP COMPARISON
 * ============================================================
 *
 * Loop Best Use
 * ------------------------------------------------
 *
 * for When the number of iterations is known
 *
 * while When the number of iterations is unknown
 *
 * do-while When code must execute at least once
 *
 *
 * ============================================================
 * 13. EASY WAY TO REMEMBER
 * ============================================================
 *
 * Ask yourself:
 *
 * Do I know how many times the loop will run?
 *
 * Yes
 * ↓
 * Use for loop
 *
 *
 * No / Continue until something happens
 * ↓
 * Use while loop
 *
 *
 * Must execute at least once
 * ↓
 * Use do-while loop
 *
 *
 * ============================================================
 * 14. IMPORTANT POINT
 * ============================================================
 *
 * All three loops can perform repetition.
 *
 * In many situations, it is technically possible to use
 * different loops for the same task.
 *
 * However, choosing the appropriate loop makes the code
 * easier to understand and maintain.
 *
 *
 * ============================================================
 * KEY POINTS TO REMEMBER
 * ============================================================
 *
 * 1. Java has while, do-while, and for loops.
 *
 * 2. All loops are used to repeat code.
 *
 * 3. Use a for loop when the number of iterations is known.
 *
 * 4. A for loop contains initialization, condition, and
 * increment/decrement in its structure.
 *
 * 5. Use a while loop when the number of iterations is not
 * known in advance.
 *
 * 6. A while loop can be useful when reading files, databases,
 * or network data.
 *
 * 7. A for loop can also be written to behave similarly to
 * a while loop.
 *
 * 8. Use a do-while loop when the code must execute at least
 * once.
 *
 * 9. A do-while loop checks its condition after executing
 * the code.
 *
 * 10. The for loop is commonly used when working with a
 * known number of iterations.
 *
 *
 * ============================================================
 * QUICK SUMMARY
 * ============================================================
 *
 * for loop
 * -> Use when the number of iterations is known.
 *
 * while loop
 * -> Use when the number of iterations is unknown
 * or when continuing until data/condition ends.
 *
 * do-while loop
 * -> Use when the code must execute at least once.
 *
 *
 * Known iterations
 * -> for loop
 *
 * Unknown iterations / Reading data
 * -> while loop
 *
 * Must run at least once
 * -> do-while loop
 *
 * ============================================================
 */