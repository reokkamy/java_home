package ch04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 If
        int hour = 15; // 오후 3시
        if (hour < 14) { //if 중괄호 안에 적용, 참일때 출력 
            System.out.println("아이스 아메리카노 + 1");
            System.out.println("샷추가");
            }
        System.out.println("커피 주문 완료#1");


        //오후 2시 이전, 모닝커피를 마시지 않은 경우?
        hour = 10;
        boolean morningCoffee = false; //모닝커피
        // if (hour < 14 && morningCoffee == false) !논리부정연산자로 같은값표시시
        if (hour < 14 && !morningCoffee) {
            System.out.println("아이스 아메리카노 + 1");
        }
        System.out.println("커피주문완료#2");
   

    //오후 2시 이후이거나 모닝 커피를 마신 경우?
    hour = 15;
    morningCoffee = true;
    // if (hour >= 14 || morningCoffee == true) ture없으면 자동 true
    if (hour >= 14 || morningCoffee) {
        System.out.println("아이스 아메리카노(디카페인) + 1");
    }
    System.out.println("커피 주문 완료 #3");


     }
}
