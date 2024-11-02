public class Pizza {
    private int nummerPizza, prisPizza;
    private String navnPizza;


    public Pizza(int nummerPizza, String navnPizza, int prisPizza){
        this.nummerPizza = nummerPizza;
        this.navnPizza = navnPizza;
        this.prisPizza = prisPizza;
    }

    public void setNummerPizza(int nummerPizza){
        this.nummerPizza = nummerPizza;
    }

    public void setNavnPizza(String navnPizza){
        this.navnPizza = navnPizza;
    }

    public void setPrisPizza(int prisPizza) {
        this.prisPizza = prisPizza;
    }

    public int getNummerPizza(){
        return nummerPizza;
    }

    public String getNavnPizza(){
        return navnPizza;
    }

    public int getPrisPizza() {
        return prisPizza;
    }

    public String toString(){
        return nummerPizza + ". " + navnPizza + ": " + prisPizza + " kr.";
    }

}
