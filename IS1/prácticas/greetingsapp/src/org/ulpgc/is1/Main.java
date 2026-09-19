package org.ulpgc.is1;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce your name: ");
        String userName = scanner.next();
        Greetings myGreetings = new Greetings();
        myGreetings.setName(userName);
        System.out.println(myGreetings.sayHello());
    }
}
