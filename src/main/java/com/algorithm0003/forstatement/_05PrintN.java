package com.algorithm0003.forstatement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 문제 번호 : 2741번
 문제 : 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 시간제한 : 1 초
 메모리 제한 : 128 MB
 입력 :
  첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
 제한 :
 Study Goal :
  첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
*/
public class _05PrintN {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    // 1. for 문 => 18156kb	232ms
    // for (int i = 1; i <= n; i++) {
    //   sb.append(i).append("\n");
    // }

    // 2. while 문 => 18148kb	224ms
    int i = 1;
    while (i <= n) {
      sb.append(i).append("\n");
      i++;
    }

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}
