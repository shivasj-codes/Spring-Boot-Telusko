public class JaggedAnd3DArray {

    public static void main(String[] args) {

        // ============================================================
        // JAGGED ARRAY
        // ============================================================

        // Creates a 2D array with 3 rows.
        // The column sizes are not defined yet.
        int nums[][] = new int[3][];

        // Defines the size of each row individually.
        nums[0] = new int[3]; // First row -> 3 columns
        nums[1] = new int[4]; // Second row -> 4 columns
        nums[2] = new int[2]; // Third row -> 2 columns

        // nums.length -> Returns the total number of rows.
        for (int i = 0; i < nums.length; i++) {

            // nums[i].length -> Returns the number of columns
            // for the current row.
            for (int j = 0; j < nums[i].length; j++) {

                // Assigns a random integer value from 0 to 9.
                nums[i][j] = (int) (Math.random() * 10);
            }
        }

        // Enhanced for loop:
        // n represents one complete row (1D array).
        for (int n[] : nums) {

            // m represents each individual value in the row.
            for (int m : n) {

                System.out.print(m + " ");
            }

            // Moves to the next line after completing one row.
            System.out.println();
        }

        System.out.println();

        // ============================================================
        // THREE-DIMENSIONAL ARRAY
        // ============================================================

        // Creates a 3D array.
        //
        // First dimension -> Size 3
        // Second dimension -> Size 4
        // Third dimension -> Size 5
        int num1[][][] = new int[3][4][5];

        // num1.length -> Returns the size of the first dimension.
        int num2 = num1.length;
        System.out.println(num2); // 3

        // num1[0].length -> Returns the size of the second dimension.
        num2 = num1[0].length;
        System.out.println(num2); // 4

        // num1[0][0].length -> Returns the size of the third dimension.
        num2 = num1[0][0].length;
        System.out.println(num2); // 5

        // First loop -> Controls the first dimension.
        for (int i = 0; i < num1.length; i++) {

            // Second loop -> Controls the second dimension.
            for (int j = 0; j < num1[i].length; j++) {

                // Third loop -> Controls the third dimension.
                for (int k = 0; k < num1[i][j].length; k++) {

                    // Assigns a random integer value from 0 to 9.
                    num1[i][j][k] = (int) (Math.random() * 10);

                    // Prints the value.
                    System.out.print(num1[i][j][k] + " ");
                }

                // Moves to the next line after one inner array.
                System.out.println();
            }

            // Adds space after completing one section.
            System.out.println();
        }
    }
}
// ! Simple structure:
/*
 * 3 → Groups
 * 
 * Each Group
 * ↓
 * 4 → Arrays
 * 
 * Each Array
 * ↓
 * 5 → Values
 */

// ! The output structure looks like this:
/*
 * num[3][4][5]
 * 
 * │
 * ├── num[0] → 4 arrays
 * │ │
 * │ ├── num[0][0] → [0][1][2][3][4]
 * │ ├── num[0][1] → [0][1][2][3][4]
 * │ ├── num[0][2] → [0][1][2][3][4]
 * │ └── num[0][3] → [0][1][2][3][4]
 * │
 * ├── num[1] → 4 arrays
 * │ │
 * │ ├── num[1][0] → [0][1][2][3][4]
 * │ ├── num[1][1] → [0][1][2][3][4]
 * │ ├── num[1][2] → [0][1][2][3][4]
 * │ └── num[1][3] → [0][1][2][3][4]
 * │
 * └── num[2] → 4 arrays
 * │
 * ├── num[2][0] → [0][1][2][3][4]
 * ├── num[2][1] → [0][1][2][3][4]
 * ├── num[2][2] → [0][1][2][3][4]
 * └── num[2][3] → [0][1][2][3][4]
 * 
 * First Group → num[0]
 * 8 3 0 5 7
 * 1 9 4 2 6
 * 0 7 5 3 1
 * 9 8 2 4 6
 * 
 * Second Group → num[1]
 * 2 5 7 1 0
 * 6 3 8 9 4
 * 1 0 5 7 2
 * 4 6 3 8 9
 * 
 * Third Group → num[2]
 * 7 1 9 4 0
 * 5 2 6 3 8
 * 9 4 1 0 7
 * 3 8 5 2 6
 */