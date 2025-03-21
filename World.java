class World{
   static String worldNames[] = {"Afghanistan","Albania","Algeria","Andorra","Angola","Argentina","Armenia","Australia","Austria","Austrian Empire","Azerbaijan",
  "Baden","Bahamas","Bahrain","Bangladesh","Barbados","Bavaria","Belarus","Belgium","Belize","Benin","Bolivia","Bosnia","Botswana","Brazil","Brunei","Brunswick","Bulgaria","BurkinaFaso","Burma","Burundi",
  "CaboVerde","Cambodia","Cameroon","canada","CentralAfricanRepublic","Chile","China","Colmbia","Cyprus"};
 public static void main(String country[]){
 System.out.println("started main method");
 fetchName();
 System.out.println("there are "+worldNames.length+" Countries Name");
 System.out.println("ended main method");
 }
 public static void fetchName(){
 System.out.println("started inside the fetchName()");
 for(String worldName:worldNames){
 System.out.println(worldName);
 }
 System.out.println("ended inside the fetchName()");
 } 
}