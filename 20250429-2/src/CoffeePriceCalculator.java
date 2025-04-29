import java.util.Scanner;
public class CoffeePriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("음료를 선택하세요: 1-아메리카노, 2-카페라떼, 3-카푸치노");
        int drinkType = scanner.nextInt();

        int basePrice = 0;


        switch (drinkType) {
            case 1:
                basePrice = 3000; // 아메리카노
                break;
            case 2:
                basePrice = 4000; // 카페라떼
                break;
            case 3:
                basePrice = 4500; // 카푸치노
                break;
            default:
                System.out.println("잘못된 음료 선택입니다.");
                return;
        }


                System.out.println(drinkType + "의 가격은 "+ basePrice + "원 입니다.");

        System.out.println("크기를 선택하세요: 1-스몰, 2-미디움, 3-라지");
        int sizeType = scanner.nextInt();

        int secondPrice = 0;


        switch (sizeType) {
            case 1:
                secondPrice = 0; // 스몰
                break;
            case 2:
                secondPrice = 500; // 미디움
                break;
            case 3:
                secondPrice = 1000; // 라지
                break;
            default:
                System.out.println("잘못된 사이즈 선택입니다.");
                return;
        }


            System.out.println(sizeType + "의 가격은 "+ secondPrice + "원 입니다");

        System.out.println("옵션을 선택하세요: 1-기본, 2-샷추가, 3-시럽추가, 4- 샷+시럽 추가");
        int optionType = scanner.nextInt();

        int thirdPrice = 0;


        switch (optionType) {
            case 1:
                thirdPrice = 0; // 기본
                break;
            case 2:
                thirdPrice = 500; // 샷추가
                break;
            case 3:
                thirdPrice = 300; // 시럽추가
                break;
            case 4:
                thirdPrice = 800; // 샷 + 시럽 추가
                break;
            default:
                System.out.println("잘못된 옵션 선택입니다.");
                return;
        }


        System.out.println(optionType + "의 가격은 "+ thirdPrice + "원 입니다");

        int price = basePrice + secondPrice + thirdPrice;
        System.out.println("총 금액은 " + price + "원 입니다.");


    }
}