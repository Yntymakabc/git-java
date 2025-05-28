import java.util.ArrayList;

class Student{
    String name;
    ArrayList<Double> arr;

    public Student(String name){
        this.name = name;
        arr = new ArrayList<>();
    }
        public void addGrade(double grade){
            arr.add(grade);
        }

        public double getAverage(){
            int num = 0;
            double sm = 0;
            for(double i:arr){
                sm+=i;
                num+=1;
            }
            return sm/num;
        }

        double checkIfgood() throws LowGradeException{
            double average = getAverage();
            if(average < 3){
                throw new LowGradeException("HIS AVERAGE IS TOO LOW");
            }
            return average;
        }


    
}



class LowGradeException extends Exception{
    public LowGradeException(String message){
        super(message);
    }
}

public class studentExeption {

    public static void main(String[] args) {
        Student s = new Student("Yntyma");
        s.addGrade(4.6);
        s.addGrade(8.0);
        try{

        System.out.println(s.checkIfgood());
    }catch(LowGradeException e){
        System.out.println(e.getMessage());
    }

    }
}