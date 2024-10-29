public class Tidspunkt {
    /* Dette er tidspunkt for afhentning af pizza*/

int time;
int minut;

    public Tidspunkt(int time, int minut){
        this.time = time;
        this.minut = minut;
    }
    /* Setters */
    public void setTime(int time) {
        this.time = time;
    }

    public void setMinut(int minut) {
        this.minut = minut;
    }

    /*Getters */
    public int getTime() {
        return time;
    }

    public int getMinut() {
        return minut;
    }

    /*"toString"*/
    public String afhentningsTidspunkt(){
        return time + ":" + minut;
    }

}
