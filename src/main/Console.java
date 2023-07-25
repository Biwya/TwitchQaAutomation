public class Console {
    public String name;
    public boolean isHandheld;
    public boolean isTurnedOn;
    public int numberOfButtons;
    public double internalStorage;
    public String operatingSystem;
    public static int consolesCreated = 0;

    public Console(String name, boolean isHandheld, boolean isTurnedOn, int numberOfButtons, double internalStorage, String operatingSystem) {
        this.name = name;
        this.isHandheld = isHandheld;
        this.isTurnedOn = isTurnedOn;
        this.numberOfButtons = numberOfButtons;
        this.internalStorage = internalStorage;
        this.operatingSystem = operatingSystem;
        increaseConsolesCreated();
    }

    public Console() {
        this.name = "";
        this.isHandheld = false;
        this.isTurnedOn = false;
        this.numberOfButtons = 18;
        this.internalStorage = 256;
        this.operatingSystem = "";
        increaseConsolesCreated();
    }

    public static void increaseConsolesCreated() {
        consolesCreated++;
    }

    public void turnConsoleOn() {
        isTurnedOn = true;
    }

    public void turnConsoleOff() {
        isTurnedOn = false;
    }

}
