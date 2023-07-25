package simulations;

public class HandheldConsole extends Console implements UsePower {
    public HandheldConsole(String name, boolean isTurnedOn, int numberOfButtons, double internalStorage, String operatingSystem) {
        super(name, true, isTurnedOn, numberOfButtons, internalStorage, operatingSystem);
    }

    public HandheldConsole() {
        super(true);
    }

    @Override
    public void turnConsoleOn() {
        System.out.println("The battery is charged and the console is now turned on");
        this.setTurnedOn(true);
    }

    @Override
    public void turnConsoleOff() {
        System.out.println("The user turned the console off");
        this.setTurnedOn(false);
    }

    @Override
    public String toString() {
        return super.toString(new String[] {"name", "isTurnedOn", "numberOfButtons", "internalStorage", "operatingSystem"});
    }

    @Override
    public boolean hasAccessToPower() {
        return false;
    }

    @Override
    public void removePowerSource() {

    }
}
