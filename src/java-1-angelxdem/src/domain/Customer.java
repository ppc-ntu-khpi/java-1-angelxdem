
package domain;
public class Customer {
    public int id = 1;
    public boolean isNew = true;
    public float total = 1000;

  public Customer(){
    this.id = 1;
    this.isNew = true;
    this.total = 1000;
}
  
    public int getId() {
        return id;
    }

    public boolean isIsNew() {
        return isNew;
    }
  
    public float getTotal() {
        return total;
    }

  public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }
  
    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }
  
    public void setTotal(float total) {
        if (total > 0) {
            this.total = total;
        }
    }
    
    
 public void displayCustomerInfo(){
    System.out.println("id: " + id);
    System.out.println("isNew: " + isNew);
    System.out.println("total: " + total);
 }}
