public class App {
    public static void main(String[] args) throws Exception {
        SimpleCalculator aCalc = new SimpleCalculatorImpl();
        System.out.println("4 + 5 = "+aCalc.add(4, 5));
        System.out.println("4 - 5 = "+aCalc.sub(4, 5));
        System.out.println("4 * 5 = "+aCalc.mul(4, 5));
        System.out.println("4 / 5 = "+aCalc.div(4, 5));
        System.out.println("4 / 0 = "+aCalc.div(4, 0));
    }
}
