import java.util.Scanner;

public class Person {
    private String birthdate = "unknown";
    private String firstName;
    private String lastName;
    private Gender gender;
    private Address address;
    Scanner scanner = new Scanner(System.in);

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String lastName, String firstName, Gender gender, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthdate = birthDate;
    }


    protected Person(String lastname, String firstname, String birthdate, Gender gender) {
        this.firstName = firstname;
        this.lastName = lastname;
        this.birthdate = birthdate;
        this.gender = gender;
        System.out.println("Enter the street where the Person life (only Street Name)");
        String street = scanner.nextLine();
        System.out.println("Enter the Housnumber");
        String houseNumber = scanner.nextLine();
        System.out.println("Enter the City Name");
        String location = scanner.nextLine();
        System.out.println("Enter The PostCode of the City");
        int postCode = Integer.parseInt(scanner.nextLine());
        this.address = new Address(street, houseNumber, location, postCode);
    }

    public String getFirstname() {
        return firstName;
    }

    public String getLastname(String lastName) {
        return this.lastName;
    }

    public void setLastname(String lastname) {
        this.lastName = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstName = firstname;
    }

    public String getBirthdate(String birthDate) {
        this.birthdate = birthDate;
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (firstName != null) {
            sb.append("Firstname: ").append(firstName).append(" ");
        }
        if (lastName != null) {
            sb.append("Lastname: ").append(lastName).append(" ");
        }

        if (address == null) {
            return "firstname : " + firstName + ", lastname : " + lastName + ", birthdate : " + birthdate + " Gender : " + gender + " " + "Address is unknown";
        }
        return "firstname : " + firstName + ", lastname : " + lastName + ", birthdate : " + birthdate + " Gender : " + gender + " " + address;

    }


}
