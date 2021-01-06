//do calculations
public class Calculation {
    final String resultString = "\nYour result is: ";
    final String squareCm = "cm².";
    final String cubicCm = "cm³.";
    public void oneVariable(String xS, String ch) {
        double x = Double.parseDouble(xS);

        if ("areaSquare".equals(ch)) {
            double result = Math.pow(x, 2);
            System.out.println(resultString + round(result) + squareCm);
        } else if ("volumeCube".equals(ch)) {
            double result = Math.pow(x, 3);
            System.out.println(resultString + round(result) + cubicCm);
        }
    }

    public void twoVariables(String xS, String  yS, String ch) {
        double x = Double.parseDouble(xS);
        double y = Double.parseDouble(yS);

        if ("areaRecPara".equals(ch)) {
            double result = x * y;
            System.out.println(resultString + round(result) + squareCm);
        } else if ("areaTriangle".equals(ch)) {
            double result = (x * y) / 2;
            System.out.println(resultString + round(result) + squareCm);
        } else if ("volumeCone".equals(ch)) {
            double result = (Math.PI * (Math.pow(x, 2)) * y) / 3;
            System.out.println(resultString + round(result) + cubicCm);
        } else if ("volumeCylinder".equals(ch)) {
            double result = (Math.PI * (Math.pow(x, 2)) * y);
            System.out.println(resultString + round(result) + cubicCm);
        }
    }

    public void threeVariables(String xS, String yS, String zS, String ch) {
        double x = Double.parseDouble(xS);
        double y = Double.parseDouble(yS);
        double z = Double.parseDouble(zS);

        if ("areaTrapezoid".equals(ch)) {
            double result = (x + y) / 2 * z;
            System.out.println(resultString + round(result) + squareCm);
        } else if ("volumeCuboid".equals(ch)) {
            double result = x * y * z;
            System.out.println(resultString + round(result)  + cubicCm);
        }
    }

    private double round(double value) {
        int decimalPoints = 2;
        double d = Math.pow(10, decimalPoints);
        return Math.round(value * d) / d;
    }

    public void cont(){
        try {
            System.out.print("Press Enter to proceed.");
            System.in.read();
        } catch (Exception e){
            System.err.println("Invalid Input!");
        }
    }
}
