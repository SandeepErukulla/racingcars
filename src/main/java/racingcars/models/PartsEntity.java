package racingcars.models;

public class PartsEntity {

    private String partListId;
    private String id;
    private int price;
    private int speedBoost;
    
    
    public PartsEntity() {
    }

    public PartsEntity(String partListId, String id, int price, int speedBoost) {
        this.partListId = partListId;
        this.id = id;
        this.price = price;
        this.speedBoost = speedBoost;
    }

    public String getPartListId() {
        return partListId;
    }
    public void setPartListId(String partListId) {
        this.partListId = partListId;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getSpeedBoost() {
        return speedBoost;
    }
    public void setSpeedBoost(int speedBoost) {
        this.speedBoost = speedBoost;
    }

    @Override
    public String toString() {
        return "PartsEntity [id=" + id + ", partListId=" + partListId + ", price=" + price + ", speedBoost=" + speedBoost
                + "]";
    }

    
    
}
