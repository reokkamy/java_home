package ch04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 ElseIf

        // 한라봉 에이드가 있으면 +1
        // 또는 망고 주스가 있으면 +1
        // 아이스 아메리카노 +1

        boolean hallabongAde = true; // 한라봉 에이드
        boolean mangoJuice = true; // 망고주스

        if (hallabongAde) {
            System.out.println("한라봉 에이드 +1");

        } else if (mangoJuice) {
            System.out.println("망고주스 +1");
        } else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피주문완료 #1");

        // else if 는 여러번 사용가능
        hallabongAde = false;
        mangoJuice = false;
        boolean orangeJuice = true;

        if (hallabongAde) {
            System.out.println("한라봉 에이드 +1");

        } else if (mangoJuice) {
            System.out.println("망고주스 +1");
        }else if (orangeJuice){
            System.out.println("오렌즈 주스 +1");
        } 
        else {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피주문완료 #2");
        //else는 없어도 가능
        //if 한라봉이 있으면 주문완료로 빠져나오고
        //if 한라봉이 없으면 다음 망고주스가있으면 주문완료로 빠져나오고..
    }
}
