package ba.unsa.etf.rpr;

public class Ocjena implements MoguPredstaviti{
    Osoba osoba;
    int ocjena;

    public Ocjena(Osoba osoba,int ocjena) {
        this.osoba = osoba;
        this.ocjena=ocjena;
    }

    public int getOcjena() {
        return ocjena;
    }
    public void setOcjena(int ocjena) {
        if (ocjena>0 && ocjena<=10)
            this.ocjena = ocjena;
    }

    @Override
    public String predstavi() {
        return Osoba.predstavi()+" "+ocjena;
    }
}
