package com.algorithm0003.forstatement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 문제 번호 : 2739
 문제 : N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
 시간제한 : 1 초
 메모리 제한 : 128 MB
 입력 : 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
 제한 :
 Study Goal :
  출력형식과 같게 N*1부터 N*9까지 출력한다.
*/
public class _01MultiplicationTable {
  public static void main(String[] args) throws IOException {
    // 1. BufferedReader, BufferedWriter => 14040kb	120ms
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    br.close();
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    for (int i=1; i<=9; i++) {
      sb.append(n).append(" * ").append(i).append(" = ").append(n*i).append("\n");
    }
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}
