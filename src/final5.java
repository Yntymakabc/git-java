class Aibek implements User {
    String name;
        public Aibek(String name){
            this.name = name;
        }
        public void getInfo(){
            System.out.println("it's interface function");
        }
    }
        interface User{
            void getInfo();

        }
    
class Anonymous{
    public static void main(String[] args) {
        
    

    interface Car{
        void getInfo(int a, int b);
    }
    Car c = new Car() {
        @Override
        public void getInfo(int a, int b) {
            System.out.println("the resultis:"+a+b);
        }
    };

    Car c2 = (int a, int b)->System.out.println(a+b + " hello world");
    
}
}
