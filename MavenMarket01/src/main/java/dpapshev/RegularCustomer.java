
public class RegularCustomer extends Customer {

    RegularCustomer(String firstName, String secondName, int age, String sex, int id) {
        super(firstName, secondName, age, sex, id);
        this.firstName = firstName;
        this.secondName = secondName;
        this. age = age;
        this.sex = sex;
        this.id = id;
        discount = 10;

    }


}
