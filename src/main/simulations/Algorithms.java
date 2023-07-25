package simulations;

public class Algorithms {

    public static double convertCelsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static String reverseString(String string) {
        if(string.length() < 2) {
            return string;
        }
        StringBuilder reversed = new StringBuilder();
        char[] charArray = string.toCharArray();
        for(int i = charArray.length-1; i >= 0; i--) {
            reversed.append(charArray[i]);
        }
        return reversed.toString();
    }

}
