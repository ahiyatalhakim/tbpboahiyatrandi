package rentalmobil;

public class Car {

        String platNo;

        Category cat;

        public Car (String platNo, Category cat){
            create(platNo,cat);
        }
        public void create(String platNo, Category cat){
            this.platNo=platNo;
            this.cat=cat;
        }
        public String getPlatNo(){
            return this.platNo;
        }
        public Category getCat(){
            return this.cat;
        }
}
