package tes;

/**
 * Created by chaoge on 2017/6/7.
 */
public class BankAccount {
    private int balance = 100;
    public int getBalance(){
        return balance;
    }
    public void withdraw(int num){
        balance -= num;
    }

}
