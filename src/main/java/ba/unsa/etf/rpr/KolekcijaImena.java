package ba.unsa.etf.rpr;

import java.util.List;
public class KolekcijaImena {
    private List<String> lista;


    public List<String> getLista() {
        return lista;
    }

    public void setLista(List<String> lista) {
        this.lista = lista;
    }

    public String getNajduzeIme(){
        int max=0;
        for (int i=0;i<lista.size();i++){
            if (lista.get(i).length()>lista.get(max).length()) max=i;
        }
        return lista.get(max);
    }
}
