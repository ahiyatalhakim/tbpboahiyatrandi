package rentalmobil;

public class Category {
        private char cat;
        public Category(char cat){
            create(cat);
        }
        public void create(char cat){
            if (cat=='E'||cat=='S'||cat=='L') {
                this.cat = cat;
            }else {
                this.cat='\0';
                System.out.println("Valid Category: E/S/L");
            }
        }
        public char get(){
            return this.cat;
        }
    }
