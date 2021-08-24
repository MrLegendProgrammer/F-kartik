import java.util.Scanner;
class hotel{
public static void main(){
Scanner sc = new Scanner(System.in);
System.out.println("_____________________________________________________________________________________________________________________________________________");
System.out.println("                                                                  !!LANDMARK!!");
System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
System.out.println();
System.out.println();
System.out.println("Press 1 to order");
System.out.println("Press 2 to Book roome");
char kkk = sc.next().charAt(0);
if(kkk == '1'){
System.out.println("....................................................................MENU.....................................................................");
System.out.println();
System.out.println("Pizza - $2000                                         Pasta - $500                                         Hotdog - $25");
System.out.println("Burger - $500                                         Bread - $100                                         Sandiwch - $50");
System.out.println("Cake - $3050                                          Icescream - $75                                      Coffee - $50              ");
System.out.println("Pudding - $55                                         Cookies - $25                                        Juice - $50                      ");
System.out.println();
System.out.println("Please enter the dish");
String a = sc.next();
System.out.println("Please enter the quantity");
int b = sc.nextInt();
int discount = 0,total = 0,charges = 0;
int g = 0;
switch(a){
case "Pizza":
discount = (2000*b * 3)/100;
total = 2000*b-discount;
System.out.println("Congrats! You got discount of 3%");
g = 2000;
break;
case "Burger":
discount = (500*b *2)/100;
total = 500*b-discount;
System.out.println("Congrats! You got discount of 2%");
g = 500;
break;
case "Cake":
discount = (3050*b * 10)/100;
total = 3050*b-discount;
System.out.println("Congrats! You got discount of 10%");
g = 3050;
break;
case "Pudding":
discount = (55*b * 2)/100;
total = 55*b-discount;
System.out.println("Congrats! You got discount of 2%");
g = 55;
break;
case "Pasta":
discount = (500*b * 3)/100;
total = 500*b-discount;
System.out.println("Congrats! You got discount of 3%");
g = 500;
break;
case "Bread":
discount = (100*b * 3)/100;
total = 100*b-discount;
System.out.println("Congrats! You got discount of 3%");
g = 100;
break;
case "Icescream":
discount = (75*b * 2)/100;
total = 75*b-discount;
System.out.println("Congrats! You got discount of 2%");
g = 75;
break;
case "Cookies":
discount = (25*b * 2)/100;
total = 25*b-discount;
System.out.println("Congrats! You got discount of 2%");
g = 25;
break;
case "Hotdog":
discount = (25*b * 2)/100;
total = 25*b-discount;
System.out.println("Congrats! You got discount of 2%");
g = 25;
break;
case "Sandwich":
discount = (50*b * 2)/100;
total = 50*b-discount;
System.out.println("Congrats! You got discount of 2%");
g = 50;
break;
case "Coffee":
discount = (50*b * 2)/100;
total = 50*b-discount;
System.out.println("Congrats! You got discount of 2%");
g = 50;
break;
case "Juice":
discount = (50*b * 2)/100;
total = 50*b-discount;
System.out.println("Congrats! You got discount of 2%");
g = 50;
break;
default:
System.out.println("Please enter correct dish");
}
System.out.println();
System.out.println("Do you want courier delivery or takedown");
System.out.println("* Courier will charge $15 extra");
System.out.println("* Takedown - You can come hotel and take by your own");
System.out.println("* 1 - Courier");
System.out.println("* 2 - Takedown");
int choice = sc.nextInt();
if(choice == 1){
total = total +15;
System.out.println("Please enter your name");
String x = sc.next();
String xyx = sc.next();
System.out.println("Please enter the address");
String y = sc.next();
String yxy = sc.next();
System.out.println("Please enter the phone number");
String z = sc.next();
System.out.println();
System.out.println();
System.out.println(".....................................................................Bill...................................................................");
System.out.println("Name :- " + x + " " + xyx);
System.out.println("Ph. No :- " + z);
System.out.println("Address :- " + y + " " + yxy);
System.out.println("Cost per piece :- $" + g);
int jj = g*b;
System.out.println("Cost of " + b + " Piece :- $" + jj);
System.out.println("Discount :- $" + discount);
System.out.println("Total :- $" + total);
System.out.println(".....................................................................End....................................................................");
}
else if(choice == 2){
System.out.println("Please enter the name");
String nn = sc.next();
String nkn = sc.next();
System.out.println("Please enter the Ph. no");
String kk = sc.next();
System.out.println();
System.out.println();
System.out.println(".....................................................................Bill...................................................................");
System.out.println("Name :- " + nn + " " + nkn);
System.out.println("Ph. No :- " + kk);
System.out.println("Cost per piece :- $" + g);
int jj = g*b;
System.out.println("Cost of " + b + " Piece :- $" + jj);
System.out.println("Discount :- $" + discount);
System.out.println("Total :- $" + total);
System.out.println(".....................................................................End....................................................................");
}


}
else if(kkk == '2'){
System.out.println();
System.out.println("Please enter the order of number for the cateogary");
System.out.println("1 - Low class = $2000/day");
System.out.println("2 - Normal class = $5000/day");
System.out.println("3 - High class = $10000/day");
char kgf = sc.next().charAt(0);
System.out.println();
System.out.println("Please enter the number of days to stay");
int dff = sc.nextInt();
System.out.println();
int dis=0,tot=0,flag=0,fla=0;
switch(kgf){
case '1':
dis = (2000*dff * 5)/100;
tot = 2000*dff - dis;
flag = 5;
fla = 2000;
System.out.println("Class = Low Class");
break;
case '2':
dis = (5000*dff * 7)/100;
tot = 5000*dff - dis;
flag = 7;
fla = 5000;
System.out.println("Class = Normal Class");
break;
case '3':
dis = (10000*dff * 10)/100;
tot = 10000*dff - dis;
flag = 10;
fla = 10000;
System.out.println("Class = High Class");
break;
default:
System.out.println("Please enter a valid input");
}
System.out.println("Please enter your name");
String xyy = sc.next();
String xxz = sc.next();
System.out.println("Please enter the address ");
String yxx = sc.next();
String yyy = sc.next();
System.out.println("Please enter the phone number");
Long zzz = sc.nextLong();
System.out.println(".....................................................................Bill...................................................................");
System.out.println("Name :- " + xyy + " " + xxz);
System.out.println("Ph. No :- " + zzz);
System.out.println("Adrress :- " + yxx + " " + yyy);
System.out.println("Cost per day :- $" + fla);
System.out.println("No of days :- " + dff);
int jgj = fla*dff;
System.out.println("Total cost (excluding discount) :- $" + jgj);
System.out.println("Discount :- " + flag + "%");
System.out.println("Discount :- $" + dis);
System.out.println("Total :- $" + tot);
System.out.println(".....................................................................End....................................................................");
System.out.println();
}

else{
System.out.println("Please enter correct input");
}
System.out.println("Do you wanna give feedback");
System.out.println("Y for yes and N for no");
char feed = sc.next().charAt(0);
if(feed == 'Y'){
System.out.println(" 1 = Very Bad");
System.out.println(" 2 = Bad");
System.out.println(" 3 = Average");
System.out.println(" 4 = Very Good");
System.out.println(" 5 = Excellent");
char jkd = sc.next().charAt(0);
switch(jkd){
case '1':
System.out.println("Please enter the problem you faced");
String mkn = sc.next();
System.out.println("Thanks! We will improve !!");
break;
case '2':
System.out.println("Please enter the problem you faced");
String mkg = sc.next();
System.out.println("Thanks! We will improve !!");
break;
case '3':
System.out.println("Please enter the problem you faced");
String mks = sc.next();
System.out.println("Thanks! We will improve !!");
break;
case '4':
System.out.println("Please enter the problem you faced");
String mkk = sc.next();
System.out.println("Thanks! We will improve !!");
break;
case '5':
System.out.println("Oh! Thank you ");
break;
default:
System.out.println("Please enter in range of 1 - 5");
}
}
System.out.println();
System.out.println();
System.out.println("Hotel Landmark");
System.out.println("Ph. no :- 9889028070");
System.out.println("G-mail :- landmark@gmail.com");
System.out.println("Website :- www.landmark.com");
System.out.println();
System.out.println("                                                                  !!THANKS!!");
}
}
//Made By Kartik