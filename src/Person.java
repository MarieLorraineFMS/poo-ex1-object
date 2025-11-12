public class Person {
    private String lastName; // required
    private String firstName; // required
    private int age; // >= 0
    private String address;

    ////////////// CONSTRUCTOR ////////////////////////////////////////////////

    public Person(String lastName, String firstName, int age, String address) {
        // basic guards
        this.lastName = (lastName == null || lastName.isBlank()) ? "Unknown" : lastName;
        this.firstName = (firstName == null || firstName.isBlank()) ? "Unknown" : firstName;
        this.age = Math.max(0, age); // never negative
        this.address = (address == null || address.isBlank()) ? "Unknown address" : address;
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

    ////////// PRINT /////////////////////////////////////////////

    public void display() {
        System.out.println(firstName + " " + lastName + " , " + age + " ans. Demeurant :  " + address);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " , " + age + " ans. Demeurant :  " + address;
    }
}
