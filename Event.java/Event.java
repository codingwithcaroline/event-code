import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
/**
*This program reads data.
*for an event and then interprets
*and prints the formatted
*event information.
*@author Caroline Kirkconnell
*@version 1/29/2020
*/
public class Event {
/**
*Accepts coded event information as input that.
*includes the date, time, price, discount, section,
*row, seat, followed by the description of the event.
*@param args Command-line arguments (unused).
*/
   public static void main(String[] args) {
      int prizeNumber;
      String event = "";
      String date = "";
      String month = "";
      String day = "";
      String year = "";
      String time = "";
      String hour = "";
      String minute = "";
      double price = 0;
      double discount = 0;
      String section = "";
      String row = "";
      String seat = "";
      String description = "";
      double cost = 0;
     
   //prints entire event code
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter your event code: ");
      String eventCode = "";
   //Print invalid message code if digits are less than 26.
      eventCode = scan.nextLine().trim();
      if (eventCode.length() < 26) {
         System.out.print("\nInvalid Event Code.\nEvent code"
            + " must have at least 26 characters.");
      }
      else {
      //divides everything in the String and prints.
         date = eventCode.substring(0, 8);
         month = eventCode.substring(0, 2);
         day = eventCode.substring(2, 4);
         year = eventCode.substring(4, 8);
         time = eventCode.substring(8, 12);
         hour = eventCode.substring(8, 10);
         minute = eventCode.substring(10, 12);
      //convert String price and discount using Double.parseDouble.
         price = Double.parseDouble(eventCode.substring(12, 17)) / 100;
         discount = Double.parseDouble(eventCode.substring(17, 19)) / 100; 
         section = eventCode.substring(19, 21);
         row = eventCode.substring(21, 23);
         seat = eventCode.substring(23, 25);
         description = eventCode.substring(25);
         System.out.print("\nEvent: " + description);
         System.out.print("   Date: " + month + "/" + day + "/" + year);
         System.out.print("   Time: " + hour + ":" + minute);
         System.out.print("\nSection: " + section);
         System.out.print("   Row: " + row);
         System.out.print("   Seat: " + seat);
      //Format the price using an
      //instance of the DecimalFormat class.
      //prints Price, Discount, and Cost
         DecimalFormat dP = new DecimalFormat("$#,##0.00");
      //double b = Double.parseDouble(dP);
         System.out.print("\nPrice: " 
            + dP.format(price));
      //Format the discount using an
      //instance of the DecimalFormat class.
         DecimalFormat dD = new DecimalFormat("0%");
      //double a = Double.parseDouble(dD);
         System.out.print("   Discount: " 
            + dD.format(discount));
      //Format the cost using an
      //instance of the DecimalFormat class.
         DecimalFormat dC = new DecimalFormat("$#,##0.00");
         cost = (price - (price * discount));
         System.out.print("   Cost: " 
            + dC.format(cost));
      //generate Random Number
         Random randNumber = new Random();
         DecimalFormat rf = new DecimalFormat("0000");
         int rn = randNumber.nextInt(9999) + 1;
         System.out.print("\nPrize Number: " + rf.format(rn));
      }
   }
}


    


