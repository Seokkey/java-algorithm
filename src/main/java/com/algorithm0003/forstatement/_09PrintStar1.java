package com.algorithm0003.forstatement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 문제 번호 : 2438번
 문제 : 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 시간제한 : 1 초
 메모리 제한 : 128 MB
 입력 :
  첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 제한 :
 Study Goal :
  첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
*/
public class _09PrintStar1 {
  public static void main(String[] args) throws IOException {
    //1. 14284kb	124ms
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCase = Integer.parseInt(br.readLine());
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= testCase; i++) {
      for (int n = 1; n <= i; n++) {
        sb.append("*");
      }
      sb.append("\n");
    }
    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}
