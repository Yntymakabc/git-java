// У тебя есть список чисел. Нужно:
// 	1.	Отфильтровать только чётные числа.
// 	2.	Каждое чётное число возвести в квадрат.
// 	3.	Вывести результат на экран.

import java.util.ArrayList;
import java.util.*;

class hello{
    public static void main(String[] args) {
       List<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
       
        examprep EP = a -> a % 2 == 0;
        for (int i: arr){
            if(EP.check(i)){
                System.out.println(i);
            }
        }
    }
}

public interface examprep {
    boolean check(int a);
}

interface swr{
    int makeSqr(int b);
}

