public class Calculation {
    
    public static double flächeRechteck(String aS, String  bS) {
        double a = Double.parseDouble(aS);
        double b = Double.parseDouble(bS);
        double result = a * b;
        System.out.println("Ihr Ergebnis lautet: " + result + "cm².");
        return result;
    }

    public static double flächeTrapez(String aS, String cS, String hS) {
        double a = Double.parseDouble(aS);
        double c = Double.parseDouble(cS);
        double h = Double.parseDouble(hS);
        double result = (a + c) / 2 * h;
        System.out.println("Ihr Ergebnis lautet: " + result + "cm².");
        return result;
    }

    public static void cont(){
        try {
            System.in.read();
        } catch (Exception e){}
    }
}
