package emailApp;

import java.util.ArrayList;
import java.util.Scanner;

public class EmailApp {
    public EmailApp() {
    }

    public static void main(String[] args) {
        new ArrayList();

        do {
            Email em1 = new Email();
            System.out.println(em1.showInfo());
        } while(Finish());

    }

    public static boolean Finish() {
        System.out.println("Do you want to finish (y/n)");
        Scanner in = new Scanner(System.in);
        char answer = in.next().charAt(0);
        return answer != 'y';
    }
}
