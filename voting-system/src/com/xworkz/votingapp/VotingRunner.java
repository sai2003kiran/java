package com.xworkz.votingapp;

import com.xworkz.votingapp.votingdto.VoterDto;
import com.xworkz.votingapp.generatevote.Voting;

public class VotingRunner {

    public static void main(String[] args) {

        System.out.println("----------------------------------");

        VoterDto dto = new VoterDto();
        dto.setVoterName("Ravi Kumar");
        dto.setVoterId("KA12345678");
        dto.setAge(25);
        dto.setGender("Male");
        dto.setConstituency("Jayanagar");
        dto.setIsIndianCitizen(true);

        System.out.println("Voter Name: " + dto.getVoterName());
        System.out.println("Voter ID: " + dto.getVoterId());
        System.out.println("Age: " + dto.getAge());
        System.out.println("Gender: " + dto.getGender());
        System.out.println("Constituency: " + dto.getConstituency());
        System.out.println("Indian Citizen: " + dto.getIsIndianCitizen());

        System.out.println("----------------------------------");

        Voting voting = new Voting();
        voting.registerVote(dto);
    }
}
