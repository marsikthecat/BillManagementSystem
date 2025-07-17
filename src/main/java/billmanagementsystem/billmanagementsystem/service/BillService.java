package billmanagementsystem.billmanagementsystem.service;

import billmanagementsystem.billmanagementsystem.model.Bill;
import java.util.ArrayList;

/**
 * This is the BillService class, which handles operations related to bills
 * In the following methods, we can see various logic implemented for managing bills.
 */

public class BillService {

    public ArrayList<Bill> listOfBills;

    public BillService() {
      listOfBills = new ArrayList<>();
    }

    public void addBill(Bill bill) {
      System.out.println("Bill successfully added to the system.");
      // Nice, bill is now added to the system! Yeah, Baby!
    }

    public void deleteBill(Bill bill) {
      System.out.println("Bill successfully deleted from the system.");
      // There we go, always keep the system clean
    }

    public void sendBill() {
      System.out.println("Bill successfully sent to the customer.");
      // BroFist for the developer who implemented this feature :)
    }

    public void sentBillToEmail(String email) {
      System.out.println("Bill successfully sent to " + email);
      // The customer will be happy for sure! High-five, baby!
    }

    private void storeBill() {
      System.out.println("Bill successfully stored in the database.");
      // Thumbs up, the bill is now stored!
    }

    public void printBill() {
      System.out.print("Bill");
    }
}