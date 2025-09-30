package p3;

import p1.*;
import p2.*;
import java.util.*;

public class HouseAutomation {
    static ArrayList<Room> rooms = new ArrayList<>();

    public static Room getRoom(String name) {
        for (Room r : rooms) {
            if (r.getName().equalsIgnoreCase(name)) 
            	return r;
        }
        return null;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Add Room \n2. Add Device \n3. Toggle Device \n4. Show Room Status \n5. Exit \nEnter choice:");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                	System.out.println("Note:Enter One room At a time");
                    System.out.println("Enter room type (kitchen/bedroom/hall/washroom): ");
                    String type = sc.nextLine();
                    System.out.println("Give the unique name to "+type+" :");
                    String roomName = sc.nextLine();
                    Room newRoom = null;
                    switch (type.toLowerCase()) {
                        case "kitchen": newRoom = new Kitchen(roomName); 
                        	 break;
                        case "bedroom": newRoom = new Bedroom(roomName); 
                        	 break;
                        case "hall": newRoom = new Hall(roomName); 
                        	 break;
                        case "washroom": newRoom = new Washroom(roomName); 
                        	 break;
                        default: 
                        	System.out.println("Invalid room type."); 
                        	continue;
                    }
                    rooms.add(newRoom);
                    System.out.println("Room added.");
                    break;

                case 2:
                    System.out.println("Enter room name to add device:");
                    Room r = getRoom(sc.nextLine());
                    if (r == null) {
                        System.out.println("Room not found");
                        break;
                    }
                    System.out.println("Enter device type (light, fan, ac, tv, shower):");
                    String devType = sc.nextLine();
                    System.out.println("Enter device name:");
                    String devName = sc.nextLine();
                    Device d = null;
                    switch (devType.toLowerCase()) {
                        case "light": d = new Light(devName); break;
                        case "fan": d = new Fan(devName); break;
                        case "ac": d = new AC(devName); break;
                        case "tv": d = new TV(devName); break;
                        case "shower": d = new Shower(devName); break;
                        default: System.out.println("Invalid device type."); continue;
                    }
                    r.addDevice(d);
                    System.out.println("Device added to " + r.getName());
                    break;

                case 3:
                    System.out.println("Enter room name:");
                    Room toggleRoom = getRoom(sc.nextLine());
                    if (toggleRoom == null) {
                        System.out.println("Room not found");
                        break;
                    }

                    toggleRoom.showStatus();  // Show all devices first

                    System.out.println("Enter device name to update:");
                    String toggleDeviceName = sc.nextLine();
                    boolean found = false;

                    for (Device device : toggleRoom.devices) {
                        if (device.getName().equalsIgnoreCase(toggleDeviceName)) {
                            found = true;
                            if (device.isOn) {
                                System.out.println(device.getName() + " is currently ON. Do you want to turn it OFF? (yes/no)");
                                String input = sc.nextLine();
                                if (input.equalsIgnoreCase("yes")) {
                                    device.toggle();
                                } else {
                                    System.out.println("No change made.");
                                }
                            } else {
                                System.out.println(device.getName() + " is currently OFF. Do you want to turn it ON? (yes/no)");
                                String input = sc.nextLine();
                                if (input.equalsIgnoreCase("yes")) {
                                    device.toggle();
                                } else {
                                    System.out.println("No change made.");
                                }
                            }
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Device not found in " + toggleRoom.getName());
                    }
                    break;


                case 4:
                    System.out.println("Enter room name:");
                    Room statusRoom = getRoom(sc.nextLine());
                    if (statusRoom == null) {
                        System.out.println("Room not found");
                        break;
                    }
                    statusRoom.showStatus();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}