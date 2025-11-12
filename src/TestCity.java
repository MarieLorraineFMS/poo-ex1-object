public class TestCity {
    public static void main(String[] args) {
        City toulouse = new City("Toulouse", "France", 450_000);
        City paris = new City("Paris", "France", 2_000_000);
        City nice = new City("Nice", "France", 340_000);

        //////////////// PRINT //////////////////////////////

        System.out.println(
                "Paris -> " + paris.getName() + " / " + paris.getCountry() + " / " + paris.getNbInhabitants());
        System.out
                .println("Nice -> " + nice.getName() + " / " + nice.getCountry() + " / " + nice.getNbInhabitants());

        toulouse.setNbInhabitants(toulouse.getNbInhabitants() + 20_000);

        System.out.println("Toulouse add +20k inhabitants -> " + toulouse.getNbInhabitants());

    }
}
