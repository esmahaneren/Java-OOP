package eren.esmahan.oopj.ch12.composition.atm;

import java.util.Scanner;


public class Login {
    
    
    public boolean login(Hesap hesap){
    
     Scanner scanner=new Scanner(System.in);
     
     String kullanici_adi;
     String parola;
     
     System.out.print("Kullanıcı adınızı giriniz:");
     kullanici_adi=scanner.nextLine();
     System.out.print("Parolanızı giriniz:");
     parola=scanner.nextLine();
      
      if(hesap.GetKullanici_adi().equals(kullanici_adi) && hesap.GetParola().equals(parola)){
      
       return true;
      }
             
    
      else{
      
       return false;
      } 
    
    }
    
    
}
