
public class DivisionByZeroException extends Exception{
    @Override
    public String getMessage(){
        return("Division by zero is not allowed");
    }

}
