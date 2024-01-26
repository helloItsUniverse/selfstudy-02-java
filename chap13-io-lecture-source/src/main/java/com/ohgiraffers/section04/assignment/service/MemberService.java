package com.ohgiraffers.section04.assignment.service;

import com.ohgiraffers.section04.assignment.aggregate.Member;
import com.ohgiraffers.section04.assignment.repository.MemberRepository;

import java.util.ArrayList;

/* 설명. 트랜잭션 성공/실패 여부 확인 및 회원 관련 비즈니스 로직 처리하는 클래스 */
public class MemberService {

    private final MemberRepository mr = new MemberRepository();

    public MemberService() {
    }

    public void selectAllMembers() {
        ArrayList<Member> selectedMembers = mr.selectAllMembers();

        /* 설명. 회원이 한명도 없어서 조회 결과가 없더라도 ArrayList객체는 넘어온다. (Empty 상태로) */
        if (!selectedMembers.isEmpty()) {       // 회원이 한명이라도 조회된다면
            System.out.println("===== service까지 잘 반환되어 오나 확인 =====");
            for(Member m: selectedMembers) {
                System.out.println(m);
            }
            return ;                            // 이후 코드와 상관 없이 메소드 종료
        }
        /* 설명. 조건이 맞지 않아(회원이 조회되지 않아) 출력을 하는 구문(위의 조건이 맞으면 실행되지 않음)(feat. else 안 쓰기) */
        System.out.println("슬프게도 우리 사이트는 아직 회원이 없습니다. ㅠㅠ");

    }

    /* 설명. 전달된 회원번호를 활용해 repository에 있는 memberList로부터 해당 회원 찾아 반환 받기 */
    public void selectMember(int memNo) {
        Member selectedMember = mr.selectMember(memNo);

        if (selectedMember == null) {
            System.out.println("그런 회원이 없네요 ㅠㅠ");
        } else {
            System.out.println("조회된 회원은: " + selectedMember);
        }
    }

    public void registMember(Member member) {
        System.out.println("사용자가 입력해서 넘겨준 Member 확인: " + member);
    }
}
