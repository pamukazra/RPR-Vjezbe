package ba.unsa.etf.rpr;

import java.util.List;
public class KolekcijaImenaIPrezimena {
    private List<String> imena;
    private List<String> prezimena;

    public int getIndexNajduzegPara(){
        int max=0;
        for (int i=0;i<imena.size();i++){
            if (imena.get(i).length()+prezimena.get(i).length()>imena.get(max).length()+prezimena.get(max).length()) max=i;
        }
        return max;
    }

    public String getImeiPrezime(int i){
        if (i<imena.size()) return imena.get(i)+" "+prezimena.get(i);
        return null;
    }
}
