using System;

public class Engine
{
    public static void Main(string[] args)
    {
      Console.WriteLine ("Love from Developer!");

      int enemyState = 1;
      int enemyStamina = 0;
      Double playerDistance = 0.00;
      String currentAction = "";
      int nextState = 1;

      Console.WriteLine("Enemy State: " + enemyState);
      Console.WriteLine("Enemy Stamina: " + enemyStamina);
      Console.WriteLine("Player Distance: " + playerDistance);
      Console.WriteLine("Current Action: " + currentAction);
      Console.WriteLine("Next State: " + nextState);
      Console.WriteLine("--- --- --- --- ---");

      Console.WriteLine("Evaluating Enemy State...");

      switch(enemyState){
         case 1:
            currentAction = "Enemy is standing still and resting.";
            if(playerDistance <= 10.00){
               nextState = 2;
            };
            break;
         case 2:
            currentAction = "Enemy is walking along a guard route.";
            if(playerDistance <= 5.00){
               nextState = 3;
            };
            break;
         case 3:
            currentAction = "Enemy is running directly toward the player!";
            if(playerDistance <= 2.00 && enemyStamina >= 20){
               nextState = 4;
            }else if(playerDistance > 12.0){
               nextState = 2;
            }
            break;
         case 4:
            currentAction = "Enemy swings their sword at the player!";
            nextState = 3;
            break;
         default:
            currentAction = "Error: Unknown AI state code detected.";
            break;
      }
   
      Console.WriteLine("Enemy State: " + enemyState);
      Console.WriteLine("Enemy Stamina: " + enemyStamina);
      Console.WriteLine("Player Distance: " + playerDistance);
      Console.WriteLine("Current Action: " + currentAction);
      Console.WriteLine("Next State: " + nextState);
    }
} 



