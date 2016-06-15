/**
 * 5.9 Reimplement the class of the preceding exercise in Java, C#, or C + + (your choice).
 * How much shorter is the Scala class?
 *
 * Make a class Car with read-only properties for manufacturer, model name, and model year, and a read-write property
 * for the license plate. Supply four constructors. All require the manufacturer and model name. Optionally, model year
 * and license plate can also be specified in the constructor. If not, the model year is set to -1 and the license plate
 * to the empty string.
 *
 * Created by icaste on 6/14/16.
 */
public class Car {
    private String manufacturer;
    private String model_name;
    private int model_year;

    private String license_plate;

    public Car(String manufacturer, String model_name){
        super();
        this.manufacturer = manufacturer;
        this.model_name = model_name;
        this.model_year = -1;
        this.license_plate = "";
    }

    public Car(String manufacturer, String model_name, int model_year){
        super();
        this.manufacturer = manufacturer;
        this.model_name = model_name;
        this.model_year = model_year;
        this.license_plate = "";
    }

    public Car(String manufacturer, String model_name, String license_plate){
        super();
        this.manufacturer = manufacturer;
        this.model_name = model_name;
        this.model_year = -1;
        this.license_plate = license_plate;
    }

    public Car(String manufacturer, String model_name, int model_year, String license_plate){
        super();
        this.manufacturer = manufacturer;
        this.model_name = model_name;
        this.model_year = model_year;
        this.license_plate = license_plate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel_name() {
        return model_name;
    }

    public int getModel_year() {
        return model_year;
    }

    public String getLicense_plate() {
        return license_plate;
    }

    public void setLicense_plate(String license_plate) {
        this.license_plate = license_plate;
    }
}
