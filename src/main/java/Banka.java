import java.util.Random;

public class Banka {
    private java.util.List<Korisnik> korisnici;
    private java.util.List<Uposlenik> uposlenici;
    public Banka(){}
    public Korisnik kreirajNovogKorisnika(String ime, String prezime){
        Korisnik k=new Korisnik(ime,prezime);
        korisnici.add(k);
        return k;
    }
    public Uposlenik kreirajNovogUposlenika(String ime,String prezime){
        Uposlenik u=new Uposlenik(ime,prezime);
        uposlenici.add(u);
        return u;
    }
    public Racun kreireajRacunZaKorisnika(Korisnik k) {
        Long n=null;
        for (int i = 0; i < this.korisnici.size(); i++)
            if (this.korisnici.get(i).equals(k)) {
                n = (new Random()).nextLong();
            }
        return new Racun(n, k);
    }
}
