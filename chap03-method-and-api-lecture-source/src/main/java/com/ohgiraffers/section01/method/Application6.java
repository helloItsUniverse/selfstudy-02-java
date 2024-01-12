package com.ohgiraffers.section01.method;

public class Application6 {
    /* 수업목표. 반환값이 있는 메소드 테스트해 보기 */
    public static void main(String[] args) {
        System.out.println("main() 메소드 시작됨...");
        
        Application6 app6 = new Application6();
//        String returnText = app6.testMethod();
//        System.out.println("returnText = " + returnText);

        /* 설명. 변수에 굳이 담을 필요 없이 메소드의 반환값을 한 번만 사용할 거라면 바로 호출해서 반환값을 활용할 수 있다. */
        //  표현식 : 하나의 리터럴로 치환될 식. 한번만 써서 굳이 변수에 담지 않아도 될 경우.
        System.out.println("returnText = " + app6.testMethod());


        System.out.println("main() 메소드 종료됨...");
    }

    /* 필기. 자료형별 기본값
     *  byte, short, int, long : 0
     *  float : 0.0f
     *  double : 0.0
     *  char : \u0000
     *
    * */
    private String testMethod() {
        System.out.println("testMethod() 메소드 실행됨...");
        return "test";          // 반환값이 있을 때는 반드시 "return" 을 적어야 함.
    }
}
