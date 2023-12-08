package ba.unsa.etf.rpr;

import java.util.List;

public class Nastavnik extends Osoba implements MoguPredstaviti,MozeOcijeniti{
    private String titula;
    private List<Ocjena> ocjene;
    public String getTitula() {
        return titula;
    }

    public void setTitula(String titula) {
        this.titula = titula;
    }

    @Override
    public String predstavi() {
        return "Nastavnik: "+getIme()+" "+getPrezime()+", "+getTitula();
    }

    @Override
    public void ocijeni(int x) {
        if (x>0 && x<=10) {
            Ocjena i=new Ocjena(this,x);
            ocjene.add(i);
        }
    }
}
