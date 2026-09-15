/**
 * ============================================================
 * ENHANCED FOR LOOP
 * ============================================================
 *
 * Enhanced For Loop is used to easily iterate through an array
 * and get one value at a time.
 *
 * It is also commonly called a For-Each Loop.
 *
 *
 * ============================================================
 * WHY ENHANCED FOR LOOP?
 * ============================================================
 *
 * With a normal for loop, we need:
 *
 * Counter
 * Array length
 * Index
 * Increment
 *
 * Enhanced For Loop removes the need to manage these manually.
 *
 *
 * ============================================================
 * SYNTAX
 * ============================================================
 *
 * for (dataType variable : array) {
 *
 * code
 *
 * }
 *
 *
 * Example:
 *
 * for (int n : nums) {
 * System.out.println(n);
 * }
 *
 * Here:
 *
 * int -> Data type of array elements
 *
 * n -> Stores one value at a time
 *
 * nums -> Array
 *
 * : -> Gets values from the array one by one
 *
 *
 * ============================================================
 * HOW IT WORKS
 * ============================================================
 *
 * If nums contains:
 *
 * 10 20 30 40
 *
 * The loop works like:
 *
 * First iteration -> n = 10
 * Second iteration -> n = 20
 * Third iteration -> n = 30
 * Fourth iteration -> n = 40
 *
 * It automatically stops after the last element.
 *
 *
 * ============================================================
 * WITH ARRAY OF OBJECTS
 * ============================================================
 *
 * Enhanced For Loop can also be used with an array of objects.
 *
 * Example:
 *
 * for (Student stud : students) {
 *
 * stud represents one Student at a time
 *
 * }
 *
 * Here:
 *
 * Student -> Type of object
 *
 * stud -> One Student reference at a time
 *
 * students -> Array of Student references
 *
 *
 * ============================================================
 * IMPORTANT
 * ============================================================
 *
 * Enhanced For Loop does not require an index or counter.
 *
 * It automatically goes through every element of the array.
 *
 * The data type of the loop variable should match the type
 * of values stored in the array.
 *
 *
 * ============================================================
 * KEY POINTS TO REMEMBER
 * ============================================================
 *
 * 1. Enhanced For Loop is used to iterate through arrays easily.
 *
 * 2. It gives one value at a time.
 *
 * 3. No counter or index is required.
 *
 * 4. No need to manually check array length.
 *
 * 5. It can also be used with arrays of objects.
 *
 *
 * ============================================================
 * QUICK SUMMARY
 * ============================================================
 *
 * Normal for loop -> Uses index/counter.
 *
 * Enhanced for loop -> Directly gets each value.
 *
 * int n : nums -> Gets one integer value at a time.
 *
 * Student stud : students -> Gets one Student reference at a time.
 *
 * ============================================================
 */

class Student {
    int rollno;
    String name;
    int marks;
}

public class EnhancedForLoop {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Navin";
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Harsh";
        s2.marks = 67;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Kiran";
        s3.marks = 97;

        System.out.println(s1.name + ":" + s1.marks);

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // for(int i=0;i<students.length;i++)
        // {
        // System.out.println(students[i].name+":"+students[i].marks);
        // }

        for (Student stud : students) {
            System.out.println(stud.name + ":" + stud);
        }

        int nums[] = new int[4];
        nums[0] = 4;
        nums[1] = 8;
        nums[2] = 3;
        nums[3] = 9;

        // for (int i=0;i<nums/length;i++)
        // {
        // System.out.println(nums[i]);
        // }

        for (int n : nums) {
            System.out.println(n);
        }

    }
}
