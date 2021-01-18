package restaurant;

import java.util.Date;

public class MenuItem {
    private String item;
    private Double price;
    private String description;
    private String category;
    private Boolean isNew;
//    private int dateIntroduced;

    public MenuItem(String item, double price, String description){
        this.item = item;
        this.price = price;
        this.description = description;
        this.category = "Not categorized";
        this.isNew = false;
        }

    public MenuItem(String item, double price, String description, String category, Boolean isNew){
        this.item = item;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public String getItem(){
        return this.item;
    }

    public void setItem(String item){
        this.item = item;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getCategory(){
        return this.category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public Boolean getIsNew(){
        return this.isNew;
    }

    public void setIsNew(Boolean isNew){
        this.isNew = isNew;
    }

//    public int getDateIntroduced(){
//        return this.dateIntroduced;
//    }
//
//    public void setDateIntroduced(int dateIntroduced){
//        this.dateIntroduced = dateIntroduced;
//    }
}
