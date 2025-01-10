package Esercizio2;

public class Chiamata{
    private double durata;
    private String numeroChiamato;

    //Costrttore
public Chiamata(double durata, String numeroChiamata){
    this.durata = durata;
    this.numeroChiamato= numeroChiamata;
}
public String toString(){
    return "Durata: " + durata + "minuti, Numero chiamato: " + numeroChiamato;
}
}


