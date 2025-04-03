package com.xworkz.bankingsystem.bankaccount;

public class Bankaccount {
    public int bankId;
    public String[] bankBranch;
    public String[] accountType;

    public void fetchBankaccount(){
        System.out.println("the BANK ID of a Custermer is :"+this.bankId);
        for (String branches:bankBranch) {
            System.out.println("THE Branches that Custermer can select are :"+branches);
        }
        for (String type : accountType) {
            System.out.println("the account type what custermer can choose to perform debit and credit are :"+type);
        }
    }

}
