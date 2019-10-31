package org.zlasu.location;

import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class LocationDao {

    private List<Location> locationList = new ArrayList<>();

    public LocationDao() {
        Random random = new Random();
        Timestamp now = new Timestamp(System.currentTimeMillis());

        //52.122229, 20.695950
        //52.144841, 20.761886

        for (int i = 0; i < 1000; i++) {
            locationList.add(new Location(i, random.nextInt(5), 52.1 + Math.random(), 20.6 + Math.random(),
                    now));
        }
    }
}
