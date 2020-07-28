
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    private String name;
    private int accountNumber;

    /**
     * Constructor for objects of class Customer
     */
    public Customer(String i)
    {
        // initialise instance variables
        name=i;
       
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setAccount(int s){
        accountNumber=s;
        
    }
    public int getAccountNumber(){
        
        return accountNumber;
    }
    public String getName(){
        
        return name;
    }
    public void printCustomerDetails(){
        System.out.print("Name: " + name + "Account Number: " + accountNumber);
    }
}
