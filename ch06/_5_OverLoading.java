package ch06;

public class _5_OverLoading {
        public static int getPower(int number) {
        int result = number * number;
        return result;
        // return number * number;
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }


    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;

        }
        return result;
    }




    public static void main(String[] args) {
        //메소드 오버로딩 :같은 이름의 메소드를 여러번 선언
        //맨위에거는 정수형 2번째는 문자형 세번째는 전달값이2개라 다다름
        //전달값의 타입이 다르거나 전달값의 갯수가 다르거나
        
       System.out.println(getPower(3)); //3 * 3 =9
       System.out.println(getPower("4")); // 4 * 4 = 16
        System.out.println(getPower(3, 3)); //3 * 3 * 3=27
    }
}
