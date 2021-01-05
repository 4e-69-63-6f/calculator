import java.util.Scanner;

public class Loop {

    //Programm-Loop
    public static void programLoop() {
        Scanner scanner = new Scanner(System.in);
        int inputLoop = 1;
        while (inputLoop != 0) {
            System.out.println("\nWas wollen sie berechnen?");
            System.out.println("\n1 = Flächeninhalt Quadrat");
            System.out.println("2 = Flächeninhalt Trapez");
            System.out.println("0 = Programm beenden");
            System.out.println("    Alle Angaben in cm.");
            System.out.print("\nIhre Eingabe: ");
            String inputString = scanner.nextLine();
            
            try {
                int input = Integer.parseInt(inputString);
                inputLoop = input;

                if (inputLoop < 0 || inputLoop > 2) {
                    System.out.println("Ungültige Eingabe!");
                } else {
                    choice(input);
                }
            }catch (NumberFormatException ex) {
                if ("Easter Egg".equals(inputString)) {
                    for (int i = 0; i < 1000; i++) {
                        System.out.println("Haha du Noob :))))))");
                    }
                    break;
                } else {
                    System.err.println("Ungültige Eingabe !");
                }
            }
        }
    }

    //Auswahl des Anwenders und Eingaben verarbeiten/weitergeben.
    public static void choice(int input) {
        Scanner scanner = new Scanner(System.in);
        String aInput, bInput, cInput, hInput;
        if (input == 1) {
            System.out.print("Geben sie Seite \"a\" an: ");
            aInput = scanner.nextLine();
            System.out.print("\nGeben sie Seite \"b\" an: ");
            bInput = scanner.nextLine();

            Calculation.flächeRechteck(aInput, bInput);

            System.out.println("Zum Fortfahren, drücke die Eingabetaste.");
            Calculation.cont();
        } else if (input == 2) {
            System.out.print("Geben sie Seite \"a\" an: ");
            aInput = scanner.nextLine();
            System.out.print("\nGeben sie Seite \"c\" an: ");
            cInput = scanner.nextLine();
            System.out.print("\nGeben sie die Höhe \"h\" an: ");
            hInput = scanner.nextLine();

            Calculation.flächeTrapez(aInput, cInput, hInput);

            System.out.println("Zum Fortfahren, drücke die Eingabetaste.");
            Calculation.cont();
        } else if (input == 0) {
            System.out.println("Verlasse Anwendung!");
        }
    }

    //Funktioniert noch nicht...Soll User Input an Double binden und Exceptions bei "falschem" Input abfangen.
    /*
    public static double parse(double input) {
        Scanner scanner = new Scanner(System.in);

        try {
            input = scanner.nextDouble();
        } catch (NumberFormatException ex) {
            System.err.println("Ungültige Eingabe!");
        }
        return input;
    }*/
}
