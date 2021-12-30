package com.algorithm0003.forstatement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 문제 번호 : 8393번
 문제 : n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 시간제한 : 1 초
 메모리 제한 : 128 MB
 입력 :
  첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
 제한 :
 Study Goal :
  1부터 n까지 합을 출력한다.
*/
public class _03SequenceAddition {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    br.close();

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    // 1. 일반적인 for 문 => 14112kb	120ms
    // int result = 0;
    // for (int i = 1; i <= n; i++) {
    //   result += i;
    // }
    // bw.write(Integer.toString(result));

    // 2. 가우스의 공식 활용 => 14196kb	120ms
    // n 에서부터 m 까지 더한 값 = ((n부터 m까지의 수의 개수)x(n+m)) / 2
    bw.write(Integer.toString((n*(n+1))/2));

    bw.flush();
    bw.close();
  }
}
