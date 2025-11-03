// Scott L. Parrish 11/3/2025
// SDEV 200 Module 1 Exercise 8.29
// ArrayCompare class to compare two 3 by 3 arrays to determine if they are identical
// including a test program to demonstrate the use of the class
public class ArrayCompare {

    // Compare each element of the two arrays one by one, if any 2 elements are not equal
    // return false, if the loop completes successfully return true.
     public static boolean equals(int[][] m1, int[][] m2) {
        for (int row = 0; row < m1.length; row++) {
            for (int column = 0; column < m1[row].length; column++) {
                if (m1[row][column] != m2[row][column]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {

        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter m1 (a 3 by 3 matrix) row by row: ");
        for (int row = 0; row < m1.length; row++) {
            for (int column = 0; column < m1[row].length; column++) {
                m1[row][column] = input.nextInt();
            }
        }
//        // Uncomment below to print a table form representation of m1
//        System.out.println("You entered the following for m1:");
//        for (int row = 0; row < m1.length; row++) {
//            for (int column = 0; column < m1[row].length; column++) {
//                System.out.print(m1[row][column] + " ");
//            }
//            System.out.println();
//        }

        System.out.print("Enter m2 (a 3 by 3 matrix) row by row: ");
        for (int row = 0; row < m2.length; row++) {
            for (int column = 0; column < m2[row].length; column++) {
                m2[row][column] = input.nextInt();
            }
        }
//        // Uncomment below to print a table form representation of m2
//        System.out.println("You entered the following for m2:");
//        for (int row = 0; row < m2.length; row++) {
//            for (int column = 0; column < m2[row].length; column++) {
//                System.out.print(m2[row][column] + " ");
//            }
//            System.out.println();
//        }

        // Check the arrays against each other using the equals() method and print the result
        if (equals(m1, m2)) {
            System.out.println("The two arrays are identical");
        } else
            System.out.println("The two arrays are not identical");
    }
}
