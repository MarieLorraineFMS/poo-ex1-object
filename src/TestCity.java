public class TestCity {
    public static void main(String[] args) {
        City toulouse = new City("Toulouse", "France", 450_000);
        City paris = new City("Paris", "France", 2_000_000);
        City nice = new City("Nice", "France", 340_000);

        //////////////// PRINT //////////////////////////////

        System.out.println("Toulouse -> " + toulouse.name + " / " + toulouse.country + " / " + toulouse.nbInhabitants);
        System.out.println("Paris    -> " + paris.name + " / " + paris.country + " / " + paris.nbInhabitants);
        System.out.println("Nice     -> " + nice.name + " / " + nice.country + " / " + nice.nbInhabitants);

        toulouse.nbInhabitants += 20_000;

        System.out.println("Toulouse +20k -> " + toulouse.nbInhabitants);
    }
}
