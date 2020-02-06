package Restaurant;

import java.time.LocalDate;
import java.util.Date;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private LocalDate dateAdded;

    public MenuItem(String itemName, double price, String description, String category) {
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = LocalDate.now();
    }
    @Override
    public String toString() {
        return  this.itemName + ": \n " + this.description +"\n Price: " + this.price +
                "\n New Item: " + isNew() + "\n";
    }
    @Override
    //the OBJECT parameter is sticking with the original object() method
    public boolean equals(Object input){
        if (input == this) {
            return true;
        }
        if (input == null) {
            return false;
        }
        if (input.getClass() != this.getClass()) {
            return false;
        }
        MenuItem inputObject = (MenuItem) input;
        return inputObject.itemName == this.itemName;
    }

    private String itemName;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public boolean isNew(){
        return this.dateAdded.isBefore(this.dateAdded.plusMonths(1));
    }

}
