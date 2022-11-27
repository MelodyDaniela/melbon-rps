package garage;

public class Boat extends Vehicle {

    // protected String color;

    protected Boat(String color){
        super(color);
        super.color = "black";
        super.regNo = "BBB222";
    }
    protected Boat(int yearOfManufacturing){
        super(String.valueOf(yearOfManufacturing));
        this.yearOfManufacturing = 2019;
}

    protected int numOfPropeller = 1;
}
