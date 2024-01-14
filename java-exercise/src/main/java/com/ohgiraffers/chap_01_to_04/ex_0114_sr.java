package com.ohgiraffers.chap_01_to_04;

import java.util.Scanner;

public class ex_0114_sr {

    public void rockScissorsPaper() {
        String computerHand = "";
        String result = "";
        Scanner sc = new Scanner(System.in);

        // 사용자와 컴퓨터가 비길 경우 재경기 하도록 반복
        while(true) {
            int computerNum = (int)(Math.random() * 3) + 1;
            switch (computerNum) {
                case 1:
                    computerHand = "가위";
                    break;
                case 2:
                    computerHand = "바위";
                    break;
                case 3:
                    computerHand = "보";
                    break;
            }

            System.out.print("가위, 바위, 보 중에서 하나를 입력하세요: ");
            String playerHand = sc.nextLine();

            /* 비기는 경우 */
            if (playerHand.equals(computerHand)) {
                result = "무승부";
                System.out.println("player: " + playerHand);
                System.out.println("computer: " + computerHand);
                System.out.println("result: " + result);
                System.out.println("재경기\n");
            }

            /* 승부가 나는 경우 */
            else {
                if (playerHand.equals("가위")) {          // 사용자가 가위를 내는 경우
                    if (computerHand.equals("바위")) result = "패배";
                    else result = "승리";     // computerHand: "보"
                } else if (playerHand.equals("바위")) {   // 사용자가 바위를 내는 경우
                    if (computerHand.equals("보")) result = "패배";
                    else result = "승리";     // computerHand: "가위"
                } else {                                 // 사용자가 보를 내는 경우
                    if (computerHand.equals("가위")) result = "패배";
                    else result = "승리";     // computerHand: "바위"
                }
                System.out.println("player: " + playerHand);
                System.out.println("computer: " + computerHand);
                System.out.println("result: " + result);
                break;
            }
        }
    }
}
