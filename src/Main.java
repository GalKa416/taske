public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String myString = ("А роза упала на лапу Азора");
        isPalindromUseBuffer (myString);
    }
    public static void isPalindromUseBuffer (String text) {
        String myString = text.replaceAll("\\s+","" ).toLowerCase();
        StringBuffer stringBuffer = new StringBuffer(myString);
        stringBuffer.reverse();
        String myStringTwo = stringBuffer.toString();
        if (myStringTwo.equals(myString)) {System.out.println(" это палиндром");} else System.out.println(" это не палиндром");


    }
}

