public class Animal extends Organism{
    private String sound;

    Animal(String sound){
        this.sound = sound;
    }

    public void hello(){
        System.out.println(sound);
    }
}
