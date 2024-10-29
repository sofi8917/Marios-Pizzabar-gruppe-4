public class Bestilling {
    int nummer;
    String navn;
    int pris;

    public Bestilling(int nummer, String navn, int pris){
        this.nummer = nummer;
        this.navn = navn;
        this.pris = pris;
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

    public int getNummer(){
        return nummer;
    }

    public String getNavn(){
        return navn;
    }

    public int getPris() {
        return pris;
    }

    public String toString(){
        return nummer + ". " + navn + ": " + pris +" kr.";
    }

}

}
