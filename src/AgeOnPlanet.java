/*
Zadanie 12
Jeżeli podamy wiek w sekundach, to jest możliwość obliczenia ile osoba ta ma lat na ziemi.
Kula ziemska przechodzi przez własną orbitę przez 365,25 dnia, które wynosi równo 31557600 sekund.
A więc jeżeli osoba ma 1000000000 sekund to łatwo można policzyć, że 1000000000/31557600 = 31,69 lat (w przybliżeniu do drugiego miejsca po przecinku).
Teraz rozpatrzmy metodę, która będzie przyjmowała wiek w sekundach oraz planetę którą chcemy obliczyć.
Napisz funkcje, a następnie program, który będzie zawierał tę metodę uwzględniając poniższe dane dotyczące innych planet:
Obrót Merkurego podczas własnej orbity wynosi 0.2408467 lat ziemskich
Obrót Wenus podczas własnej orbity wynosi 0.61519726 lat ziemskich
Obrót Marsa podczas własnej orbity wynosi 1.8808158 lat ziemskich
Obrót Jowisza podczas własnej orbity wynosi 11.862615 lat ziemskich
Obrót Saturna podczas własnej orbity wynosi 29.447498 lat ziemskich
Obrót Uranu podczas własnej orbity wynosi 84.016846 lat ziemskich
Obrót Neptuna podczas własnej orbity wynosi 164.79132 lat ziemskich
>WEJŚCIE:
1000000000
Ziemia
WYJŚCIE:
31.69
 */

import java.util.Scanner;

public class AgeOnPlanet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ageInSeconds;
        String planetName;

        System.out.print("Podaj wiek w sekundach: ");
        ageInSeconds = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Podaj nazwę planety: ");
        planetName = scanner.nextLine();

        double earthYears = ageInSeconds / 31557600.0;
        double ageOnPlanet = 0.0;

        switch (planetName.toLowerCase()) {
            case "merkury":
                ageOnPlanet = earthYears / 0.2408467;
                break;
            case "wenus":
                ageOnPlanet = earthYears / 0.61519726;
                break;
            case "mars":
                ageOnPlanet = earthYears / 1.8808158;
                break;
            case "jowisz":
                ageOnPlanet = earthYears / 11.862615;
                break;
            case "saturn":
                ageOnPlanet = earthYears / 29.447498;
                break;
            case "uran":
                ageOnPlanet = earthYears / 84.016846;
                break;
            case "neptun":
                ageOnPlanet = earthYears / 164.79132;
                break;
            case "ziemia":
                ageOnPlanet = earthYears;
                break;
            default:
                System.out.println("Nie ma takiej planety");
                return;
        }

        System.out.printf("Wiek na %s: %.2f lat\n", planetName, ageOnPlanet);
    }
}
