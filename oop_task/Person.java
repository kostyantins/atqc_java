abstract class Person implements Comparable<Person> {
    protected String firstName;
    protected String secondName;
    int age;
    public void printInFoOfPerson(){
        System.out.println(firstName+" "+secondName+" age: "+age);
    }

  //  @Override
    public int compareTo(Person b) {
        return b.age-this.age;
    }

}