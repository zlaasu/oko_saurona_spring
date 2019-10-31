package org.zlasu.location;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class Location {
    private int id;
    private int deviceId;
    private Double latitude;
    private Double longitude;
    private Timestamp createOn;

    public Location(int id, int deviceId, Double latitude, Double longitude, Timestamp createOn) {
        this.id = id;
        this.deviceId = deviceId;
        this.latitude = latitude;
        this.longitude = longitude;
        this.createOn = createOn;
    }
}
