public class OOPConcepts2 {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Animal [] animals = {new Cat(), new Lion(), new Wolf(), new Dog()};
        
        for(int i = 0 ; i < animals.length ; i++){
            animals[i].hello();
        }
    }
}
