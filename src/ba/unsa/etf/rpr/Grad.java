package ba.unsa.etf.rpr;

public enum Grad {
    TRAVNIK("030"),
    GOZAK("031"),
    ZENICA("032"),
    SARAJEVO("033"),
    LIVNO("034"),
    TUZLA("035"),
    MOSTAR("036"),
    BIHAC("037"),
    GORAZDE("038"),
    POSUSJE("039"),
    BRCKO("049"),
    MRKONJIC_GRAD("050"),
    BANJA_LUKA("051"),
    PRIJEDOR("052"),
    DOBOJ("053"),
    SAMAC("054"),
    BIJELJINA("055"),
    ZVORNIK("056"),
    PALE("057"),
    FOCA("058"),
    TREBINJE("059");

    private String pozivniBroj;
    Grad(String pozivniBroj){this.pozivniBroj=pozivniBroj;}
    public String getPozivniBroj(){return pozivniBroj;}
    public static Grad p(String pozivni){
        for (Grad i:Grad.values())
            if (i.getPozivniBroj().equals(pozivni)) return i;
        return null;
    }
}
