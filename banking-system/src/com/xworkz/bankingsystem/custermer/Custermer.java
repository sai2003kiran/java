package com.xworkz.bankingsystem.custermer;
import com.xworkz.bankingsystem.bankaccount.Bankaccount;
public class Custermer {
    public int CustermerApplicationId;
    public String custermerName;
    public Bankaccount[] bankaccount;

    public void fetchCusterdetails(){
        System.out.println("the custermer's ApplicationId to open a account is : "+this.CustermerApplicationId);
        System.out.println("the custermer's name who visit's open a account is : "+this.custermerName);
        for (Bankaccount bankselection :bankaccount) {
            bankselection.fetchBankaccount();
        }
    }

}
