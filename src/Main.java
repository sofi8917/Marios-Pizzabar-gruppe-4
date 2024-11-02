import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    private static EkspederedeOrdrer ekspederedeOrdrer;
    private static DagensListe dagensListe;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dagensListe = new DagensListe();
        ekspederedeOrdrer = new EkspederedeOrdrer();
        Menu pizzaMenu = new Menu(); // Menuen printes som en del af vores interface.
        boolean user = true;

        while (user) { //Der kører et while-loop for user indtil user = false
            System.out.println("Dagens liste er oprettet. Vælg mellem følgende:");
            System.out.println("1. Tilføj bestilling");
            System.out.println("2. Annuller en bestilling");
            System.out.println("3. Vis Dagens Liste - alle bestillinger");
            System.out.println("4. Flyt ordre til listen over Ekspederede ordrer");
            System.out.println("5. Find specifik bestilling");
            System.out.println("6. Redigér bestilling");
            System.out.println("7. Slet Dagens Liste");
            System.out.println("8. Se listen over Ekspederede ordrer");
            System.out.println("9. Tak for i dag:)");
            int opgave = sc.nextInt();
            String navn = "";

            switch (opgave) { // Programmet lavet som switch case
                case 1:
                    System.out.print("Indtast kundens navn: ");
                    sc.nextLine();
                    String kundenavn = sc.nextLine();

                    System.out.print("Indtast kundens telefonnummer: ");
                    int telefonnummer = sc.nextInt();

                    System.out.print("Indtast kundens ønskede afhentningstidspunkt (format: tt:mm): ");
                    sc.nextLine(); // For at forbruge den nye linje efter nextInt()
                    String afhentningstidspunkt = sc.nextLine();

                    // Split input i time og minut
                    String[] parts = afhentningstidspunkt.split(":");

                    // Kontrollerer, om input er gyldigt
                    if (parts.length == 2) {
                        try {
                            int time = Integer.parseInt(parts[0]);
                            int minut = Integer.parseInt(parts[1]);

                            // Kontrollerer at time og minut ligger indenfor gyldige værdier
                            if (time >= 0 && time < 24 && minut >= 0 && minut < 60) {
                                // Opretter et Tidspunkt objekt
                                Tidspunkt tidspunkt = new Tidspunkt(time, minut);

                                // Opretter en ny Kunde med tidspunktet
                                Kunde kunde = new Kunde(kundenavn, telefonnummer);
                                kunde.setAfhentningsTidspunkt(time, minut); // Indstiller afhentningstidspunktet

                                pizzaMenu.printPizza(); // Menuen printes igen for overblikkets skyld.
                                ArrayList<Pizza> bestiltePizzaer = new ArrayList<>(); // Der oprettes en ArrayList for bestiltePizzaer.
                                boolean continueOrdering = true;

                                while (continueOrdering) { // while-loop kører indtil der ikke skal bestilles mere
                                    System.out.print("Indtast nummeret på pizzaen du vil bestille (eller 0 for at afslutte): ");
                                    int pizzaNummer = sc.nextInt();

                                    if (pizzaNummer == 0) {
                                        continueOrdering = false;
                                    } else if (pizzaNummer > 0 && pizzaNummer <= pizzaMenu.pizzaMenu.size()) {
                                        Pizza valgtPizza = pizzaMenu.pizzaMenu.get(pizzaNummer - 1);
                                        bestiltePizzaer.add(valgtPizza); // Tilføjer til bestillingslisten
                                        System.out.println(valgtPizza.getNavnPizza() + " er tilføjet til din bestilling.");
                                    } else {
                                        System.out.println("Ugyldigt valg. Prøv igen.");
                                    }
                                }

                                // Opretter bestillingen med alle data
                                Bestilling bestilling = new Bestilling(telefonnummer, kundenavn, tidspunkt, bestiltePizzaer);
                                dagensListe.addBestilling(bestilling); // Tilføjer bestillingen til Dagens Liste
                                System.out.println("Bestilling tilføjet med ordrenummer: " + bestilling.getOrdrenummer());

                            } else {
                                System.out.println("Ugyldigt tidspunkt. Timer skal være mellem 00 og 23 og minutter mellem 00 og 59.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Ugyldig input. Sørg for at indtaste timer og minutter som tal.");
                        }
                    } else {
                        System.out.println("Ugyldigt format. Brug venligst formatet hh:mm.");
                    }

                    break;

                case 2:
                    String scannerBug1 = sc.nextLine();
                    System.out.println(dagensListe);
                    System.out.print("Hvilken bestilling vil du gerne annullere? (indtast kundens navn): ");
                    navn = sc.nextLine().toLowerCase().trim();
                    dagensListe.removeBestilling(navn);
                    break;
                case 3:
                    System.out.println("Her er Dagens liste:");
                    dagensListe.sortTid();
                    System.out.println(dagensListe);
                    break;
                case 4:
                    String scannerBug2 = sc.nextLine();
                    System.out.println(dagensListe);
                    System.out.println("Hvilken bestilling vil du gerne fuldende og rykke til listen over Ekspederede Ordrer?");
                    navn = sc.nextLine().toLowerCase().trim();
                case 5:
                    boolean searchOrder = true;
                    int searchChoice = sc.nextInt();
                    System.out.println("Vil du søge efter 1. ordrenummer, 2. kundenavn eller 3. telefonnummer?");
                    while (searchOrder){
                        if (searchChoice == 1){
                            System.out.println("Skriv venligst ordrenummeret på ordren:");
                        }
                        else if (searchChoice == 2){
                            System.out.println("Skriv venligst kundenavn på ordren:");
                        }
                        else if (searchChoice == 3){
                            System.out.println("Skriv venligst telefonummeret på ordren:");
                        }
                        else {
                            searchOrder = false;
                        }
                    }

                    break;
                case 6:
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("");
                    break;
                case 8:
                    System.out.println("");
                    break;
                case 9:
                    user = false;
                    System.out.println("Farvel og tak! \uD83D\uDE00");
                    break;
                default:
                    System.out.println("Ugyldigt valg, prøv igen.");
            }
        }

    }

    public void tilføjEkspederede(Bestilling bestilling) {
        ekspederedeOrdrer.addEkspederetBestilling(bestilling);
        dagensListe.removeBestilling(bestilling.getNavn());
    }

}