package ch01; //상수

public class _06_Constants {
    public static void main(String[] args) {
        final String KR_COUNTRY_CODE = "+82"; //국가번호 (빨리) final을써서 상수화화
        // KR_COUNTRY_CODE = "+8282";
        System.out.println(KR_COUNTRY_CODE);

        final double PI = 3.141592; //원주율율
        final String DATE_OF_BIRTH = "1992-12-12";   //생년월일
        System.out.println(PI);
        System.out.println(DATE_OF_BIRTH);

    }
}
