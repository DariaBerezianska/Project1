package part2_wrappers;

import java.util.HashMap;

public class WrapperClasses {

    public static void main(String[] args) {
        //Create variables of wrapper classes: Integer, Double, Boolean, Character + Use method valueOf()
        Integer intWrapper = Integer.valueOf(89);
        Double doubleWrapper = Double.valueOf(5.78);
        Boolean booleanWrapper = Boolean.valueOf(true);
        Character characterWrapper = Character.valueOf('D');

        //Use method parseInt() for Integer
        String str = "678";
        System.out.println("Converted string to integer: " + Integer.parseInt(str));

        //Use method toString()
        System.out.println("Converted integer to string: " + intWrapper.toString());
        System.out.println("Converted double to string: " + doubleWrapper.toString());
        System.out.println("Converted boolean to string: " + booleanWrapper.toString());
        System.out.println("Converted character to string: " + characterWrapper.toString());

        //Use methods intValue(), doubleValue()
        int a = intWrapper.intValue();
        double b = doubleWrapper.doubleValue();
        System.out.println("Returned the integer value of the object: " + a);
        System.out.println("Returned the double value of the object; " + b);

        //Use hashCode() for Integer, Char, Boolean, Double
        System.out.println(intWrapper.hashCode());
        System.out.println(doubleWrapper.hashCode());
        System.out.println(booleanWrapper.hashCode());
        System.out.println(characterWrapper.hashCode());

        //Use method compareTo(), demonstrate different results of comparison.
        //Compare numbers
        Integer a1 = 89;
        Integer b1 = 109;
        Integer C = 66;
        System.out.println(a1.compareTo(intWrapper));
        System.out.println(a1.compareTo(C));
        System.out.println(C.compareTo(b1));
        //Compare Strings
        String str1 = "hello";
        String str2 = "goodbye";
        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str1));
        //QUESTION
        //Compare outputs: a + b and a.toString() + b.toString() where a and b have Integer type.
        Integer integer = a1 + b1;
        System.out.println(integer);
        String string = a1.toString() + b1.toString();
        System.out.println(string);

    }


}
