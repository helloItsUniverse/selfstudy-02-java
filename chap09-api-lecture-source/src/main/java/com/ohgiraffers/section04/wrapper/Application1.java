package com.ohgiraffers.section04.wrapper;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. Wrapper 클래스에 대해 이해할 수 있다. */
        int intValue = 20;

        /* 설명. 기본자료형을 Wrapper클래스 자료형으로 변환할 수 있다. */
        Integer boxingInt = (Integer)20;
        Integer boxingInt2 = Integer.valueOf(intValue);

        /* 설명. Wrapper클래스 자료형을 기본자료형으로 변환할 수 있다.(언박싱, unboxing) .... 근데 사실 자동으로 해줌 */
        int unboxingValue = boxingInt.intValue();

        /* 설명. 기본자료형과 Wrapper 클래스는 자동으로 박싱 및 언박싱이 일어난다.(autoboxing, auto-unboxing) */
        Integer autoBoxingInt = intValue;
        int autoUnboxingValue = autoBoxingInt;


        /* 설명.
         *  Object obj 에 10이 들어가는 순간
         *  1. (Integer)10 으로 auto-boxing 이 일어나고,
         *  2. (Object)(Integer)10 으로 다형성이 일어난다.
         * */
        anythingMethod(10);


        /* 설명. Wrapper 클래스 값 비교 */
        /* 설명. Wrapper 클래스들도 리터럴(literal) 값으로 오토박싱하면 결국 동일한 객체 하나만 관리된다. */
        Integer integerTest1 = (Integer)30;
        Integer integerTest2 = (Integer)30;
        System.out.println(" == 비교: " + (integerTest1 == integerTest2));
        System.out.println(" equals() 비교: " + integerTest1.equals(integerTest2));
        System.out.println("integerTest1 주소: " + System.identityHashCode(integerTest1));
        System.out.println("integerTest2 주소: " + System.identityHashCode(integerTest2));
    }

    /* 설명. 매개변수가 Object인 메소드(어떤 자료형의 전달인자이든 받아낼 수 있는 메소드 */
    public static void anythingMethod(Object obj) {     // 10 -> (Integer)10 으로 auto-boxing -> (Object)(Integer)10 으로 다형성
        System.out.println("obj: " + obj);              // Object의 toString()이 아닌 Integer의 toString()이 실행됨(동적 바인딩)
    }
}
