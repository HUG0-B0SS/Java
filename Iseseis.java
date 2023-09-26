import java.util.Scanner;

public class iseseis {
    
    public static void main(String[] args) {
        // Küsib kasutajalt arve suuruse
        Scanner sisestus = new Scanner(System.in);
        System.out.println("Sisesta arve suurus: ");
        double arveSuurus = sisestus.nextDouble();

        // Käivitab restoraniArve klassi
        restoraniArve arve = new restoraniArve(arveSuurus);
        arve.prindiArve();
    }

    // Pöörab lause sõnade järjekorra tagurpidi
    static void lauseTagurpidi() {
        // Loob uue scanneri ja küsib kasutajalt lauset
        Scanner sisestus = new Scanner(System.in);
        System.out.println("Sisesta lause: ");
        String lause = sisestus.nextLine();

        // Loob uue massiivi, kus on lause sõnad
        String[] sonalist = lause.split(" ");

        // Prindib sõnad tagurpidises järjekorras
        for (int i = sonalist.length - 1; i >= 0; i--) {
            System.out.print(sonalist[i] + " ");
        }
        System.out.println();

        // Sulgeb scanneri
        sisestus.close();
    }

    // Prindib välja arvud 1-66 ühes reas
    static void uhestKuuekumnekuueni() {
        // For loop mis prindib arvud ühele reale
        for (int i = 1; i <= 66; i++) {
            System.out.print(i);
        }
        // Prindib tühja rea, et järgmine programm oleks eraldi
        System.out.println();
    }

    // Prindib välja arvud 1-66 viie kaupa reas
    static void uhestKuuekumnekuueniViieKaupa() {
        // For loop mis prindib arvud viie kaupa reas
        for (int i = 1; i <= 66; i++) {
            System.out.print(i);
            if (i % 5 == 0) {
                System.out.println();
            }
        }
        // Prindib tühja rea, et järgmine programm oleks eraldi
        System.out.println();
    }

    // Prindib numbrid 1-66, mis jagunevad kolmega
    static void uhestKuuekumnekuueniJagunebKolmega() {
        for (int i = 1; i <= 66; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}

class restoraniArve {
    private double algArve;

    // Konstruktor
    public restoraniArve(double summa) {
        algArve = summa;
    }

    // Meetod tipi arvutamiseks
    public int tipArvutus() {
        double tipProtsent = 0.10;
        double tip = algArve * tipProtsent;
        return Math.round((float)tip);
    }

    // Meetod kogu summa arvutamiseks
    public double arvutaSumma() {
        double koguSumma = algArve + tipArvutus();
        return koguSumma;
    }

    // Meetod arve väljastamiseks
    public void prindiArve() {
        System.out.println("Arve " + algArve + "€, Tip " + tipArvutus() + "€, Kokku " + arvutaSumma() + "€");
    }
}
