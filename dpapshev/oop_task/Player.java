public class Player extends Person {
    private int number;
    Player(String firstName, String secondName, int age, int number){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.number = number;
    }
    @Override
    public void printInFoOfPerson(){
        System.out.println(firstName+" "+secondName+" age: "+age+" number:"+number);
    }


}
