using System;


interface PaymentBase {
   void pay(string mode);
}

interface RefundBase {
   void refund(string auth_key, string id, string reason);
}

interface NotificationBase {
   void notify();
}


class PaymentService: PaymentBase, RefundBase, NotificationBase {
   public void pay(
      string mode
   ){
      if(mode == "UPI"){
         // Logic
         Console.WriteLine($"Paid by {mode}");
      }else if(mode == "CREDIT_CARD"){
         // Logic
         Console.WriteLine($"Paid by {mode}");
      }else if(mode == "DEBIT_CARD"){
         // Logic
         Console.WriteLine($"Paid by {mode}");
      }else{
         Console.WriteLine($"Payment failed, unknown mode {mode}");
      }
   }

   // refund_request

   public void refund(string auth_key, string id, string reason){
      // Verify key
      // Verify payment
      // Verify reason
      Console.WriteLine("Refunded");
   }

   public void notify(){
      Console.WriteLine("Notified");
   }
}


public class Payment {
   public static void Main(){
      PaymentService payment_service = new PaymentService();
      Console.WriteLine(int.Parse("1"));
      Console.WriteLine($"Enter you payment mode : ");
      string mode = Console.ReadLine();
      payment_service.pay(mode);
      payment_service.refund("", "", "");
      payment_service.notify();
   }
}

