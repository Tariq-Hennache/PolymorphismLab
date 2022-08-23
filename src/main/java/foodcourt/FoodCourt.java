package foodcourt;


import foodshop.FoodShop;

import java.util.ArrayList;

public class FoodCourt {

    private String name;
    private ArrayList<FoodShop> foodShop;

    public FoodCourt(String name){
        this.name = name;
        this.foodShop = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<FoodShop> getFoodShop() {
        return foodShop;
    }

    public void setFoodShop(ArrayList<FoodShop> foodShop) {
        this.foodShop = foodShop;
    }

    public int countShops(){
        return foodShop.size();
    }

    public void addShop(FoodShop foodShop){
        this.foodShop.add(foodShop);
    }


}
