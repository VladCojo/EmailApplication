package emailapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {

        List<Email> l = new ArrayList<>();

        String firstName, lastName;

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Enter first name(or 'quit' to exit): ");
            firstName = scanner.nextLine();
            if(firstName.equals("quit")) break;

            System.out.println("Enter last name: ");
            lastName = scanner.nextLine();
            Email em = new Email(firstName, lastName);
            l.add(em);


        }
        for(var it: l){
            System.out.println(it.showInfo());
        }

    }
}
