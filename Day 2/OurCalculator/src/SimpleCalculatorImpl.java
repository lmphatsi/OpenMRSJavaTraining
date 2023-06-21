public class SimpleCalculatorImpl implements SimpleCalculator{

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
    public double div(double x, double y) throws DivisionByZeroException{
        if(y == 0){
            throw new DivisionByZeroException();
        }
        return (x/y);
    }
    
}
