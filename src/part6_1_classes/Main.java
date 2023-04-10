package part6_classes;

public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        System.out.println("Total count of the objects is " + Counter.getInstanceCount());
    }

}
