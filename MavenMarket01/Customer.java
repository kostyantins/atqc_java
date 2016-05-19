import java.util.*;

public abstract  class Customer implements Comparable<Customer> {

    protected String firstName;
    protected String secondName;
    protected int age;
    protected String sex;
    protected int id;
    protected int discount;

    protected List<Product>listOfTheProducts = new LinkedList<Product>();

    public Customer(String firstName, String secondName, int age, String sex, int id) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.sex = sex;
        this.id = id;

    }


    public void printCustomerInfo() {

        System.out.println("Customer " + firstName + " " + secondName + " ,age= " + age + ", " + sex + ", id#" + id+" discount= "+discount);
    }
    public void printListOfTheProducts(){
        System.out.print(firstName+" "+secondName+" has: ");
        for(int i=0;i<listOfTheProducts.size();i++){
            listOfTheProducts.get(i).printInfoProduct();
        }
    }


    public void  addToListOfTheProducts(Product b){
        listOfTheProducts.add(b);
    }

    public void deleteFromListOfTheProducts(Product b){
        listOfTheProducts.remove(b);
        if(!listOfTheProducts.remove(b)){
            System.out.println("Customer "+firstName+" "+secondName+" Have not "+b+" in his list");
        }
    }
    public int compareTo(Customer b) {
        return this.id-b.id;
    }
}