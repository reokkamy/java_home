package ch02;

public class _01_Operator1 {
    public static void main(String[] args) {
        //산술 연산자

        //일반 연산
        System.out.println(4 + 2); //6
        System.out.println(4 - 2); //2
        System.out.println(4 * 2); //8
        System.out.println(4 / 2); //2
        System.out.println(5 / 2); //2만 나옴
        System.out.println(2 / 4); //0이 나옴
        System.out.println(4 % 2); //0 몫이 2고 나머지0
        System.out.println(5 % 2); //1 몫이 2고 나머지 1

        //우선 순위 연산
        System.out.println(2 + 2 * 2); //6
        System.out.println((2 +2) * 2); //8
        System.out.println(2 + (2 * 2));  //6

        //변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c); //30

        c = a - b;
        System.out.println(c); //10

        c = a * b;
        System.out.println(c);

        c = a / b;
        System.out.println(c);

        c = a % b;
        System.out.println(c); 

        //증감 연산  ++, --
        int val;
        val = 10;
        System.out.println(val); //10
       System.out.println(++val);  //11  1+10이먼서 계산되고 문장이 수행함함
       System.out.println(val);  //11

       val = 10;
       System.out.println(val); //10
       System.out.println(val++); //10   문장을 수행하고 1+10이됨
       System.out.println(val);  //11

       val = 10;
       System.out.println(val);  //10
       System.out.println(--val); //9
       System.out.println(val);  //9

       val = 10;
       System.out.println(val); //10
       System.out.println(val--);  //10
       System.out.println(val);  //9
    

       //은행 대기 번호 표
       int wai = 0;
       System.out.println("대기 인원 : " + wai++);  //대기인원 0
         System.out.println("대기 인원 : " + wai++);  //대기인원 1
           System.out.println("대기 인원 : " + wai++);  //대기인원 2
           System.out.println("총 대기 인원 : " + wai);  //총 대기인원

    }   
}
