import java.util.Scanner;

public class SumOneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int sum = 0;

        System.out.println("숫자를 입력하세요: ");
        N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }

        System.out.println(N);
        System.out.println("홀수의 합: " + sum);
    }
}