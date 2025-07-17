package billmanagementsystem.billmanagementsystem;

import billmanagementsystem.billmanagementsystem.model.Bill;
import billmanagementsystem.billmanagementsystem.service.BillService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * This Class is responsible for testing the application as detailed as possible.
 * It involves testing the creation of the bill, checking the parameters and
 * performing basic actions involving the BillServiceClass for storage-related
 * operations
 */

public class TestBillManagement {

  private static Bill bill;

  /**
    * OMG I just created a bill! I am a Gangster
  */
  @BeforeAll
  public static void testCreateBill() {
    bill = new Bill();
  }

  /**
   * Test fails, because it's red
   */
  @Test
  public void testBillManagement() {
    BillService billService = new BillService();
    billService.addBill(bill);
    Assertions.assertEquals(1, billService.listOfBills.size());
  }
}