package rentalmobil;

import java.util.Date;
import java.util.List;

public class Customer{
    boolean pickUp;
    String name;
    public Customer(String name) {
        create(name);
    }
    public void create(String name){
        this.name=name;
    }
    public Book book(Date start, Date end, Category cat){
        return new Book(this, start, end,cat);
    }
    public void cencel(Book b){
        this.cencel(b);
    }
    public Car pickUp(Book b){
        return this.pickUp(b);
    }
    public void returnCar(Car car){
        this.returnCar(car);
    }
}
