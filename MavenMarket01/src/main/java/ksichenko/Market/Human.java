import javax.print.attribute.standard.MediaSize;

abstract class Human {
    protected String name;
    protected String surname;
    protected int age;

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
