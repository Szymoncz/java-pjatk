/*
Zadanie 6
Napisz program, który pobierze trzy liczby rzeczywiste,
a następnie wyświetli je w kolejności od najmniejszej do największej,
a potem od największej do najmniejszej. Nie używaj tutaj żadnych dostępnych metod sortujących.

>WEJŚCIE:
1 2 3
WYJŚCIE:
1.000000 2.000000 3.000000
3.000000 2.000000 1.000000
 */
import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wpisz pierwszą liczbę: ");
        double a = scanner.nextDouble();
        System.out.print("Wpisz drugą liczbę: ");
        double b = scanner.nextDouble();
        System.out.print("Wpisz trzecią liczbę: ");
        double c = scanner.nextDouble();

        double min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }

        double max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        double mid = a + b + c - min - max;

        System.out.printf("%.6f %.6f %.6f%n", min, mid, max);

        System.out.printf("%.6f %.6f %.6f%n", max, mid, min);

        scanner.close();
    }
}
