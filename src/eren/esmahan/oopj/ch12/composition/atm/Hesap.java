package eren.esmahan.oopj.ch12.composition.atm;

public class Hesap {
    
    
    private String kullanici_adi;
    private String parola;
    private int bakiye;
    
    
    public Hesap(String kullanici_adi,String parola,int bakiye){
    
      this.kullanici_adi=kullanici_adi;
      this.parola=parola;
      this.bakiye=bakiye;
      
   }
    
   public void SetKullanici_adi(String kullanici_adi){
   
      this.kullanici_adi=kullanici_adi;
      
   } 
    public String GetKullanici_adi(){
    
         return kullanici_adi;
    }
    
    public void SetParola(String parola){
      
       this.parola=parola;
    }
    public String GetParola(){
    
         return parola;
    }
     public void SetBakiye(int bakiye){
     
        this.bakiye=bakiye;
     }
     public int GetBakiye(){
     
        return bakiye;
     }
     
     public void ParaYatirma(int miktar){
     
         bakiye+=miktar;
         
        System.out.println("Yeni bakiyeniz:"+bakiye);
        
     }
     public void ParaCekme(int miktar){
     
         if(bakiye-miktar<0){
         
         System.out.println("Yetersiz Bakiye");
         }
         
         else{
         
         bakiye-=miktar;
         System.out.println("Yeni bakiyeniz."+bakiye);
         
         }
     }
}
