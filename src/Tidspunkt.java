import java.time.LocalTime;

public class Tidspunkt{

    // Dette er tidspunkt for afhentning af pizza
    private LocalTime tidspunkt;

    public Tidspunkt(int time, int minut){
        this.tidspunkt = LocalTime.of(time, minut);
    }


    //Getter
    public LocalTime getTidspunkt() {
        return tidspunkt;
    }


    @Override
    /*"toString"*/
    public String toString(){
        return tidspunkt.toString();
    }
}