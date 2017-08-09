
public class Bird {

    private String name;
    private String latinName;
    private int ringingYear;

    public Bird(String name, String latinName, int ringingYear) {
        this.name = name;
        this.latinName = latinName;
        this.ringingYear = ringingYear;
    }

    @Override
    public boolean equals(Object obj) {
        // empty object
        if (obj == null) {
            return false;
        }

        // different type of object
        if (this.getClass() != obj.getClass()) {
            return false;
        }

        Bird compared = (Bird) obj;
        // comparing content of objects
        if (this.latinName == null || !this.latinName.equals(compared.latinName)) {
            return false;
        }
        
        if (this.ringingYear < 0 || this.ringingYear != compared.ringingYear) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        if (this.latinName == null) {
            return 7;
        }       

        return this.latinName.hashCode();
    }

    @Override
    public String toString() {
        return this.latinName + " (" + this.ringingYear + ")";
    }
}
