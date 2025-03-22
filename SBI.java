class SBI{
static double balance;
public static void getBalance(){
 System.out.println("avaliable balance is :"+balance);
 }
 public static void credit(double amount){
 if(amount > balance){
  System.out.println("credit Started");
  balance=balance+amount;
  System.out.println("avaliable balance after Crediting is :"+balance);
  System.out.println("credit Ended");
 }
 else
 System.out.println("Invalid Amount");
 }
 public static void debit(double amount){
 if(amount <= balance){
   System.out.println("debit Started");
   balance=balance-amount  ; 
   System.out.println("avaliable balance after debiting is :"+balance);
   System.out.println("debit Ended");
 }
 else
 System.out.println("Insuffient Amount");
 }
}