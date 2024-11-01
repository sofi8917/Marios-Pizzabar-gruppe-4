import java.util.ArrayList;

public class Bestilling {
    int nummer; // ordrenummer
    String navn; // navn på kunde
    int pris; // samlet pris på ordre
    Tidspunkt afhentningstidspunkt;
    ArrayList<Pizza> pizzaer;

    public Bestilling(int nummer, String navn, int pris, Tidspunkt afhentningstidspunkt){
        this.nummer = nummer;
        this.navn = navn;
        this.pris = pris;
        this.afhentningstidspunkt = afhentningstidspunkt;
        this.pris = beregnPris(pizzaer);
    }

    public void setNummer(int nummer){
        this.nummer = nummer;
    }

    public void setNavn(String navn){
        this.navn = navn;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public String getNavn(){
        return navn;
    }

    public int getNummer(){
        return nummer;
    }

    public int getPris() {
        return pris;
    }

    public Tidspunkt getAfhentningstidspunkt() {
        return afhentningstidspunkt;
    }

    private int beregnPris() {
        int total = 0;
        for (Pizza pizza : pizzaer) {
            total += pizza.getPrisPizza();
        }
        return total;
    }

    public String toString(){
        return nummer + ". " + navn + ": " + pris +" kr.";
    }

}
