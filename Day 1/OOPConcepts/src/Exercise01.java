public class Exercise01 {
    public static void main(String[] args) throws Exception {

        A aObject = new A("Ola class A");
        //B bObject = new B("Ola class B");
        B bObject = new B();

        aObject.hello();
        bObject.hello();

        A c = new B();
        c.hello();
    }
}
