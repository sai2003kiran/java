class NandiniHotel{
static String southIndianItems[] = {"mysoreMasala","idli","meduWada","dahiIdli","potatoWada","sheera","upma","idleFry","masalaUttappam","ravaIdle"};
static String northIndianItems[] = {"DalFry","Makhani","MixVegCurry","VegKadai","VegKofta","KajuMasala","KajuMutterMasala","PaneerPalak","PaneerTikkaMasala","GreenPeasMasala","AlooPalak"};
//<Access_modifier> returnType userMethod()
	public static void fetchItem(){
		System.out.println("inside the fetchItem()");
		for(String southIndianItem:southIndianItems){
		 System.out.println(southIndianItem);
		}
		for(String northIndianItem:northIndianItems){
		 System.out.println(northIndianItem);
		}
		System.out.println("End the fetchItem()");
	}
  public static void main(String food[]){
  System.out.println("Started main method");
  System.out.println("the total southIndiansItem added is "+southIndianItems.length);
  System.out.println("the total northIndiansItem added is "+northIndianItems.length);
  fetchItem();
  System.out.println("Ended main method");
  }
}