package com.algorithm0003.forstatement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 문제 번호 : 15552번
 문제 : 빠른 A+B
 시간제한 : 1 초
 메모리 제한 : 512 MB
 입력 :
  첫 줄에 테스트케이스의 개수 T가 주어진다.
  T는 최대 1,000,000이다.
  다음 T줄에는 각각 두 정수 A와 B가 주어진다.
  A와 B는 1 이상, 1,000 이하이다.
 제한 :
 Study Goal :
  각 테스트케이스마다 A+B를 한 줄에 하나씩 순서대로 출력한다.
*/
public class _04Addition2 {
  public static void main(String[] args) throws IOException {
    // Scanner, System.out.printn() 사용하면 시간 초과 됨.
    // 1. BufferedReader, BufferedWriter => 280308kb	988ms
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int testCount = Integer.parseInt(br.readLine());

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= testCount; i++) {
      String[] input = br.readLine().split(" ");
      sb.append(Integer.parseInt(input[0]) + Integer.parseInt(input[1])).append("\n");
    }
    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}
