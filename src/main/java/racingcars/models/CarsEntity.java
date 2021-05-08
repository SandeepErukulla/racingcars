package racingcars.models;

public class CarsEntity {
    private String id;
    private String name;
    private int baseSpeed;
    private int topSpeed;
    private String partListId;

    public CarsEntity() {
    }
    
    public CarsEntity(String id, String name, int baseSpeed, int topSpeed, String partListId) {
        this.id = id;
        this.name = name;
        this.baseSpeed = baseSpeed;
        this.topSpeed = topSpeed;
        this.partListId = partListId;
    }
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBaseSpeed() {
        return baseSpeed;
    }
    public void setBaseSpeed(int baseSpeed) {
        this.baseSpeed = baseSpeed;
    }
    public int getTopSpeed() {
        return topSpeed;
    }
    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }
    public String getPartListId() {
        return partListId;
    }
    public void setPartListId(String partListId) {
        this.partListId = partListId;
    }

    @Override
    public String toString() {
        return "CarsEntity [baseSpeed=" + baseSpeed + ", id=" + id + ", name=" + name + ", partListId=" + partListId
                + ", topSpeed=" + topSpeed + "]";
    }

    // @Override
    // public int compareTo(CarsEntity o) {
    //     // TODO Auto-generated method stub
    //    // if(this.baseSpeed.compareTo(o.getBaseSpeed()))
    //    //return this.baseSpeed.compareTo((int)o.getBaseSpeed());
    //     return 4.compareTo(3);
    // }



    
}
