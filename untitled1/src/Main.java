import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kor = 0;
        int eng = 0;
        int mat = 0;
        int sci = 0;
        int sum = 0;
        int intAvg = 0;
        double doubleAvg = 0.0;
        boolean boolRslt = false;

        // 점수 입력
        System.out.print("국어 점수를 입력하세요: ");
        kor = scanner.nextInt();
        System.out.print("영어 점수를 입력하세요: ");
        eng = scanner.nextInt();
        System.out.print("수학 점수를 입력하세요: ");
        mat = scanner.nextInt();
        System.out.print("과학 점수를 입력하세요: ");
        sci = scanner.nextInt();

        // 총점 및 평균 계산
        sum = kor + eng + mat + sci;
        intAvg = sum / 4;
        doubleAvg = sum / 4.0; // 실수 평균을 계산하기 위해 4.0으로 나눔
        boolRslt = intAvg == doubleAvg;

        // 결과 출력
        System.out.println("총점: " + sum);
        System.out.println("정수 평균: " + intAvg);
        System.out.println("실수 평균: " + doubleAvg);
        System.out.println("정수 평균과 실수 평균이 같은가? " + boolRslt);

        scanner.close();
    }
}

