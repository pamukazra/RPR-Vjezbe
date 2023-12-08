package ba.unsa.etf.rpr;

public class Student extends Osoba implements MoguPredstaviti{
    private String brojIndeksa;
    private String godinaStudija;

    public Student(){
        this.setIme("");
        this.setPrezime("");
        this.brojIndeksa="";
        this.godinaStudija="";
    }
    public String getBrojIndeksa() {
        return brojIndeksa;
    }

    public String getGodinaStudija() {
        return godinaStudija;
    }

    public void setBrojIndeksa(String brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public void setGodinaStudija(String godinaStudija) {
        this.godinaStudija = godinaStudija;
    }

    @Override
    public String predstavi(){
        return "Student: "+this.getIme()+" "+this.getPrezime()+", Br. indeksa: "+this.getBrojIndeksa()
                +", Godina studija: "+this.getGodinaStudija();
    }
}
