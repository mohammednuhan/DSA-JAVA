package loops ;

import java.util.Scanner;

public class g { 
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for(int i=n;i<=5;i++){
            sum = sum + i;
        }
        System.out.println(sum);

    }
}