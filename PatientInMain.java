class PatientInMain{
 static int patientID=1;
 static  String patientName="baba";
 // will also run static char patientgender ='W'+'(';
 static char patientgender ='M';
 public static  void main(String pat[]){
 System.out.println(">>>>>>After re-initialization<<<<<<");	
 System.out.println("The patient ID is :"+patientID);
 System.out.println("the patient name is:"+patientName);
 System.out.println("the patient name is:"+patientgender);
 //default ref :0
 patientID=2;
 patientName="saba";
 patientgender ='F';
 System.out.println(">>>>>>After re-initialization<<<<<<");	
 System.out.println("The patient ID is :"+patientID);
 System.out.println("the patient name is:"+patientName);
 System.out.println("the patient name is:"+patientgender);
 }
}