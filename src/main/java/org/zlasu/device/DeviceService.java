package org.zlasu.device;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DeviceService {

    private final DeviceDao deviceDao;

    private List<Device> deviceList;

    public DeviceService(DeviceDao deviceDao) {
        this.deviceDao = deviceDao;
        deviceList = new ArrayList<>();
    }

    public List<Device> getAllDevice() {
        return deviceDao.getAll();
    }

    public Device getDevice(int id) {
        return deviceDao.getDevice(id);
    }

    public void addDevice(Device device) {
        deviceDao.addDevice(device);
    }

    public void deleteDevice(int id) {
        deviceDao.deleteDevice(id);
    }

    public void updateDevice(Device device) {
        deviceDao.updateDevice(device);
    }
}
