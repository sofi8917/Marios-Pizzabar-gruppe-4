import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DagensListe dagensListe = new DagensListe();
        menu pizzaMenu = new menu();
        boolean user = true;

        while (user = true) {
            System.out.println("Dagens liste er oprettet. Vælg mellem følgende:");
            System.out.println("1. Tilføj bestilling \n2. Fjern en bestilling \n3. Vis alle bestillinger \n4. Find specifik bestilling \n5. Redigér bestilling \n6. Slet dagens liste \n7. Tak for i dag:)");
            int opgave = sc.nextInt();

            switch (opgave) {
                case 1:
                    menu(pizzaMenu());
                    System.out.println("Indtast bestilling");

            }

        /*

        DagensListe orders = new DagensListe();



            if (opgave == 1) {
                sc.nextLine();
                System.out.println("Indtast Bestilling");
                int nummer = sc.nextInt();
                if (Pizza.getNummerPizza() == nummer) {
                    DagensListe.addBestilling(new Bestilling(sc.nextLine()));
                    System.out.println(order);
                    System.out.println();
                }
            } else if (opgave == 2) {
                sc.nextLine();
                System.out.println("Vælg Bestilling");
                System.out.println(orders);
                String S = sc.nextLine();
                orders.removeBestilling(orders.searchBestilling(S));
                System.out.println("Din Bestilling er nu opdateret:");
                System.out.println(orders);
                System.out.println();
            } else if (opgave == 3) {
                System.out.println(orders);
                System.out.println();
            } else if (opgave == 4) {
                sc.nextLine();
                System.out.println("Vælg ordre");
                System.out.println(orders);
                String S = sc.nextLine();
                orders.searchOrders(S);
                System.out.println();
            } else if (opgave == 5) {
                sc.nextLine();
                System.out.println("vælg ordre");
                System.out.println(orders);
                String S1 = sc.nextLine();
                String gammelTitel = "Gammel pizza: " + S1;
                System.out.println("vælg ny pizza");
                String S2 = sc.nextLine();
                String nyTitel = "Ny titel: " + S2;
                orders.editTitel(S1, S2);
                System.out.println(nyTitel);
                System.out.println();
            } else if (opgave == 6) {
                sc.nextLine();
                orders.clearDagensListe();
                System.out.println(orders + "du har slettet dagens liste");
                System.out.println();
            } else if (opgave == 7) {
                sc.nextLine();
                System.out.println("Dit program er nu afsluttet");
                System.exit(0);
            }

        } */
        }

    }

}
