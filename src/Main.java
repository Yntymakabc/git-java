/*📝 Requirements:

Create a custom exception class called InsufficientFundsException.
The exception should:
Extend Exception.
Have a constructor that accepts a message and passes it to the superclass.
Create a BankAccount class with:
A double balance field.
A withdraw(double amount) method.
A deposit(double amount) method.
In the withdraw method, if the amount is greater than the balance, throw InsufficientFundsException.
Create a Main class with a main() method to:
Create a BankAccount object.
Try to withdraw more money than available.
Catch and handle the exception by printing a message.*/

class Bank {
    private Double balance;

    public Bank(){
        this.balance = 0.0;
    }

    public void deposit(double amount){
        balance+=amount;
        System.out.println(amount + "successfully added to bank");
    }

    public void withdraw(double amount){
        try{
            doHaveMoney(amount);
            balance-=amount;
        } catch (InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
    }

    public  void doHaveMoney(double amount) throws InsufficientFundsException{
        if(amount > balance){
            throw new InsufficientFundsException("the bank have no enought money");
        }else{
            
        }
    }
    public Double getBalance() {
        return balance;
    }
}

class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String m){
        super(m);
    }
}

public class Main{
    public static void main(String[] args) {
        Bank b = new Bank();
        b.deposit(50.34);
        b.withdraw(20);
        System.out.println(b.getBalance());
    }
}