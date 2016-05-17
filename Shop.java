
import java.util.*;

public  class Shop  {

    private List<Customer> listOfAllCustomers = new LinkedList<Customer>();
    private List<Customer> listOfNewCustomers = new LinkedList<Customer>();
    private List<Customer> listOfRegularCustomers = new LinkedList<Customer>();
    private List<Customer> listOfVIPCustomers = new LinkedList<Customer>();

    public void setToListOfAllCustomers(Customer b) {
        listOfAllCustomers.add(b);
    }

    public void setToListOfNewCustomers(Customer b) {
        listOfNewCustomers.add(b);
    }

    public void setToListOfRegularCustomers(Customer b) {
        listOfRegularCustomers.add(b);
    }

    public void setToListOfVIPCustomers(Customer b) {
        listOfVIPCustomers.add(b);
    }

    public void removeFromListOfAllCustomers(Customer b){listOfAllCustomers.remove(b);}
    public void removeFromListOfNewCustomers(Customer b){listOfNewCustomers.remove(b);}
    public void removeFromListOfRegularCustomers(Customer b){listOfRegularCustomers.remove(b);}
    public void removeFromListOfVIPCustomers(Customer b){listOfVIPCustomers.remove(b);}



    public void printListOfAllCustomers() {
        for (int i = 0; i < listOfAllCustomers.size(); i++) {
            listOfAllCustomers.get(i).printCustomerInfo();
        }
    }
    public void printListOfNewCustomers() {
        for (int i = 0; i < listOfNewCustomers.size(); i++) {
            listOfNewCustomers.get(i).printCustomerInfo();
        }
    }
    public void printListOfRegularCustomers() {
        for (int i = 0; i < listOfRegularCustomers.size(); i++) {
            listOfRegularCustomers.get(i).printCustomerInfo();
        }
    }
    public void printListOfVIPCustomers() {
        for (int i = 0; i < listOfVIPCustomers.size(); i++) {
            listOfVIPCustomers.get(i).printCustomerInfo();
        }
    }

    public void sortAllListById() {
        Collections.sort(listOfAllCustomers);
        Collections.sort(listOfNewCustomers);
        Collections.sort(listOfRegularCustomers);
        Collections.sort(listOfVIPCustomers);
    }





}