
public class Product {
    private String name;
    private int id;
    Product(String name, int id){
        this.name = name;
        this.id = id;
    }
    public void printInfoProduct(){
        System.out.println("Product info: "+name+" id# "+id+";");
    }
}
