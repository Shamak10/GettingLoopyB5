public class Main {
    public static void main(String[] args) {// Declare and initialize a variable called 'row' with a value of 5
        int row = 5;//
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {// Print a single asterisk
                System.out.print("*");
            }
            System.out.println();//Newline character to move to the next line
        }
    }
}