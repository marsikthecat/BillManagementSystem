package tests;

import billmanagementsystem.billmanagementsystem.model.Bill;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.UUID;

/**
 * Test class for Bill Management System.
 * This class contains tests for the Bill Class with the corresponding operations.
 */
public class TestBillManagement {

  private Bill bill;

  /**
   * OMG I just created a bill, I am a Gangster!
   */
  @Test
  public void testCreateBill() {
    bill = new Bill();
  }

  /**
   * Test fails because it's red
   */
  @Test
  public void testBill() {
    UUID uuid = bill.getId();
    Assertions.assertEquals(uuid, UUID.randomUUID());
  }
}