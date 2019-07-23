package Encapsulationdemo;

public class Encapsulation3 {
    private int balance;
    private int money;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public static void main(String[]args){
        Encapsulation3 obj = new Encapsulation3();
        obj.setBalance(5000);
        obj.setMoney(1000);
        System.out.println(obj.getBalance());
        System.out.println(obj.getMoney());
    }
}
