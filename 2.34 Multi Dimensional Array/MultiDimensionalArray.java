public class MultiDimensionalArray {

    public static void main(String[] args) {

        // Creates a 2D array with 3 rows and 4 columns.
        int nums[][] = new int[3][4];

        // Outer loop -> Controls the rows.
        for (int i = 0; i < 3; i++) {

            // Inner loop -> Controls the columns.
            for (int j = 0; j < 4; j++) {

                // Assigns a random integer value from 0 to 9.
                nums[i][j] = (int) (Math.random() * 10);

                // Prints each element with a space.
                System.out.print(nums[i][j] + " ");
            }

            // Moves to the next line after completing one row.
            System.out.println();
        }

        // Prints an empty line between the two outputs.
        System.out.println();

        // ! Enhanced for loop:
        // Example 2D Array:
        //
        // nums = {
        // {10, 20, 30, 40},
        // {50, 60, 70, 80},
        // {90, 100, 110, 120}
        // };
        //
        // nums is a 2D array containing 3 rows.
        //
        // First enhanced for loop:
        // n receives one complete row (1D array) at a time.
        //
        // 1st iteration -> n = {10, 20, 30, 40}
        // 2nd iteration -> n = {50, 60, 70, 80}
        // 3rd iteration -> n = {90, 100, 110, 120}

        for (int n[] : nums) {

            // Second enhanced for loop:
            // m receives one individual value from the row n.
            //
            // Example for the first row:
            //
            // m = 10
            // m = 20
            // m = 30
            // m = 40

            for (int m : n) {

                // Prints each individual value.
                System.out.print(m + " ");
            }
        }
    }
}