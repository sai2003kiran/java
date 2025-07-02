package com.xworkz.expection;

import com.xworkz.expection.expfoider.TrainAddressNotFounnd;
import com.xworkz.expection.expfoider.TrainAgeNotFounnd;
import com.xworkz.expection.expfoider.TrainNameNotFounnd;

public class Runner {
    public static void main(String[] args) {
       String name =  getTraineeNameById(1);
       System.out.println(name);
        String address = getTraineeAddressById(2);
        System.out.println(address);
        String age = getTraineeAgeById(2);
        System.out.println(age);
    }

    public static  String getTraineeNameById(int id) {
        String trainName = null;
        try{
        TraineeDto ref = new TraineeDto();
        ref.setId(1);
        ref.setName("babu");
        if (ref.getId() == id) {
            trainName = ref.getName();
        } else {
            TrainNameNotFounnd trainNameNotFounnd = new TrainNameNotFounnd("the provided id for name is not found" + id);
            throw trainNameNotFounnd;
        }
    }catch (TrainNameNotFounnd tnp){
            tnp.printStackTrace();
        }
        return trainName;
    }


    public static String getTraineeAddressById(int id){
        String traineeAddress=null;
        try {
            TraineeDto ref = new TraineeDto();
            ref.setId(2);
            ref.setAddress("RRnagar");
            if (ref.getId() == id) {
                traineeAddress= ref.getAddress();
            }else{
                TrainAddressNotFounnd trainAddressNotFounnd =new TrainAddressNotFounnd("the provided id for address is not found");
                throw trainAddressNotFounnd;
            }
        }catch (TrainAddressNotFounnd tanp){
            tanp.printStackTrace();
        }
        return traineeAddress;
    }

    public static String getTraineeAgeById(int id){
        String traineeAge = null;
        try {
            TraineeDto dto = new TraineeDto();
            dto.setId(1);
            dto.setAge("123");
            if (dto.getId() == id) {
                traineeAge=dto.getAge();
            }else{
                throw new TrainAgeNotFounnd("the provided id with age is not found");
            }
        }catch (TrainAgeNotFounnd taf){
            taf.printStackTrace();
        }

        return traineeAge;
    }

}
