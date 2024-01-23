package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 컬렉션 프레임워크에 대해 이해할 수 있다. */
        ArrayList aList = new ArrayList();
        ArrayList<Object> aList2 = new ArrayList<>();       // 다이아몬드 연산자 없는 제네릭 클래스는 <Object>와 같다.

        List list = new ArrayList();    // 이렇게 은근히 많이 씀. 컬렉션은 다형성을 적용한 형태로 관례 상 많이 쓴다.
        Collection col = new ArrayList();
        // ArrayList 는 처음에 10칸짜리 디폴트 배열을 생성.
        // 배열을 다루는 것 보다 ArrayList 를 다루는게 훨씬 편리하다.
        // 배열이라는 자료구조 형태와 배열의 크기를 자동으로 늘리는 알고리즘이 다 포함되어 있음.


        /* 제네릭이 Object 형이기 때문에 아무 값이나 넣어도 전부 다형성이 된다 */
        aList.add("apple");     // String -> Object
        aList.add(123);         // 123 -> (Integer)123 -> Object
        aList.add(45.67);
        aList.add(new java.util.Date());        // 이렇게 하면 타입 안정성이 장점이었던 제네릭 클래스의 특성을 가져가지 못함.

        System.out.println("aList = " + aList);
        System.out.println("첫 번째 저장된 값: " + aList.get(0));
        System.out.println("두 번째 저장된 값: " + aList.get(1));
        System.out.println("aList에 담긴 데이터의 크기: " + aList.size());       // length와 비슷한 것. 우리가 ArrayList에 추가한 값의 크기

        for (int i = 0; i < aList.size(); i++) {
            System.out.println("aList 의 " + (i + 1) + "번째 칸에 들어 있는 값: " + aList.get(i));
        }

        /* 필기.
         *  배열보다 ArrayList가 나은 점
         *   1. 처음부터 크기 할당 불필요
         *   2. 중간에 값 추가 및 삭제가 용이
        * */



        /* 설명. 중간에 값 추가 불편한 예시 */
        int[] intArr = new int[5];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = 1;
        }
        System.out.println(Arrays.toString(intArr));

        int[] newArr = new int[intArr.length + 1];
        System.arraycopy(intArr, 0, newArr, 0, intArr.length);
        System.out.println(Arrays.toString(newArr));

        for (int i = newArr.length - 2; i > 1; i--) {
            newArr[i + 1] = newArr[i];
        }
        System.out.println(Arrays.toString(newArr));

        newArr[2] = 2;
        System.out.println(Arrays.toString(newArr));



        /* 설명. 중간에 값 추가 불편한 예시 2 */
        int[] intArr2 = new int[5];
        int num = 0;
        for (int i = 0; i < intArr2.length; i++) {
            intArr2[i] = ++num;
        }
        System.out.println(Arrays.toString(intArr2));

        int[] newArr2 = new int[intArr2.length + 1];
        System.arraycopy(intArr2, 0, newArr2, 0, intArr2.length);
        System.out.println(Arrays.toString(newArr2));

//        for (int i = newArr2.length - 2; i > 1; i--) {
        for (int i = 2; i > newArr2.length - 1; i++) {      // 기존의 값을 뒤로 옮길 때 앞의 인덱스부터 옮기면 안됨
            newArr2[i + 1] = newArr2[i];
        }
        System.out.println(Arrays.toString(newArr2));

        newArr2[2] = 7;
        System.out.println(Arrays.toString(newArr2));


        /* 필기.
         *  배열보다 ArrayList가 나은 점
         *   1. 처음부터 크기 할당 불필요
         *   2. 중간에 값 추가 및 삭제가 용이
        * */

        System.out.println("=========== ArrayList ===========");
        /* 설명. ArrayList에서 제공하는 add메소드로 쉽게 해 보자. */
//        Vector intArrList = new Vector();      // 벡터도 가능
        ArrayList<Integer> intArrList = new ArrayList<>();      // int값으로 제한
        for (int i = 0; i < 5; i++) {
            intArrList.add(i + 1);
        }
        System.out.println(intArrList);
        intArrList.add(2, 7);
        System.out.println(intArrList);

        /* 설명. ArrayList는 중복 저장을 허용한다. */
        System.out.println(aList);
        aList.add(123);
        aList.add("apple");
        System.out.println(aList);

        /* 설명. set() 메소드로 원하는 인덱스의 값을 원하는 값으로 수정할 수 있다. */
        aList.set(1, 777);
        System.out.println(aList);

        /* 설명. remove() 메소드로 원하는 인덱스의 값을 삭제할 수 있다. */
        aList.remove(1);
        System.out.println(aList);


        aList.add(null);
        System.out.println(aList);

        /* 설명. ArrayList 의 칸에는 기본 자료형 값이 직접 들어가는 것이 아니라 참조 자료형의 주소값이 정수 형으로 들어가있는 형태이다. */




        /* 설명. ArrayList를 활용해 정렬을 진행해 보자. */
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("orange");
        stringList.add("banana");
        stringList.add("mango");
        stringList.add("grape");

        System.out.println("stringList = " + stringList);

        /* 설명. Collections의 sort()메소드를 활용한 정렬 */
        Collections.sort(stringList);
        System.out.println("stringList = " + stringList);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(4);
        integerList.add(20);
        integerList.add(5);
        integerList.add(8);
        integerList.add(14);

        System.out.println("integerList = " + integerList);
        Collections.sort(integerList);
        System.out.println("integerList = " + integerList);

        /* 설명. 우리가 참조 자료형의 정렬 기준을 바꿀 수 없다. */
        /* 설명. 내림차순으로 바꾸기 위해 ArrayList에서 LinkedList로 교체 */
        stringList = new LinkedList<>(stringList);
        Iterator<String> iter = ((LinkedList<String>) stringList).descendingIterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
