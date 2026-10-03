public class Fibonacci {
    public static void main(String[] args) {
        
	int a = 0;
        int b = 1;

        System.out.println("Fibonacci Series:");

        for (int i = 1;i <= 10; i++) {

            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }

    }
}