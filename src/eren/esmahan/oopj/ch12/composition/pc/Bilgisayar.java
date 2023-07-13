package eren.esmahan.oopj.ch12.composition.pc;


public class Bilgisayar {
    
    private Monitor monitor;
    private Anakart anakart;
    private Kasa kasa;
    
    
    public Bilgisayar(Monitor monitor,Anakart anakart,Kasa kasa){
    
        this.setMonitor(monitor);
        this.setAnakart(anakart);
        this.setKasa(kasa);
    }

 
    public Monitor getMonitor() {
        return monitor;
    }

   
    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

   
    public Anakart getAnakart() {
        return anakart;
    }

    
    public void setAnakart(Anakart anakart) {
        this.anakart = anakart;
    }

    
    public Kasa getKasa() {
        return kasa;
    }

    public void setKasa(Kasa kasa) {
        this.kasa = kasa;
    }
    
    
}
