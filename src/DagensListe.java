import java.util.ArrayList;
    public class DagensListe {

        private static ArrayList<Bestilling> liste;

        public DagensListe() {
            liste = new ArrayList<Bestilling>();
        }

        public static void addBestilling(Bestilling bestilling) {
            liste.add(bestilling);
        }

        public void removeBestilling(int ordrenummer) {
            for (Bestilling bestilling : liste) {
                if (bestilling.getNummer() == ordrenummer) {
                    liste.remove(bestilling);
                    System.out.println("Bestilling fjernet");
                    return;
                }
            }
            System.out.println("Bestilling findes ikke");
        }


        public void clearListe() {
            liste.clear();
        }

        public Bestilling searchBestilling(String navn) {
            for (Bestilling s : liste) {
                if (navn.equals(s.getNavn())) {
                    System.out.println(s);
                    return s;
                }
            }
            System.out.println("Hov! Denne pizza er ikke på listen. Vælg en anden.");
            return null;
        }

        public void editNavn(String navn1, String navn2) {
            searchBestilling(navn1).setNavn(navn2);
        }

        /*Sorterer elementerne i liste ved at tilføje dem sorteret til en ny liste. Derefter cleares den originale
        liste og erstattes af den sorterede liste*/
        public void sortTid() {
            ArrayList<Bestilling> sorteret = new ArrayList<>();
            for (Bestilling bestilling : liste) {
                int i = 0;
                if (sorteret.isEmpty()) {
                    sorteret.add(bestilling);
                } else {
                    boolean added = false;
                    for (i = 0; i < sorteret.size(); i++) {
                        if (bestilling.getAfhentningstidspunkt().getTidspunkt().compareTo(sorteret.get(i).getAfhentningstidspunkt().getTidspunkt()) < 0) {
                            sorteret.add(i, bestilling);
                            added = true;
                            break;
                        }
                    }
                    if (!added) {
                        sorteret.add(bestilling);
                    }
                }
            }
            liste.clear();
            liste.addAll(sorteret);
            System.out.println("Bestillingerne er blevet sorteret efter afhentningstidspunkt.");
        }

        @Override
        public String toString() {
            StringBuilder listeStr = new StringBuilder();
            for (Bestilling s : liste) {
                listeStr.append(s).append("\n");
            }
            return listeStr.toString();
        }

    }