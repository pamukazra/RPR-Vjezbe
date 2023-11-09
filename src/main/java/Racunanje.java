import java.util.List;

public class Racunanje {
    public static Double min(List<Double> l) {
        double min = Double.MAX_VALUE;
        for (Double i : l)
            if (i.doubleValue() < min) min = i.doubleValue();
    return min;
    }
    public static Double max(List<Double> l){
        double max=Double.MIN_VALUE;
        for (Double i:l)
            if (i.doubleValue()>max) max=i.doubleValue();
        return max;
    }
    public static Double mean(List<Double> l){
        double suma=0;
        for(Double i:l) suma+=i.doubleValue();
        return suma/l.size();
    }
    public static Double standDev(List<Double> l){
        Double mean=Racunanje.mean(l);
        double s=0;
        for (Double i:l) s+=Math.pow(i-mean,2);
        return Math.sqrt(s/l.size());
    }
}
