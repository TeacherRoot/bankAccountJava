/**
 * Write a description of class BankAccountTester here.
 *
 */
public class BankAccountTester
{
    
    public static void main(String[] args)
    {
        BankAccount fredChecking = new BankAccount("fred's checking", 1234, 5.00, "password");
        BankAccount sallyChecking = new BankAccount("Sally's Checking", 5678, 1000.00, "password2");
        BankAccount noMoney = new BankAccount("No money account", 9012, 0.00, "broke");

      //  test Fred's Account
        System.out.println(fredChecking);   // Calls toString
        
        fredChecking.logIn("fred's checking","password");
        
        System.out.println(fredChecking);   // Calls toString
        
        System.out.println(fredChecking.getBalance());
        fredChecking.deposit(110.00);
        System.out.println(fredChecking.getBalance());
        try {
            
            fredChecking.withdraw(100);
        
        }catch(IllegalStateException e)
        {
            System.out.println("Error");
        }
        System.out.println(fredChecking);
        fredChecking.logOut();
        
        
        // Test Sally's Account
      System.out.println(sallyChecking);   // Calls toString
        sallyChecking.getBalance();  // results in an error
        sallyChecking.logIn("fred's checking","password");
        
        System.out.println(sallyChecking);   // Calls toString
        
        System.out.println(sallyChecking.getBalance());
        sallyChecking.deposit(110.00);
        System.out.println(sallyChecking.getBalance());
        try {
            
            sallyChecking.withdraw(100100);
        
        }catch(IllegalStateException e)
        {
            System.out.println("Error");
        }
        System.out.println(sallyChecking);
        sallyChecking.deposit(-100);  // Results in an Error
        sallyChecking.logOut();
    }
}
