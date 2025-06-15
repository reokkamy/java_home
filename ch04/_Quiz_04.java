package ch04;
//주차 요금은 시간당 4000원 (일일 최대 요금은 30000원)

//경차 또는 장애인 차량은 최종요금에서 50%할인

//일반 차량 5시간 주차시 20000원
//경차 5시간 주차시 10000원
//장애인 차량 10시간 주차시 15000원

//실행결과: 주차 요금은 xx원입니다

public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 10; // 주차시간
        boolean isSmallcar =  false; // 경차여부
        boolean withDisabledPerson = true; // 장애인 차량여부

        int fee = hour * 4000; // 주차정산요금 (시간당 4000원 곱하기

        // 30000원 초과시 일일 최대 요금으로 수정
        if (fee > 30000) {
            fee = 30000;

        }
        // 경차 또는 장애인 차량의 경우 50%할인
        if (isSmallcar || withDisabledPerson) {
            fee *= 0.5f;
        }
        //실행결과
        System.out.println("주차요금은" + fee + " 원입니다");
    }
}
