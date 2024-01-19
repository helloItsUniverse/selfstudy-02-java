package com.ohgiraffers.section03.interfaceimplements;

/* 설명. 인터페이스 간에는 다중 상속이 가능하고 implements 대신 extends를 사용한다. */
public interface InterProduct extends ParentInterProduct, AnotherParentInterProduct {

//    static 은 어떤 객체든지 다 같이 쓸 수 있는 공공재. 그 중에서도 변하면 안되는 값으 static final 로 지정.

    /* 설명. 상수 필드만 가질 수 있기 때문에 모든 필드는 묵시적으로 public ststic final이다. */
//    public static final int MAX_NUM = 100;
    int MAX_NUM = 100;              // 상품 최대 100개만 저장 가능하고 이 값을 활용해 조건식을 작성해라.

    /* 설명. 인터페이스는 생성자를 가질 수 없다. */
//    public InterProduct() {}

    /* 설명. 추상메소드만 작성이 가능하다.(public abstract) */
    /* public abstract를 적지 않아도 JVM이 알아서 달아준다. */
//    private void nonStaticMethod();
    void nonStaticMethod();

    /* 설명. 하지만 static 메소드는 바디부까지 작성을 허용하였다. (JDK 1.8부터 추가된 기능) */
    public static void staticMethod() {
        System.out.println("InterProduct 클래스의 staticMethod 호출됨...");
    }

    /* 설명. 또한 default 키워드를 사용하면 non-static 메소드로 작성 가능하다. (JDK 1.8부터 추가된 기능) */
    public default void defaultMethod() {
        System.out.println("InterProduct 클래스의 defaultMethod 호출됨...");
    }

    /* 설명. private도 abstract가 아닌 온전한 메소드로 사용은 가능하다.(default도 없이) */
    private void privateMethod() {

        /* 설명. 다른 public default 메소드에서 활용할 수만 있는 메소드 */
    }
}
