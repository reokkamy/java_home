package ch05;

public class _05_ASCII {
    public static void main(String[] args) {
        //아스키코드 (ANSI) :미국 표준코드
        char c = 'A'; //알파벳 대문자 65부터/ 소문자는 97/ 숫자(0)은 48부터 시작
        System.out.println(c);
        System.out.println((int)c);

        c ='B';
         System.out.println(c);
        System.out.println((int)c);

        c++;
          System.out.println(c);
        System.out.println((int)c);


             // 세로크기 10 x 가로크기 15 에 해당하는 영화관 좌석
        String[][] seats3 = new String[10][15];
        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) { // 세로
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(ch) + (j + 1);
            }
            ch++;
        }
        
                //영화관 좌석 번호 확인
            for (int i = 0; i < seats3.length; i++) { // 세로
            for (int j = 0; j < seats3[i].length; j++) { // 가로
                System.out.print(seats3[i][j] + " "); // 띄워쓰기

            }
            System.out.println();
        }




    }
}
