
import java.util.Scanner;




class gusser {
    
    
    
    int guessingNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("gusser! kindly guess the number");
        int guessNumber = sc.nextInt();
        return guessNumber;
    }
}
class player1 {
    int guessingNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("player 1!kindlay guess the number");
        int guessNumber = sc.nextInt();
        return guessNumber;
    }
}
class player2{
    int guessNumber;

    int guessingNumber(){
        Scanner sc= new Scanner (System .in);
        System.out.println("player 2! kindaly guess the number");
        guessNumber=sc.nextInt();
        return guessNumber;
    }
}
class player3{
    int guessNumber;
    int guessingNumber(){
    Scanner sc = new Scanner (System.in);
    System.out.println("player 3! kindaly guess the number");
    guessNumber=sc.nextInt();
    return guessNumber;


    }

}

class umpire {
     int numfromguesser;
    int numfromplayer1;
   int numfromplayer2;
   int numfromplayer3;

    void collectnumfromguesser() {
        gusser g = new gusser();

       
         numfromguesser = g.guessingNumber();
    }

    void collectnumfromplayer()
     {
        player1 p1 = new player1();
        player2 p2 = new player2();
        player3 p3 = new player3();
         numfromplayer1 = p1.guessingNumber();
         numfromplayer2 = p2.guessingNumber();
         numfromplayer3 = p3.guessingNumber();
    }

void compare()
{
if(numfromguesser==numfromplayer1 && numfromguesser==numfromplayer2 && numfromguesser ==numfromplayer3) 
{

     System.out.println("All player  guess correct number game tie ");
    }
     


    else if(numfromguesser==numfromplayer1&&numfromguesser==numfromplayer2){
        System.out.println("player 1and 2 both guess correct number won this");
    }
else if (numfromguesser==numfromplayer2&&numfromguesser==numfromplayer3) 
{
    System.out.println("player 2and 3 both guess correct number won this");

}
else if(numfromguesser==numfromplayer3&&numfromguesser==numfromplayer1){
    System.out.println("player 1and 3 both guess correct number won this");
}
else if(numfromguesser==numfromplayer1){
    System.out.println("player 1 won this game");
}
else if(numfromguesser==numfromplayer2){
    System.out.println("player 2 won this game");
}
else if(numfromguesser==numfromplayer3){
    System.out.println("player 3 won this game");
}

else {
    System.out.println("All player lost this match");
}

}
}




public class gusser_game {
    public static void main(String[] args) {
        System.out.println("welcome ");
        System.out.println("game start");

        umpire u = new umpire();
        u.collectnumfromguesser();
        u.collectnumfromplayer();
        u.compare();


    }
}

