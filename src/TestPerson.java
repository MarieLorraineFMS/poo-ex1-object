import java.util.List;

public class TestPerson {
    public static void main(String[] args) {

        City helsinki = new City("Helsinki", "Finland", 650_000);
        City bordeaux = new City("Bordeaux", "France", 260_000);
        City lyon = new City("Lyon", "France", 520_000);
        City nibelheim = new City("Nibelheim", "Gaia", 2_000); // FFVII lore (fictional)
        City suramar = new City("Suramar", "Azeroth", 100_000); // WoW lore (fictional)

        Person p1 = new Person("Torvalds", "Linus", 56, "Kernel St., Helsinki", helsinki);
        Person p2 = new Person("Strife", "Cloud", 21, "Sector 7, Midgar", nibelheim);
        Person p3 = new Person("Stormrage", "Illidan", 10000, "Black Temple, Outland", suramar);
        Person p4 = new Person("Houssein", "Corentin (Gotaga)", 30, "Rue de Rivoli, Paris", bordeaux);
        Person p5 = new Person("Astier", "Alexandre", 49, "Quai du Rhône, Lyon", lyon);

        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);

        /////// FILTERS ////////////////////////////////////////////

        // All persons
        var people = List.of(p1, p2, p3, p4, p5);

        // Born in Fr
        var bornInFrance = people.stream()
                .filter(p -> p.getBirthCity() != null
                        && "France".equalsIgnoreCase(p.getBirthCity().getCountry()))
                .toList();

        // Living in Paris
        var livingInParis = people.stream()
                .filter(p -> p.getAddress() != null
                        && p.getAddress().toLowerCase().contains("paris"))
                .toList();

        printPeople("== All Persons ==", people);
        printPeople("== Persons born in France ==", bornInFrance);
        printPeople("== Persons living in Paris ==", livingInParis);
    }

    private static void printPeople(String title, List<Person> list) {
        System.out.println(title);
        System.out.println();
        list.forEach(System.out::println);// list.forEach(x -> System.out.println(x));
        System.out.println();
    }
}
