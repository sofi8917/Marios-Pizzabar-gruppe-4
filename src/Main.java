import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DagensListe dagensListe = new DagensListe();
        Menu pizzaMenu = new Menu();
        boolean user = true;

        while (user) {
            System.out.println("Dagens liste er oprettet. Vælg mellem følgende:");
            System.out.println("1. Tilføj bestilling");
            System.out.println("2. Fjern en bestilling");
            System.out.println("3. Vis Dagens Liste - alle bestillinger");
            System.out.println("4. Find specifik bestilling");
            System.out.println("5. Redigér bestilling");
            System.out.println("6. Slet Dagens Liste");
            System.out.println("7. Se listen over Ekspederede ordrer");
            System.out.println("8. Tak for i dag:)");
            int opgave = sc.nextInt();

            switch (opgave) {
                case 1:
                    System.out.print("Indtast kundens navn: ");
                    sc.nextLine();
                    String kundenavn = sc.nextLine();

                    System.out.print("Indtast kundens telefonnummer: ");
                    int telefonnummer = sc.nextInt();

                    Kunde kunde = new Kunde(kundenavn, telefonnummer);

                    pizzaMenu.printPizza();
                    ArrayList<Pizza> bestiltePizzaer = new ArrayList<>();
                    boolean continueOrdering = true;

                    while (continueOrdering) {
                        System.out.print("Indtast nummeret på pizzaen du vil bestille (eller 0 for at afslutte): ");
                        int pizzaNummer = sc.nextInt();

                        if (pizzaNummer == 0) {
                            continueOrdering = false;
                        } else if (pizzaNummer > 0 && pizzaNummer <= pizzaMenu.pizzaMenu.size()) {
                            Pizza valgtPizza = pizzaMenu.pizzaMenu.get(pizzaNummer - 1);
                            bestiltePizzaer.add(valgtPizza); // Tilføj til bestillingslisten
                            System.out.println(valgtPizza.getNavnPizza() + " er tilføjet til din bestilling.");
                        } else {
                            System.out.println("Ugyldigt valg. Prøv igen.");
                        }
                    }
                    Bestilling bestilling = new Bestilling(kunde, bestiltePizzaer);
                    dagensListe.addBestilling(bestilling);
                    System.out.println("Bestilling tilføjet!");

                    break;
                case 2:
                    System.out.println(dagensListe);
                    System.out.print("Hvilken bestilling vil du gerne fjerne? (indtast ordrenummer): ");
                    int ordrenummer = sc.nextInt();
                    dagensListe.removeBestilling(ordrenummer);
                case 3:
                    System.out.println("Her er Dagens liste:");
                    System.out.println(dagensListe);
                    break;
                case 4:
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
                case 5:
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("");
                    break;
                case 8:
                    user = false;
                    System.out.println("Farvel og tak! \uD83D\uDE00");
                    break;
                default:
                    System.out.println("Ugyldigt valg, prøv igen.");
            }

        }

    }

}