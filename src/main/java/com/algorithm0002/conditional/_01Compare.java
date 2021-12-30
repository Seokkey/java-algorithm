package com.algorithm0002.conditional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 문제 번호 : 1330
 문제 : 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
 시간제한 : 1 초
 메모리 제한 : 512 MB
 입력 : 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
 제한 : -10,000 ≤ A, B ≤ 10,000
 Study Goal :
  첫째 줄에 다음 세 가지 중 하나를 출력한다.
  A가 B보다 큰 경우에는 '>'를 출력한다.
  A가 B보다 작은 경우에는 '<'를 출력한다.
  A와 B가 같은 경우에는 '=='를 출력한다.
*/
public class _01Compare {
  public static void main(String[] args) throws IOException {
    // 1. Scanner, if/else => 17668kb	208ms
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // sc.close();
    // if (a > b) {
    //   System.out.println(">");
    // } else if (a < b) {
    //   System.out.println("<");
    // } else {
    //   System.out.println("==");
    // }

    // 2. Scanner, 3항 연산자 => 17680kb	224ms
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // sc.close();
    // System.out.println((a > b) ? ">" : ((a < b) ? "<" : "=="));

    // 3. BufferedReader, 3항 연산자 => 14216kb	124ms
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    // StringTokenizer VS String.split ::
    // https://blog.naver.com/PostView.nhn?blogId=makga87&logNo=221949199317&parentCategoryNo=&categoryNo=17&viewDate=&isShowPopularPosts=true&from=search
    // StringTokenizer 가 레거시
    // StringTokenizer의 내부에 구현된 함수 및 로직들이, 구분자(delimeter)와 문자열을 일일이 비교하고, 구분자가 유니코드 일 경우,
    // hasMoreToke 혹은 nextToken 호출 시, 문자열과 구분자 전체를 비교하는 로직이 있어, 효율이 좋지 못하다.
    String[] str = br.readLine().split(" ");
    int a = Integer.parseInt(str[0]);
    int b = Integer.parseInt(str[1]);

    // 3항 연산자나 if-else 구문이나 성능상의 차이는 없다. 가독성의 문제
    System.out.println((a > b) ? ">" : ((a < b) ? "<" : "=="));
  }
}
