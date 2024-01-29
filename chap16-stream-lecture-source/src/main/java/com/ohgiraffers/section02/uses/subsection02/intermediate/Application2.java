package com.ohgiraffers.section02.uses.subsection02.intermediate;

import java.util.stream.IntStream;

/* 필기.
 *  아주 중요한 부분이니 꼭 알아둘 것.
* */

public class Application2 {
    public static void main(String[] args) {

        /* 수업목표. 스트림의 중계연산 중 하나인 map 에 대해 이해하고 사용할 수 있다. */
        /* 설명. 맵(map)은 스트림에 들어있는 데이터를 람다식으로 가공하고 새로운 스트림에 담아주는 메소드이다. */
        IntStream intStream = IntStream.range(1, 10);
        intStream.filter(i -> i % 2 == 0)               // boolean 반환형으로 람다식 작성(predicate)
                 .map(i -> i * 5)                       // 오소를 반환하는 형태로 람다식 작성(operator)
                 .forEach(result -> System.out.print(result + " "));    // 반환형 없는 람다식 작성(consumer)
    }
}
