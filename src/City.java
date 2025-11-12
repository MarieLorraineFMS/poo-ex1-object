public class City {

    private String name;
    private String country;
    private int nbInhabitants;

    // 1.7 Counter
    private static int cityCounter = 0;

    /////////////// CONSTRUCTOR /////////////////////

    public City(String name, String country, int nbInhabitants) {
        this.name = (name == null || name.isBlank()) ? "Unknown" : name; // no empty name
        this.country = (country == null || country.isBlank()) ? "Unknown" : country; // no empty country
        this.nbInhabitants = Math.max(0, nbInhabitants); // no negative inhabitants
        cityCounter++; // 1.7 Increment on each creation
    }

    public City(String name, int nbInhabitants) {
        this(name, "Unknown", nbInhabitants);
    }

    /////////////// GETTERS /////////////////////////

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getNbInhabitants() {
        return nbInhabitants;
    }

    // 1.7
    public static int getCityCount() {
        return cityCounter;
    }

    /////////////// SETTERS /////////////////////////

    public void setName(String name) {
        // prevent empty
        if (name == null || name.isBlank()) {
            return; // keep previous
        }
        this.name = name;
    }

    public void setCountry(String country) {
        // prevent empty
        if (country == null || country.isBlank()) {
            return; // keep previous
        }
        this.country = country;
    }

    public void setNbInhabitants(int nbInhabitants) {
        // allow decrease/increase but never < 0
        if (nbInhabitants < 0) {
            return;
        }
        this.nbInhabitants = nbInhabitants;
    }

    @Override
    public String toString() {
        return "City of " + name + " in " + country + " with " + nbInhabitants + " inhabitants";
    }
}
