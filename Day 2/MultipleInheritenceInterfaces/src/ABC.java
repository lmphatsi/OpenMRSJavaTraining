public class ABC implements B, C{

    @Override
    public void foo() {
        System.out.println("foo method "+ PI);
    }

    @Override
    public void hello() {
        System.out.println("hello method "+ PI);
    }

    @Override
    public void bar() {
        System.out.println("bar method "+ PI);
    }
    
}
