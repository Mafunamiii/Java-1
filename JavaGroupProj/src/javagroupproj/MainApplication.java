package javagroupproj;

import MyLib.*;


public class MainApplication {

    public static void main(String[] args) {
        
        User Cus1 = new Customer("Elijah", "Tam-od", "elijahyahoocom", "091234246");
        User Cus2 = new Customer("Elijah", "Tam-od", "elijahyahoocom", "091234246");
        User Admin1 = new Admin("Elijah", "Tam-od", "elijah@yahoocom", "091234246", "Elijah", "123456");
        User Admin2 = new Admin("Jahnreil", "JahnJahn", "Jahn@yahoocom", "09123424", "Jahnreil","123456");
        
        Lots LotA1 = new Lots("A1", 100, 2000, "Reserved");
        
        System.out.println(Cus2.getID());
        System.out.println(Admin1.getID());
        
        
    }
    
}
