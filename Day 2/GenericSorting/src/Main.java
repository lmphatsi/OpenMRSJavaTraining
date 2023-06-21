import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person [] people = {
                new Person("Paballo", "Makhate", 123),
                new Person("Tiisetso", "Leqela", 234),
                new Person("Tlohang", "Moeketse",4),
                new Person("Monaheng", "Razzmatazz",56),
                new Person("Makhate", "Makhate",2),
        };

        for(Person aPerson : people){
            System.out.println(aPerson.id+ " "+aPerson.surname+ " "+aPerson.forename);
        }

        Arrays.sort(people);
        System.out.println();

        for(Person aPerson : people){
            System.out.println(aPerson.id+ " "+aPerson.surname+ " "+aPerson.forename);
        }
    }
}