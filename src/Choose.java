import java.util.Scanner;

public class Choose {
    Calculation calc = new Calculation();
    
    //process user-input
    public void choice(int input) {
        Scanner scanner = new Scanner(System.in);
        String aInput, bInput, cInput, gInput, hInput, rInput;
        final String areaRecPara = "areaRecPara";
        final String areaTrapezoid = "areaTrapezoid";
        final String areaSquare = "areaSquare";
        final String areaTriangle = "areaTriangle";
        final String volumeCuboid = "volumeCuboid";
        final String volumeCube = "volumeCube";
        final String volumeCone = "volumeCone";
        final String volumeCylinder = "volumeCylinder";
        final String a = "Indicate value \"a\": ";
        final String b = "Indicate value \"b\": ";
        final String c = "Indicate value \"c\": ";
        final String G = "Indicate value \"G\": ";
        final String g = "Indicate value \"g\": ";
        final String h = "Indicate value \"h\": ";
        final String hk = "Indicate value \"hĸ\": ";
        final String r = "Indicate value \"r\": ";

        if (input == 1) {
            System.out.print(a);
            aInput = scanner.nextLine();
            System.out.print("\n" + b);
            bInput = scanner.nextLine();
            calc.twoVariables(aInput, bInput, areaRecPara);

            calc.cont();
        } else if (input == 2) {
            System.out.print(a);
            aInput = scanner.nextLine();
            System.out.print("\n" + c);
            cInput = scanner.nextLine();
            System.out.print("\n" + h);
            hInput = scanner.nextLine();
            calc.threeVariables(aInput, cInput, hInput, areaTrapezoid);

            calc.cont();
        } else if (input == 3) {
            System.out.print(a);
            aInput = scanner.nextLine();
            calc.oneVariable(aInput, areaSquare);

            calc.cont();
        } else if (input == 4) {
            System.out.print(g);
            gInput = scanner.nextLine();
            System.out.print("\n" + h);
            hInput = scanner.nextLine();
            calc.twoVariables(gInput, hInput, areaRecPara);

            calc.cont();
        } else if (input == 5) {
            System.out.print(g);
            gInput = scanner.nextLine();
            System.out.print("\n" + h);
            hInput = scanner.nextLine();
            calc.twoVariables(gInput, hInput, areaTriangle);

            calc.cont();
        } else if (input == 6) {
            System.out.print(a);
            aInput = scanner.nextLine();
            System.out.print("\n" + b);
            bInput = scanner.nextLine();
            System.out.print("\n" + c);
            cInput = scanner.nextLine();
            calc.threeVariables(aInput, bInput, cInput, volumeCuboid);

            calc.cont();
        } else if (input == 7) {
            System.out.print(a);
            aInput = scanner.nextLine();
            calc.oneVariable(aInput, volumeCube);

            calc.cont();
        } else if (input == 8) {
            System.out.print(G);
            gInput = scanner.nextLine();
            System.out.print("\n" + hk);
            hInput = scanner.nextLine();
            calc.twoVariables(gInput, hInput, areaRecPara);

            calc.cont();
        } else if (input == 9) {
            System.out.print(r);
            rInput = scanner.nextLine();
            System.out.print("\n" + h);
            hInput = scanner.nextLine();
            calc.twoVariables(rInput, hInput, volumeCone);

            calc.cont();
        } else if (input == 10) {
            System.out.print(r);
            rInput = scanner.nextLine();
            System.out.print("\n" + h);
            hInput = scanner.nextLine();
            calc.twoVariables(rInput, hInput, volumeCylinder);

            calc.cont();
        }
        else if (input == 0) {
            System.out.println("Exit Application!");
        }
    }
}
