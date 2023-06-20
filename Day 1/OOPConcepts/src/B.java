public class B extends A{
    B(){
        super("Hello");
    }

    @Override
    public void hello(){
        //System.out.println(this.getClass() + " " + message);
        super.hello();
    }
}
