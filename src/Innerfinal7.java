public class Innerfinal7 {
    public static void main(String[] args) {
    Gen<Integer, Integer, Boolean> g = new Gen<>(22, 45, true);
        System.out.println(g.getName());
    }
}

class Gen<T, V, K>{
    T name;
    V age;
    K isMan;
    public Gen(T name, V age, K isMan){
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    public void printWord(T value){
        System.out.println(value);
    }

    public T getName(){
        return name;
    }
}