public class TestPerson {
    public static void main(String[] args) {

        Person p1 = new Person("Torvalds", "Linus", 56, "Kernel St., Helsinki");
        Person p2 = new Person("Strife", "Cloud", 21, "Sector 7, Midgar");
        Person p3 = new Person("Stormrage", "Illidan", 10000, "Black Temple, Outland");

        p1.display();
        p2.display();
        p3.display();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
