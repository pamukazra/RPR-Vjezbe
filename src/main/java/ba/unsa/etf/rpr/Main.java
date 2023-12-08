package ba.unsa.etf.rpr;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student=new Student();
        student.setIme("Azra");
        student.setPrezime("Pamuk");
        student.setGodinaStudija("II");
        student.setBrojIndeksa("19447");

        Nastavnik nastavnik=new Nastavnik();
        nastavnik.setIme("Spužva");
        nastavnik.setPrezime("Bob");
        nastavnik.setTitula("dipl.ing");

        Predmet predmet=new Predmet();
        predmet.setNaziv("Fizika I");
        predmet.setOpis("Nema opisa");

        List<MoguPredstaviti> lista=new ArrayList<>();
        lista.add(student);
        lista.add(nastavnik);
        lista.add(predmet);

        KolekcijaPoruka kolekcija=new KolekcijaPoruka(lista);
        List<String> porukeListe=kolekcija.getPoruke();

        System.out.println("Poruke koje se nalaze u kolekciji su: ");
        for(String poruka:porukeListe){
            System.out.println(poruka);
        }

    }
}
