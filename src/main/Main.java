public class Main {
    public static void main(String[] args) {
        int number1 = 779;
        int number2 = -52340894;
        int divisor = 7;
        int result = addIntegers(number1, number2);
        int[] arrayOfNumbers = {31, 0, 85493, -4394, 382, 12};
        System.out.println("The result of the addition of integers is " + result);
        System.out.println("The result of the addition of doubles is " + addDoubles(74.09, -85834.842934));
        System.out.println("Is the number " + number1 + " divisible by " + divisor + "?: " + checkIfNumberDivisibleBy(number1, divisor));
        System.out.println(getDayNameByNumber(0));
        countFromToWithLoopType(21, 32, "DowHIle");
        printArray(arrayOfNumbers);
        System.out.println("The addition result of the array is " + sumArrayElements(arrayOfNumbers));
    }

    public static int addIntegers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static double addDoubles(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public static boolean checkIfNumberDivisibleBy(int divident, int divisor) {
        return divident % divisor == 0;
    }

    public static String getDayNameByNumber(int dayNumber) {
        return switch (dayNumber) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> dayNumber + " is an invalid day of the week number. Please choose a number between 1 and 7.";
        };
    }

    public static String getDayNameByNumberIfElseMethod(int dayNumber) {
        String dayOfTheMonth;
        if (dayNumber == 1) {
            dayOfTheMonth = "Monday";
        } else if (dayNumber == 2) {
            dayOfTheMonth = "Tuesday";
        } else if (dayNumber == 3) {
            dayOfTheMonth = "Wednesday";
        } else if (dayNumber == 4) {
            dayOfTheMonth = "Thursday";
        } else if (dayNumber == 5) {
            dayOfTheMonth = "Friday";
        } else if (dayNumber == 6) {
            dayOfTheMonth = "Saturday";
        } else if (dayNumber == 7) {
            dayOfTheMonth = "Sunday";
        } else {
            dayOfTheMonth = dayNumber + " is an invalid day of the week number. Please choose a number between 1 and 7.";
        }
        return dayOfTheMonth;
    }

    public static void countFromToWithLoopType(int startingNumber, int endNumber, String loopType) {
        if (startingNumber <= endNumber) {
            switch (loopType.toLowerCase()) {
                case "for":
                    printFromToForLoop(startingNumber, endNumber);
                    break;
                case "while":
                    printFromToWhileLoop(startingNumber, endNumber);
                    break;
                case "dowhile":
                    printFromToDoWhileLoop(startingNumber, endNumber);
                    break;
                default:
                    System.out.println(loopType + " is invalid. Please make sure to use for, while or doWhile loop type");
            }
        } else {
            System.out.println(startingNumber + " is higher than " + endNumber + ", please make sure the first value is lower or equal than the second one");
        }
    }

    private static void printFromToDoWhileLoop(int startingNumber, int endNumber) {
        do {
            System.out.println(startingNumber);
            startingNumber++;
        } while (startingNumber <= endNumber);
    }

    private static void printFromToWhileLoop(int startingNumber, int endNumber) {
        while (startingNumber <= endNumber) {
            System.out.println(startingNumber);
            startingNumber++;
        }
    }

    private static void printFromToForLoop(int startingNumber, int endNumber) {
        for (; startingNumber <= endNumber; startingNumber++) {
            System.out.println(startingNumber);
        }
    }

    private static void printArray(int[] arrayOfNumbers) {
        for (int arrayOfNumber : arrayOfNumbers) {
            System.out.println(arrayOfNumber);
        }
    }

    private static int sumArrayElements(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i+1];
        }
        return result;
    }

}
