import java.util.Scanner;

class DragonCave{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
System.out.println("You are in a land full of dragons. In front of you,");
System.out.println("you see two caves. In one cave, the dragon is friendly");
System.out.println("and will share his treasure with you. The other dragon");
System.out.println("is greedy and hungry and will eat you on sight.");
System.out.println("Which cave will you go into?(1 or 2)");
try{
String input= s.nextLine();
if(input.equals("1")){
System.out.println("You approach the cave...");
System.out.println("It is dark and spooky...");
System.out.println("A large dragon jumps out in front of you! He opens his jaws and..,");
System.out.println("Gobbles you down in one byte!");}
else if(input.equals("2")){
System.out.println("You approach the cave...");
System.out.println("It is dark and spooky...");
System.out.println("A large dragon jumps out in front of you! He opens his jaws and..,");
System.out.println("Offers you some of his treasure. You got lucky this time.");
}
else
System.out.println("Wrong input.");
}catch(Exception e){
    System.out.println(e.getMessage());
    }


}}

