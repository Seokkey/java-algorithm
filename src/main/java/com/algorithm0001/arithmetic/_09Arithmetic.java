package com.algorithm0001.arithmetic;

import java.util.Scanner;

/*
 문제 번호 : 10869
 문제 :
  두 자연수 A와 B가 주어진다. 이때,
  A+B,
  A-B,
  A*B,
  A/B(몫),
  A%B(나머지)를 출력하는 프로그램을 작성하시오.

 시간제한 : 1 초
 메모리 제한 : 256 MB
 입력 : 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
 Study Goal :
  첫째 줄에 A+B,
  둘째 줄에 A-B,
  셋째 줄에 A*B,
  넷째 줄에 A/B,
  다섯째 줄에 A%B를 출력한다.
*/
public class _09Arithmetic {
  public static void main(String[] args) {
    // 17840 kb 212 ms
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();
    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a*b);
    System.out.println(a/b);
    System.out.println(a%b);
  }
}
