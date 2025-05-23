import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

         for (int i = 0; i < 10; i++) {
            System.out.print("1부터 100 사이의 숫자를 입력하세요: ");
            num = sc.nextInt();

            if (0<=num & num<=100)
                break;

            System.out.println(num);
        }
    }
}