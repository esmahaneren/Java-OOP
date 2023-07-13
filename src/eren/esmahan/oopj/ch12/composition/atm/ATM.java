package eren.esmahan.oopj.ch12.composition.atm;

import java.util.Scanner;


public class ATM {
    
    
    public void calis(Hesap hesap){
    
        Login login=new Login();
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Bankamıza Hoşgeldiniz");
        System.out.println("*****************************");
        System.out.println("Kullanıcı Girişi");
        System.out.println("*****************************");
        int giris_hakki=3;
        
        while(true){
        
          if(login.login(hesap)){
        
           System.out.println("Giriş Başarılı");
           break;
          }
          
          else{
          
           System.out.println("Hatalı Giriş");
           giris_hakki-=1;
           System.out.println("Kalan giriş hakkınız:"+giris_hakki);
          }
          
          if(giris_hakki==0){
          
          System.out.println("Giriş hakkınız bitti");
          return;
          }
        } 
          System.out.println("*********************************");
            
           String islemler="1.Bakiye Sorgulama\n"
                            +"2.Para Yatırma\n"
                            +"3.Para Çekme\n"
                            +"Çıkış için q'ya Basınız";
           
           System.out.println(islemler);
           
             while(true){
             
             System.out.println("Yapmak istediğiniz işlemi giriniz");
             String islem=scanner.nextLine();
             
             if(islem.equals("q")){
              
                 break;
             }
             
             else if(islem.equals("1")){
             
             
                 System.out.println("Bakiyeniz:"+hesap.GetBakiye());
             
             }
               
             else if(islem.equals("2")){
             
             System.out.print("Yatırmak İstediğiniz Miktarı Giriniz:");
             int tutar=scanner.nextInt();
             scanner.nextByte();
              
             hesap.ParaYatirma(tutar);
             
             }
             
             else if(islem.equals("3")){
             
              System.out.print("Çekmek İstediğiniz Miktarı Giriniz");
              int tutar=scanner.nextInt();
              scanner.nextLine();
              hesap.ParaCekme(tutar);
              
              }
              
             else{
             
             System.out.println("Geçersiz İşlem");
             
             }
             
             
             
             }
            
            
           
              
            
    }      
    }      
          
    

