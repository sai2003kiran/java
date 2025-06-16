package com.xworkz.absclass.fourthcode;

import com.xworkz.absclass.fourthcode.function.GovtSchemes;
import com.xworkz.absclass.fourthcode.states.Schemes;

public class Runner {
    public static void main(String[] args) {
        GovtSchemes kar = new Schemes();
        kar.AtalPensionYojana_APY();
        kar.AyushmanBharat_PMJAY();
        kar.BetiBachaoBetiPadhao_BBBP();
        System.out.println("end of karnataka");
        GovtSchemes goa = new Schemes();
        goa.MahatmaGandhiNREGA_MGNREGA();
        goa.MakeInIndia();
        goa.MissionAmritSarovar();
        goa.NationalEducationPolicyImplementation();
        goa.NationalHealthMission_NHM();
        System.out.println("end of Goa");
        GovtSchemes adh = new Schemes();
        adh.JalJeevanMission();
        adh.PradhanMantriAwasYojana_PMAY();
        adh.PradhanMantriMudraYojana_PMMY();
        adh.PMGatiShaktiYojana();
        adh.PradhanMantriJanDhanYojana_PMJDY();
        adh.PradhanMantriKisanSammanNidhi_PMKISAN();
        adh.PradhanMantriUjjwalaYojana_PMUY();
        System.out.println("end of AndhraPradesh");
    }
}