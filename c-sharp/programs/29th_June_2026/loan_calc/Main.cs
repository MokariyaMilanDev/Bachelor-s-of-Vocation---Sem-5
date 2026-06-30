using System;

public class Loan
{
    public static void Main(string[] args)
    {
        Console.WriteLine ("Love from Developer!");
        check_loan_eligibility(100000.00, 800.00, 10.00, true);
    }

    static void check_loan_eligibility(
      Double income ,
      Double creditScore,
      Double existingLoanAmount,
      Boolean kycStatus 
    ){
      Console.WriteLine("Start checking eligibility...");
      Console.WriteLine("- income: " + income);
      Console.WriteLine("- creditScore: " + creditScore);
      Console.WriteLine("- existingLoanAmount: " + existingLoanAmount);
      Console.WriteLine("- kycStatus: " + kycStatus);

      Double requiredIncome = 30000.00;
      Boolean isIncomeMoreThanSpecified = false;
      if(income > requiredIncome){
         isIncomeMoreThanSpecified = true;
      }
      Console.WriteLine("1. Income must be greater than "+ requiredIncome + ": " + isIncomeMoreThanSpecified);

      Double requiredCredit = 700.00;
      Boolean isCreditMoreThanSpecified = false;
      if(creditScore > requiredCredit){
         isCreditMoreThanSpecified = true;
      }
      Console.WriteLine("2. Credit score must be greater than "+ requiredCredit + ": " + isCreditMoreThanSpecified);

      Double requiredLona = 20000.00;
      Boolean isLoanMoreThanSpecified = false;
      if(existingLoanAmount < requiredLona){
         isLoanMoreThanSpecified = true;
      }
      Console.WriteLine("3. Existing loan must be less than "+ requiredLona + ": " + isLoanMoreThanSpecified);

      Console.WriteLine("4. KYC must be verified: " + kycStatus);

      if(isIncomeMoreThanSpecified && isCreditMoreThanSpecified && isLoanMoreThanSpecified && kycStatus){
         Console.WriteLine("Status: Loan Approved");
      }else{
         Console.WriteLine("Status: Loan Rejected");
      }
    }
}



