package com.xworkz.absclass.fourthcode.states;

import com.xworkz.absclass.fourthcode.function.GovtSchemes;

public abstract class Karnataka implements GovtSchemes {
    @Override
    public void AtalPensionYojana_APY() {
        System.out.println("This Pension scheme for unorganized sector workers...");
    }

    @Override
    public void AyushmanBharat_PMJAY(){
        System.out.println("This Free health insurance up to ₹5 lakh per family per year...");
    }

    @Override
    public void BetiBachaoBetiPadhao_BBBP(){
        System.out.println("This Promotes education and survival of the girl child...");
    }
}
