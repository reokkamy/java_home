package ch04;

public class _06_While {
    public static void main(String[] args) {
        
    
    //반복문 While
    //수영장에서 수영을하는
    int distance = 25; //전체거리 25m
    int move = 0; // 현재 이동거리 0m
    while (move < distance){  //현재 이동거리가 전체거리보다 작다는 조건이 참인동안
        System.out.println("발차기를 계속합니다.");
        System.out.println("현재 이동거리는 : " + move);
        move += 3;  //3미터 이동
    }

    System.out.println("도착 하였습니다다");

    //무한루프
    
    int move1 = 0; // 현재 이동거리 0m
    while (move1 < distance){  //현재 이동거리가 전체거리보다 작다는 조건이 참인동안
        System.out.println("발차기를 계속합니다.");
        System.out.println("현재 이동거리는 : " + move);
            }

    System.out.println("도착 하였습니다다");

    }


}
