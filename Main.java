import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        System.out.print("Bir Sayı Giriniz :");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = n; j >= n - i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k < (n - i - 1) * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }





        }

    }

