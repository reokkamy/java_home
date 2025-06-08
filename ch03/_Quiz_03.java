package ch03;


//주민등록 번호에서 생년월일 및 성별까지만 출력하는 프로그램을 작성

//참고
//주민등록번호 13자리숫자
//앞6자리는 생년월일 뒷 7자리중 첫번째 숫자는 성별정보
//입력데이터는 -을 포함한 14자리의 문자열형태

//예시
// "901231-1234567" 인경우 901231-1 까지 출력

public class _Quiz_03 {
    public static void main(String[] args) {
        String id = "901231-1234567";//주민등록번호 13자리
        System.out.println(id.substring(0, 8)); //0위치부터 8위치직전
    
        System.out.println(id.substring(0, id.indexOf("-") + 2));
        //0위치부터 하이픈 위치 + 2 직전까지



    }
    
}
