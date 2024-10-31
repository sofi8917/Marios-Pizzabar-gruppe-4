import java.time.LocalTime;

public class Tidspunkt{

    // Dette er tidspunkt for afhentning af pizza
    LocalTime tidspunkt;

    public Tidspunkt(int time, int minut){
        this.tidspunkt = LocalTime.of(time, minut);
    }

    //Sammenligner et andet Tidspunkt med dette og returnerer -1 hvis dette Tidspunkt er før det, der bliver taget
    //som parameter, 1 hvis det er efter og 0 hvis de to Tidspunkter er ens

    //EDIT: Jeg så lige at den aldrig bruger denne metode, men bruger den indbyggede compareTo-metode i LocalTime-klassen. Måske kan hele sorteringsdelen i DagensListe ændres til ArrayLists egen sort-metode
    public int compareTo(Tidspunkt tidspunkt) {
        if (this.getTidspunkt().isBefore(tidspunkt.getTidspunkt())){
            return -1;
        } else if (this.getTidspunkt().isAfter(tidspunkt.getTidspunkt())) {
            return +1;
        }
        else if (this.getTidspunkt().equals(tidspunkt.getTidspunkt())) {
            return 0;
        } else {
            //Måske, jeg har ikke testet endnu
            return 0;
        }
    }

    /*Getter */
    public LocalTime getTidspunkt() {
        return tidspunkt;
    }


    @Override
    /*"toString"*/
    public String toString(){
        return tidspunkt.toString();
    }
}