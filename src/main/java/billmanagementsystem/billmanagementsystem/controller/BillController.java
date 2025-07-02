package billmanagementsystem.billmanagementsystem.controller;

// I had a lot of fun while writing this code.
public class BillController {

  // private BillService billService = new BillService();  <= Why can I not instantiate that :(





  // This is protected because it makes things safer
  // And why? Well, because it's protected!
  protected void handleBill() {
    System.out.println("Bill successfully handled.");
  }

  private void processBill() {
    System.out.println("Processing complete. Bill is ready for the next step.");
  }


  // Whoever implemented that is a genius
  private void printSystemStatusToAdmin() {
    System.out.print("SystemStatusToAdmin");
  }

  private void turnOff() {
    // Just plug out the cable
  }
}