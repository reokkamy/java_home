package ch06;

public class _6_WhenToUse {
       public static int getPower(int number) {
        //int result = number * number;
        //return result;
        // return number * number;
        return getPower(number, 2);
    }
     //아래 getpower를 이용해 위 코드도 리팩토링 가능 return값에 넣어서
     //이런경우 exponent값이 2니까 2제곱만 하고싶을땐 위 코드에 number수만 고치면되고
     //여러제곱을 사용할때엔 밑에걸 이용하면됨


    public static int getPower(int number, int exponent){
         int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;

        }
        return result;
    }
    public static void main(String[] args) {
        // 메소드가 필요한 이유

        // 2의 2승을 구하기
     
        System.out.println(getPower(2, 2));
        
        //3의 3승을 구하기
      
        System.out.println(getPower(3, 3)); //3 * 3* 3 = 27


        //4의 2승을 구하기
   
        System.out.println(getPower(4, 2));  // 4* 4 = 16
    }
}
