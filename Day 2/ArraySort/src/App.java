import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Person [] persons = {new Person("Thabo", "Zakes"), new Person("Thabizo", "Wadada"), new Person("Tlaka", "Abayo"), new Person("Thakaka", "Adada")};

        //print before sorting
        int i = 1;
        System.out.println("Before Sorting");
        for(Person p : persons){
            System.out.print(i+": "+p.getForename()+" "+p.getSurname());
            System.out.println();
            i++;
        }
        Arrays.sort(persons);

        //print after sorting
        i = 1;
        System.out.println("After Sorting");
         for(Person p : persons){
            System.out.print(i+": "+p.getForename()+" "+p.getSurname());
            System.out.println();
            i++;
        }
    }
}
