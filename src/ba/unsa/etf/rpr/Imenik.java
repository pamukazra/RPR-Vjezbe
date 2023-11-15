package ba.unsa.etf.rpr;
import java.util.*;

public class Imenik {
    private Map<String,TelefonskiBroj> brojevi;

    public Imenik(){this.brojevi=new HashMap<String,TelefonskiBroj>();}

    public Map<String, TelefonskiBroj> getBrojevi() {
        return brojevi;
    }
    public void setBrojevi(Map<String,TelefonskiBroj> m){this.brojevi=m;}

    public void dodaj(String ime,TelefonskiBroj broj){this.brojevi.put(ime,broj);}

    public String dajBroj(String ime){
        if (this.brojevi.get(ime)!=null) return this.brojevi.get(ime).ispisi();
        return null;
    }
    public String dajIme(TelefonskiBroj broj){
        for (Map.Entry<String,TelefonskiBroj> i:this.brojevi.entrySet())
            if (i.getValue().ispisi().equals(broj.ispisi())) return i.getKey();
        return null;
    }

    public String naSlovo(char c){
        StringBuilder builder=new StringBuilder();
        int brojac=1;
        for (Map.Entry<String,TelefonskiBroj> i:this.brojevi.entrySet()){
            if (i.getKey().startsWith(String.valueOf(c))){
                builder.append(brojac)
                        .append(". ")
                        .append(i.getKey())
                        .append(" - ")
                        .append(i.getValue().ispisi())
                        .append(System.lineSeparator());
            }
            brojac++;
        }
        return builder.toString();
    }

    private boolean prov(TelefonskiBroj broj,Grad g){
        if (broj instanceof FiksniBroj) return g.equals(((FiksniBroj)broj).getGrad());
        return false;
    }
    public Set<String> izGrada(Grad grad){
        Set<String> r=new TreeSet<String>();
        for (Map.Entry<String,TelefonskiBroj> i:this.brojevi.entrySet()){
            if (prov(i.getValue(),grad)) r.add(i.getKey());
        }
        return r;
    }
    public Set<TelefonskiBroj> izGradaBrojevi(Grad grad){
        Set<TelefonskiBroj> r=new TreeSet<TelefonskiBroj>(new Comparator<TelefonskiBroj>(){
            @Override
            public int compare(TelefonskiBroj b1,TelefonskiBroj b2){return b1.ispisi().compareTo(b2.ispisi());}
        });
        for (Map.Entry<String,TelefonskiBroj> i:this.brojevi.entrySet())
            if (prov(i.getValue(),grad)) r.add(i.getValue());return r;
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();
        int brojac=1;
        for (Map.Entry<String,TelefonskiBroj> i:this.brojevi.entrySet()){
            builder.append(brojac)
                    .append(", ")
                    .append(i.getKey())
                    .append(" - ")
                    .append(i.getValue().ispisi())
                    .append(System.lineSeparator());
            brojac++;
        }
        return builder.toString();
    }
}
