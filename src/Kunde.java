public class Kunde {   //ciao
    private String kundeNavn;
    private int telefonnummer;
    private Tidspunkt afhentningsTidspunkt;

    public Kunde(String kundeNavn, int telefonnummer){
        this.kundeNavn = kundeNavn;
        this.telefonnummer = telefonnummer;
    }

    public void setKundeNavn(String kundeNavn){
        this.kundeNavn = kundeNavn;
    }

    public void setTelefonnummer(int telefonnummer) {
       this.telefonnummer = telefonnummer;
    }

    public void setAfhentningsTidspunkt(int time, int minut) {
        this.afhentningsTidspunkt = new Tidspunkt(time, minut);
    }


    public String getKundeNavn(){
        return kundeNavn;
    }

    public int getTelefonnummer(){
        return telefonnummer;
    }

    public Tidspunkt getAfhentningsTidspunkt() {
        return afhentningsTidspunkt;
    }

    @Override
    public String toString() {
        return "Navn: " + kundeNavn +
                ", telefonnummer: " + telefonnummer +
                ", afhentningstidspunkt: " + (afhentningsTidspunkt != null ? afhentningsTidspunkt.toString() : "Ikke angivet");
    }
}
