package ch02;

public class _03_Operator4 {
    public static void main(String[] args) {
        //논리 연산자
        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); //하나라도 true이면 true
        System.out.println(김치찌개 && 계란말이 && 제육볶음); //모두 true이면 ture

        System.out.println((5 > 3) && (3 > 1)); //5는 3보다 크고 3은 1보다 크다 true
        System.out.println((5 > 3) && (3 < 1));

    }
} 
