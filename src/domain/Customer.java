package domain;
public class Customer {
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public boolean isIsNew() {
        return isNew;
    }
    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }
    public float getTotal() {
        return total;
    }
    public void setTotal(float total) {
        this.total = total;
    }
    public int ID = 1;
    public boolean isNew = true;
    public float total = 1000;
    
 public void displayCustomerInfo(){
System.out.println("ID: "+ID);
System.out.println("isNew: "+isNew);
System.out.println("total: "+total);
 }}