/*
Zadanie 5
Napisz program, który dla podanej liczby z odpowiedniego zakresu wyświetli jaki to miesiąc i ile ma on dni.
Zakładamy, że rok tutaj nie jest przestępny.
W przypadku niepoprawnych danych program ma wypisać komunikat: BŁĄD.
Użyj słowa kluczowego switch.
 */

import java.util.Scanner;

public class MonthCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wpisz nr miesiąca: ");
        int month = scanner.nextInt();

        int daysInMonth;

        switch (month) {
            case 1:
                System.out.println("Styczeń");
                daysInMonth = 31;
                break;
            case 2:
                System.out.println("Luty");
                daysInMonth = 28;
                break;
            case 3:
                System.out.println("Marzec");
                daysInMonth = 31;
                break;
            case 4:
                System.out.println("Kwiecień");
                daysInMonth = 30;
                break;
            case 5:
                System.out.println("Maj");
                daysInMonth = 31;
                break;
            case 6:
                System.out.println("Czerwiec");
                daysInMonth = 30;
                break;
            case 7:
                System.out.println("Lipiec");
                daysInMonth = 31;
                break;
            case 8:
                System.out.println("Sierpień");
                daysInMonth = 31;
                break;
            case 9:
                System.out.println("Wrzesień");
                daysInMonth = 30;
                break;
            case 10:
                System.out.println("Październik");
                daysInMonth = 31;
                break;
            case 11:
                System.out.println("Listopad");
                daysInMonth = 30;
                break;
            case 12:
                System.out.println("Grudzień");
                daysInMonth = 31;
                break;
            default:
                System.out.println("BŁĄD");
                return;
        }

        System.out.println("Liczba dni w wybranym miesiącu: " + daysInMonth);
    }
}