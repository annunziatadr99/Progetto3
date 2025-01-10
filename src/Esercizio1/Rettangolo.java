package Esercizio1;

public class Rettangolo {
    //attributi / proprietà
    private double altezza;
    private double larghezza;

    //Costruttore che richiama gli attributi
    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    //metodo calcolo perimetro

    public double calcoloPerimetro(){
        return  2 * (altezza + larghezza);
    }

    //metodo calcolo area
    public double calcoloArea(){
        return altezza * larghezza;
    }

    //Metodo per stampare area e perimentro

    public void stampaRettangolo(){
        System.out.println("L'area del rettangolo è: " + calcoloArea() + ", il perimetro è:" + calcoloPerimetro());
    }

    //Metodo stampa dei due rettangolo con somma area e perimetro

    public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2){
        //somma Aree Rettangoli
        System.out.println("Rettangolo 1 - Area: " + r1.calcoloArea() + "Rettangolo 1 - Perimetro: " + r1.calcoloPerimetro() );
        double sommaAree = r1.calcoloArea() + r2.calcoloArea();

        //somma Perimetri
        System.out.println("Rettangolo 2 - area: " + r1.calcoloArea() + "Rettangolo 2 - Perimetro: " + r2.calcoloPerimetro() );
        double sommaPrimetri = r1.calcoloPerimetro() + r2.calcoloPerimetro();
        System.out.println("La somma delle Aree dei Rettangoli è: " + sommaAree );
        System.out.println("La somma dei Oerimetri dei rettangoli è: " + sommaPrimetri);
    }


    //creazioni oggetti (RETTANGOLI)
    public static void main(String[] args) {
        Rettangolo rettangolo1 = new Rettangolo(3.5,2.5);
        Rettangolo rettangolo2 = new Rettangolo(5.5,4.5);

        //utilizzo metodi per stampare aree e perimetri

        rettangolo1.stampaRettangolo();
        rettangolo2.stampaRettangolo();
        stampaDueRettangoli(rettangolo1,rettangolo2);


    }

}
