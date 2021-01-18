package restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;


    public static void main(String[] args) {
        MenuItem salmon = new MenuItem("Salmon dinner", 19.80, "Salmon, broccoli, couscous", "main course", true);
        System.out.println(salmon.getItem());
        salmon.setPrice(25.99);
        System.out.println(salmon.getPrice());
        Date date = new Date();
        System.out.println(date);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
