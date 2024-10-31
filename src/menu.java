import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class menu {

    private List<Pizza> pizzaMenu;

    public menu(){
        createPizza();
    }
/* Pizza = nummerPizza, navnPizza, prisPizza */

    public void createPizza() {
        pizzaMenu = new ArrayList<>();

        Pizza vesuvio = new Pizza(1, "Vesuvio", 57);
        Pizza amerikaner = new Pizza(2, "Amerikaner", 53);
        Pizza cacciatore = new Pizza(3, "Cacciatore", 57);
        Pizza carbona = new Pizza(4, "Carbona", 63);
        Pizza dennis = new Pizza(5, "Dennis", 63);
        Pizza bertil = new Pizza(6, "Bertil", 57);
        Pizza silvia = new Pizza(7, "Silvia", 57);
        Pizza victoria = new Pizza(8, "Victoria", 57);
        Pizza toronto = new Pizza(9, "Toronto", 57);
        Pizza capricciosa = new Pizza(10, "Capricciosa", 57);
        Pizza hawaii = new Pizza(11, "Hawaii", 57);
        Pizza leBlissola = new Pizza(12, "Le Blissola", 57);
        Pizza venezia = new Pizza(13, "Venezia", 57);
        Pizza mafia = new Pizza(14, "Mafia", 61);
        Pizza larsKrisMads = new Pizza(15, "Lars Kris-Mads", 70);
        Pizza adios = new Pizza(16, "Adios", 65);
        Pizza quatroStagnioni = new Pizza(17, "Quatro Stagioni", 63);
        Pizza bigJohn = new Pizza(18, "Big John", 74);
        Pizza porto = new Pizza(19, "Porto", 57);
        Pizza bigMamma = new Pizza(20, "Big Mamma", 62);
        Pizza neymar = new Pizza(21, "Neymar", 65);
        Pizza americano = new Pizza(22, "Americano", 81);
        Pizza opera = new Pizza(23, "Opera", 58);
        Pizza paesana = new Pizza(24, "Paesana", 82);
        Pizza mexicano = new Pizza(25, "Mexicano", 73);
        Pizza jolle = new Pizza(26, "Jolle", 56);
        Pizza azario = new Pizza(27, "Azario", 72);
        Pizza andrea = new Pizza(28, "Andrea", 79);
        Pizza palermo = new Pizza(29, "Palermo", 68);
        Pizza bocaJuniors = new Pizza(30, "Boca Juniors", 69);
        Pizza sofiANapoli = new Pizza(31, "Sofi A Napoli", 78);

        pizzaMenu.add(vesuvio);
        pizzaMenu.add(amerikaner);
        pizzaMenu.add(cacciatore);
        pizzaMenu.add(carbona);
        pizzaMenu.add(dennis);
        pizzaMenu.add(bertil);
        pizzaMenu.add(silvia);
        pizzaMenu.add(victoria);
        pizzaMenu.add(toronto);
        pizzaMenu.add(capricciosa);
        pizzaMenu.add(hawaii);
        pizzaMenu.add(leBlissola);
        pizzaMenu.add(venezia);
        pizzaMenu.add(mafia);
        pizzaMenu.add(larsKrisMads);
        pizzaMenu.add(adios);
        pizzaMenu.add(quatroStagnioni);
        pizzaMenu.add(bigJohn);
        pizzaMenu.add(porto);
        pizzaMenu.add(bigMamma);
        pizzaMenu.add(neymar);
        pizzaMenu.add(americano);
        pizzaMenu.add(opera);
        pizzaMenu.add(paesana);
        pizzaMenu.add(mexicano);
        pizzaMenu.add(jolle);
        pizzaMenu.add(azario);
        pizzaMenu.add(andrea);
        pizzaMenu.add(palermo);
        pizzaMenu.add(bocaJuniors);
        pizzaMenu.add(sofiANapoli);

        List<String> beskrivelse = new ArrayList<>();
        beskrivelse.add("tomatsauce, ost, skinke og oregano............................................");
        beskrivelse.add("NYHED tomatsauce, ost, oksefars og oregano.................................");
        beskrivelse.add("tomatsauce, ost, pepperoni og oregano......................................");
        beskrivelse.add("NYHED tomatsauce, ost kødsauce, spaghetti, cocktailpølser og oregano..........");
        beskrivelse.add("NYHED tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano............");
        beskrivelse.add("tomatsauce, ost, bacon og oregano..............................................");
        beskrivelse.add("tomatsauce, ost pepperoni, rød peber, løg, oliven og oregano...................");
        beskrivelse.add("tomatsauce, ost, skinke, ananas, champignon, løg og oregano..................");
        beskrivelse.add("NYHED tomatsauce, ost, skinke, bacon, kebab, chili og oregano.................");
        beskrivelse.add("tomatsauce, ost, skinke, champignon og oregano...........................");
        beskrivelse.add("tomatsauce, ost, ananas og oregano............................................");
        beskrivelse.add("tomatsauce, ost, skinke, rejer og oregano................................");
        beskrivelse.add("tomatsauce, ost, skinke, bacon og oregano....................................");
        beskrivelse.add("NYHED tomatsauce, ost, pepperoni, bacon, løg og oregano........................");
        beskrivelse.add("tomatsauce, ost, ristet pølse i svøb og risengrød (indbagt)...........");
        beskrivelse.add("tomatsauce, ost, pepperoni, løg, hakket oksekød, jalapeños og tacosauce........");
        beskrivelse.add("tomatsauce, mozzarella, skinke, champignon, artiskok og oliven.......");
        beskrivelse.add("NYHED tomatsauce, gorgonzola ost, bearnaise og XL medisterpølse.............");
        beskrivelse.add("tomatsauce, mozzarella, muslinger, tun og rejer................................");
        beskrivelse.add("tomatsauce, mozzarella, champignon, paprika, kødstrimler og løg............");
        beskrivelse.add("tomatsauce, mozzarella, pepperoni, løg og peber...............................");
        beskrivelse.add("tomatsauce, mozzarella, marineret steak og chili...........................");
        beskrivelse.add("tomatsauce, mozzarella, hakket oksekød, pepperoni og løg.......................");
        beskrivelse.add("tomatsauce, ost, skinke, bacon, hakket oksekød, jakabov og cocktailpølser....");
        beskrivelse.add("tomatsauce, mozzarella, skinke, pepperoni, løg, chili og hvidløg............");
        beskrivelse.add("tomatsauce, ost, kebab, salat, chili, dressing (foldet på midten)..............");
        beskrivelse.add("tomatsauce, mozzarella, kartofler, basilikum, fetaost og rosmarin.............");
        beskrivelse.add("tomatsauce, mozzarella, marineret kylling, champignon og kværnet peber........");
        beskrivelse.add("tomatsauce, mozzarella, skinke, pepperoni, hvidløg og bacon..................");
        beskrivelse.add("tomatsauce, mozzarella, kødstrimler, salat og creme fraiche dressing....");
        beskrivelse.add("tomatsauce, mozzarella, chili, hvidløg, artiskok og kødstrimler........");

        printPizza(beskrivelse);
    }

    public void printPizza(List<String> beskrivelse) {
        System.out.println(" ___________________________________________________________________________________________________");
        System.out.println("|                                                                                                   |");
        System.out.println("| " + "\u001B[1mMARIOS PIZZABAR MENU\u001B[0m" + "                                                                              |");
        System.out.println("|                                                                                                   |");
        for (int i = 0; i < pizzaMenu.size(); i++) {
            Pizza pizza = pizzaMenu.get(i);
            String beskrivelser = beskrivelse.get(i); // Hent den specifikke beskrivelse

            boolean isNyhed = beskrivelser.contains("NYHED");

            String pizzanummerFarvet = "\u001B[1m" + pizza.getNummerPizza() + ". " + "\u001B[0m";
            String pizzaNavnFarvet = "\u001B[35;1m" + pizza.getNavnPizza() + "\u001B[0m";
            String nyhedFarvet = beskrivelser.contains("NYHED") ? "\u001B[31mNYHED\u001B[0m " : "";
            String prisFarvet = "\u001B[32m" + pizza.getPrisPizza() + " ,-\u001B[0m";

            if (isNyhed) {
                beskrivelser = beskrivelser.replace("NYHED", "").trim();
            }

            System.out.println("| " + pizzanummerFarvet + ". " + pizzaNavnFarvet + ": " + nyhedFarvet + beskrivelser + prisFarvet + " |");
        }
        System.out.println("|___________________________________________________________________________________________________|");
    }
}
