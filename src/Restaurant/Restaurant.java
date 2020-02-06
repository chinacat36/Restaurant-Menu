package Restaurant;

import java.util.ArrayList;

public class Restaurant {
    public static void main(String[] args){
        MenuItem caesarSalad = new MenuItem("Caesar Salad", 5.00, "salad", "Small Plates");
        MenuItem chickenSoup = new MenuItem("Chicken Noodle Soup", 4, "soup", "Small Plates");
        MenuItem spaghetti = new MenuItem("Spaghetti and Meatballs", 20.00, "The best pasta","Large Plates");
        MenuItem iceCream = new MenuItem("Ice Cream", 3.00, "Strawberry, Vanilla, or Chocolate", "Desserts");
        ArrayList<MenuItem> smallPlates = new ArrayList<>();
        ArrayList<MenuItem> largePlates = new ArrayList<>();
        ArrayList<MenuItem> desserts = new ArrayList<>();
        ArrayList<ArrayList<MenuItem>> fullMenu = new ArrayList<ArrayList<MenuItem>>();
        Menu myMenu = new Menu(smallPlates, largePlates, desserts, fullMenu);
        fullMenu.add(smallPlates);
        fullMenu.add(largePlates);
        fullMenu.add(desserts);

        myMenu.addMenuItem(caesarSalad, "smallPlates");
        myMenu.addMenuItem(spaghetti, "largePlates");
        myMenu.addMenuItem(iceCream, "desserts");
        myMenu.addMenuItem(chickenSoup, "smallPlates");
        //myMenu.printMenuItem(caesarSalad, "smallPlates");
        //myMenu.removeMenuItem(caesarSalad, "smallPlates");
        myMenu.printEntireMenu();
        }

}
