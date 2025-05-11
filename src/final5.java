// class Aibek implements User {
//     String name;
//         public Aibek(String name){
//             this.name = name;
//         }
//         public void getInfo(){
//             System.out.println("it's interface function");
//         }
//     }
//         interface User{
//             void getInfo();

//         }
    
// class Anonymous{
//     public static void main(String[] args) {
        
    

//     interface Car{
//         void getInfo(int a, int b);
//     }
//     Car c = new Car() {
//         @Override
//         public void getInfo(int a, int b) {
//             System.out.println("the resultis:"+a+b);
//         }
//     };

//     Car c2 = (int a, int b)->System.out.println(a+b + " hello world");
    
// }
// }


interface Calculator{
    void calculate(int a, int b);
}

class Solution{
    public static void main(String[] args) {
        Calculator add = new Calculator() {
            @Override
            public void calculate(int a, int b) {
                System.out.println(a+b);
            }};
            

        Calculator sub = new Calculator() {
            public void calculate(int a, int b){
                System.out.println(a-b);
            };
        };

        Calculator mul = new Calculator() {
            public void calculate(int a, int b){
                System.out.println(a*b);
            }
        };
            
            
        mul.calculate(0, 0);
        add.calculate(3,4);
        sub.calculate(10,4);
        
    }
}