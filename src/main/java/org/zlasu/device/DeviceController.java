package org.zlasu.device;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/device")
public class DeviceController {

    private final DeviceService deviceService;

    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @GetMapping("/list")
    public List<Device> deviceListAction() {
        return deviceService.getAllDevice();
    }

    @GetMapping("/{id}")
    public Device deviceGetAction(@PathVariable int id) {
        return deviceService.getDevice(id);
    }

    @DeleteMapping("/{id}")
    public void deviceDeleteAction(@PathVariable int id) {
        deviceService.deleteDevice(id);
    }

    @PutMapping("/")
    public void deviceUpdateAction(@RequestBody Device device) {
        deviceService.updateDevice(device);
    }

    @PostMapping("/")
    public void deviceAddAction(@RequestBody Device device) {
        deviceService.addDevice(device);
    }
}
