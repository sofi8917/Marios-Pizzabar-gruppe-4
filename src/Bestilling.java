public class Bestilling {
    private int nummer;
    private String navn;
    private int pris;

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

    public String getNavn(){
        return navn;
    }

    public int getNummer(){
        return nummer;
    }

    public int getPris() {
        return pris;
    }

    @Override
    public String toString(){
        return nummer + ". " + navn + ": " + pris +" kr.";
    }

}
