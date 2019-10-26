package org.zlasu.device;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Repository
public class DeviceDao {

    private List<Device> deviceList = new ArrayList<>();

    public DeviceDao() {
        deviceList.add(new Device(1, 1, "Rower Janka", "1", "2"));
        deviceList.add(new Device(2, 1, "Rower Janka 2", "1", "2"));
        deviceList.add(new Device(3, 1, "Rower Janka 3", "1", "2"));
        deviceList.add(new Device(4, 1, "Telefon Janka 4", "0", "1"));
        deviceList.add(new Device(5, 1, "Telefon Janka 5", "0", "1"));
    }

    public List<Device> getAll() {
        return this.deviceList;
    }

    public void addDevice(Device device) {
        int newID = deviceList.stream().map(Device::getId).mapToInt(v -> v).max().orElseThrow(NoSuchElementException::new) + 1;
        device.setId(newID);
        deviceList.add(device);
    }

    public void updateDevice(Device device) {
        deviceList.remove(getDevice(device.getId()));
        deviceList.add(device);
    }

    public Device getDevice(int id) {
        return deviceList.stream().filter(s -> s.getId() == id).findFirst().get();
    }

    public void deleteDevice(int id) {
        deviceList.remove(getDevice(id));
    }
}
