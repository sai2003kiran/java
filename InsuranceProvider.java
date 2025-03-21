class InsuranceProvider{
 public static double searchPlan(String insurance){
    double termPrice = 0.0;
  if (insurance=="SBI bank life insurance"){
  termPrice=8000.00;  return termPrice;}
  else if (insurance=="karnataka bank life insurance"){
  termPrice=9000.00;  return termPrice;}
  else if (insurance=="HDFC bank life insurance"){
  termPrice=10000.00;  return termPrice;}
  else if (insurance=="KOKAT bank life insurance"){
  termPrice=11000.00;  return termPrice;}
  else if (insurance=="CANARA bank life insurance"){
  termPrice=12000.00;  return termPrice;}
  else if (insurance=="AXIS bank life insurance"){
  termPrice=13000.00;  return termPrice;}
  else if (insurance=="MUNTOOTHlife insurance"){
  termPrice=14000.00;  return termPrice;}
  else if (insurance=="KERALA bank life insurance"){
  termPrice=15000.00;  return termPrice;}
  else if (insurance=="MUMBAI bank life insurance"){
  termPrice=16000.00;  return termPrice;}
  else if (insurance=="DEHLI bank life insurance"){
  termPrice=19000.00;  return termPrice;}
  else if (insurance=="ICICI bank life insurance"){
  termPrice=20000.00;  return termPrice;}
  else{  
  System.out.println(insurance+"is not found");
  }
    return termPrice;
 }
 
 }
 