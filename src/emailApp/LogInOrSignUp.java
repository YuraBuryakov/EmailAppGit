package emailApp;

import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LogInOrSignUp {

        public static boolean signUp(Collection<Email> worker){
            boolean answer = false;
            System.out.println("Welcome to Email for workers!\nPlease enter your first name for logging in");
            Scanner in = new Scanner(System.in);
            String answerFN = in.next();
            System.out.println("Enter your last name");
            Scanner inLN = new Scanner(System.in);
            String answerLN = in.next();
            System.out.println("Just a minute: we are checking you in our system ");
            for(Email w: worker){
                if(answerFN == w.getFirstName() && answerLN == w.getLastName()) {
                    answer = true;
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


