package Number_Game;
import java.util.Scanner;

public class Number_Game
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int chances=10;
        int finals=0;
        boolean playAgain=true;
        System.out.println("Welcome Player!");
        System.out.println("You have about "+chances+" to win the game");
        while(playAgain){
            int rand=getrandN(1,100);
            boolean guess=false;
            for(int i=0;i<chances;i++){
                System.out.println("chances "+(i+1)+" Enter your guess:");
                int user=sc.nextInt();
                if(user==rand){
                    guess=true;
                    finals+=1;
                    System.out.println("You Won It.");
                    break;
                }
                else if(user>rand){
                    System.out.println("You have guessed it too high");
                }
                else{
                    System.out.println("You have guessed it too low");
                }
            }
            if(guess==false){
                System.out.println("you are out of chances.The number is"+rand);
            }
            System.out.println("Do you want to play a Again(y/n)");
            String pA=sc.next();
            playAgain=pA.equalsIgnoreCase("y");

        }
        System.out.println("End of the game, Hope you enjoyed it");
        System.out.println("Here is your score"+finals);
    }
        public static int getrandN(int min,int max){
            return (int)(Math.random()*(max-min+1)+min);
        }
      
        
        
    
}