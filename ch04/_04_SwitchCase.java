package ch04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // _04_SwitchCase
        // 1등 : 전액장학금
        // 2등 : 반액 장학금
        // 3등 : 반액 장학금
        // 그외: 장학금 대상아님

        //if else 문은 여러조건 또는 범위에 해당하는 조건
        int ranking = 1; // 등수
        if (ranking == 1) {
            System.out.println("전액장학금");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        // SwitchCase 문을 이용 (명확한 케이스가 있는 경우)
        // case2와 3통합 ranking이 2일때 case1 확인하고 2확인하고
        // 3확인하고 없으면 디폴트, 2가 맞으면 break가 없으므로
        // 3의 문구 출력, 값이 3이면 2 번 확인하고 3번출력
        ranking = 2;
        switch (ranking) {
            case 1:
                System.out.println("전액장학금");
                break;
            case 2:

            case 3:
                System.out.println("반액장학금");
                break;

            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");

        // 중고상품의 등급에 따른 가격을 책정(1급: 최상, 4급: 최하)
        int grade = 1; // 등급
        int price = 7000;// 기본가격
        switch (grade) {
            case 1:
                price += 1000; // price = price + 1000
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격: " + price + "원");
        //1등급 제품의 가격: 10000원
        //2등급 제품의 가격: 9000원
        // break를 없애서 연산을 한꺼번에 하는방법

        int score =  95;
        if (score >=90)
        System.out.println("A");
        else if (score >=80)
        System.out.println("B");

        //범위를 할때는 if, 명확한 값은 case를 사용하면편함



    }
}
