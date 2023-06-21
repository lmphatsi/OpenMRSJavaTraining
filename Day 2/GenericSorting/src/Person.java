public class Person implements Comparable<Person> {
    String forename;
    String surname;
    Integer id;

    Person(String forename, String surname, Integer id){
        this.forename=forename;
        this.surname=surname;
        this.id = id;
    }


    @Override
    public int compareTo(Person person) {
        return (this.id).compareTo(person.id);
    }
}
