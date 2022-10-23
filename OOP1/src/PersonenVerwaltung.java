import java.util.*;

public class PersonenVerwaltung {
    private List<Person> personList = new ArrayList<>();
    public void createPerson(String firstName, String lastName, Gender gender, String birthDate) {
        Person p = new Person(lastName, firstName,  gender, birthDate);
        personList.add(p);
    }
    protected void createPerson(String firstName, String lastName) {
        Person p = new Person(firstName, lastName);
        personList.add(p);
    }

    protected void createPerson(String firstName, String lastName, String birthDate, Gender gender) {
        Person p = new Person( firstName, lastName, birthDate, gender);
        personList.add(p);
    }



    protected boolean removePerson(String lastName) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getLastname(lastName).equals(lastName)) {
                personList.remove(i);
                return true;
            }
        }
        return false;
    }

    public void printStaff() {
        for (Person p : personList) {
            System.out.println(p);
        }
    }
}