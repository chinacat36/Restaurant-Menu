package Restaurant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> smallPlates;
    private ArrayList<MenuItem> largePlates;
    private ArrayList<MenuItem> desserts;
    private ArrayList<ArrayList<MenuItem>> fullMenu;
    private LocalDate lastUpdated;

    public Menu(ArrayList<MenuItem> smallPlates, ArrayList<MenuItem> largePlates, ArrayList<MenuItem> desserts, ArrayList<ArrayList<MenuItem>> fullMenu){
        this.smallPlates = smallPlates;
        this.largePlates = largePlates;
        this.desserts = desserts;
        this.fullMenu = fullMenu;
    }

    public void addMenuItem(MenuItem newItem, String placement) {
        if(placement == "smallPlates") {
            smallPlates.add(newItem);
        }else if (placement == "largePlates"){
            largePlates.add(newItem);
        }else if(placement == "desserts"){
                desserts.add(newItem);
            }
        this.lastUpdated = LocalDate.now();
    }

    public void removeMenuItem(MenuItem oldItem, String placement){
        if(placement == "smallPlates") {
            smallPlates.remove(oldItem);
        }else if (placement == "largePlates"){
            largePlates.remove(oldItem);
        }else if(placement == "desserts"){
            desserts.remove(oldItem);
        }
        this.lastUpdated = LocalDate.now();
    }

    public void printLastUpdated(){
        System.out.println(this.lastUpdated);
    }

    public void printMenuItem(MenuItem printItem, String placement) {

        if(placement == "smallPlates") {
            for (MenuItem item : smallPlates) {
                item = printItem;
                if (smallPlates.contains(item)) {
                }
            }
            System.out.println(printItem);
        }else if(placement == "largePlates"){
                    for(MenuItem item : largePlates) {
                        item = printItem;
                        if (largePlates.contains(item)) {
                        }
                    }
            System.out.println(printItem);
        }else if(placement == "desserts"){
            for(MenuItem item : desserts){
                item = printItem;
                if(desserts.contains(item)){
                }
        }
            System.out.println(printItem);
        }
    }

    public void printEntireMenu(){
        System.out.println("MENU:");
        for(ArrayList list : fullMenu){
            for(Object item : list){
                System.out.println(item);
            }
        }

        System.out.println("\nLast updated: " + lastUpdated);
    }

}
