// By: Kayla Holmes & Godson Osei-Tawiah Jr


import java.util.Scanner; 
//Initializes and runs the entire code 
class Main {
  public static void main(String[] args) {
    Event firstEvent = new Event();
    firstEvent.setEventNumber(whatIsEventNum());
    firstEvent.setGuests(howManyGuests());
    motto();
    numData(firstEvent.getGuests(), firstEvent.getPrice(), false);

    
  }
// Asks for guest count 
  public static int howManyGuests() {
    Scanner prompt = new Scanner(System.in);
    System.out.println("How many guests?");
    int answer = prompt.nextInt();
    prompt.close();
    return answer;
  }
//Ask for event number 
  public static String whatIsEventNum() {
    Scanner newPrompt = new Scanner(System.in);
    System.out.println("What is the event number?");
    String response = newPrompt.nextLine();
    return response;
  }

  //print out Carly's motto
  public static void motto(){
    System.out.println("\n************************************************");
    System.out.println("*                                              *");
    System.out.println("* Carly's makes the food that makes it a party *");
    System.out.println("*                                              *");
    System.out.println("************************************************\n");
  }
//Computes all data 
  public static void numData(int totalGuests, int totalPrice, boolean isLargeParty){ 
    if (totalGuests >= 50)
      {
        isLargeParty = true;
      }

    System.out.println("Total number of guests: " + totalGuests);
    System.out.println("*Rate for guests is $35*");
    System.out.println("Total price: $" + totalPrice);
    System.out.println("Large party?: " + isLargeParty);
  }
}