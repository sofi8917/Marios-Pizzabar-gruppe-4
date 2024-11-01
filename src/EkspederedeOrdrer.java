import java.util.ArrayList;

public class EkspederedeOrdrer {
    private ArrayList<Bestilling> ekspederedeBestillinger;

    public EkspederedeOrdrer() {
        this.ekspederedeBestillinger = new ArrayList<>();
    }

    public void addEkspederetBestilling(Bestilling bestilling) {
        ekspederedeBestillinger.add(bestilling);
        System.out.println("Bestilling " + bestilling.getNummer() + " er blevet ekspederet.");
    }

    public void removeEkspederetBestilling(int nummer) {
        for (Bestilling bestilling : ekspederedeBestillinger) {
            if (bestilling.getNummer() == nummer) {
                ekspederedeBestillinger.remove(bestilling);
                System.out.println("Bestilling " + nummer + " er blevet fjernet fra ekspederede ordrer.");
                return;
            }
        }
        System.out.println("Bestilling " + nummer + " findes ikke.");
    }

    public void printEkspederedeBestillinger() {
        if (ekspederedeBestillinger.isEmpty()) {
            System.out.println("Ingen ekspederede ordrer.");
            return;
        }
        System.out.println("Ekspederede Ordrer:");
        for (Bestilling bestilling : ekspederedeBestillinger) {
            System.out.println(bestilling);
        }
    }
}