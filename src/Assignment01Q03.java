public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");
        int a = 0;
        int b = 1;
        int temp = a;
        int numOdd = 0;
        for (int i = 0; i < x; i++) {
            if (b % 2 != 0) {
                numOdd++;
            }
            System.out.print(b);
            if (i < x - 1)
                System.out.print(" ");
            temp = b;
            b = a + b;
            a = temp;

        }
        System.out.println();

        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
