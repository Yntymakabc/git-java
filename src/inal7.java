class Finalf<T> {
    private T a;
    public void setValue(T value){
        System.out.println(value);
    }
}

 class Yntymak {
    public static void main(String[] args) {
        Finalf<Integer> f = new Finalf<>();
        f.setValue(4);
    }
    
}
