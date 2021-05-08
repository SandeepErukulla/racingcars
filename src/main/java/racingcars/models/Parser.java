package racingcars.models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

import racingcars.models.CarsEntity;
import racingcars.models.PartsEntity;
import racingcars.models.TeamsEntity;

public class Parser {

    public List<CarsEntity> carParser(File file) {
        List<CarsEntity> cars = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            br.readLine();
            String row = br.readLine();
            while (row != null) {

                String[] attributes = row.split(",");
                CarsEntity car = new CarsEntity();
                car.setId(attributes[0]);
                car.setName(attributes[1]);
                car.setBaseSpeed(Integer.parseInt(attributes[2]));
                car.setTopSpeed(Integer.parseInt(attributes[3]));
                car.setPartListId(attributes[4]);

                cars.add(car);

                row = br.readLine();
            }
            br.close();

            Collections.sort(cars, new Comparator<CarsEntity>() {

                @Override
                public int compare(CarsEntity t, CarsEntity t1) {
                    return t1.getTopSpeed() - t.getTopSpeed();
                }
            });
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        return cars;
    }

    public List<TeamsEntity> teamParser(File file) {
        List<TeamsEntity> teams = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            br.readLine();
            String row = br.readLine();
            while (row != null) {

                String[] attributes = row.split(",");
                TeamsEntity team = new TeamsEntity();
                team.setId(Integer.parseInt(attributes[0]));
                team.setName(attributes[1]);
                team.setCar(attributes[2]);
                team.setFunds(Integer.parseInt(attributes[attributes.length - 1]));
                teams.add(team);
                row = br.readLine();
            }
            br.close();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        return teams;
    }

    public List<PartsEntity> partsParser(File file) {
        List<PartsEntity> parts = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            br.readLine();
            String row = br.readLine();
            while (row != null) {

                String[] attributes = row.split(",");
                PartsEntity part = new PartsEntity();
                part.setPartListId(attributes[0]);
                part.setId(attributes[1]);
                part.setPrice(Integer.parseInt(attributes[2]));
                part.setSpeedBoost(Integer.parseInt(attributes[3]));
                parts.add(part);

                Collections.sort(parts, new Comparator<PartsEntity>() {

                    @Override
                    public int compare(PartsEntity t, PartsEntity t1) {
                        return t1.getSpeedBoost() - t.getSpeedBoost();
                    }
                });
                row = br.readLine();
            }
            br.close();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        return parts;
    }
}
