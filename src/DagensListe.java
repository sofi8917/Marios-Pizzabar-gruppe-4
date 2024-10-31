import java.util.ArrayList;
    public class DagensListe {

        private static ArrayList<Bestilling> liste;

        public DagensListe() {
            liste = new ArrayList<Bestilling>();
        }

        public static void addBestilling(Bestilling bestilling) {
            liste.add(bestilling);
        }

        public void removeBestilling(Bestilling valg) {
            if (liste.contains(valg)) {
                System.out.println("findes ikke");
            } else {
                liste.remove(valg);
            }
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

        //Sorterer elementerne i liste ved at tilføje dem sorteret til en ny liste. Derefter cleares den originale
        //liste og erstattes af den sorterede liste
        public void sortTid() {
            ArrayList<Bestilling> sorteret = new ArrayList<>();
            for (Bestilling bestilling : liste) {
                int i = 0;
                if (sorteret.isEmpty())
                    sorteret.add(bestilling);
                else if (bestilling.getAfhentningstidspunkt().getTidspunkt().compareTo(sorteret.get(i).getAfhentningstidspunkt().getTidspunkt()) == -1) {
                    sorteret.add(0, bestilling);
                } else if (bestilling.getAfhentningstidspunkt().getTidspunkt().compareTo(sorteret.get(i).getAfhentningstidspunkt().getTidspunkt()) == 1) {
                    int j = 0;
                    for (Bestilling sortBestilling : sorteret) {
                        if (bestilling.getAfhentningstidspunkt().getTidspunkt().compareTo(sortBestilling.getAfhentningstidspunkt().getTidspunkt()) == -1)
                            sorteret.add(j, bestilling);
                        else
                            j++;
                    }
                }
            }
            liste.clear();
            liste.addAll(sorteret);
        }
/*
        @Override
        public String toString() {
            String liste = "";
            for(Bestilling s : DagensListe){
                liste += s;
                liste += "\n";
            }
            return liste;
        }
 */

    }