package database.entities;

/**
 *
 * @author Adm
 */
public class Cities {

    private int id;

    private String name;

    private int country;

    private int capital;
    
    private float latitude;
    
    private float longitude;

    public Cities() {
    }

    public Cities(int id, String name, int country, int capital, float latitude, float longitude) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.capital = capital;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Cities{" + "id=" + id + ", name=" + name + ", country=" + country + ", capital=" + capital + ", latitude=" + latitude + ", longitude=" + longitude + '}';
    }
    
    
}
