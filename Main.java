import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome TO Vacation Planer!!");

        String name = input.next();
        System.out.println("Nice to meet you" +" "+ name + " " + "Where you want to travel?");
        String city = input.next();
        System.out.println(city + ",Seems to be a nice choice");

        System.out.println("How many days u will stay?");
        Integer days = input.nextInt();
        System.out.println("How much money you will spend on your trip(in USD)?");
        Integer money = input.nextInt();
        System.out.println("What is three letter currency symbol of place u wanna travel?");
        String letter = input.next();
        System.out.println("How many " + " " + letter +" " +"are there in 1 USD?");
        Integer conv = input.nextInt();
        System.out.println("If u are travelling for" + " "+ days +" "+" days that is same as" + "  "+ days * 1440 + " minutes");
        System.out.println("If u are going to spend" +" "+ money +"USD , that means u can spend upto "+"  " + money/days + "  "+ " USD per day");
        System.out.println("Your total budget in "+ " "+ letter +" is " + conv*money   +letter+ " "+ ",which is " + money * conv/days + letter +" "+" per day.");


        System.out.println("What is the square area of your destination country in km? ");
        Integer mile = input.nextInt();
        System.out.println("That is  " +" "+mile*0.62 +" "+"in miles");











    }





}
