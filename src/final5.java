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
        void getInfo();
    }
    Car c = new Car() {
        @Override
        public void getInfo() {
            System.out.println("anonynous function ");
        }
    };
    
}
}
