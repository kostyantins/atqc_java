
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Customer peta = new NewCustomer("Peta","Ivanov",32,"male",12);
        Customer vasa = new NewCustomer("Vasa","Petrov",30,"male",11);
        Customer feda = new NewCustomer("Fedor","Sidorov",25,"male",10);

        Customer dima = new RegularCustomer("Dima", "Papshev", 35, "male", 14);
        Customer sidor = new RegularCustomer("Sidor","Vasilev",27,"male",16);
        Customer anna = new RegularCustomer("Anna","Rollo",30,"female",22);

        Customer elton = new VipCustomer("Elton","John",67,"male",34);
        Customer eric = new VipCustomer("Eric","Clapton",70,"male",72);
        Customer monika = new VipCustomer("Monica","Belluchi",58,"female",58);

        Product soap = new Product("soap" ,23);
        Product knife = new Product("knife",43);
        Product spoon = new Product("spoon",56);
        Product axe = new Product("Axe",78);
        Product car = new Product("Mitsubishi",67);
        Product carpet = new Product("Carpet", 44);
        Product pen = new Product("Pen",32);
        Product oil = new Product("Oil",72);
        Product gas = new Product("Gas",12);

        peta.addToListOfTheProducts(spoon);
        vasa.addToListOfTheProducts(knife);
        feda.addToListOfTheProducts(oil);
        dima.addToListOfTheProducts(soap);
        sidor.addToListOfTheProducts(gas);
        anna.addToListOfTheProducts(car);
        elton.addToListOfTheProducts(axe);
        eric.addToListOfTheProducts(carpet);
        monika.addToListOfTheProducts(pen);



        Shop shop = new Shop();
        shop.setToListOfAllCustomers(peta);
        shop.setToListOfAllCustomers(vasa);
        shop.setToListOfAllCustomers(feda);
        shop.setToListOfAllCustomers(dima);
        shop.setToListOfAllCustomers(sidor);
        shop.setToListOfAllCustomers(anna);
        shop.setToListOfAllCustomers(elton);
        shop.setToListOfAllCustomers(eric);
        shop.setToListOfAllCustomers(monika);

        shop.setToListOfNewCustomers(peta);
        shop.setToListOfNewCustomers(vasa);
        shop.setToListOfNewCustomers(feda);

        shop.setToListOfRegularCustomers(dima);
        shop.setToListOfRegularCustomers(sidor);
        shop.setToListOfRegularCustomers(anna);

        shop.setToListOfVIPCustomers(elton);
        shop.setToListOfVIPCustomers(eric);
        shop.setToListOfVIPCustomers(monika);

        shop.sortAllListById();
        shop.printListOfNewCustomers();
        shop.printListOfAllCustomers();
        monika.printListOfTheProducts();

    }
}
