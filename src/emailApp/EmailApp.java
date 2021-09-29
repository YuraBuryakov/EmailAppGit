package emailApp;

import java.util.ArrayList;
import java.util.Scanner;

public class EmailApp {
    protected static ArrayList<Email> Workers = new ArrayList();


    public static void main(String[] args) {
        boolean answerForFinish = true;
        do {

            System.out.println("Welcome to Mail application for workers of our company");
            System.out.println("Please choose an action\n1-Log in our account\n2-Create your account\n3-Exit");
            int answer = LogInOrSignUp.scannerForAnswer(3);

            if  (answer == 1) {
                if(LogInOrSignUp.signUp(Workers)){
                    System.out.println("You are welcome! This is your info");

                } else{
                    System.out.println("You are not in our base");
                }
            } else if(answer == 2){
                Email worker = new Email();
                System.out.println(worker.showInfo());
                Workers.add(worker);
                PersonalAccount.account(worker);
                //System.out.println("see workers? (y/n)");
                //Scanner in = new Scanner(System.in);
                //char an = in.next().charAt(0);
                //if (an == 'y'){
                   // for(Email w: Workers){
                        //System.out.println(w.showInfo());
                    //}
                //}

            } else if (answer == 3){
                answerForFinish = Finish();
            }

        } while(answerForFinish);

    }

    public static boolean Finish() {
        System.out.println("Do you want to finish (y/n)");
        Scanner in = new Scanner(System.in);
        char answer = in.next().charAt(0);
        return answer != 'y';
    }



}

