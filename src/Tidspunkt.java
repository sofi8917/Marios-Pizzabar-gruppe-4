import java.time.LocalTime;

public class Tidspunkt {
    /* Dette er tidspunkt for afhentning af pizza*/

int time;
int minut;
static LocalTime tidspunkt;

    public Tidspunkt(int time, int minut){
        this.tidspunkt = LocalTime.of(time, minut);
    }

    /*Getter */
    public static LocalTime getTidspunkt() {
        return tidspunkt;
    }


    @Override
    /*"toString"*/
    public String toString(){
        return tidspunkt.toString();
    }
/* 	System.out.print("Indtast time (tt) for afhentning: ");
        String timeInput = scanner.next();

        System.out.print("Indtast minutterne (mm) for afhenting: ");
        String minutInput = scanner.next();

        if (isValidTimeFormat(timeInput, 23) && isValidTimeFormat(minutInput, 59)) {
            int time = Integer.parseInt(timeInput);
            int minut = Integer.parseInt(minutInput);

            Tidspunkt tidspunkt = new Tidspunkt(time, minut);

            System.out.println("Tidspunktet er: " + tidspunkt);
        } else {
            System.out.println("Fejl: Timer og minutter skal være to cifre og inden for gyldige værdier (tt:mm).");
        }
*/
}