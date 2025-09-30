package p2;

import java.util.ArrayList;

import p1.Device;

abstract public class Room{
	String name;
	public ArrayList<Device> devices = new ArrayList<>();
	
	public Room(String name) {
		this.name = name;
	}
	
	public void addDevice(Device adddevice) {
		devices.add(adddevice);
	}
	
	public void removeDevice(String removedevice) {
		devices.removeIf(d -> d.getName().equalsIgnoreCase(removedevice));
	}
	
	public void showStatus() {
		System.out.println("\nDevices in "+name+"are :");
		for(Device d : devices) {
			System.out.println(d);
		}
	}
	
	public void toggleDevice(String deviceName) {
        for (Device d : devices) {
            if (d.getName().equalsIgnoreCase(deviceName)) {
                d.toggle();
                return;
            }
        }
        System.out.println("Device not found in " + name);
    }

	public String getName() {
		return name;
	}

	

}
