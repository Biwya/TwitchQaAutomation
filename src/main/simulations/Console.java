package simulations;

public abstract class Console {
    private String name;
    private boolean isHandheld;
    private boolean isTurnedOn;
    private int numberOfButtons;
    private double internalStorage;
    private String operatingSystem;
    private static int consolesCreated = 0;

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

    public Console(boolean isHandheld) {
        this();
        this.isHandheld = isHandheld;
    }

    public int getNumberOfButtons() {
        return numberOfButtons;
    }

    public void setNumberOfButtons(int numberOfButtons) {
        if (numberOfButtons >= 2) {
            this.numberOfButtons = numberOfButtons;
            System.out.println("THe number of buttons was set to " + numberOfButtons);
        } else {
            System.out.println(numberOfButtons + " is an invalid value for number of buttons. Please choose a value higher or equal to 2");
        }
    }

    public boolean isHandheld() {
        return isHandheld;
    }

    public void setHandheld(boolean handheld) {
        isHandheld = handheld;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        isTurnedOn = turnedOn;
    }

    public double getInternalStorage() {
        return internalStorage;
    }

    public void setInternalStorage(double internalStorage) {
        this.internalStorage = internalStorage;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public static int getConsolesCreated() {
        return consolesCreated;
    }

    public static void setConsolesCreated(int consolesCreated) {
        Console.consolesCreated = consolesCreated;
    }

    public static void increaseConsolesCreated() {
        consolesCreated++;
    }

    public abstract void turnConsoleOn();

    public abstract void turnConsoleOff();

    @Override
    public String toString() {
        return "Console{" +
                "name='" + name + '\'' +
                ", isHandheld=" + isHandheld +
                ", isTurnedOn=" + isTurnedOn +
                ", numberOfButtons=" + numberOfButtons +
                ", internalStorage=" + internalStorage +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }

    String toString(String[] parameterList) {
        StringBuilder builder = new StringBuilder();
        builder.append("Console{");
        for (int i = 0; i < parameterList.length; i++) {
            if (i > 0) {
                builder.append(", ");
            }
            switch (parameterList[i].toLowerCase()) {
                case "name" -> builder.append("name='").append(name).append('\'');
                case "ishandheld" -> builder.append("isHandheld=").append(isHandheld);
                case "isturnedon" -> builder.append("isTurnedOn=").append(isTurnedOn);
                case "numberofbuttons" -> builder.append("numberOfButtons=").append(numberOfButtons);
                case "internalstorage" -> builder.append("internalStorage=").append(internalStorage);
                case "operatingsystem" -> builder.append("operatingSystem='").append(operatingSystem).append('\'');
            }
        }
        builder.append('}');

        return builder.toString();
    }
}
