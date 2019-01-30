public class Student {

    private String naam;
    private String studentnummer;

    public Student(String naam, String studentnummer) {
        this.naam = naam;
        this.studentnummer = studentnummer;
    }

    @Override
    public String toString() {
        return "Student{" +
                "naam='" + naam + '\'' +
                ", studentnummer='" + studentnummer + '\'' +
                '}';
    }
}
