public class CalculatorImpl implements SimpleCalculator{

    @Override
    public double add(double x, double y) {
        return (x+y);
    }

    @Override
    public double sub(double x, double y) {
        return (x-y);
    }

    @Override
    public double mul(double x, double y) {
        return (x*y);
    }

    @Override
    public double div(double x, double y) throws ArithmeticException{
        if(y == 0){
            throw new ArithmeticException("Division by zero is not allowed");
        }
        else{
            return (x/y);
        }
    }
    
}
