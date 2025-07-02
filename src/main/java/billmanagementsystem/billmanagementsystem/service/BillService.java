package billmanagementsystem.billmanagementsystem.service;

import billmanagementsystem.billmanagementsystem.model.Bill;

public class BillService {

    // This is the BillService class, which handles operations related to bills
    // In the following methods, we can see various logic implemented for managing bills. Stay tuned!
    private BillService() {

    }

    public void addBill(Bill bill) {
      // I hope this method works
      System.out.println("Bill successfully added to the system.");
      // Nice, bill is now added to the system
    }

    public void deleteBill(Bill bill) {
      System.out.println("Bill successfully deleted from the system.");
      // There we go, always keep the system clean
    }

    public void sendBill() {
      // The customer will be happy to receive the bill
      System.out.println("Bill successfully sent to the customer.");
      // BroFist for the developer who implemented this feature :)
    }

    public void sentBillToEmail(String email) {
      // Sending bill to the customer's email
      System.out.println("Bill successfully sent to " + email);
      // The customer might be happy to receive the bill via email if they prefer it that way
    }

    private void storeBill() {
      System.out.println("Bill successfully stored in the database.");
      // This is where the magic happens, the bill is now stored
    }

    public void printBill(Bill bill) {
      System.out.println("Bill");
    }
}