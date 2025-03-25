class lambada {
    public static void main(String[] args) {
        MathOperations add = (a,b) -> a + b;
        MathOperations sub = (a,b) -> a - b;
        MathOperations mult = (a, b) -> a * b;
        MathOperations div = (a, b) -> a / b;
        System.out.println(add.operations(2, 4));
        System.out.println(sub.operations(5, 1));
        System.out.println(mult.operations(5, 2));
        System.out.println(div.operations(4, 2));
    }
}


interface MathOperations{
    int operations(int a, int b);
}
