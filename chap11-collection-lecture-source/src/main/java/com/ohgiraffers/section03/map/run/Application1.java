package com.ohgiraffers.section03.map.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. Map의 자료구조에 대해 이해하고 HashMap을 이요할 수 있다. */
        Map<Object, Object> hmap = new HashMap<>();
        hmap.put("one", new Date());
        hmap.put(12, "red apple");
        hmap.put(33, 123);

        System.out.println("key가 \"one\"인 value 값: " + hmap.get("one"));
        System.out.println("Map의 toString(): " + hmap);

        /* 설명. key 값은 중복되면 이후 put 되는 key와 value가 덮어씌운다. (에러가 뜨지 않으니 주의) */
        hmap.put(12, "purple banana");
        System.out.println(hmap.get(12));

        /* 설명. value는 중복되어도 상관이 없다. */
        hmap.put(77, "purple banana");
        System.out.println(hmap);

        System.out.println("Map이 지닌 entry의 수: " + hmap.size());
        System.out.println("key=77 과 관련된 entry 삭제: " + hmap.remove(77));
        System.out.println("삭제 후 entry의 수: " + hmap.size());

        /* 필기. Map을 반복하여 각 entry들(key와 value)을 활용해보자. */
        HashMap<String, String> hmap2 = new HashMap<>();

        hmap2.put("one", "java17");
        hmap2.put("two", "mariaDB 10");
        hmap2.put("three", "servlet/jsp");
        hmap2.put("four", "springboot 3.0");
        hmap2.put("five", "jue.js");

//        Set<String> keys = hmap2.keySet();
//        Iterator<String> iter = keys.iterator();
//        while(iter.hasNext()) {
//            System.out.println(iter.next());
//        }



        /* 목차. 1. keySet()을 활용한 iterator 활용하기 */
        Set<String> keys = hmap2.keySet();
        Iterator<String> iter = keys.iterator();
        while(iter.hasNext()) {
            String key = iter.next();
            System.out.println("key값: " + key + ", value값: " + hmap2.get(key));
        }
        System.out.println();

        /* 목차. 2. entrySet()을 활용한 iterator 활용하기 */
        Set<Map.Entry<String, String>> set = hmap2.entrySet();
        Iterator<Map.Entry<String, String>> iterEntry = set.iterator();
        while(iterEntry.hasNext()) {
            Map.Entry<String, String> entry = iterEntry.next();

            System.out.println("key값: " + entry.getKey() + ", value값: " + entry.getValue());
        }

    }
}
