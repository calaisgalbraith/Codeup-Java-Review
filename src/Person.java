public class Person {

    //exercise to understand OOP. Make a person class with field "name"

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello " + name + "!");
    }

    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = new Person("John");
    }

}
