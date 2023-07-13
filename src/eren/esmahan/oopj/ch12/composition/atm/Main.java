package eren.esmahan.oopj.ch12.composition.atm;

public class Main {
  
  public static void main(String[]args){
  
   ATM atm=new ATM();
   
   Hesap hesap=new Hesap("Esmahan EREN","12345",2000);
   
   atm.calis(hesap);
   
   System.out.println("Programdan Çıkılıyor...");
  
  
  
  
  
  }

    
}
