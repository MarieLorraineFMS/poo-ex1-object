public class Person {
    private String lastName; // required
    private String firstName; // required
    private int age; // >= 0
    private String address;
    private String sex;
    private City birthCity;

    ////////////// CONSTRUCTOR ////////////////////////////////////////////////

    public Person(String lastName, String firstName, int age, String address) {
        // basic guards
        this.lastName = (lastName == null || lastName.isBlank()) ? "Unknown" : lastName;
        this.firstName = (firstName == null || firstName.isBlank()) ? "Unknown" : firstName;
        this.age = Math.max(0, age); // never negative
        this.address = (address == null || address.isBlank()) ? "Unknown address" : address;
        this.birthCity = new City("Unknown", "Unknown", 0);
    }

    public Person(String lastName, String firstName, int age, String address, City birthCity) {
        this(lastName, firstName, age, address);
        if (birthCity != null) {
            this.birthCity = birthCity;
        }
    }

    ///////////// GETTERS ////////////////////////////////////////////////////

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public City getBirthCity() {
        return birthCity;
    }

    ///////////// SETTERS ////////////////////////////////////////////////////

    public void setLastName(String lastName) {
        if (lastName != null && !lastName.isBlank())
            this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        if (firstName != null && !firstName.isBlank())
            this.firstName = firstName;
    }

    public void setAge(int age) {
        if (age >= 0)
            this.age = age;
    }

    public void setAddress(String address) {
        if (address != null && !address.isBlank())
            this.address = address;
    }

    public void setBirthCity(City birthCity) {
        if (birthCity != null) {
            this.birthCity = birthCity;
        }
    }

    ////////// PRINT /////////////////////////////////////////////

    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " , " + age + " ans. Demeurant : " + address
                + ". Né à : " + birthCity.toString();
    }
}
