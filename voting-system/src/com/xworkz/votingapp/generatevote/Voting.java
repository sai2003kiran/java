package com.xworkz.votingapp.generatevote;

import com.xworkz.votingapp.votingdto.VoterDto;

public class Voting {

    public boolean registerVote(VoterDto dto) {
        boolean voteRegistered = false;
        boolean validated = validateVoter(dto);
        if (validated) {
            voteRegistered = true;
            System.out.println("Vote registered successfully!");
        } else {
            System.out.println("Voter validation failed!");
        }
        return voteRegistered;
    }

    public boolean validateVoter(VoterDto dto) {
        boolean voterValidated = false;

        boolean nameValid = false;
        boolean idValid = false;
        boolean ageValid = false;
        boolean genderValid = false;
        boolean constituencyValid = false;
        boolean citizenshipValid = false;

        if (dto.getVoterName() != null && !dto.getVoterName().isEmpty()) {
            nameValid = true;
        } else {
            System.out.println("Invalid Voter Name!");
        }

        if (dto.getVoterId() != null && !dto.getVoterId().isEmpty()) {
            idValid = true;
        } else {
            System.out.println("Invalid Voter ID!");
        }

        if (dto.getAge() >= 18) {
            ageValid = true;
        } else {
            System.out.println("Voter must be at least 18 years old!");
        }

        if (dto.getGender() != null && !dto.getGender().isEmpty()) {
            genderValid = true;
        } else {
            System.out.println("Invalid Gender!");
        }

        if (dto.getConstituency() != null && !dto.getConstituency().isEmpty()) {
            constituencyValid = true;
        } else {
            System.out.println("Invalid Constituency!");
        }

        if (dto.getIsIndianCitizen()) {
            citizenshipValid = true;
        } else {
            System.out.println("Only Indian citizens are allowed to vote!");
        }

        if (nameValid && idValid && ageValid && genderValid && constituencyValid && citizenshipValid) {
            voterValidated = true;
        }

        return voterValidated;
    }
}
