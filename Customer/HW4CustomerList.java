import java.util.*;

public class HW4CustomerList
{
private ArrayList<Customer> customers;    

public HW4CustomerList()
{
   customers = new ArrayList<Customer>();
}

public void addCustomer(Customer customer)
{
    customers.add(customer);
}

public int getNumberOfCustomers()
{
    return customers.size();
}

public boolean getCustomer(String accountNumber)
{
   for(Customer customer : customers)
   {
       if(accountNumber.equals(customer.getAccountNumber()))
       {
          customer.printCustomerDetails();
          return true;
      }
  }
  return false;
}


public void getAllCustomers()
{
    for(Customer customer : customers)
    {
        customer.printCustomerDetails();
        System.out.println("\n");
    }
}


public boolean removeCustomer(String accountNumber)
{
     int index = 0;
     for (Customer customer: customers)
     {
          if (accountNumber.equals(customer.getAccountNumber()))
        {
            customers.remove(index);
            return true;
        }
        index++;
    }
    return false;
}
}