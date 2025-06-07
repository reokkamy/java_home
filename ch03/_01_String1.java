package ch03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I Like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 29

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // 다 대문자로
        System.out.println(s.toLowerCase()); // 다 소문자로

        // 포함관계
        System.out.println(s.contains("Java")); // 포함된다면 true, 안되면 false
        System.out.println(s.contains("C#")); // false

        System.out.println(s.indexOf("Java")); // 0부터 시작해서 7번째 위치
        System.out.println(s.indexOf("C#")); // 미포함시 -1
        System.out.println(s.indexOf("and")); //처음 일치하는 위치정보
        System.out.println(s.lastIndexOf("and")); //마지막에 일치하는 위치정보
        System.out.println(s.startsWith("I Like")); //이문자열로 시작하면 true
        System.out.println(s.endsWith("."));


    }

}
