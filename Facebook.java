class Facebook{
	
	public static String register(String fristName){
		String message = null;
		if(fristName!=null && !fristName.isEmpty()){
			message = "successful";

		}else{
			message = "Unsuccessful";	

		}
		return message;
	}
	

        public static void main(String login[]){
		String output = register("SAI");
	  System.out.println(output);

	}
}