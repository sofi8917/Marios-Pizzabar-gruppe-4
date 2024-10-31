import java.util.ArrayList;
    public class DagensListe {

        private ArrayList<Bestilling> liste;

        public DagensListe() {
            liste = new ArrayList<Bestilling>();
        }

        public void addBestilling(Bestilling bestilling) {
            liste.add(bestilling);
            System.out.println("Bestilling tilføjet: " + bestilling);
        }

        public void removeBestilling(Bestilling bestilling) {
            if (liste.remove(bestilling)) {
                System.out.println("Bestilling fjernet: " + bestilling);
            } else {
                System.out.println("Bestilling findes ikke.");
            }
        }

        public void clearListe() {
            liste.clear();
            System.out.println("Dagens liste er blevet ryddet.");
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

        @Override
        public String toString() {

            if (liste.isEmpty()) {
                return "Ingen bestillinger på Dagens Liste";
            }
            StringBuilder sb = new StringBuilder();
            /*
            String liste = "";
            */

            for (Bestilling s : liste) {
                sb.append(s).append("\n");

                /*
                liste += s;
                liste += "\n";
            }
            return liste;
            */

            }
            return sb.toString();

        }
    }