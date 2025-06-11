package ch04;

public class _07_DoWhile {
    public static void main(String[] args) {
        //반복문 DoWhile
        int distance = 25; //전체거리 25m
        int move = 0; //현재 이동거리 0m
        int height = 2; //키 2미터

        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " +move);
            move +=3; //3m이동
            
        }
        System.out.println("도착하였음");

        System.out.println("-=========반복문#1=======");

        //키가 엄청나게 큰사람?
        move = 0;
        height = 25; //키가 25m
        while (move + height < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " +move);
            move +=3; //3m이동
            
        }
        System.out.println("도착하였음");


          System.out.println("-=========반복문#2=======");

        //Do While 반복문
        //발차기한번은 실행하고 while에서 참인지 거짓인지. 참이면 반복복
        do {
            System.out.println("발차기를 게속합니다");
            System.out.println("현재 이동거리 : " + move);
            move += 3;


        } while ( move + height < distance  );

        System.out.println("도착했씁니다");









    }
    
}
