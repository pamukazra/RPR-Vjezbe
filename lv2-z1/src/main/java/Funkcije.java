public class Funkcije {
    public static double Sinus(double n){
        return Math.sin(n);
    }
    public static long Faktorijel(int n){
        if (n<0) throw new IllegalArgumentException("Nema smisla racunati faktorijel za negativan broj");
        int f=1;
        for (int i=1;i<=n;i++) f*=i;
        return f;
    }
}
