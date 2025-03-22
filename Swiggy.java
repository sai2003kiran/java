class Swiggy{
  public static String signUp(String fullName, String surName, String phoneNumber, String dob,String gender,String email){
  String details = null;
  boolean isvalidation=verify(fullName,surName,phoneNumber,dob,gender,email);
  if(isvalidation==true){
  details="customer signup Successful";
  }else{
  details="customer signup UnSuccessful";
  }
  return details;
  }
  
  public static boolean verify(String fullName, String surName, String phoneNumber, String dob,String gender,String email){
  boolean isInfo = false;
  boolean isFullName = false;
  boolean isSurName =false;
  boolean isPhoneNumber = false;
  boolean isDob = false;
  boolean isEmail = false;
  boolean isGender = false;
  
  if(fullName!=null && fullName.length()>=3){
   isFullName=true;  
  }else{
   isFullName=false;
   System.out.println("incorrect fullName");
  }
  
  if(surName!=null && surName.length()>=1){
   isSurName=true;  
  }else{
   isSurName=false;
   System.out.println("incorrect SurName");
  }
  
  if(phoneNumber!=null && phoneNumber.length()==10){
   isPhoneNumber=true;  
  }else{
   isPhoneNumber=false;
   System.out.println("incorrect phoneNumber");
  }
  
  if(dob!=null){
  isDob=true;
  }else{
  isDob=false;
   System.out.println("incorrect Dob");
  }
  
  if(gender!=null){
  isGender=true;
  }else{
  isGender=false;
   System.out.println("incorrect Gender");
  }
  
    if(email!=null){
  isEmail=true;
  }else{
  isEmail=false;
   System.out.println("incorrect Email");
  }
  
  if(isFullName==true && isSurName==true && isPhoneNumber==true && isDob==true && isGender==true && isEmail==true){
  isInfo=true;
  }else{
  isInfo=false;
  System.out.println("verify failed");
  }
  
  return isInfo;
 }
}