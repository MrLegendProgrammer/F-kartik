import java.util.Scanner;
class online_shopping{
public static void main(){
System.out.println("_____________________________________________________________________________________________________________________________________________");
System.out.println("                                                            ONLINE SHOPPING");
System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
System.out.println("* Here you can order things online");
System.out.println("* Suprise discount for diwali offer");
System.out.println("List of items are:-  ");
System.out.println("laptop - $100000 , phone - $60000 , AC - 70000 , fridge - 50000 , heater - 70000 , beast pc - 110000");
System.out.println();
System.out.println();
Scanner sc = new Scanner(System.in);
System.out.println("Enter the item");
String a = sc.nextLine();
System.out.println("Please enter the quantity");
int b = sc.nextInt();
int discount = 0,total = 0;
if(b<5){
switch(a){
case "laptop":
discount = (100000*b * 20)/100;
total = (100000*b)-discount;
System.out.println("You got discount of 20%");
break;

case "mobile":
discount = (60000*b * 10)/100;
total = (60000*b)-discount;
System.out.println("You got discount of 10%");
break;

case "AC":
discount = (70000*b * 20)/100;
total = (70000*b)-discount;
System.out.println("You got discount of 20%");
break;

case "fridge":
discount = (50000*b * 20)/100;
total = (50000*b)-discount;
System.out.println("You got discount of 20%");
break;

case "beast pc":
discount = (110000*b * 25)/100;
total = (110000*b)-discount;
System.out.println("You got discount of 25%");
break;

case "heater":
discount = (70000*b * 25)/100;
total = (70000*b)-discount;
System.out.println("You got discount of 15%");
break;

default:
System.out.println("no such item available");
}
System.out.println("Discount :- " + discount);
System.out.println("Total Cost :- " + total);
System.out.println("Order Placed");
System.out.println();
System.out.println("Any Query? - 9224056840");
System.out.println("Gmail - kartikbhartiya613@gmail.com");
System.out.println("Website - www.gadaelectronics.com");
System.out.println("                                                            THANKS FOR SHOPPING");
}
else{
System.out.println("Sorry! unaivailaible try for less than 5");
}
}
}
//made by kartik