import java.util.ArrayList;

public class EkspederedeOrdrer {
    private ArrayList<Bestilling> ekspederedeBestillinger; // Liste over ekspederede bestillinger.

    // Konstruktør, der initialiserer listen over ekspederede ordrer
    public EkspederedeOrdrer() {
        this.ekspederedeBestillinger = new ArrayList<>();
    }

    // Tilføjer en ekspederet bestilling
    public void addEkspederetBestilling(Bestilling bestilling) {
        ekspederedeBestillinger.add(bestilling);
        System.out.println("Bestilling " + bestilling.getNummer() + " er blevet ekspederet.");
    }

    // Fjern en ekspederet bestilling baseret på nummer
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

    // Print alle ekspederede bestillinger
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

    // Override af toString for at vise alle ekspederede bestillinger
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Bestilling bestilling : ekspederedeBestillinger) {
            result.append(bestilling.toString()).append("\n");
        }
        return result.toString();
    }
}