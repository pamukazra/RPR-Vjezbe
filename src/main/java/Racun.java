public class Racun {
    private Long brojRacuna;
    private Osoba korisnikRacuna;
    private boolean odobrenjePrekoracenja;
    private Double stanjeRacuna;

    public Racun(Long r,Osoba o){
        this.brojRacuna=r;
        this.korisnikRacuna=o;
    }
    public boolean provjeriOdobrenjePrekoracenja(Double d){return true;}
    public boolean izvrsiUplatu(Double d){return true;}
    public void odobriPrekoracenje(Double d){}


}
