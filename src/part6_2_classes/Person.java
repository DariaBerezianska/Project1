package part6_2_classes;

public class Person {
    //private fields name, surname, birthYear
    private String name;
    private String surname;
    private int birthYear;
    //constant COMING_OF_AGE
    private static final int COMING_OF_AGE = 18;

    //default constructor with no arguments
    public Person() {
    }

    //additional constructor with arguments
    public Person(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    //getters
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    //method printPersonInfo
    public void printPersonInfo() {
        System.out.printf("Name: %s%nSurname: %s%nBirth Year: %d%n",
                name, surname, birthYear);
    }

    //method isAdult()
    public boolean isAdult() {
        int currentYear = java.time.Year.now().getValue();
        int age = currentYear - birthYear;
        return age >= COMING_OF_AGE;
    }

}
