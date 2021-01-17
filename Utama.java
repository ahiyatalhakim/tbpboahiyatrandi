package rentalmobil;



import java.util.*;
import java.text.*;

public class Utama {
    public static void main(String args[]){
        Date startDate=null, endDate=null;
        SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
        Category cat=new Category('E');
        Car car=new Car("BE3211DE",cat);
        try{
        startDate=dateformat.parse("15/01/2021");
        endDate=dateformat.parse("25/01/2021");
        } catch (Exception e){

        }
        Book b1;
        Customer ahiyat=new Customer("ahiyat");
        b1=ahiyat.book(startDate, endDate, cat);
        b1.assignCar(car);
        System.out.println("Customer        : "+ahiyat.name);
        System.out.println("Kategori        : "+cat.get());
        System.out.println("Awal Pinjaman   : "+startDate);
        System.out.println("Akhir Pinjaman  : "+endDate);
        System.out.println("Mobil           : "+b1.getCar());
        System.out.println("Flat No         : "+b1.getCar().getPlatNo());
        System.out.println("Available Car   : "+b1.searchAvailCar());
    }
}
