public class StarPattern {
    public static void main(String[] args) {
        int rows = 5; // Total number of rows in the pattern

        for (int i = 1; i <= rows; i++) {
            if (i % 2 == 0) {
                // For even rows, print 4 stars
                for (int j = 1; j <= 4; j++) {
                    System.out.print("* ");
                }
            } else {
                // For odd rows, print 5 stars
                for (int j = 1; j <= 5; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
