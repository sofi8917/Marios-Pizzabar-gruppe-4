import java.time.LocalTime;

public class Bestilling {
    int nummer;
    String navn;
    Tidspunkt afhentningstidspunkt;
    int pris;
    int antal;

    public Bestilling(int nummer, String navn, Tidspunkt afhentningstidspunkt, int pris){
        this.nummer = nummer;
        this.navn = navn;
        this.afhentningstidspunkt = afhentningstidspunkt;
        this.pris = pris;
        this.antal = 1;
    }

    public Bestilling(int nummer, String navn, Tidspunkt afhentningstidspunkt, int pris, int antal){
        this.nummer = nummer;
        this.navn = navn;
        this.afhentningstidspunkt = afhentningstidspunkt;
        this.pris = pris;
        this.antal = antal;
    }

    public void setNummer(int nummer){
        this.nummer = nummer;
    }

    public void setNavn(String navn){
        this.navn = navn;
    }

    public void setAfhentningstidspunkt(int time, int minut) {
        this.afhentningstidspunkt = new Tidspunkt(time, minut);
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }

    public String getNavn(){
        return navn;
    }

    public Tidspunkt getAfhentningstidspunkt() {
        return afhentningstidspunkt;
    }

    public int getNummer(){
        return nummer;
    }

    public int getPris() {
        return pris;
    }

    public int getAntal() {
        return antal;
    }

    public String toString(){
        return nummer + ". " + navn + ": " + pris +" kr.";
    }

    //Til at kunne sortere
    //public int compare(Bestilling bestilling1, Bestilling bestilling2) {
    //
    //}

}
