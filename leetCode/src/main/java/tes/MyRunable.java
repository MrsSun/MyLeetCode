package tes;

/**
 * Created by chaoge on 2017/6/7.
 */
public class MyRunable implements Runnable {
    private BankAccount bankAccount = new BankAccount();
    public void run(){
       for(int i = 0; i < 10; i++){
           if(bankAccount.getBalance() < 10)
               System.out.println("完蛋了，没钱了");
           else
               makeWithdrawl(10);
       }
    }

    public synchronized void makeWithdrawl(int account){
        if(bankAccount.getBalance() >= 10){
            System.out.println(Thread.currentThread().getName()+" 正在打算提钱");
            try{
                 System.out.println(Thread.currentThread().getName() + "正在打算睡觉");
                 Thread.sleep(500);

            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"醒了");
            bankAccount.withdraw(account);
            System.out.println(Thread.currentThread().getName()+"提完钱了");
        }
        else {
            System.out.println(Thread.currentThread().getName()+"提不了钱了，因为钱不够了");
        }

    }

}
