/**
 * 5.9 Reimplement the class of the preceding exercise in Java, C#, or C + + (your choice).
 * How much shorter is the Scala class?
 *
 * Make a class _5_9_Car with read-only properties for manufacturer, model name, and model year, and a read-write property
 * for the license plate. Supply four constructors. All require the manufacturer and model name. Optionally, model year
 * and license plate can also be specified in the constructor. If not, the model year is set to -1 and the license plate
 * to the empty string.
 *
 * Created by icaste on 6/14/16.
 */
public class _5_9_Car {
    private String manufacturer;
    private String modelName;
    private int modelYear;

    private String licensePlate;

    public _5_9_Car(String manufacturer, String modelName){
        super();
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.modelYear = -1;
        this.licensePlate = "";
    }

    public _5_9_Car(String manufacturer, String modelName, int modelYear){
        super();
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.licensePlate = "";
    }

    public _5_9_Car(String manufacturer, String modelName, String licensePlate){
        super();
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.modelYear = -1;
        this.licensePlate = licensePlate;
    }

    public _5_9_Car(String manufacturer, String modelName, int modelYear, String licensePlate){
        super();
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.licensePlate = licensePlate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    public int getModelYear() {
        return modelYear;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}
