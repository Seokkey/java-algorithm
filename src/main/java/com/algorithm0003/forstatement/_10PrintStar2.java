package com.algorithm0003.forstatement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 문제 번호 : 2439번
 문제 :
  첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
  하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
 시간제한 : 1 초
 메모리 제한 : 128 MB
 입력 :
  첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 제한 :
 Study Goal :
  첫째 줄부터 N번째 줄까지 차례대로 오른쪽으로 정렬된 별을 출력한다.
*/
public class _10PrintStar2 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCase = Integer.parseInt(br.readLine());
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    br.close();

    //1. for, if 조합 => 14304 kb	124ms
    // for (int i = 1; i <= testCase; i++) {
    //   for (int j = 1; j <= testCase; j++) {
    //     if (j > testCase-i) {
    //       sb.append("*");
    //     } else {
    //       sb.append(" ");
    //     }
    //   }
    //   sb.append("\n");
    // }
    // bw.write(sb.toString());

    // 2. for, for 조합 => 14200kb	124ms
    for (int i = 1; i <= testCase; i++) {
      for (int j = 1; j <= testCase - i; j++) {
        bw.write(' ');
      }
      for (int k = 1; k <= i; k++) {
        bw.write('*');
      }
      bw.newLine();
    }

    bw.flush();
    bw.close();
  }
}
