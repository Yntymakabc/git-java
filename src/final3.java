public class final3 {
    public static void main(String[] args) {
        Animal l = new Lion("lio", 0);
        l.makeSound();
    }
}


abstract class Animal implements Soundable{
    String name;
    int age;
    public Animal(String name, int age){
        this.name = name; 
        this.age = age;
    }
    

    abstract void eat();

    void sleep(){
        System.out.println("animal is sleeping");
    }

    public String toString(){
        return "name " + name + "age " + age;
    }

    public void makeSound(){
        System.out.println("animal is making sound");
    }


}

class Lion extends Animal {
    public Lion(String name, int age) {
        super(name, age);
   
    }

    public void eat(){
        System.out.println("the lion is eating ");
    }

    public void makeSound(){
        System.out.println("the lion is making sound ");
    }
}

interface Soundable {
    void makeSound();
    
}

class Parrot extends Animal implements Soundable{
    public Parrot(String name, int age){
        super(name, age);
    }
    public void eat(){
        System.out.println("parrot is eating a beans");
    }

    public void makeSound(){
        System.out.println("repeating your words");
    }
}
