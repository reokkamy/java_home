package ch03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I Like Java and Python and C.";

        //문자열 변환
        System.out.println(s.replace(" and", ","));//and를 ,로변환
        System.out.println(s.substring(7)); //인덱스 기준 7부터시작(이전내용은삭제)
        System.out.println(s.substring(s.indexOf("Java"))); 

        //java가 시작하는 위치부터 ","이 시작하는 위치 바로 앞까지


    }
    
}
