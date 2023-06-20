public class App {
    public static void main(String[] args) throws Exception {
        CalculatorImpl myCalc = new CalculatorImpl();
        System.out.println("3 * 4 = "+ myCalc.mul(3,4));
        System.out.println("3 + 4 = "+ myCalc.add(3,4));
        System.out.println("3 - 4 = "+ myCalc.sub(3,4));
        System.out.println("3 / 4 = "+ myCalc.div(3,4));
        System.out.println("0 / 4 = "+ myCalc.div(0,4));
        System.out.println("3 / 0 = "+ myCalc.div(3,0));
    }
}
