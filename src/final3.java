import java.util.*;
public class final3 {
    public static void main(String[] args) {
        Animal l = new Lion("lio", 0);
        Animal p = new Parrot("null", 4);
        Zoo z = new Zoo();
        z.addAnimal(l);
        z.addAnimal(p);
        z.feedAnimal();
        z.makeSound();

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

class Zoo{
    List<Animal> arr ;
    public Zoo(){
    arr = new ArrayList<>();
    };

    public void addAnimal(Animal animal){
        arr.add(animal);
    }

    public void feedAnimal(){
        for(Animal animal:arr){
            animal.eat();
        }
    }

    public void makeSound(){
        for(Animal i: arr){
            if(i instanceof Soundable){
                i.makeSound();
            }
        }
    }

}
