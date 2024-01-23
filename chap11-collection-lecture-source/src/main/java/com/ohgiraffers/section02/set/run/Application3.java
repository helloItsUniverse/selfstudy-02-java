package com.ohgiraffers.section02.set.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. TreeSet에 대해 이해하고 활용할 수 있다. */
        Set<String> tSet = new TreeSet<>();
        tSet.add("ramen");
        tSet.add("pork");
        tSet.add("kimchi");
        tSet.add("fried egg");
        tSet.add("soup");
        System.out.println("tSet = " + tSet);

        /* 설명. 과제. 중복되지 않는 번호를 발생시켜 로또 번호 발생기 만들기(TreeSet 사용하지 않고) */
        Set<Integer> lotto = new TreeSet<>();

        /* 설명. 1부터 45까지 6개의 중복되지 않는 난수를 발생하여 값 저장 */
        while(lotto.size() < 6) {
            lotto.add((int) (Math.random() * 45) + 1);
        }

        /* 설명. 출력 시에는 오름차순으로 출력되도록 작성 */
        System.out.println("lotto = " + lotto);


        ArrayList<Integer> lottoList = new ArrayList<>();

        while(lottoList.size() < 6) {
            int newNum = (int) (Math.random() * 45) + 1;
//            if (lottoList.isEmpty()) {
//                lottoList.add(newNum);
//            }
            for (int i = 0; i <= lottoList.size() - 1; i++) {
                if (lottoList.isEmpty()) {
                    lottoList.add(newNum);
                    break;
                }
                if (lottoList.get(i) != newNum) {

                }
            }
        }
        Collections.sort(lottoList);
        System.out.println("lottoList = " + lottoList);
    }
}
