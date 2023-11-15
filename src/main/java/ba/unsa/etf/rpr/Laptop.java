package ba.unsa.etf.rpr;

public class Laptop {
    private String brend, model;
    private double cijena;
    private int ram,hdd, ssd;
    private String procesor,grafickaKartica;
    private double velicinaEkrana;

    public Laptop(){
        this.brend=null;
        this.model=null;
        this.cijena=0;
        this.ram=0;
        this.hdd=0;
        this.ssd=0;
        this.procesor=null;
        this.grafickaKartica=null;
        velicinaEkrana=0;
    }

    public String getBrend(){
        return brend;
    }

    public String getModel() {
        return model;
    }

    public double getCijena() {
        return cijena;
    }

    public int getRam() {
        return ram;
    }

    public int getHdd() {
        return hdd;
    }

    public int getSsd() {
        return ssd;
    }

    public String getProcesor() {
        return procesor;
    }

    public String getGrafickaKartica() {
        return grafickaKartica;
    }

    public double getVelicinaEkrana() {
        return velicinaEkrana;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public void setProcesor(String procesor) {
        this.procesor = procesor;
    }

    public void setGrafickaKartica(String grafickaKartica) {
        this.grafickaKartica = grafickaKartica;
    }

    public void setVelicinaEkrana(double velicinaEkrana) {
        this.velicinaEkrana = velicinaEkrana;
    }
    @Override
    public String toString(){
        StringBuilder builder=new StringBuilder();
        builder.append("Brend: ")
                .append(brend)
                .append(", Model: ")
                .append(model)
                .append(", Cijena: ")
                .append(cijena)
                .append(", RAM: ")
                .append(ram)
                .append(", HDD: ")
                .append(hdd)
                .append(", SSD: ")
                .append(ssd)
                .append(" Procesor: ")
                .append(procesor)
                .append(", Graficka kartica: ")
                .append(grafickaKartica)
                .append(", Velicina ekrana: ")
                .append(velicinaEkrana);

        return builder.toString();
    }
}
