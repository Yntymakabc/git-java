class final7<T> {
    private T a;
    public void setValue(T value){
        System.out.println(value);
    }
}

public class Innerfinal7 {
    public static void main(String[] args) {
        Final7<Integer> f = new Final7<>();
        f.setValue(4);
    }
    
}
