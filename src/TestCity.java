public class TestCity {
    public static void main(String[] args) {
        City toulouse = new City("Toulouse", "France", 450_000);
        City paris = new City("Paris", "France", 2_000_000);
        City nice = new City("Nice", "France", 340_000);

        // 1.3 New city with name & inhabitants and country set via setter
        City limoges = new City("Limoges", 133_000);
        limoges.setCountry("France");

        //////////////// PRINT //////////////////////////////

        System.out.println(
                "Paris -> " + paris.getName() + " / " + paris.getCountry() + " / " + paris.getNbInhabitants());
        System.out
                .println("Nice -> " + nice.getName() + " / " + nice.getCountry() + " / " + nice.getNbInhabitants());

        toulouse.setNbInhabitants(toulouse.getNbInhabitants() + 20_000);

        System.out.println("Toulouse add +20k inhabitants -> " + toulouse.getNbInhabitants());

        // 1.3
        System.out.println(
                "Limoges  -> " + limoges.getName() + " / " + limoges.getCountry() + " / " + limoges.getNbInhabitants());

    }
}
