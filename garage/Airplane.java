package garage;

public class Airplane extends Vehicle{

    protected Airplane(String color){
        super.color = "white";
        super.regNo = "AAA123";
    }
    protected Airplane(int yearOfManufacturing){
        this.yearOfManufacturing = 2021;
    }

    protected int numOfWings = 2;
}
