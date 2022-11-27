package garage;

public class Car extends Vehicle{

   // protected String color;

    protected Car(String color){
        super(color);
        super.color = "red";
        super.regNo = "ABC123";
    }
    protected Car(int yearOfManufacturing){
        super(String.valueOf(yearOfManufacturing));
        super.yearOfManufacturing = 2022;
    }

    protected int numOfWheels = 4;





}

