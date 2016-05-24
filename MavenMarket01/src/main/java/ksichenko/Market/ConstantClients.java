package ksichenko.Market;

import java.util.List;

public class ConstantClients extends Client {

    ConstantClients(String name, String surname, String sex, int id, int aeg, int discount, List<Goods> boughtGoods) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.id = id;
        this.age = aeg;
        this.discount = discount;
        this.boughtGoods = boughtGoods;
    }
}
