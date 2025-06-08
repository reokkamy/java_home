package ch03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        //특수문자, 이스케이프 문자(Escape Sequence, Escape Character, Special Character)
        // \n \t \\ \" \'
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        //   \n 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");

        // \t: 탭 띄우기
        //해물파전   9000원
        //김치전     8000원
        //부추전     8000원
        System.out.println("해물파전\t\t9000원");
        System.out.println("김치전\t\t8000원");
        System.out.println("부추전\t\t8000원");

        // \\:역슬래시, 두번적어서 역슬래스를 표현
        System.out.println("C:\\Program Files\\Java");

        // \"큰따옴표
        //단비가 "냐옹" 이라고 했어요
        System.out.println("단비가 \"냐옹\"이라고 했어요");

        // \'' :작은 따옴표
        //단바가 '뭘 봐?' 라는 표정을 지었어요
        System.out.println("단비가 \'뭘 봐?\' 라는 표정을 지었어요");
        System.out.println("단비가 '뭘 봐?' 라는 표정을 지었어요");

        char c = 'A';
        c = '\'';
        System.out.println(c);
     

    }
    
}
