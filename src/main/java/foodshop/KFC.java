package foodshop;

public class KFC extends FoodShop implements ISuggest{

    private Integer familyBucketSize;
    private Boolean healthy;

    public KFC(String name,Boolean healthy, Integer familyBucketSize){
        super(name);
        this.familyBucketSize = familyBucketSize;
        this.healthy = healthy;
    }

    public String suggest(String food){
        return String.format("Our special food of the day is %s", food);
    }

    public Integer getFamilyBucketSize(){
        return familyBucketSize;
    }

    public void setFamilyBucketSize(Integer familyBucketSize) {
        this.familyBucketSize = familyBucketSize;
    }

    public Boolean isItHealthy(){
        return healthy;
    }

    @Override
    public void setHealthy(boolean healthy) {
        super.setHealthy(healthy);
    }

    @Override
    public String popularFood(){
        return "Box meal";
    }

    public String popularFood(String secondPop){
        return String.format("%s",secondPop);
    }

    public String addWings(){
        return "How many wings do you want?";
    }
}
