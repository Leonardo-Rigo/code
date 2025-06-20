import java.util.Scanner;

public class ola {
    public static void main (String[] args) {
        System.out.println("Hello world!");

Scanner scanner = new Scanner(System.in); 

int idade = scanner.nextInt();

scanner.close();

System.out.println("sua idade é de: " + idade);

    }
}