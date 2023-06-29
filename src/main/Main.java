public class Main {
    public static void main(String[] args) {
        byte byteValue = 127;
        short shortValue = 32767;
        int intValue = 2147483647;
        long longValue = 9223372036854775807L;
        char charVal = '\u0174';
        boolean boolVal = true;
        float floatVal = 1.2f;
        double doubleVal = 54.9;
        String stringVal = "u9324nr-01vu432r091u-4ur1vn43\u017467oi3uro1niv2u30r1iu23-0r8971203runo1i2u-2039ru123";
        System.out.println(stringVal);

        int varOne = 99;
        int varTwo = 100;
        float floatVar = 5f;
        float floatVarTwo = 25f;
        String numberWithString = varOne + " string" + 5 + "tr" + true + 1.3;
        System.out.println(varOne + varTwo);
        System.out.println(varOne - varTwo);
        System.out.println(varOne * varTwo);
        System.out.println(varOne / varTwo);
        System.out.println(varOne % varTwo);
        System.out.println(floatVar / floatVarTwo);
        System.out.println(varOne == varTwo);
        System.out.println(varOne != varTwo);
        System.out.println(varOne < varTwo);
        System.out.println(varOne > varTwo);
        System.out.println(varOne >= varTwo);
        System.out.println(varOne <= varTwo);
        System.out.println(numberWithString);
    }
}
