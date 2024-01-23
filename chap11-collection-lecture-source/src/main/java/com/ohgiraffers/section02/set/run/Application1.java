package com.ohgiraffers.section02.set.run;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. Set 자료구조의 특성을 이해하고 hashSet을 이용할 수 있다. */

//        HashSet<String> hset = new HashSet<>();
        Set<String> hset = new HashSet<>();     // modulus 연산자와 비슷한 느낌
        hset.add(new String("java"));
        hset.add(new String("mariaDB"));
        hset.add(new String("servlet"));
        hset.add(new String("spring"));
        hset.add(new String("html"));

        /* 설명. Set에 저장된 자료는 넣은 순서를 보장하지 않는다. */
        System.out.println("hset = " + hset);

        hset.add(new String("mariaDB"));        // add 안됨
        hset.add(new String("mariaDB1"));

        /* 설명. 중복값은 Set에 추가되지 않는다. */
        /* 설명. 참조자료형에 정의된 동등한 객체를 저장하지 않음. (feat. equals, hashCode 오버라이딩 필요) */
        /* 설명. 중복되는 값이 있으면 새로 추가하려는 객체의 주소가 튕겨나간다.(덮어쓰지 않음) */
        System.out.println("hset = " + hset);
        System.out.println();

        /* 설명. 인덱스 개념이 없는 Set은 iterator를 돌리거나 array로 바꿔야 확인 가능하다. */
        Iterator<String> iter = hset.iterator();        // 웬만하면 제네릭을 걸자. (타입 안정성)
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println();

        Object[] objArr = hset.toArray();
        for(Object obj: objArr) {
            System.out.println(obj);
        }
        System.out.println();

        System.out.println("size(): " + hset.size());
        hset.clear();
        System.out.println("size(): " + hset.size());
        System.out.println("isEmpty(): " + hset.isEmpty());

    }
}
