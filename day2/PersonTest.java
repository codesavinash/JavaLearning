
import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = input.nextLine();
        System.out.println("What is your age? ");
        int age = input.nextInt();

        // create a new person
        Person p1 = new Person(name, age);

        // print the person's name
        System.out.printf("Hello %s glad to meet you!%n" , p1.getName());
        System.out.printf("I hear you are %d years old%n!" , p1.getAge());

        input.close();
    }   //main 
} //class

