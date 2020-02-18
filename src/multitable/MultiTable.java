/* Use nested for loops to print a multiplication table as shown below.
 * The value of each cell should be computed using the values in the row and column headings (e.g., 1 * 1; 1 * 2; 1 * 3; etc.).
 * Make sure to match the below results as shown.

   * |  1  2  3  4  5  6  7  8  9
-------------------------------
1 |  1  2  3  4  5  6  7  8  9
2 |  2  4  6  8 10 12 14 16 18
3 |  3  6  9 12 15 18 21 24 27
4 |  4  8 12 16 20 24 28 32 36
5 |  5 10 15 20 25 30 35 40 45
6 |  6 12 18 24 30 36 42 48 54
7 |  7 14 21 28 35 42 49 56 63
8 |  8 16 24 32 40 48 56 64 72
9 |  9 18 27 36 45 54 63 72 81

 */
package multitable;

public class MultiTable {

    public static void main(String[] args) {
        int x;
        int y;
        
        System.out.print("*|");
        
        for (x = 1; x < 10; x++){
            System.out.printf("%3d", x);
        }
        System.out.println();
        
        for (x = 1; x < 32; x++){
            System.out.print("-");
        }
        
        for (x = 1; x < 10; x++){
            System.out.printf("\n%d|", x);
            for (y = 1; y < 10; y++){
                System.out.printf("%3d", x * y);
            }
        }
    }
}
