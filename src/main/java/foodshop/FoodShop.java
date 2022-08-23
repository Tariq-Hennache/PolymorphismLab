package foodshop;

public class FoodShop {

    private boolean healthy;

    private String name;

    private boolean kidsMenu;

    public FoodShop(String name){
        this.name = name;
        this.kidsMenu = true;
        this.healthy = false;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    public boolean isKidsMenu() {
        return kidsMenu;
    }

    public void setKidsMenu(boolean kidsMenu) {
        this.kidsMenu = kidsMenu;
    }

    public String popularFood(){
        return String.format("Our most popular food item is %s", this.name);
    }
}
