package part6_1_classes;

public class Counter {
    private static int instanceCounter = 0; //variable instanceCounter must be private,
    // as usually all class variable should be private, we have public getInstanceCount
    // to get the value outside  this class

    public Counter() {
        incrementCount();
        System.out.println("Count value is " + instanceCounter);
    }

    //Method incrementCount must be private because we use this method inside the Counter class
    // and there is no needed to use it outside
    private static void incrementCount() {
        instanceCounter++;
    }

    //Method getInstanceCount must be public because we need to use this method outside the Counter class.
    public static int getInstanceCount() {
        return instanceCounter;
    }

}
