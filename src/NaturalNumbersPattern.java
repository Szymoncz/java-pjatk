/*
Zadanie 8
Napisz program, który dla liczby naturalnej n wypisze poniższe wzory (jeden pod drugim).
W przypadku niepoprawnych danych program ma ponownie je wczytać.
Zakładamy, że na końcu linii jest wyłącznie znak nowej linii.
>WEJŚCIE:
3
WYJŚCIE:
*
**
***
***
**
*
***
 **
  *
  *
 **
***
 */
import java.util.Scanner;

public class NaturalNumbersPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        while (n <= 0) {
            System.out.print("Wpisz liczbę naturalną: ");
            try {
                n = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("BŁĄD");
            }
        }


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}