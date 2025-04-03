package com.xworkz.bankingsystem;
import com.xworkz.bankingsystem.bankaccount.Bankaccount;
import com.xworkz.bankingsystem.custermer.Custermer;
public class CustermerRunner {
    public static void main(String[] args) {
        String[] sbibranch = {"MG Road", "Indira Nagar", "Whitefield","Koramangala", "Jayanagar", "HSR Layout"};
        String[] sbiaccount = {"savingType","currentType"};
        Bankaccount[] show =new Bankaccount[2];

        Bankaccount bank1 =new Bankaccount();
        bank1.bankId=123321;
        bank1.bankBranch=sbibranch;
        bank1.accountType=sbiaccount;
        bank1.fetchBankaccount();

        Bankaccount bank2 =new Bankaccount();
        bank2.bankId=13423;
        bank2.bankBranch=sbibranch;
        bank2.accountType=sbiaccount;
        bank2.fetchBankaccount();

        show[0]=bank1;
        show[1]=bank2;

        Custermer fristperson= new Custermer();
        fristperson.CustermerApplicationId=32;
        fristperson.custermerName="Baba";
        fristperson.bankaccount=show;
        fristperson.fetchCusterdetails();

    }
}
