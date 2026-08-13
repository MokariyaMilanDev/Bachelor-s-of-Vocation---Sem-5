using System;


interface BasePayment {
   void __pay__(double amount);
}


class CreditCard:BasePayment {
   public void __pay__(double amount){
      Console.WriteLine($"[CreditCard] Amount ${amount} Payment successfully paid.");
   }
}


class DebitCard:BasePayment {
   public void __pay__(double amount){
      Console.WriteLine($"[DebitCard] Amount ${amount} Payment successfully paid.");
   }
}


class UPI:BasePayment {
   public void __pay__(double amount){
      Console.WriteLine($"[UPI] Amount ${amount} Payment successfully paid.");
   }
}


public class Payment {
   public static void Main(){
      Console.WriteLine("Enter Payment Method (Credit, Debit, UPI): ");
      string paymentMethod = Console.ReadLine();
      Console.WriteLine("Enter Payment Amount: ");
      double amount = int.Parse(Console.ReadLine());
      if(paymentMethod == "Credit"){
         BasePayment creditCard = new CreditCard();
         creditCard.__pay__(amount);
      }else if(paymentMethod == "Debit"){
         BasePayment creditCard = new DebitCard();
         creditCard.__pay__(amount);
      }else if(paymentMethod == "UPI"){
         BasePayment creditCard = new UPI();
         creditCard.__pay__(amount);
      }else{
         Console.WriteLine("Rerun programe & enter valid paymentMethod(Credit, Debit, UPI).");
      }
   }
}

