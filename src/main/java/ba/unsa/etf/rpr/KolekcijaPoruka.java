package ba.unsa.etf.rpr;

import java.util.List;
import java.util.ArrayList;
public class KolekcijaPoruka {
    private List<String> poruke;

    public KolekcijaPoruka(List<? extends MoguPredstaviti> lista){
        poruke=new ArrayList<>();
        for (MoguPredstaviti i:lista) poruke.add(i.predstavi());
    }
    public List<String> getPoruke() {
        return poruke;
    }

}
