package ch04;

public class _08_NestedLoop {
    public static void main(String[] args) {
        // 이중 반복문

        // 별 (*) 사각형 만들기
        // *

        // *****
        // *****
        // *****
        // *****
        // *****

        // *
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        System.out.println("----------------반복문 #1------------");
        // 별 (*) 왼쪽 삼각형 만들기

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++){
            // for (int j2 = 0; j2 <=i; j2++) {
            System.out.print("*");
            } 
                 System.out.println();
            }

       System.out.println("-00----------------");    
       //별 오른쪽 삼각형 만들기
    // * 
       
    //         *
    //        **
    //       ***
    //      ****
    //     *****

    //    *
        
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 4 - i; j++) {
            System.out.print(" ");
        }
        for (int k = 0; k <= i; k++) {
            System.out.print("*");
        }
        System.out.println();
    }


    }

}