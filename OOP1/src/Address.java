public class Address {
    public static Address Person;
    private String street;
    private int postCode;
    private String houseNumber;
    private String location;

    public  Address(String street, String housenumber, String location, int postCode) {
        this.street = street;
        this.houseNumber = housenumber;
        this.location = location;
        this.postCode = postCode;

    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "residence=" + street +
                ", postCode=" + postCode +
                ", housenumber='" + houseNumber + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}