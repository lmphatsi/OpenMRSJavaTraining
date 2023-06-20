public class Person implements Comparable<Person>{
    private String forename;
    private String surname;

    Person(String forename, String surname){
        this.forename = forename;
        this.surname = surname;
    }

    public String getForename(){
        return forename;
    }

    public String getSurname(){
        return surname;
    }

    @Override
    public int compareTo(Person o) {
       return this.getSurname().compareTo(o.getSurname());
    }
}