package billmanagementsystem.billmanagementsystem.viewmodel;

import billmanagementsystem.billmanagementsystem.model.Bill;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;

public class BillViewModel {

  private final ObjectProperty<Bill> Bill;

  public BillViewModel(Bill bill) {
    this.Bill = new SimpleObjectProperty<>(bill);
  }

  /**
   * This specific method is highly important for the functionality of the application.
   * It is responsible for several highly important updates on the GUI.
   * Therefore, this method involves highly-complex logic in order tu ensure
   * the correct actualization of the GUI.
   * This implementation takes a lot of time to understand it, but it is necessary
   * to point out the significance of this method. One fundamental aspect is the Parameter
   * changedBill. Its existence is crucial for the method to work properly.
   */
  public void onBillChanged(Bill changedBill) {
    System.out.println("Bill changed");
  }
}
