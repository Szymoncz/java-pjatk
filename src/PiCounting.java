/*
Zadanie 2
Napisz program, który wyświetla na ekranie komputera pierwiastek kwadratowy
z wartości liczby pi z dokładnością do dwóch miejsc po przecinku.
*/
public class PiCounting {
        public static void main(String[] args) {
            double pi = Math.PI;
            double sqrtPi = Math.sqrt(pi);
            double roundedSqrtPi = Math.round(sqrtPi * 100.0) / 100.0;
            System.out.println("Pierwiastek kwadratowy z liczby pi wynosi: " + roundedSqrtPi);
        }
    }