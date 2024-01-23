package com.ohgiraffers.section02.set.run;

import java.util.HashMap;
import java.util.HashSet;
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
        System.out.println("hset = " + hset);

        hset.add(new String("mariaDB"));        // add 안됨
        hset.add(new String("mariaDB1"));
        System.out.println("hset = " + hset);



    }
}
