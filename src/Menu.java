import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    List<Pizza> pizzaMenu;
    List<String> beskrivelse;

    public Menu(){
        pizzaMenu = new ArrayList<>();
        beskrivelse = new ArrayList<>();
        createPizza();

    }
    /* Pizza = nummerPizza, navnPizza, prisPizza */

    public void createPizza() {

        pizzaMenu.add(new Pizza(1, "Vesuvio", 57));
        pizzaMenu.add(new Pizza(2, "Amerikaner", 53));
        pizzaMenu.add(new Pizza(3, "Cacciatore", 57));
        pizzaMenu.add(new Pizza(4, "Carbona", 63));
        pizzaMenu.add(new Pizza(5, "Dennis", 63));
        pizzaMenu.add(new Pizza(6, "Bertil", 57));
        pizzaMenu.add(new Pizza(7, "Silvia", 57));
        pizzaMenu.add(new Pizza(8, "Victoria", 57));
        pizzaMenu.add(new Pizza(9, "Toronto", 57));
        pizzaMenu.add(new Pizza(10, "Capricciosa", 57));
        pizzaMenu.add(new Pizza(11, "Hawaii", 57));
        pizzaMenu.add(new Pizza(12, "Le Blissola", 57));
        pizzaMenu.add(new Pizza(13, "Venezia", 57));
        pizzaMenu.add(new Pizza(14, "Mafia", 61));
        pizzaMenu.add(new Pizza(15, "Lars Kris-Mads", 70));
        pizzaMenu.add(new Pizza(16, "Adios", 65));
        pizzaMenu.add(new Pizza(17, "Quatro Stagioni", 63));
        pizzaMenu.add(new Pizza(18, "Big John", 74));
        pizzaMenu.add(new Pizza(19, "Porto", 57));
        pizzaMenu.add(new Pizza(20, "Big Mamma", 62));
        pizzaMenu.add(new Pizza(21, "Neymar", 65));
        pizzaMenu.add(new Pizza(22, "Americano", 81));
        pizzaMenu.add(new Pizza(23, "Opera", 58));
        pizzaMenu.add(new Pizza(24, "Paesana", 82));
        pizzaMenu.add(new Pizza(25, "Mexicano", 73));
        pizzaMenu.add(new Pizza(26, "Jolle", 56));
        pizzaMenu.add(new Pizza(27, "Azario", 72));
        pizzaMenu.add(new Pizza(28, "Andrea", 79));
        pizzaMenu.add(new Pizza(29, "Palermo", 68));
        pizzaMenu.add(new Pizza(30, "Boca Juniors", 69));
        pizzaMenu.add(new Pizza(31, "Sofi A Napoli", 78));

        this.beskrivelse.add("tomatsauce, ost, skinke og oregano............................................");
        this.beskrivelse.add("NYHED tomatsauce, ost, oksefars og oregano.................................");
        this.beskrivelse.add("tomatsauce, ost, pepperoni og oregano......................................");
        this.beskrivelse.add("NYHED tomatsauce, ost kødsauce, spaghetti, cocktailpølser og oregano..........");
        this.beskrivelse.add("NYHED tomatsauce, ost, skinke, pepperoni, cocktailpølser og oregano............");
        this.beskrivelse.add("tomatsauce, ost, bacon og oregano..............................................");
        this.beskrivelse.add("tomatsauce, ost pepperoni, rød peber, løg, oliven og oregano...................");
        this.beskrivelse.add("tomatsauce, ost, skinke, ananas, champignon, løg og oregano..................");
        this.beskrivelse.add("NYHED tomatsauce, ost, skinke, bacon, kebab, chili og oregano.................");
        this.beskrivelse.add("tomatsauce, ost, skinke, champignon og oregano...........................");
        this.beskrivelse.add("tomatsauce, ost, ananas og oregano............................................");
        this.beskrivelse.add("tomatsauce, ost, skinke, rejer og oregano................................");
        this.beskrivelse.add("tomatsauce, ost, skinke, bacon og oregano....................................");
        this.beskrivelse.add("NYHED tomatsauce, ost, pepperoni, bacon, løg og oregano........................");
        this.beskrivelse.add("tomatsauce, ost, ristet pølse i svøb og risengrød (indbagt)...........");
        this.beskrivelse.add("tomatsauce, ost, pepperoni, løg, hakket oksekød, jalapeños og tacosauce........");
        this.beskrivelse.add("tomatsauce, mozzarella, skinke, champignon, artiskok og oliven.......");
        this.beskrivelse.add("NYHED tomatsauce, gorgonzola ost, bearnaise og XL medisterpølse.............");
        this.beskrivelse.add("tomatsauce, mozzarella, muslinger, tun og rejer................................");
        this.beskrivelse.add("tomatsauce, mozzarella, champignon, paprika, kødstrimler og løg............");
        this.beskrivelse.add("tomatsauce, mozzarella, pepperoni, løg og peber...............................");
        this.beskrivelse.add("tomatsauce, mozzarella, marineret steak og chili...........................");
        this.beskrivelse.add("tomatsauce, mozzarella, hakket oksekød, pepperoni og løg.......................");
        this.beskrivelse.add("tomatsauce, ost, skinke, bacon, hakket oksekød, jakabov og cocktailpølser....");
        this.beskrivelse.add("tomatsauce, mozzarella, skinke, pepperoni, løg, chili og hvidløg............");
        this.beskrivelse.add("tomatsauce, ost, kebab, salat, chili, dressing (foldet på midten)..............");
        this.beskrivelse.add("tomatsauce, mozzarella, kartofler, basilikum, fetaost og rosmarin.............");
        this.beskrivelse.add("tomatsauce, mozzarella, marineret kylling, champignon og kværnet peber........");
        this.beskrivelse.add("tomatsauce, mozzarella, skinke, pepperoni, hvidløg og bacon..................");
        this.beskrivelse.add("tomatsauce, mozzarella, kødstrimler, salat og creme fraiche dressing....");
        this.beskrivelse.add("tomatsauce, mozzarella, chili, hvidløg, artiskok og kødstrimler........");

        printPizza();
    }

    public void printPizza() {
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