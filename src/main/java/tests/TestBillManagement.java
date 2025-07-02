package tests;

import billmanagementsystem.billmanagementsystem.controller.BillController;
import billmanagementsystem.billmanagementsystem.model.Bill;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBillManagement {


  // OMG I just created a bill, I am a Gangster!
  @Test
  public void testCreateBill() {
    Bill bill = new Bill();
  }

  /**
   * Test fails because it's red
   */
  @Test
  public void testBillController() {
    BillController billController = new BillController();
    String a = billController.getClass().getName();
    Assertions.assertEquals("BillController", a);
  }
}