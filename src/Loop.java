import java.util.Scanner;

public class Loop {

    //Program-Loop an record user-input
    public static void programLoop() {
        Scanner scanner = new Scanner(System.in);
        int inputLoop = 1;
        while (inputLoop != 0) {
            System.out.println("\nWhat do you want to calculate?");
            System.out.println("1 = Area: Rectangle");
            System.out.println("2 = Area: Trapezoid");
            System.out.println("3 = Area: Square");
            System.out.println("4 = Area: Parallelogram");
            System.out.println("5 = Area: Triangle");
            System.out.println("6 = Volume: Cuboid");
            System.out.println("7 = Volume: Cube");
            System.out.println("8 = Volume: Prism");
            System.out.println("9 = Volume: Cone");
            System.out.println("10 = Volume: Cylinder");
            System.out.println("0 = Exit Program");
            System.out.println("    Every input in centimeters.");
            System.out.println("    Replace commas with dots!");
            System.out.print("\nYour Input: ");
            String inputString = scanner.nextLine();
            
            try {
                int input = Integer.parseInt(inputString);
                inputLoop = input;

                if (inputLoop < 0 || inputLoop > 10) {
                    System.err.println("Invalid Input!");
                    Calculation.cont();
                } else {
                    Choose.choice(input);
                }
            }catch (NumberFormatException ex) {
                if ("Easter Egg".equals(inputString)) {
                    for (int i = 0; i < 1000; i++) {
                        System.out.println("Haha you Noob :))))))");
                    }
                    break;
                } else {
                    System.err.println("Invalid Input");
                    Calculation.cont();
                }
            }
        }
    }
}
