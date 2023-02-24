import java.util.ArrayList;

public class Car {
    private String manufacturer;

    private String number;

    private int year;

    private String ownerName;

    private ArrayList<String> owners = new ArrayList<String>();

    public Car(String manufacturer, String number, int year, String ownerName) {
        this.manufacturer = manufacturer;
        this.number = number;
        this.year = year;
        this.ownerName = ownerName;
        owners.add(ownerName);
    }

    public Car() {
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getYear() {
        return year;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
        owners.add(ownerName);
    }

    public ArrayList<String> getOwners() {
        return owners;
    }
}
