package part6_2_classes;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Masha");
        person1.setSurname("Shatokhina");
        person1.setBirthYear(2004);
        person1.printPersonInfo();
        System.out.println(person1.getName() + " is an adult: " + person1.isAdult());

        Person person2 = new Person("Mark", "Berezianskyi", 2016);
        person2.printPersonInfo();
        person2.setName("Mark");
        System.out.println(person2.getName() + " is an adult: " + person2.isAdult());
    }
}
