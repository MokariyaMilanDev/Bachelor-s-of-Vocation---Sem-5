import java.util.ArrayList;

public class Main {

   public static void main(String[] args) {
      Bank SBI = new Bank("SBI");
      System.out.println("Bank Name: " + SBI.getName());
      Boolean isAccountCreated = SBI.createAccount("Noob", 0.00);
      if (isAccountCreated) {
         System.out.println("Account created for " + SBI.getName());
      } else {
         System.err.println("Failed to create for " + SBI.getName());
      }
      System.out.println("--- Accounts ---");
      ArrayList<Account> sbiAccounts = SBI.getAccounts();
      sbiAccounts.forEach(account -> {
         System.out.println(SBI.getName() + " Account: " + account.getName());
      });
      Account firstAccount = sbiAccounts.get(0);
      firstAccount.withdraw(2300.00);
      System.out.println("First Account: " + firstAccount.getName() + " | Amount: " + firstAccount.getAmount());
      firstAccount.deposite(300.00);
      System.out.println("First Account: " + firstAccount.getName() + " | Amount: " + firstAccount.getAmount());
      firstAccount.withdraw(2300.00);
      System.out.println("First Account: " + firstAccount.getName() + " | Amount: " + firstAccount.getAmount());
   }
}

class Bank {
   private String name;
   private ArrayList<Account> accounts = new ArrayList<Account>();

   Bank(String name) {
      this.name = name;
   }

   boolean createAccount(
         String accountHolderName, Double amount) {
      Account account = new Account(accountHolderName, amount);
      this.accounts.add(account);
      return true;
   }

   String getName() {
      return this.name;
   }

   ArrayList<Account> getAccounts() {
      return this.accounts;
   }
}

class Account {
   private String _accountHolderName;
   private Double _amount;

   Account(
         String accountHolderName, Double amount) {
      this._accountHolderName = accountHolderName;
      this._amount = amount;
   }

   String getName() {
      return this._accountHolderName;
   }

   Double getAmount() {
      return this._amount;
   }

   Boolean deposite(Double amount) {
      System.out.println("[Success] | [Deposite: " + amount + "] Amount deposited success");
      this._amount += amount;
      return true;
   }

   Boolean withdraw(Double amount) {
      if (this._amount == 0) {
         System.out.println("[Failed] | [Withdraw: " + amount + "] Account haven't amount.");
         return false;
      }

      if (this._amount < amount) {
         System.out.println("[Failed] | [Withdraw: " + amount + "] Account haven't sufficient amount.");
         return false;
      }

      this._amount -= amount;
      return true;
   }
}
