import java.sql.SQLOutput;
import java.util.Scanner;
    public class game {
        public static void main(String[] args) {
            int times =1;
            int GUESS =0;
            int PRIVATE_NUM = (int) (Math.random() * 99 +1);
            Scanner INPUT = new Scanner(System.in);
            System.out.println("************************************************************************");
            System.out.println("Welcome to guess number game \n You will be asked  to guess a number to win the game \n You have 5 attempt limit");

            do{
                System.out.println("ENTER THE NUMBER BETWEEN 1 to 100\n");
                if(INPUT.hasNextInt()){
                    GUESS = INPUT.nextInt();
                    if(GUESS == PRIVATE_NUM){
                        System.out.println("BOOYAH !! , YOU ENTERED CORRECT NUMBER . YOU WIN THE GAME!");
                        break;
                    } else if (GUESS < PRIVATE_NUM) {
                        System.out.println("YOU ENTERED SMALL NUMBER");
                    } else if (GUESS > PRIVATE_NUM) {
                        System.out.println(" YOU ENTERED GREATER NUMBER");
                    }
                    if(times==5){
                        System.out.println(" YOU REACH THE MAXIMUM ATTEMPT LIMIT. TRY AGAIN");
                        break;
                    }
                    times++;
                }
                else{
                    System.out.println("PLEASE ENTER A VALID NUMBER");
                    break;
                }
            }while( GUESS != PRIVATE_NUM);

            System.out.println("THE PRIVATE NUMBER IS... ");
            System.out.println(PRIVATE_NUM);

        }
    }

