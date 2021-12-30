package com.algorithm0003.forstatement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 문제 번호 : 2742번
 문제 : 자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 시간제한 : 1 초
 메모리 제한 : 128 MB
 입력 :
  첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
 제한 :
 Study Goal :
  N번째 줄 부터 1 까지 차례대로 출력한다.
*/
public class _06NPrint {
  public static void main(String[] args) throws IOException {
    // Scanner, System.out.printn() 사용하면 시간 초과 됨.
    // 1. BufferedReader, BufferedWriter => 18156kb	232ms
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();

    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}
