package emailApp;

import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LogInOrSignUp {

    //Does not work
        public static boolean signUp(Collection<Email> worker){
            boolean answer = false;

            System.out.println("Welcome to Email for workers!\nPlease enter your email");
            while(!answer){
                Scanner in = new Scanner(System.in);
                String userAnswer = in.next();
                System.out.println("Just a minute: we are checking you in our system ");
                for(Email w: worker){

                    if (userAnswer == w.getEmail().toString()){
                        System.out.println(w.getEmail());
                        answer = true;
                    }
                }
                if(answer == false){
                    System.out.println("Incorrect email. Please enter again");
                    System.out.println("Your: " + userAnswer);
                    ;
                }
            }

            return answer;
        }

    public static int scannerForAnswer(int quantityOfVarients) {
        boolean flag = true;
        int answer = 0;
        while (flag) {

            try {
                Scanner in = new Scanner(System.in);
                answer = in.nextInt();
            } catch (Exception e){
                System.out.println("Please enter the number");
            }
            for (int i = 1; i <= quantityOfVarients; i++) {
                if (answer == i) {
                    flag = false;
                }
            }
            if (flag == true){
                System.out.println("You chose a wrong option. Please choose again");
            }

        }
        return answer;
    }
}


