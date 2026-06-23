import java.util.*;
public class Calculator {

    public static void main(String[] args) {
        System.out.println("odd even machine");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number ");
        int x = sc.nextInt();
        System.out.println("enter second number ");
        int y = sc.nextInt();
        System.out.println("1. enter for addition \n 2. enter for subtraction \n 3. enter for multiplication \n 4. enter for divison");
        int z = sc.nextInt();
        switch (z) {
            case 1:
                System.out.println(x+y);
                break;
            case 2:
                System.out.println(x-y);
                break;
            case 3:
                System.out.println(x*y);
                break;
            case 4:
                System.out.println(x/y);
                break;
            default:
                System.out.println("invalid operation");
                break;
        }
        }

    }
