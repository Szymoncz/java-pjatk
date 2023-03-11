/*
Zadanie 1
Napisz program, który obliczy pole prostokąta o bokach a i b,
wprowadzonych wcześniej przez użytkownika (każda wartość będzie znajdować się w osobnej linii).
*/
import java.util.Scanner;

public class RectangleField {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj bok a: ");
        double a = scan.nextDouble();
        System.out.println("Podaj bok b: ");
        double b = scan.nextDouble();

        System.out.println("Pole prostokąta wynosi "+a*b);
    }

}
