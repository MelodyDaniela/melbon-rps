package garage;

public abstract class Vehicle {
 // protected: klassen själv, alla klasser i samma paket och alla subklasser oavsett paket, har tillgång till fältet.
    protected int yearOfManufacturing;
    protected String color, regNo;

    public Vehicle (String color){
        this.color = color;
    }

}



