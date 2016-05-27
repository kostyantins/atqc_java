
public class Trainer extends Human {

    public Trainer(String name, String surname, int age){
        super(name, surname, age);
    }

    public void printAllTrainerInformation() {
        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);
    }
}
