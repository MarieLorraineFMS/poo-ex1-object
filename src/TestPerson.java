public class TestPerson {
    public static void main(String[] args) {

        City helsinki = new City("Helsinki", "Finland", 650_000);
        City nibelheim = new City("Nibelheim", "Gaia", 2_000); // FFVII lore (fictional)
        City suramar = new City("Suramar", "Azeroth", 100_000); // WoW lore (fictional)

        Person p1 = new Person("Torvalds", "Linus", 56, "Kernel St., Helsinki", helsinki);
        Person p2 = new Person("Strife", "Cloud", 21, "Sector 7, Midgar", nibelheim);
        Person p3 = new Person("Stormrage", "Illidan", 10000, "Black Temple, Outland", suramar);

        p1.display();
        p2.display();
        p3.display();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
