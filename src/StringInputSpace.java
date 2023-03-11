/*
Zadanie 3
Napisz program, który pobierze od użytkownika dwa ciągi tekstowe (rozdzielone znakiem spacji)
napis1 oraz napis2, a następnie wyświetli ciąg tekstowy w następującym formacie: `"%napis2 napis1%"`.
 */
import java.util.Scanner;
public class StringInputSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj dwa zdania rozdzielone spacją: ");
        String input = scanner.nextLine();
        String[] inputs = input.split(" ");
        String napis1 = inputs[0];
        String napis2 = inputs[1];

        System.out.println("\"%" +napis2+" "+napis1+"%\"");

    }
}
