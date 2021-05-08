package racingcars.models;

import java.util.List;

public class Winner {

    private String teamName;
    private String carName;
    private int speedAcheived;
    private int fundsSpent;
    private List<String> partsUsed;

    
    public Winner() {
    }

    
    public Winner(String teamName, String carName, int speedAcheived, int fundsSpent, List<String> partsUsed) {
        this.teamName = teamName;
        this.carName = carName;
        this.speedAcheived = speedAcheived;
        this.fundsSpent = fundsSpent;
        this.partsUsed = partsUsed;
    }


    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public String getCarName() {
        return carName;
    }
    public void setCarName(String carName) {
        this.carName = carName;
    }
    public int getSpeedAcheived() {
        return speedAcheived;
    }
    public void setSpeedAcheived(int speedAcheived) {
        this.speedAcheived = speedAcheived;
    }
    public int getFundsSpent() {
        return fundsSpent;
    }
    public void setFundsSpent(int fundsSpent) {
        this.fundsSpent = fundsSpent;
    }
    public List<String> getPartsUsed() {
        return partsUsed;
    }
    public void setPartsUsed(List<String> partsUsed) {
        this.partsUsed = partsUsed;
    }


    @Override
    public String toString() {
        return "Winner [carName=" + carName + ", fundsSpent=" + fundsSpent + ", partsUsed=" + partsUsed
                + ", speedAcheived=" + speedAcheived + ", teamName=" + teamName + "]";
    }

    
    
}
