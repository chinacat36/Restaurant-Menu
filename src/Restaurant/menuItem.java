package Restaurant;

public class menuItem {
    private String itemName;
    private double price;
    private String description;
    private Boolean newItem = false;
    private String category;

    public menuItem(String itemName, double price, String description, Boolean newItem, String category) {
    this.itemName = itemName;
    this.price = price;
    this.description = description;
    this.newItem = newItem;
    this.category = category;
    }
}
