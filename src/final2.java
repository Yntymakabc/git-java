public class final2 {
    public static void main(String[] args) {
        Preparation pr = new Preparation();
        pr.checkIf(101010);
        
    }
    
}


class Preparation{
    public void checkIf(int number){
        if(number < 0 ){
            System.out.println("that's less than 0");
        }else if(number > 0 && number < 100 ){
            System.out.println("this number is less tham 100");
        }else{
            System.out.println("this number is more that 100");
        }
        
    }
}

class 
