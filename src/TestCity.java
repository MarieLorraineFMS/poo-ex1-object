public class TestCity {
    public static void main(String[] args) {
        City toulouse = new City("Toulouse", "France", 450_000);
        City paris = new City("Paris", "France", 2_000_000);
        City nice = new City("Nice", "France", 340_000);
        City limoges = new City("Limoges", 133_000);

        //////////////// PRINT //////////////////////////////

        System.out.println("Print Toulouse : " + toulouse);
        System.out.println("Print Paris : " + paris);
        System.out.println("Print Nice : " + nice);
        System.out.println("Print Limoges : " + limoges);

        // 1.7
        System.out.println("City instances = " + City.getCityCount());

        // 1.7 one more city
        City lyon = new City("Lyon", "France", 520_000);
        System.out.println("Print Lyon : " + lyon);
        System.out.println("City instances = " + City.getCityCount());

    }
}
