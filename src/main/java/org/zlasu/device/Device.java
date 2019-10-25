package org.zlasu.device;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Device {

    private int id;
    private int userId;
    private String name;
    private String status;
    private String type;

    public Device() {
    }

    public Device(int id, int userId, String name, String status, String type) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.status = status;
        this.type = type;
    }
}
