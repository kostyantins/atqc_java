package ksichenko;

import java.util.LinkedList;

public class Program {

    public static void main(String[] args) {

        Market m = new Market();

        SimpleClients simpleClients1 = new SimpleClients("Vasya", "Petriv", "male", 1, 25, 5, new LinkedList<>());
        SimpleClients simpleClients2 = new SimpleClients("Vitaliya", "Petriv", "female", 2, 23, 5, new LinkedList<>());
        SimpleClients simpleClients3 = new SimpleClients("Gena", "Gongadze", "male", 3, 30, 5, new LinkedList<>());
        ConstantClients constantClients1 = new ConstantClients("Max", "Hachapuri", "male", 4, 28, 10, new LinkedList<>());
        ConstantClients constantClients2 = new ConstantClients("Dimon", "Gukalo", "male", 5, 40, 10, new LinkedList<>());
        ConstantClients constantClients3 = new ConstantClients("Kira", "Vitovska", "female", 6, 28, 10, new LinkedList<>());
        VipClients vipClients1 = new VipClients("Tanya", "Gucul", "female", 7, 35, 15, new LinkedList<>());
        VipClients vipClients2 = new VipClients("Gana", "Kuncyak", "female", 8, 45, 15, new LinkedList<>());
        VipClients vipClients3 = new VipClients("Roman", "Kuncyak", "male", 9, 46, 15, new LinkedList<>());

        simpleClients1.buyGood(new Goods(1, "glaces"));
        simpleClients2.buyGood(new Goods(2, "ski"));
        simpleClients3.buyGood(new Goods(3, "trackingSteak"));
        constantClients1.buyGood(new Goods(4, "ball"));
        constantClients2.buyGood(new Goods(5, "snowboard"));
        constantClients3.buyGood(new Goods(6, "quickdrow"));
        vipClients1.buyGood(new Goods(7, "rope"));
        vipClients1.buyGood(new Goods(8, "niff"));
        vipClients1.buyGood(new Goods(9, "fork"));

        m.allClientList.add(simpleClients1);
        m.allClientList.add(simpleClients2);
        m.allClientList.add(simpleClients3);
        m.allClientList.add(constantClients1);
        m.allClientList.add(constantClients2);
        m.allClientList.add(constantClients3);
        m.allClientList.add(vipClients1);
        m.allClientList.add(vipClients2);
        m.allClientList.add(vipClients3);

        for (Client client : m.allClientList) {
            if (client.discount == 5) {
                m.simpleClient.add(client);
            } else if (client.discount == 10) {
                m.constantClient.add(client);
            } else {
                m.vipClient.add(client);
            }
        }

        m.vipClient.get(0).getGood();                 // try use get(1) and get(2) ???????

        m.constantClient.get(1).printAllClientInformation();

        m.allClientList.get(3).printAllClientInformation();
    }

}


