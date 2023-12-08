package ba.unsa.etf.rpr;
import java.util.List;
public class Predmet implements MoguPredstaviti,MozeOcijeniti{

    private List<Ocjena> ocjene;
    private String naziv;
    private String opis;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Override
    public String predstavi() {
        return this.getNaziv()+": "+this.getOpis();
    }

    @Override
    public void ocijeni(int x) {
        if(x>0 && x<=10){
            Ocjena i=new Ocjena(null,x);
            ocjene.add(i);
        }

    }
}
