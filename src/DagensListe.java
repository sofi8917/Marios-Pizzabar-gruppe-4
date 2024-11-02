import java.util.ArrayList;
    public class DagensListe {
        private static ArrayList<Bestilling> liste; // ArrayListe over alle aktive Bestillinger

        //Konstruktør der initialiserer liste-attributten
        public DagensListe() {
            liste = new ArrayList<Bestilling>();
        }

        //Metode der tilføjer en Bestilling til DagensListe
        public static void addBestilling(Bestilling bestilling) {
            liste.add(bestilling);
        }

        //Metode der fjerner en Bestilling fra DagensListe
        public void removeBestilling(String navn) {
            for (Bestilling bestilling : liste) {
                if (bestilling.getNavn().toLowerCase().trim().equals(navn.toLowerCase().trim())) {
                    liste.remove(bestilling);
                    System.out.println("Bestilling fjernet");
                    return;
                }
            }
            System.out.println("Bestilling findes ikke");
        }

        //Metode der rydder DagensListe for alle Bestillinger
        public void clearListe() {
            liste.clear();
        }

        //Metode der søger igennem en specifik Bestilling i DagensListe ud fra det navn, der er tilknyttet Bestillingen
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

        //Metode der ændrer navnet der er tilknyttet en Bestilling i DagensListe
        public void editNavn(String navn1, String navn2) {
            searchBestilling(navn1).setNavn(navn2);
        }

        //Sorterer elementerne i liste ved at tilføje dem sorteret til en ny liste. Derefter cleares den originale
        //liste og erstattes af den sorterede liste
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
        }

        //En toString-metode
        @Override
        public String toString() {
            StringBuilder listeStr = new StringBuilder();
            for (Bestilling s : liste) {
                listeStr.append(s).append("\n");
            }
            return listeStr.toString();
        }

    }