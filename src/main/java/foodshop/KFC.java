package foodshop;

public class KFC extends FoodShop{

    private Integer familyBucketSize;

    public KFC(String name, Integer familyBucketSize){
        super(name);
        this.familyBucketSize = familyBucketSize;
    }

    public Integer getFamilyBucketSize(){
        return familyBucketSize;
    }

    public void setFamilyBucketSize(Integer familyBucketSize) {
        this.familyBucketSize = familyBucketSize;
    }

    @Override
    public String popularFood(){
        return "Box meal";
    }

    public String addWings(){
        return "How many wings do you want?";
    }
}
