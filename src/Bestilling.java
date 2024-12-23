import java.util.ArrayList;

public class Bestilling {
    private static int nextOrderNumber = 1; // Bruges til generering af ordrenumre - består af seks cifre, hvoraf tomme pladser foran bliver erstattet med nuller
    private int nummer, pris; // Kundens telefonnummer & Totalprisen for bestillingen.
    private String navn, ordrenummer; // Kundenavn & Bestillingens ordrenummer.
    private Tidspunkt afhentningstidspunkt; // Tidspunkt for afhentning.
    private ArrayList<Pizza> pizzaer; // Liste over bestilte pizzaer


    // Konstruktør, der initialiserer bestillingsobjekt
    public Bestilling(int nummer, String navn, Tidspunkt afhentningstidspunkt, ArrayList<Pizza> pizzaer) {
        this.nummer = nummer;
        this.navn = navn;
        this.afhentningstidspunkt = afhentningstidspunkt;
        this.pizzaer = pizzaer;
        this.pris = beregnPris(); // Der er ikke nogen this.pris = pris; eftersom den er overflødig og aldrig vil blive brugt. Der er kun en samlet pris this.pris for en bestilling.
        this.ordrenummer = generateOrderNumber();
    }

    //Metode der genererer et ordrenummer baseret på, hvor mange ordrenumre der allerede er oprettet i dag
    private String generateOrderNumber() {
        String formattedOrderNumber = String.format("%06d", nextOrderNumber);
        nextOrderNumber++;
        return formattedOrderNumber;
    }

    //Getters og setters
    public void setNummer(int nummer){
        this.nummer = nummer;
    }

    public void setNavn(String navn){
        this.navn = navn;
    }

    public String getNavn(){
        return navn;
    }

    public int getNummer(){
        return nummer;
    }

    // Getter metoder til at få ordrenummer, kundeNavn osv.
    public String getOrdrenummer() {
        return ordrenummer;
    }

    public ArrayList<Pizza> getPizzaer() {
        return pizzaer;
    }

    public Tidspunkt getAfhentningstidspunkt() {
        return afhentningstidspunkt;
    }

    // Der er ingen setters eller getters på pris. Der er kun beregnPris.
    private int beregnPris() {
        int total = 0;
        for (Pizza pizza : pizzaer) {
            total += pizza.getPrisPizza();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Ordrenummer: " + ordrenummer + ", Navn: " + navn + ", Telefon: " + nummer + ", Afhentningstidspunkt: " + afhentningstidspunkt + ", Bestilte pizzaer: " + pizzaer;
    }

}
