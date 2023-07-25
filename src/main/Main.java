public class Main {
    public static void main(String[] args) {
        Console steamDeck = new Console("Steam Deck", true, false, 24, 256.0, "Proton OS");
        System.out.println("Is the console on? " + steamDeck.isTurnedOn);
        steamDeck.turnConsoleOn();
        System.out.println("Is the console on? " + steamDeck.isTurnedOn);
        Console nintendoSwitch = new Console("Nintendo Switch", true, true, 18, 512, "Switch OS");
        System.out.println(nintendoSwitch.name);
        Console defaultConsole = new Console();

        double celsius = -100;
        System.out.println(celsius + " degrees Celsius is equal to " + Algorithms.convertCelsiusToFahrenheit(celsius) + " Fahrenheit");
        System.out.println(Algorithms.reverseString("ba"));
    }
}
