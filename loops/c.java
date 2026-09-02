package loops;

import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}