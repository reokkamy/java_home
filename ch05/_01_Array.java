package ch05;

public class _01_Array {
    public static void main(String[] args) {

        // 배열 : 같은 자료형의 값 여러개를 저장하는 연속된 공간
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeCandeler = "라떼";
        String coffeeMonica = "카푸치노";

        System.out.println(coffeeRoss + "하나");
        System.out.println(coffeeRachel + "하나");
        System.out.println(coffeeMonica + "하나");
        System.out.println(coffeeCandeler + "하나");
        System.out.println("주세요");


        // //배열 선언 첫번째 방법
        //  String[] coffees = new String [4];

         //두번째 방법
        //  String coffees[] = new String[4];
        // coffees[0] = "아메리카노"; //0부터 시작 
        // coffees[1] = "카페모카";
        // coffees[2] = "라떼";
        // coffees[3] = "카푸치노";

        //세번째 방법
        // String[] coffees = new String[] {"아메리카노", "카페모카", "라떼", "카푸치노"};

        //네번째 방법
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};

            System.out.println("--------------------------------");

            //커피 주문
            System.out.println(coffees[0] +" 하나");  
            System.out.println(coffees[1] +" 하나");
            coffees[2] = "에스프레소"; //값변경
            System.out.println(coffees[2] +" 하나");  
            System.out.println(coffees[3] +" 하나");
            System.out.println("주세요");

            //다른자료형?
            int[] i = new int[3];
            i[0] = 1;
            i[1] = 2;
            i [3] =3;
            double[] d = new double[] {10.0, 11.2, 13.5};
            boolean[] b = {true, true, false};
    }
}
