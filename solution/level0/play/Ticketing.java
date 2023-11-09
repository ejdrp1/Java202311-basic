package level0.play;

import java.util.Scanner;

public class Ticketing {
    Scanner scanner = new Scanner(System.in);

    //    1. 손님 종류를 입력받는 기능
    private int inputKindOfPeople() {
        System.out.println("당신의 어디에 해당합니까?");
        System.out.println("1.노인 2.어린이 3.일반");

        int customerNum = scanner.nextInt();

        return customerNum;
    }

    //    2. 좌석 종류를 입력받는 기능
    private int inputKindOfSeat() {
        System.out.println("좌석 종류를 선택해주세요.");
        System.out.println("1.VIP석(60,000원) 2.일반석(30,000원) 3.스탠딩석(10,000원)");

        int seatNum = scanner.nextInt();

        return seatNum;
    }

    //    3. 손님의 종류에 따라 할인된 가격을 계산하는 기능
    private int discountPrice(int customerNum, int seatNum) {

        int seatPrice = 0;
        int discountPrice = 0;

        switch (seatNum) {
            case 1:
                seatPrice = 60000;
                break;
            case 2:
                seatPrice = 30000;
                break;
            case 3:
                seatPrice = 10000;
                break;
        }

        switch (customerNum) {
            case 1:
            case 2:
                discountPrice = (int) (seatPrice * 0.8);
                break;
            case 3:
                discountPrice = seatPrice;
        }

        return discountPrice;
    }

    //    4. 다시 하기
    private String retryReserve() {
        System.out.println("다시 하시겠습니까? (y/n)");
        String answer = scanner.next();

        return answer;
    }

    public static void main(String[] args) {

        String flag = "y";
        while (flag.equals("y")) {

            Ticketing ticketing = new Ticketing();
            int customerNum = ticketing.inputKindOfPeople();
            int seatNum = ticketing.inputKindOfSeat();
            int discountPrice = ticketing.discountPrice(customerNum, seatNum);
            System.out.println("최종 결제 금액 : " + discountPrice);

            flag = ticketing.retryReserve();

        }


    }


}
