package loops;

import java.util.Scanner;

public class h {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int n = sc.nextInt();

        int factorial = 0 ;


        for(int i =1;i<=n;i++){
            System.out.println(factorial * i);
        }

    }    
}
