package com.ohgiraffers.section04.dto;

import com.ohgiraffers.section04.constructor.User;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 생성자를 이용한 객체 초기화와 설정자를 이용한 초기화의 장단점을 이해할 수 있다. */
        UserDTO user1 = new UserDTO();
        System.out.println(user1.toString());

        user1.setId("user01");                  // 설정하는 메소드 (설정자) setter
        System.out.println(user1.getId());      // 불러오는 메소드 getter
        System.out.println(user1);
        // toString() 을 만든 경우 .toString() 을 적지 않아도 적었을 때와 똑같이 출력됨.
    }
}
