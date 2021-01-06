//do calculations
public class Calculation {

    public static void oneVariable(String xS, String ch) {
        double x = Double.parseDouble(xS);

        if ("areaSquare".equals(ch)) {
            double result = x * x;
            System.out.println("Your result is: " + round(result) + "cm².");
        } else if ("volumeCube".equals(ch)) {
            double result = x * x * x;
            System.out.println("Your result is: " + round(result) + "cm³.");
        }
    }

    public static void twoVariables(String xS, String  yS, String ch) {
        double x = Double.parseDouble(xS);
        double y = Double.parseDouble(yS);

        if ("areaRecPara".equals(ch)) {
            double result = x * y;
            System.out.println("Your result is: " + round(result) + "cm².");
        } else if ("areaTriangle".equals(ch)) {
            double result = (x * y) / 2;
            System.out.println("Your result is: " + round(result) + "cm².");
        } else if ("volumePrism".equals(ch)) {
            double result = x * y;
            System.out.println("Your result is: " + round(result) + "cm³.");
        } else if ("volumeCone".equals(ch)) {
            double result = (3.14 * (x * x) * y) / 3;
            System.out.println("Your result is: " + round(result) + "cm³.");
        } else if ("volumeCylinder".equals(ch)) {
            double result = (3.14 * (x * x) * y);
            System.out.println("Your result is: " + round(result) + "cm³.");
        }
    }

    public static void threeVariables(String xS, String yS, String zS, String ch) {
        double x = Double.parseDouble(xS);
        double y = Double.parseDouble(yS);
        double z = Double.parseDouble(zS);

        if ("areaTrapezoid".equals(ch)) {
            double result = (x + y) / 2 * z;
            System.out.println("Your result is: " + round(result) + "cm².");
        } else if ("volumeCuboid".equals(ch)) {
            double result = x * y * z;
            System.out.println("Your result is: " + round(result)  + "cm³.");
        }
    }

    private static double round(double value) {
        int decimalPoints = 2;
        double d = Math.pow(10, decimalPoints);
        return Math.round(value * d) / d;
    }

    public static void cont(){
        try {
            System.out.print("Press Enter to proceed.");
            System.in.read();
        } catch (Exception e){}
    }
}
