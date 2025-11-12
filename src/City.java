public class City {

    // Encapsulated 1.2
    private String name;
    private String country;
    private int nbInhabitants;

    /////////////// CONSTRUCTOR /////////////////////

    public City(String name, String country, int nbInhabitants) {
        this.name = (name == null || name.isBlank()) ? "Unknown" : name; // no empty name
        this.country = (country == null || country.isBlank()) ? "Unknown" : country; // no empty country
        this.nbInhabitants = Math.max(0, nbInhabitants); // no negative inhabitants
    }

    // 1.3 Constructor with name & inhabitants and country defaults set to "Unknown"
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
}
