package racingcars.service;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import racingcars.models.CarsEntity;
import racingcars.models.Parser;
import racingcars.models.PartsEntity;
import racingcars.models.TeamsEntity;
import racingcars.models.Winner;

public class CalculateMaxSpeed {

    Parser parser = new Parser();

    List<Winner> li = new ArrayList<>();
    Winner w = new Winner();

    public Winner maxSpeed(File carfile, File teamsFile, File partsFile) {
        List<CarsEntity> cars = parser.carParser(carfile);
        List<TeamsEntity> teams = parser.teamParser(teamsFile);
        List<PartsEntity> parts = parser.partsParser(partsFile);
        for (CarsEntity c : cars) {
            List<String> partsUsed = new ArrayList<>();
            int fundsSpent = 0;
            String teamName = getTeamName(c.getId(), teams);
            int funds = getFunds(c.getId(), teams);
            String partlist = c.getPartListId();
            List<PartsEntity> segregateParts = segregateParts(partlist, parts);
            int speedLeft = c.getTopSpeed() - c.getBaseSpeed();
            for (PartsEntity s : segregateParts) {
                if (c.getBaseSpeed() < c.getTopSpeed() && s.getPrice() < funds && s.getSpeedBoost() < speedLeft) {
                    c.setBaseSpeed(c.getBaseSpeed() + s.getSpeedBoost());
                    speedLeft = c.getTopSpeed() - c.getBaseSpeed();
                    funds -= s.getPrice();
                    partsUsed.add(s.getId());
                    fundsSpent += s.getPrice();
                }

            }
            if (w.getSpeedAcheived() < c.getBaseSpeed()) {
                w.setTeamName(teamName);
                w.setCarName(c.getName());
                w.setSpeedAcheived(c.getBaseSpeed());
                w.setFundsSpent(fundsSpent);
                w.setPartsUsed(partsUsed);

            }
        }
        return w;

    }

    public String getTeamName(String carId, List<TeamsEntity> teams) {
        for (TeamsEntity t : teams) {
            if (carId.equals(t.getCar())) {
                return t.getName();
            }
        }
        return null;

    }

    public int getFunds(String carId, List<TeamsEntity> teams) {
        for (TeamsEntity t : teams) {
            if (carId.equals(t.getCar())) {
                return t.getFunds();
            }
        }
        return 0;

    }

    public List<PartsEntity> segregateParts(String partListId, List<PartsEntity> parts) {
        List<PartsEntity> segregatedParts = new ArrayList<>();

        for (PartsEntity p : parts) {
            if (p.getPartListId().equals(partListId)) {
                segregatedParts.add(p);
            }

        }

        Collections.sort(segregatedParts, new Comparator<PartsEntity>() {

            @Override
            public int compare(PartsEntity t, PartsEntity t1) {
                return t1.getSpeedBoost() - t.getSpeedBoost();
            }
        });
        return segregatedParts;
    }

}
