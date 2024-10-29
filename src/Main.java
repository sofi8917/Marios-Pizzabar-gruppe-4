import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] menukort = new String[30];
        menukort[0]="1. Vesuvio: tomatsauce, ost, skinke og oregano………………………………………………….57,-\n";
        menukort[1]="2. Amarikaner: NYHED tomatsauce, ost, oksefars og oregano…………………………………53,-\n";
        menukort[2]="3. Cacciatore: tomatsauce, ost, pepperoni og oregano…………………………………………57,-\n";
        menukort[3]="4. Carbona: NYHED tomatsauce, ost kødsauce, spaghetti, cocktailpølser og oregano………63,-\n";
        menukort[4]="5. Dennis: NYHED tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano…………63,-\n";
        menukort[5]="6. Bertil: tomatsauce, ost, bacon og oregano………………………………………………………57,-\n";
        menukort[6]="7. Silvia: tomatsauce, ost pepperoni, rød peber, løg, oliven og oregano………………………61,-\n";
        menukort[7]="8. Victoria: tomatsauce, ost, skinke, ananas, champignon, løg og oregano……………………61,-\n";
        menukort[8]="9. Toronto: NYHED tomatsauce, ost, skinke, bacon, kebab, chili og oregano…………………61,-\n";
        menukort[9]="10. Capricciosa: tomatsauce, ost, skinke, champignon og oregano…………………………….61,-\n";
        menukort[10]="11. Hawaii: tomatsauce, ost, ananas og oregano………………………………………………….61,-\n";
        menukort[11]="12. Le Blissola: tomatsauce, ost, skinke, rejer og oregano………………………………………61,-\n";
        menukort[12]="13. Venezia: tomatsauce, ost, skinke, bacon og oregano………………………………………...61,-\n";
        menukort[13]="14. Mafia: NYHED tomatsauce, ost, pepperoni, bacon, løg og oregano………………………..61,-\n";
        menukort[14]="15. Lars Kris-Mads: tomatsauce, ost, ristet pølse i svøb og risengrød (indbagt)………………70,-\n";
        menukort[15]="16. Adios: tomatsauce, ost, pepperoni, løg, hakket oksekød, jalapeños og tacosauce……….65,-\n";
        menukort[16]="17. Quatro Stagioni: tomatsauce, mozzarella, skinke, champignon, artiskok og oliven……….63,-\n";
        menukort[17]="18. Big John: NYHED tomatsauce, gorgonzola ost, bearnaise og XL medisterpølse…………74,-\n";
        menukort[18]="19. Porto: tomatsauce, mozzarella, muslinger, tun og rejer……………………………………....57,-\n";
        menukort[19]="20. Big Mamma: tomatsauce, mozzarella, champignon, paprika, kødstrimler og løg…………62,-\n";
        menukort[20]="21. Neymar: tomatsauce, mozzarella, pepperoni, løg og peber…………………………………65,-\n";
        menukort[21]="22. Americano: tomatsauce, mozzarella, marineret steak og chili………………………………81,-\n";
        menukort[22]="23. Opera: tomatsauce, mozzarella, hakket oksekød, pepperoni og løg………………………58,-\n";
        menukort[23]="24. Paesana: tomatsauce, ost, skinke, bacon, hakket oksekød, jakabov og cocktailpølser…82,-\n";
        menukort[24]="25. Mexicano: tomatsauce, mozzarella, skinke, pepperoni, løg, chili og hvidløg………………73,-\n";
        menukort[25]="26. Jolle: tomatsauce, ost, kebab, salat, chili, dressing (foldet på midten)...............................56,-\n";
        menukort[26]="27. Azario: tomatsauce, mozzarella, kartofler, basilikum, fetaost og rosmarin…………………72,-\n";
        menukort[27]="28. Andrea: tomatsauce, mozzarella, marineret kylling, champignon og kværnet peber……79,-\n";
        menukort[28]="29. Palermo: tomatsauce, mozzarella, skinke, pepperoni, hvidløg og bacon…………………68,-\n";
        menukort[29]="30. Boca Juniors: tomatsauce, mozzarella, kødstrimler, salat og creme fraiche dressing……69,-\n";
        menukort[30]="31. Sofi A Napoli: tomatsauce, mozzarella, chili, hvidløg, artiskok og kødstrimler……………78,-\n";
        System.out.println(menukort);
        System.out.println();
    }
}

/*
        Scanner sc = new Scanner(System.in);
        boolean user = true;
        DagensListe orders = new DagensListe();

        while(user = true) {
            System.out.println("indtast pizza");
            String nummer = sc.nextLine();
            Bestilling order = new Bestilling(nummer);
            Bestilling.addBestilling(order);
            System.out.println(order);

            System.out.println("vil du tilføje flere ja/nej");
            if(sc.nextLine().trim().equalsIgnoreCase("nej")) {
                System.out.println(orders);
                user = false;

                break;
            }

        }

        while(true) {
            System.out.println("Dagens liste er oprettet. vælg mellem følgende:");
            System.out.println("1. tilføj bestilling \n 2. fjern en bestilling \n 3. vis alle bestillinger \n 4. find specifik bestilling \n 5. Redigér bestilling \n 6. slet dagens liste \n 7. tak for i dag:)");
            int opgave = sc.nextInt();
            if (opgave == 1) {
                sc.nextLine();
                System.out.println("indtast sang");
                String S = sc.nextLine();
                System.out.println("indtast kunstner");
                String A = sc.nextLine();
                Sang ss = new Sang(S, A);
                sang.addSang(ss);
                System.out.println(ss);
                System.out.println();
            } else if (opgave == 2) {
                sc.nextLine();
                System.out.println("vælg sang");
                System.out.println(sang);
                String S = sc.nextLine();
                sang.removeSang(sang.searchSong(S));
                System.out.println("din playliste er nu opdateret:");
                System.out.println(sang);
                System.out.println();
            } else if (opgave == 3) {
                System.out.println(sang);
                System.out.println();
            } else if (opgave == 4) {
                sc.nextLine();
                System.out.println("vælg sang");
                System.out.println(sang);
                String S = sc.nextLine();
                sang.searchSong(S);
                System.out.println();
            } else if (opgave == 5) {
                sc.nextLine();
                System.out.println("vælg sang");
                System.out.println(sang);
                String S1 = sc.nextLine();
                String gammelTitel = "Gammel titel: " + S1;
                System.out.println("vælg ny titel");
                String S2 = sc.nextLine();
                String nyTitel = "Ny titel: " + S2;
                sang.editTitel(S1, S2);
                System.out.println(nyTitel);
                System.out.println();
            } else if (opgave == 6) {
                sc.nextLine();
                sang.clearPlaylist();
                System.out.println(sang + "du har slettet din playliste");
                System.out.println();
            } else if (opgave == 7) {
                sc.nextLine();
                System.out.println("Dit program er nu afsluttet");
                System.exit(0);
            }
        }*/