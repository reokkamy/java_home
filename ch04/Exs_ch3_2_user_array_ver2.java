package ch3;

import java.util.Scanner;

import util.date.*;
import util.model.Member;

public class Exs_ch3_2_user_array_ver2 {

    

    static final int MAX_USERS = 100; 

    
    static Member[] members = new Member[MAX_USERS];

    static int userCount = 0; 

    public static void addUser(Scanner scanner) {
        if (userCount < MAX_USERS) { // 기본 유효성 체크
            System.out.println("이름을 입력하세요: ");
            String name = scanner.nextLine();

            System.out.println("이메일을 입력하세요: ");
            String email = scanner.nextLine();

            System.out.println("패스워드를 입력하세요: ");
            String password = scanner.nextLine();

            String registrationDate = DateUtil.getCurrentDateTime();

            Member member = new Member(name, password, email, registrationDate);

            members[userCount] = member;
            userCount++;
            System.out.println("회원이 추가되었습니다: " + name + ", " + email + ", " + registrationDate);
        } else {
            System.out.println("회원 수가 최대치를 초과했습니다.");
        }
    } 

   
    public static void viewUsers() {
        if (userCount == 0) {
            System.out.println("등록된 회원이 없습니다.");
            return; 
        }
        System.out.println("등록된 회원 목록:");
        for (int i = 0; i < userCount; i++) {
            members[i].showInfo();
        }
    } 

    
    public static void updateUser(Scanner scanner) {
        System.out.println("수정할 회원의 인덱스를 입력하세요 (0 ~ " + (userCount - 1) + "): ");
        int index = scanner.nextInt(); // 수정할 회원의 인덱스 입력
        scanner.nextLine(); // 개행 문자 제거
        if (index < 0 || index >= userCount) {
            System.out.println("잘못된 인덱스입니다.");
            return;
        }
        System.out.println("수정할 회원의 이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.println("수정할 회원의 이메일을 입력하세요: ");
        String email = scanner.nextLine();

        System.out.println("수정할 회원의 패스워드를 입력하세요: ");
        String password = scanner.nextLine();

        String registrationDate = DateUtil.getCurrentDateTime();

        Member member = new Member(name, password, email, registrationDate);
        members[index] = member;

        System.out.println("회원 정보가 수정되었습니다: " + name + ", " + email + ", "
                + registrationDate);
    } 

    public static void deleteUser(Scanner scanner) {
        System.out.println("삭제할 회원의 인덱스를 입력하세요 (0 ~ " + (userCount - 1) + "): ");
        int index = scanner.nextInt(); 
        scanner.nextLine(); 

        if (index < 0 || index >= userCount) {
            System.out.println("잘못된 인덱스입니다.");
            return; 
        }

        Member member = members[index];
        System.out.println("삭제할 회원 정보: ");
        member.showInfo(); 

        for (int i = index; i < userCount - 1; i++) {
            members[i] = members[i + 1]; 
        }
        
        members[userCount - 1] = null; 

        userCount--;
        System.out.println("회원이 삭제되었습니다.");
    }
    

    
    public static void addDummyUsers() {
        for (int i = 0; i < 5; i++) {
            if (userCount < MAX_USERS) {

                
                Member dummyMember = new Member(
                        "더미회원" + (i + 1),
                        "password" + (i + 1),
                        "dummy" + (i + 1) + "@example.com",
                        DateUtil.getCurrentDateTime());
              
                members[userCount] = dummyMember;

                userCount++;
            } else {
                System.out.println("더미 회원 추가 실패: 최대 회원 수 초과");
                break;
            }
        }
        System.out.println("더미 회원 5명이 추가되었습니다.");
    }
  

    public static void searchUser(Scanner scanner) {
        System.out.println("검색할 회원의 이름 또는 이메일을 입력하세요: ");
        String searchQuery = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < userCount; i++) {
            if (members[i].getName().contains(searchQuery) || members[i].getEmail().contains(searchQuery)) {
                members[i].showInfo(); 
                found = true;
            }
        }

        if (!found) {  -> false;
            System.out.println("검색 결과가 없습니다.");
        }
    }
   

}