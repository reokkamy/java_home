package ch06;

public class _07_VariableScope {
    public static void methodA() {
        //System.out.println(number);
       // System.out.println(result);
    }

    public static void methodB() {
        int result = 1; //지역변수 중괄호를 벗어나면 쓸수없다 쓸려면 전달값에 정의
    }



    public static void main(String[] args) {
        int number = 3;

       // System.out.println(result);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // System.out.println(i);
        {
            int j = 0;
            System.out.println(j);
            System.out.println(number);
        }
        // System.out.println(j);
    }
    
}
