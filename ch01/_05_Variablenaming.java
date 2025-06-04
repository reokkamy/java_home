package ch01;

public class _05_Variablenaming {
    public static void main(String[] args) {
        //변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄, 문자, 숫자 사용가능 (공백사용불가)
        // 3. 밑줄 또는 문자로 시작 가능, 숫자x
        // 4. 한단어 또는 2개 이상단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
        // 6. 예약어 사용불가 (public, static, void, int, double, float ..)
        
        //입국 신고서(여행)
        String nationality = "대한민국"; //국적
        String firstName = "현성"; //이름
        String lastName = "김"; //성
        String dateOfBirth = "1983-12-12"; //생년월일
        String residentialAdress = "무슨 호텔"; //체류지
        String purposeOfVisit = "관광"; //입국목적적
        String flightNo = "KE054"; //항공편명
        String _flightNo = "KE054"; //밑줄 시작
        String flight_no_2 = "KE054"; //밑줄과 숫자 포함
        // String -flightNo = "KE054"; 

        int accompany = 2; //동반가족수
        int lengthOfStay = 5; //체류기간

        String item1 = "시계";
        String item2 = "가방";
        // String 3item = "전자제품";

        //프로그램의 흐름을 ㅜ이해 사용되는 경우등(크게 이름이 중요하지않을때)
        int i = 0;
        String s ="";
        String str = "";

        //절대 변하지 않는 상수는 대문자로
        final String CODE = "KR";
    }
}
