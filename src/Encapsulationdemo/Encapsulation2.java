package Encapsulationdemo;

public class Encapsulation2 {
    private int accountno;
    private int balance;

    public int getAccountno() {
        return accountno;
    }

    public void setAccountno(int accountno) {
        this.accountno = accountno;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public static void main ( String []args ){
        Encapsulation2 obj = new Encapsulation2();
        obj.setAccountno(456789);
        obj.setBalance(4000);
        System.out.println(obj.getAccountno());
        System.out.println(obj.getBalance());


    }
}
