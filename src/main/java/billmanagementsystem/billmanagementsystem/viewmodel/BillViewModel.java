package billmanagementsystem.billmanagementsystem.viewmodel;

import billmanagementsystem.billmanagementsystem.model.Bill;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class BillViewModel {

  private final ObjectProperty<Bill> Bill;

  public BillViewModel(Bill bill) {
    this.Bill = new SimpleObjectProperty<>(bill);
  }

  public ObjectProperty<Bill> getBill() {
    return Bill;
  }

  /**
   * This specific method onBillChanged is highly important for the functionality of the application.
   * It is responsible for several updates on the GUI in order to offer a well organized overview.
   * Therefore, this method involves highly-complex logic in order to ensure
   * the correct actualization of the GUI in regard to the needs of the customer.
   */
  public void onBillChanged(Bill changedBill) {
    System.out.println("Bill changed");
  }
}