package foodshop;

public class Subway extends FoodShop {

    private String breadType;

    public Subway(String name, String breadType){
        super(name);
        this.breadType = breadType;
    }

    public String getBreadType() {
        return breadType;
    }

    public void setBreadType(String breadType) {
        this.breadType = breadType;
    }

    @Override
    public String popularFood(){
        return "BMT";
    }

    public String addCrisps(){
        return "Do you want crisps";
    }
}
