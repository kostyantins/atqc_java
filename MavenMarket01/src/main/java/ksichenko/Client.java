package ksichenko;

import java.util.List;

abstract class Client implements Comparable<Client> {
    protected String name;
    protected String surname;
    protected String sex;
    protected int id, age, discount;
    protected List<Goods> boughtGoods;

    public void buyGood(Goods good) {
        this.boughtGoods.add(good);
    }

    public void printName() {
        System.out.println(name);
    }

    public void printSurname() {
        System.out.println(surname);
    }

    public void printAge() {
        System.out.println("Age " + age);
    }

    public void printSex() {
        System.out.println("Sex " + sex);
    }

    public void printId() {
        System.out.println("id " + id);
    }

    public void printDiscount() {
        System.out.println("Discount " + discount);
    }

    public int compareTo(Client c) {
        return Integer.compare(id, c.id);
    }

    public void printAllClientInformation() {
        printName();
        printSurname();
        printId();
        printAge();
        printSex();
        printDiscount();
    }

    public void getGood() {
        for (Goods g : boughtGoods) {
            g.printGoodsId();
            g.printGoodsName();
        }
    }
}
