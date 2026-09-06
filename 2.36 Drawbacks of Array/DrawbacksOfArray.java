/**
 * ============================================================
 * DRAWBACKS OF ARRAYS
 * ============================================================
 *
 * Arrays are useful for storing multiple values, but they also
 * have some limitations.
 *
 *
 * ============================================================
 * 1. FIXED SIZE
 * ============================================================
 *
 * Once the size of an array is created, it cannot be changed.
 *
 * Example:
 *
 * int[] nums = new int[4];
 *
 * The array can store only 4 values.
 *
 * If more space is needed, we must create a new array and copy
 * the existing values.
 *
 *
 * ============================================================
 * 2. CONTINUOUS MEMORY
 * ============================================================
 *
 * An array is an object in Java.
 *
 * Because we use the new keyword, the array object is created
 * in Heap Memory.
 *
 * The array elements occupy continuous memory locations.
 *
 *
 * ============================================================
 * 3. SEARCHING AND INSERTING CAN TAKE TIME
 * ============================================================
 *
 * Searching for an element may require traversing through
 * the array elements.
 *
 * Inserting or managing elements can also require additional
 * operations.
 *
 *
 * ============================================================
 * 4. SAME DATA TYPE
 * ============================================================
 *
 * A normal array is designed to store values of the same type.
 *
 * Example:
 *
 * int[] -> Stores integer values
 *
 * String[] -> Stores String values
 *
 * We cannot normally mix different data types such as int,
 * String, and double in the same typed array.
 *
 *
 * ============================================================
 * ARRAYS VS COLLECTIONS
 * ============================================================
 *
 * Arrays are still very useful.
 *
 * If the size is fixed and we need to store multiple values,
 * an array can be a good choice.
 *
 * Collections provide additional features and flexibility,
 * which we will learn later.
 *
 *
 * ============================================================
 * QUICK SUMMARY
 * ============================================================
 *
 * Fixed size -> Cannot expand after creation
 *
 * Memory -> Array is created in Heap Memory
 *
 * Searching -> May require traversing elements
 *
 * Data Type -> Normally stores the same type of values
 *
 * Fixed-size data -> Arrays are a good choice
 *
 * ============================================================
 */