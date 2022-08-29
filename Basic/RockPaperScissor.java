package Basic;

import java.util.Scanner;
import java.util.Random;

/* 0 = rock
   1 = paper
   2 = scissor
 */
public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int a = rand.nextInt((byte)3);


            byte b = sc.nextByte();
        if(a==b){
            System.out.println("DRAW ENTER AGAIN");
            while(a==b){
                a=rand.nextInt();
                b=sc.nextByte();}

        }
         if(a==1){
            System.out.println("COMPUTER CHOOSE PAPER");
        }
         else if(a==0){
            System.out.println("COMPUTER CHOOSE ROCK");
        }
        else if(a==2){
            System.out.println("COMPUTER CHOOSE SCISSOR");
        }
        if(b==1){
            System.out.println("YOU CHOOSE PAPER");
        }
         else if(b==0){
            System.out.println("YOU CHOOSE ROCK");
        }
         else if(b==2){
            System.out.println("YOU CHOOSE SCISSOR");
        }
            if(a==0 && b==1){
                System.out.println("YOU WON!!!");
            }
            else if(a==1 && b==2){
                System.out.println("YOU WON!!!");
            }
            else if(a ==2 && b==0 ){
                System.out.println("YOU WON!!!");
            }

            else{
                System.out.println("YOU LOOSE!!!");

            }

        }
    }

