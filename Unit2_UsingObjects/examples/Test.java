package Unit2_UsingObjects.examples;



public class Test {
    public static double calculate(double x){
        return x * 2;
    }
    public static void main(String[] args) {
        Double n = new Double(7.0);
        System.out.println(calculate(n));
    }
}
