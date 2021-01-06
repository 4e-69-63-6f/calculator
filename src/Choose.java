import java.util.Scanner;

public class Choose {
    //process user-input
    public static void choice(int input) {
        Scanner scanner = new Scanner(System.in);
        String aInput, bInput, cInput, gInput, hInput, rInput;
        final String areaRecPara = "areaRecPara";
        final String areaTrapezoid = "areaTrapezoid";
        final String areaSquare = "areaSquare";
        final String areaTriangle = "areaTriangle";
        final String volumeCuboid = "volumeCuboid";
        final String volumeCube = "volumeCube";
        final String volumePrism = "volumePrism";
        final String volumeCone = "volumeCone";
        final String volumeCylinder = "volumeCylinder";

        if (input == 1) {
            System.out.print("Indicate value \"a\": ");
            aInput = scanner.nextLine();
            System.out.print("\nIndicate value \"b\": ");
            bInput = scanner.nextLine();
            Calculation.twoVariables(aInput, bInput, areaRecPara);

            Calculation.cont();
        } else if (input == 2) {
            System.out.print("Indicate value \"a\": ");
            aInput = scanner.nextLine();
            System.out.print("\nIndicate value \"c\": ");
            cInput = scanner.nextLine();
            System.out.print("\nIndicate value \"h\": ");
            hInput = scanner.nextLine();
            Calculation.threeVariables(aInput, cInput, hInput, areaTrapezoid);

            Calculation.cont();
        } else if (input == 3) {
            System.out.print("Indicate value \"a\": ");
            aInput = scanner.nextLine();
            Calculation.oneVariable(aInput, areaSquare);

            Calculation.cont();
        } else if (input == 4) {
            System.out.print("Indicate value \"g\": ");
            gInput = scanner.nextLine();
            System.out.print("\nIndicate value \"h\": ");
            hInput = scanner.nextLine();
            Calculation.twoVariables(gInput, hInput, areaRecPara);

            Calculation.cont();
        } else if (input == 5) {
            System.out.print("Indicate value \"g\": ");
            gInput = scanner.nextLine();
            System.out.print("\nIndicate value \"h\": ");
            hInput = scanner.nextLine();
            Calculation.twoVariables(gInput, hInput, areaTriangle);

            Calculation.cont();
        } else if (input == 6) {
            System.out.print("Indicate value \"a\": ");
            aInput = scanner.nextLine();
            System.out.print("\nIndicate value \"b\": ");
            bInput = scanner.nextLine();
            System.out.print("\nIndicate value \"c\": ");
            cInput = scanner.nextLine();
            Calculation.threeVariables(aInput, bInput, cInput, volumeCuboid);

            Calculation.cont();
        } else if (input == 7) {
            System.out.print("Indicate value \"a\": ");
            aInput = scanner.nextLine();
            Calculation.oneVariable(aInput, volumeCube);

            Calculation.cont();
        } else if (input == 8) {
            System.out.print("Indicate value \"G\": ");
            gInput = scanner.nextLine();
            System.out.print("\nIndicate value \"hĸ\": ");
            hInput = scanner.nextLine();
            Calculation.twoVariables(gInput, hInput, volumePrism);

            Calculation.cont();
        } else if (input == 9) {
            System.out.print("Indicate value \"r\": ");
            rInput = scanner.nextLine();
            System.out.print("\nIndicate value \"h\": ");
            hInput = scanner.nextLine();
            Calculation.twoVariables(rInput, hInput, volumeCone);

            Calculation.cont();
        } else if (input == 10) {
            System.out.print("Indicate value \"r\": ");
            rInput = scanner.nextLine();
            System.out.print("\nIndicate value \"h\": ");
            hInput = scanner.nextLine();
            Calculation.twoVariables(rInput, hInput, volumeCylinder);

            Calculation.cont();
        }
        else if (input == 0) {
            System.out.println("Exit Application!");
        }
    }
}
