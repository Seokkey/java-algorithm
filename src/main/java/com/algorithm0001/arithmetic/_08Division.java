package com.algorithm0001.arithmetic;

import java.util.Scanner;

/*
 문제 번호 : 1008
 문제 : 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

 시간제한 : 2 초
 메모리 제한 : 128 MB
 입력 : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 Study Goal : 첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
*/
public class _08Division {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    sc.close();
    System.out.println(a/b);
  }
}
