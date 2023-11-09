public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Morate unijeti tačno dva argumenta: operacija (sin ili faktorijel) i broj.");
            return;
        }

        String operacija = args[0];
        double broj = Double.parseDouble(args[1]);

        if (operacija.equalsIgnoreCase("sin")) {
            double rez = Funkcije.Sinus(broj);
            System.out.println("Sinus od " + broj + " je " + rez);
        } else if (operacija.equalsIgnoreCase("faktorijel")) {
            if (broj % 1 != 0) {
                System.out.println("Faktorijel se može izračunati samo za cijele brojeve.");
                return;
            }
            long result = Funkcije.Faktorijel((int) broj);
            System.out.println("Faktorijel od " + (int) broj + " je " + result);
        } else {
            System.out.println("Nepodržana operacija. Molimo koristite 'sin' ili 'faktorijel'.");
        }
    }
}
