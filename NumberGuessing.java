//**InfoByte Internship Task-2(Number Guessing Game), done by Devangam Ravula Cheruvu Sai Chaitanya**
import java.util.Random;
import java.util.*;

class NumberGuessing {
    public static void main(String[] args) {
        System.out.println("Number Guessing Game! Start Now");
        Scanner sc = new Scanner(System.in);
        Random randint = new Random();
        int r = randint.nextInt(1);
        int n;
        int score = 100;
        do {
            System.out.println("Guess the Number(1-100):");
            n = sc.nextInt();
            // if(n==r){
            // System.out.println("You Guessed the correct number");
            // }
            if (n > r) {
                System.out.println("Too High");
                score -= 10;
            } else if (n < r) {
                System.out.println("Too low");
                score -= 10;
            } else {
                System.out.println("you got!");
            }
        } while (n != r);
        System.out.println("Your score is " + score);

    }
}
//**InfoByte Internship Task-2(Number Guessing Game), done by Devangam Ravula Cheruvu Sai Chaitanya**