package eren.esmahan.oopj.ch12.composition.pc;


public class Main {
    
    public static void main(String[]args){
    
    Resolution resolution=new Resolution(1920,1080);
    Monitor monitor=new Monitor("VS197DE","ASUS","18.5",resolution);
    Kasa kasa=new Kasa("Shadow Blade","Shadow","Temperli Cam");
    Anakart anakart=new Anakart("B259-PRO","ASUS",10,"Windows");
    
    Bilgisayar pc=new Bilgisayar(monitor,anakart,kasa);
    
    
    pc.getMonitor().monitoru_kapat();
    pc.getAnakart().isletim_sistemi_yukle("windows");
    
    System.out.println("Anakartın yuva sayısı:"+pc.getAnakart().getYuva_sayisi());
    
    
    
    
    }
}
