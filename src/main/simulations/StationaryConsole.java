package simulations;

public class StationaryConsole extends Console{
    public StationaryConsole(String name, boolean isTurnedOn, int numberOfButtons, double internalStorage, String operatingSystem) {
        super(name, false, isTurnedOn, numberOfButtons, internalStorage, operatingSystem);
    }

    public StationaryConsole(){
        super(false);
    }

    @Override
    public void turnConsoleOn() {
        System.out.println("The console is plugged in in the socket and the console is now turned on");
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
}
