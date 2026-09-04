import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {          // rows
            for (int j = 1; j <= n; j++) {      // columns
                System.out.print("*");
            }
            System.out.println();
        }
    }
}