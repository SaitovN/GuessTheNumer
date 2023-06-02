package academy.devonline.java.basic.section01_setup.section05_setup;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumer {
    public static void main(String[] args) {
        var number = new Random().nextInt(10);
        while (true){
            var user = new Scanner(System.in).nextInt();
            if (number > user){
                System.out.println("Больше: >"+user+"try :");
            } else if (number<user) {
                System.out.println("Менше: < "+user+"try :");
            }else {
                System.out.println("Вы угадали :");
                break;
            }
        }
    }
}
