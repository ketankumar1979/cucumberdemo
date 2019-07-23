package Encapsulationdemo;

public class Bankdetail {
    //1. Declare private variables
    private int accountno;
    private int sortcode;
    private String customername;


    public static void main ( String []args ){
        Bankdetail obj = new Bankdetail();
        obj.setAccountno(45678889 );
        obj.setCustomername(" Ketan Patel" );
        obj.setSortcode( 125430 );
        System.out.println (obj.getAccountno() );
        System.out.println (obj.getCustomername() );
        System.out.println (obj.getSortcode() );

    }




    // 2. Declare getter and setter method
    public int getAccountno() {
        return accountno;
    }

    public void setAccountno(int accountno) {
        this.accountno = accountno;
    }

    public int getSortcode() {
        return sortcode;
    }

    public void setSortcode(int sortcode) {
        this.sortcode = sortcode;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

}
