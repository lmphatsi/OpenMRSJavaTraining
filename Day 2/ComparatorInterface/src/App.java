import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
       
        List<Patient> patients = new ArrayList<Patient>();
        patients.add(new Patient("Thakaka", "PO Matatiele", LocalDate.now(), 70));
        patients.add(new Patient("Letebele", "PO Matatiele", LocalDate.now(), 60));
        patients.add(new Patient("Mzondaze", "PO Matatiele", LocalDate.now(), 78));
        patients.add(new Patient("Masiba", "PO Matatiele", LocalDate.now(), 56));
       
        System.out.println("List before sorting");
        System.out.println(patients);
        patients.sort(new PatientSort());
        System.out.println("List after sorting");
        System.out.println(patients);

    }
}
