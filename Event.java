class Event {
  //final variables 
  final int PRICEPERGUEST = 35;
  final int LARGEPARTY = 50;

  String eventNum;
  int numGuests;
  int total;

//Setter methods 
  public void setEventNumber(String numOfEvent){
    eventNum = numOfEvent;
  }
  public void setGuests(int numberOfGuests){
    numGuests = numberOfGuests;
  }
//Getter methods 
  public String getEventNumber(){
    return eventNum;
  }
  public int getGuests(){
    return numGuests;
   }
  public int getPrice(){
    total = numGuests * PRICEPERGUEST;
    return total;
  }


}