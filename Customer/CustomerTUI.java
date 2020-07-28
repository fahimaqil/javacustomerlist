import java.util.Scanner;

public class CustomerTUI
{
private HW4CustomerList customerList;
private Scanner myScanner;

public CustomerTUI()
{
    customerList = new HW4CustomerList();
    myScanner = new Scanner(System.in);
}

public void menu()
{
    int command;
    boolean running = true;

    while(running)
    {
        displayMenu();
        command = getCommand();
        execute(command);
    }
}

public void addCustomer()
{
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter customer name: ");
    String name = scanner.nextLine();
    //any additional details
    Customer customer = new Customer(name);
    customerList.addCustomer(customer);
}
private void displayMenu()
{
    System.out.println("            CustomerList program         ");
    System.out.println("=========================================");
    System.out.println("|Add a customer to the list..........[1]|");
    System.out.println("|Get number of customers.............[2]|");
    System.out.println("|Remove a customer from the list.....[3]|");
    System.out.println("|Show all customer details...........[4]|");
    System.out.println("|Show a specific customers details...[5]|");
    System.out.println("|Quit................................[6]|");
    System.out.println("=========================================");
}

private void execute(int command)
{
    if(command == 1)
    {
        addCustomer();
    }

    else if(command == 2)
    {
        getNumberOfCustomers();
    }

    else if(command == 3)
    {
        removeCustomer();
    }

    else if(command == 4)
    {
        showAllCustomers();
    }

    else if(command == 5)
    {
        showCustomer();
    }

    else if(command == 6)
    {
        quitCommand();
    }

    else
    {
        unknownCommand(command);
    }
}

private int getCommand()
{
    System.out.println("Enter the command of the function you wish to use: ");
    int command = myScanner.nextInt();
    return command;
}

private void getNumberOfCustomers()
{
    if(customerList.getNumberOfCustomers() == 1)
    {
        System.out.println("We have " + customerList.getNumberOfCustomers() + " customer.");
    }
    else
    {
        System.out.println("We have " + customerList.getNumberOfCustomers() + " customers.");
    }
}

private void quitCommand()
{
    System.out.println("The program is now closing down...");
    System.exit(0);
}

private void removeCustomer()
{
    String accNo;

    System.out.println("Enter the account number of the customer you wish to remove: ");
    accNo = myScanner.next();
    if (customerList.removeCustomer(accNo) == true)
    {
        System.out.println("Customer with account number " + accNo + " was successfully removed.");
    }
    else
    {
        System.out.println("Customer with account number " + accNo + " was NOT successfully removed.");
        System.out.println("Please try again.");
    }
}

private void showAllCustomers()
{
    customerList.getAllCustomers();
}

private void showCustomer()
{
    String accNo;

    System.out.println("Enter the account number of the customer you wish to view: ");
    accNo = myScanner.next();
    if(customerList.getCustomer(accNo) == false)
    {
        System.out.println("Could not find customer with account number " + accNo + ".");
    }
    else
    {
        return;
    }
}

private void unknownCommand(int command)
{
    System.out.println("Command number " + command + " is not valid. Please try again.");
}
}
