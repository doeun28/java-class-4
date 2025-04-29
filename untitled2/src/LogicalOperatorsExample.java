import java.util.Scanner;

public class LogicalOperatorsExample {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("정수를 입력하세요: ");
       int num = sc.nextInt();


        if (num > 1 && num < 100) {
            System.out.println("1에서 100사이의 값입니다.");
        } else {
            System.out.println("1에서 100사이의 값이 아닙니다.");
        }


        }
    }