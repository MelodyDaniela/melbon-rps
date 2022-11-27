package garage;

public class Motorcykle extends Vehicle{

    protected Motorcykle (String color){
        super.color = "blue";
        super.regNo = "MMM333";
    }
    protected Motorcykle (int yearOfManufacturing){
        this.yearOfManufacturing = 2020;
    }

    protected int  numOfWheels = 2;
}
