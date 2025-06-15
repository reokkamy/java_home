package ch04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue

        // 치킨 주문 손님중에 노쇼 손님이 있다고 가정
        // for

        int max = 20; // 최대 판매수량
        int sold = 0; // 현재 치킨 판매 수량
        int noshow = 17; // 대기번호 17번 손님ㄴ이 노쇼
        for (int i = 1; i < 50; i++) {
            System.out.println(i + "번 손님 주문하신 치킨 나왔습니다");
            // 손님이 없다면? (noshow)
            if (i == noshow) {
                System.out.println(i + "번 손님 노쇼로 인해 다음으로");
                continue; //만나면 즉시 동작멈추고 다음 방법,회차로 
            }

            sold++; // 판매 처리,
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되엇습니다");
                break;  //만나자마자 반복문 탈출
            }

        }
        System.out.println("영업 종료 되었습니다");

        System.out.println("---------------------");
        //while문
        sold = 0;
        int index = 1; // 손님번호
        while (index <= 50) {
            System.out.println(index + " 번 손님 주문하신 치킨나왔습니다");

            //손님이 없다면 (noshow)
            if (index == noshow) {
                System.out.println(index + "번 손님 노쇼로 인해 다음손님으로");
                index++; //continue로 밑에 실행안하고 위의 다음 반복문으로 가서
                continue;
                
            }

            sold++; //판매처리
            if (sold == max){
                System.out.println("금일 재료가 모두 소진되었씁니다");
                break;
            }
            index++;
        }
        System.out.println("영업을 종료합니다"); 
        //유튜브 6시간째에 추가 설명잇음
    }
}
