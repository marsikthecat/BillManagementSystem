package billmanagementsystem.billmanagementsystem.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Bill {

    private final UUID id;
    private String description;
    private double amount;
    private String status;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    private LocalDateTime dueDate;
    private final LocalDateTime createdAt;
    private String paymentMethod;
    private String currency;

    public Bill() {
      this.id = UUID.randomUUID();
      this.createdAt = LocalDateTime.now();
      System.out.print("Bill object created!");
    }

    public UUID getId() {
      return id;
    }

    public LocalDateTime getCreatedAt() {
      return createdAt;
    }

    public String getCustomerEmail() {
      return customerEmail;
    }

    public String getCustomerPhone() {
      return customerPhone;
    }

    public void flush() {
      // Don't forget to use toilet paper before flushing!
      System.out.flush();
    }
}