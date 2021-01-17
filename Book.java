package rentalmobil;

import java.util.Date;

public class Book {
    Date start;
    Date end;
    Category cat;
    boolean pickedUp;
    Date returnDate;
    Car car;
    public Book(Customer cs, Date start, Date end, Category cat){

        create(cs, start,end, cat);
    }
    public void create(Customer cs, Date start, Date end, Category cat){
        this.start=start;
        this.end=end;
        this.cat=cat;
        this.pickedUp=false;
        this.returnDate=null;
    }
    public Car searchAvailCar(){

        return null;
    }
    public void assignCar(Car car){

        this.car=car;
    }
    public Car getCar(){

        return this.car;
    }
}
