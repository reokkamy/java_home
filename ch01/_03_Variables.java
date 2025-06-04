package ch01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "김무진";
        int hour = 15;  //정수는 따옴표 없이이

        System.out.println(name + "님, 배송이 시작됩니다." + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다");

        double score = 90.5;   //실수수
        char grade = 'A';   //한글자자
        name = "강백호";   //이 아래에 name수정됨됨
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다");
        System.out.println("학점은 " + grade + "입니다");

        boolean pass = true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.1456879795;   
        float f = 3.1423884734F;   //소수점이 적게 나옴옴
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L;  //int는 21억까지 
        l = 1_000_000_000_000L; //보기힘들어서 언더바
        System.out.println(l);

        int, long, float, double, char, String, boolean
        //사용하는 데이터에 맞게 써야 문제가 덜생김
    }

}
