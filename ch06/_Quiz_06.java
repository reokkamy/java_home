package ch06;
//실행 결과

//이름: 김**
//주민등록번호: 990990-1******
//전화번호 : 010-123-1234

//힌트   substring()    length()

public class _Quiz_06 {
    public static String getHiddenData(String data, int index) {
        String hiddenData = data.substring(0, index); // 김무진 ->김
        // for (int i = index; i < data.length(); 1++){
        for (int i = 0; i < data.length() - index; i++) {
            hiddenData += "*";  //김**
 
        }

        return hiddenData;

    }

    public static void main(String[] args) {
        String name = "김무진"; // 이름
        String id = "990990-1234567"; // 주민번호
        String phone = "010-123-1234"; // 전화번호

        System.out.println("이름 : " + getHiddenData(name, 1)); // 개인정보, 비공개 시작위치
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }
}
