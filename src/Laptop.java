import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Laptop {
    private String brandName;
    private String ram;
    private String hDD;
    private String operatingSystem;
    private String colour;

    public List complect;

    public Laptop(String brandName, String ram, String hDD, String operatingSystem, String colour) {
        this.brandName = brandName;
        this.ram = ram;
        this.hDD = hDD;
        this.operatingSystem = operatingSystem;
        this.colour = colour;
        this.complect = List.of(brandName, ram, hDD, operatingSystem, colour);
    }

    public void printProperty(){

    }

    public String getBrandName() {
        return brandName;
    }

    public String getRam() {
        return ram;
    }

    public String gethDD() {
        return hDD;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }
    public String getColour() {
        return colour;
    }

    public String getNameProperties(){
        return ("\n[1] - Brand Name \t\t[4] - Operating System\n[2] - RAM value \t\t[5] - Colour\n[3] - Size of HDD");
    }


    // @Override
    public String toString() {
        return "(Ноутбук " + brandName + ", " + ram + "Gb, " + hDD + "Gb, "
                + operatingSystem + ", " + colour + ")";
    }

    public void add(Object item) {
    }
}