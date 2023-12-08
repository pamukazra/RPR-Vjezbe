package ba.unsa.etf.rpr;

public class Pobjednik {
    private String ime;
    private String prezime;
    private int brojZnakova;
    private KolekcijaImena kolekcijaImena;

    public Pobjednik(KolekcijaImena imena){
        String imeiprezime=imena.getNajduzeIme();
        String[] dio=imeiprezime.split(" ");
        this.ime=dio[0];
        this.prezime=dio[1];
        this.brojZnakova=this.ime.length();
        this.kolekcijaImena=imena;
    }
}
