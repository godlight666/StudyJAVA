import java.util.Scanner;
public class Out_In{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your name: ");
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        int money = scanner.nextInt();
        scanner.close();
    }
    
}
