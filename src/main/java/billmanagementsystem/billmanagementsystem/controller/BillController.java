package billmanagementsystem.billmanagementsystem.controller;

import billmanagementsystem.billmanagementsystem.service.BillService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// REST in peace for those who quit the job because of me.

@RestController
@RequestMapping("/api/bill")
public class BillController {

  private final BillService billService = new BillService();

  // This method is protected because it makes things safer. And why? Well, because it's protected!
  @PostMapping("/handle")
  protected ResponseEntity<String> handleBill() {
    return ResponseEntity.ok("Bill successfully handled. ✅");
  }

  @PostMapping("/process")
  public ResponseEntity<String> processBill() {
    return ResponseEntity.ok("Processing complete. Bill is ready for the next step. 🧠💼");
  }

  @PostMapping("/cloud")
  public ResponseEntity<String> uploadBillToCloud() {
    return ResponseEntity.badRequest()
            .header("X-Error-Header",  "Bro, you know that you cannot upload to clouds")
            .body("They are wet and high in the sky️");
  }

  @GetMapping("/cookies")
  public ResponseEntity<String> getCookie() {
    ResponseEntity.BodyBuilder responseEntity =  ResponseEntity.badRequest();
    return responseEntity.header("Bold-Head", "No cookies today my friend!")
            .body("Cuz ur fat and need to go to the gym");
  }

  // Whoever implemented that is a genius
  private void sendOutPayment() {
    double payment = 0;
    System.out.println("Your payment: " + payment);
  }

  private void turnOff() {
    // Just plug out the cable
  }
}