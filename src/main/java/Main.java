import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        List<Double>l=new ArrayList<Double>();

        for(;;){
            System.out.print("Unesite broj ili rijec stop: ");
            String n=scanner.nextLine();
            if ("stop".equalsIgnoreCase(n.trim())) break;
            try{
                Double broj=Double.parseDouble(n);
                l.add(broj);
            }catch(Exception e){
                System.out.println("Uneseni string nije broj!");
                continue;
            }
        }

        System.out.println("Min: "+Racunanje.min(l));
        System.out.println("Max: "+Racunanje.max(l));
        System.out.println("Mean: "+Racunanje.mean(l));
        System.out.println("Standardna devijacija: "+Racunanje.standDev(l));





    }
}
