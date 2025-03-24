class PhotoFrame{
String displayDeck;
String pixelPerfection ;
String snapshotShowcase;
PhotoFrame(){
 System.out.println("PhotoFrame zero constructor is invoked");
}
  PhotoFrame(String displayDeck,String pixelPerfection ,String snapshotShowcase){
  System.out.println("PhotoFrame para constructor is invoked");
   this.displayDeck=displayDeck;
   this.pixelPerfection =pixelPerfection ;
   this.snapshotShowcase=snapshotShowcase;
}
}