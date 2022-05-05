package database.entities;

/**
 *
 * @author Adm
 */
public class Continents {
    private int id;

    private String name;
    
    private String area;

    private int population;

    public Continents() {
    }

    public Continents(int id, String name, String area, int population) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.population = population;
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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Continents{" + "id=" + id + ", name=" + name + ", area=" + area + ", population=" + population + '}';
    }
    
    

    
    
}
