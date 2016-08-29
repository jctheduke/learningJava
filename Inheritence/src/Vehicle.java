/**
 * Created by priyaranjanjc on 8/24/2016.
 */


public class Vehicle {

    private String name;
    private String model;
    private String year;
    private String price;
    private String stearing;
    private String gears;

    public Vehicle(String name, String model, String year, String price, String stearing, String gears) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.price = price;
        this.stearing = stearing;
        this.gears = gears;
    }

    public Vehicle(String name, String model, String year, String price, String stearing) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.price = price;
        this.stearing = stearing;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getPrice() {
        return price;
    }

    public String getStearing() {
        return stearing;
    }

    public String getGears() {
        return gears;
    }

}
