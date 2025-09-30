package p1;

public abstract class Device {
    protected String name;
    public boolean isOn;
    protected long lastToggleTime;

    public Device(String name) {
        this.name = name;
        this.isOn = false;
        this.lastToggleTime = System.currentTimeMillis();
    }

    public String getName() {
        return name;
    }

    public void toggle() {
        isOn = !isOn;
        lastToggleTime = System.currentTimeMillis();
        System.out.println(name + (isOn ? " turned ON." : " turned OFF."));
    }

    public String getStatus() {
        long duration = (System.currentTimeMillis() - lastToggleTime) / 1000;
        return name + " is " + (isOn ? "ON for " + duration + "s" : "OFF for " + duration + "s");
    }

    @Override
    public String toString() {
        return getStatus();
    }
}