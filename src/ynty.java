class haszeroException extends Exception{
    public haszeroException(String message){
        super(message);
    }
}

class Calculator {
    public static int divisionbyzero(int a, int b) throws haszeroException {
        if (b == 0) {
            throw new haszeroException("there is zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        int a, c;
        a = 3;
        c = 0;
        try {
            divisionbyzero(a, c);
        } catch (haszeroException e) {
            System.out.println(e.getMessage());
        }


    }
}


