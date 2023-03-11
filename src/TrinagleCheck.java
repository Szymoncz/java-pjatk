/*
Zadanie 4
Napisz program, który dla trzech boków a,b,c podanych wcześniej przez użytkownika
 stwierdzi czy da się z tych boków zbudować trójkąt.

Trójkąt da się zbudować z boków a,b,c wtedy i tylko wtedy gdy zachodzą następujące warunki:
a+b>c
a+c>b
b+c>a
W przypadku wprowadzenia niepoprawnych danych program ma wyrzucić komunikat: BŁĄD.
 */

import java.util.Scanner;

public class TrinagleCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj boki trójkąta rozdzielone spacją: ");
        double a, b, c;
        if (scanner.hasNextDouble()) {
            a = scanner.nextDouble();
        } else {
            System.out.println("BŁĄD");
            return;
        }
        if (scanner.hasNextDouble()) {
            b = scanner.nextDouble();
        } else {
            System.out.println("BŁĄD");
            return;
        }
        if (scanner.hasNextDouble()) {
            c = scanner.nextDouble();
        } else {
            System.out.println("BŁĄD");
            return;
        }

        if (a+b>c && a+c>b && b+c>a) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }
    }
}

