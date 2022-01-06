package com.algorithm0005.Array1D;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 문제 번호 : 2562번
 문제 :
  9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
  예를 들어, 서로 다른 9개의 자연수
  3, 29, 38, 12, 57, 74, 40, 85, 61
  이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
 시간제한 : 1 초
 메모리 제한 : 128 MB
 입력 :
  첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
 제한 :
 Study Goal :
  첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
*/
public class _02Max {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int count = 0; // 필요없다, 변수 할당 없이 그냥 입력만 받아도 됨
    int max = 0;

    // 1. 배열 X, 포문 사용 => 14196 kb 124ms
    for (int i = 1; i <= 9; i++) {
      int val = Integer.parseInt(br.readLine());
      if (max < val) {
        max = val;
        count = i;
      }
    }
    br.close();
    sb.append(max).append("\n").append(count);

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}
