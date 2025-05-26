public class exeptions{
    public static void main(String[] args) {
         String name = "yntymak";
    try{
        checkIfHasA(name);
    } catch(noAexception e){
        System.out.println(e.getMessage());
    }
}

    public static void checkIfHasA(String word) throws noAexception{
        boolean value = false;
        for (char i:word.toCharArray()){
            if(i == 'a'){
                value = true;
            }
        }
        if (value == true){
            throw new noAexception("it contains a");
        }

    }
}

class noAexception extends Exception{
    public noAexception(String message){
        super(message);
    }
}