package foodshop;

import java.util.ArrayList;

public class TacoBell extends FoodShop{

    private String tacoType;

    public TacoBell(String name, String tacoType){
        super(name);
        this.tacoType = tacoType;
    }

    public String getTacoType(){
        return tacoType;
    }

    public void setTacoType(String tacoType) {
        this.tacoType = tacoType;
    }

    @Override
    public String popularFood(){
        return "Spicy BBQ Taco";
    }

    public String addTortillas(){
        return "How many Tortillas you want?";
    }




}
