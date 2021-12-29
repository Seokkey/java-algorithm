package com.algorithm0001.arithmetic;

import java.util.Scanner;

/*
 문제 : 두 정수 A와 B를 입력받은 다음, AxB를 출력하는 프로그램을 작성하시오.

 시간제한 : 2 초
 메모리 제한 : 128 MB
 입력 : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 Study Goal : 첫째 줄에 AxB를 출력한다.
*/
public class _07Multiplication {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();
    System.out.println(a-b);
  }
}
