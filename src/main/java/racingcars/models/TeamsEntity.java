package racingcars.models;


public class TeamsEntity {
    private int id;
    private String name;
    private String car;
    private int funds;

    
    public TeamsEntity() {
    }
    public TeamsEntity(int id, String name, String car, int funds) {
        this.id = id;
        this.name = name;
        this.car = car;
        this.funds = funds;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCar() {
        return car;
    }
    public void setCar(String car) {
        this.car = car;
    }
    public int getFunds() {
        return funds;
    }
    public void setFunds(int funds) {
        this.funds = funds;
    }
    @Override
    public String toString() {
        return "TeamsEntity [ id=" + id +", name=" + name +" car =" + car + ", funds=" + funds +  "]";
    }

}
