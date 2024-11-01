public class Kunde {   //ciao
    private String kundeNavn;
    private int telefonnummer;

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

    public String getKundeNavn(){
        return kundeNavn;
    }

    public int getTelefonnummer(){
        return telefonnummer;
    }

    public String toString(){
        return "Navn: " + kundeNavn + ", telefonnummer: " + telefonnummer;
    }

}
