import java.time.LocalDate;

public class Patient{
    private String name;
    private String address;
    private LocalDate dateOfBirth;
    private int weight;


    public Patient(String name, String address, LocalDate dateOfBirth, int weight) {
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.weight = weight;
    }
    

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setDateOfBirth(LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }


    public String getName() {
        return this.name;
    }


    public String getAddress() {
        return this.address;
    }


    public LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }


    public int getWeight() {
        return this.weight;
    }
    

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", dateOfBirth='" + getDateOfBirth() + "'" +
                "}";
    } 

}