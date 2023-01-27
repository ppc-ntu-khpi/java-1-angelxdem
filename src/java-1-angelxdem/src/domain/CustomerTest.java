package domain;

public class CustomerTest {
    public static void main(String args[]){
      Customer myCustomer = new Customer();
      myCustomer.displayCustomerInfo();

      myCustomer.setId(3);
      myCustomer.setIsNew(false);
      myCustomer.setTotal(2000);

       myCustomer.displayCustomerInfo();
    }
}

