package emailApp;

import java.util.ArrayList;
import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args) {
        ArrayList<Email> Workers = new ArrayList();

        do {
            Email em1 = new Email();
            System.out.println(em1.showInfo());
            // Trying

            Workers.add(em1);
            System.out.println("see workers?");
            Scanner in = new Scanner(System.in);
            char answer = in.next().charAt(0);
            if (answer == 'y'){
                for(Email w: Workers){
                    System.out.println(w.showInfo());
                }
            }


            for (Email em: Workers){
                System.out.println(em);
            }
        } while(Finish());

    }

    public static boolean Finish() {
        System.out.println("Do you want to finish (y/n)");
        Scanner in = new Scanner(System.in);
        char answer = in.next().charAt(0);
        return answer != 'y';
    }
}
