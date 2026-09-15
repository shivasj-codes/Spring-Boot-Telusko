/**
 * ============================================================
 * ARRAY LENGTH AND ARRAY OF OBJECTS
 * ============================================================
 *
 * 1. ARRAY LENGTH
 * ============================================================
 *
 * Every array has a length property.
 *
 * Example:
 *
 * int[] nums = new int[6];
 *
 * nums.length -> 6
 *
 * Array index starts from 0.
 *
 * For an array of size 6:
 *
 * Index -> 0 1 2 3 4 5
 *
 * So the last index is length - 1.
 *
 * IMPORTANT:
 *
 * Use:
 *
 * i < nums.length
 *
 * instead of hardcoding the array size.
 *
 *
 * ============================================================
 * DEFAULT VALUES
 * ============================================================
 *
 * If an integer array is created without assigning values,
 * its elements are initialized to 0 by default.
 *
 *
 * ============================================================
 * ARRAY OF OBJECTS
 * ============================================================
 *
 * An array can also store references to objects.
 *
 * Example:
 *
 * Student[] students
 *
 * This means the array can hold Student references.
 *
 * IMPORTANT:
 *
 * Creating a Student array does NOT automatically create
 * Student objects.
 *
 * The Student objects must be created separately and then
 * assigned to the array.
 *
 *
 * ============================================================
 * ACCESSING OBJECT DATA
 * ============================================================
 *
 * When we access an object from the array, we can use its
 * reference to access the object's variables.
 *
 * Example:
 *
 * students[i].name
 *
 * students[i].marks
 *
 * Here, i changes for each student in the array.
 *
 *
 * ============================================================
 * KEY POINTS TO REMEMBER
 * ============================================================
 *
 * 1. Array length gives the total number of elements.
 *
 * 2. Array index starts from 0.
 *
 * 3. Last index = length - 1.
 *
 * 4. Integer array elements are 0 by default.
 *
 * 5. An array of objects stores object references.
 *
 * 6. Creating an object array does not create the objects.
 *
 * ============================================================
 * QUICK SUMMARY
 * ============================================================
 *
 * array.length -> Total size of the array
 *
 * Array index -> Starts from 0
 *
 * Student[] -> Array of Student references
 *
 * students[i] -> Reference of a Student object
 *
 * students[i].name -> Access the object's name
 *
 * ============================================================
 */
class Student {
    int rollno;
    String name;
    int marks;
}

public class ArrayOfObjects {
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

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + ":" + students[i].marks);
        }

        // int nums[] = new int[6];
        // nums[0]=4;
        // nums[1]=8;
        // nums[2]=3;
        // nums[3]=9;
        //
        // for(int i=0;i<nums.length;i++)
        // {
        // System.out.println(nums[i]);
        // }
    }
}