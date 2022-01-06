package com.algorithm0003.forstatement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 문제 번호 : 11021번
 문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 시간제한 : 1 초
 메모리 제한 : 256 MB
 입력 :
  첫째 줄에 테스트 케이스의 개수 T가 주어진다.
  각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 제한 :
 Study Goal :
  각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
*/
public class _07Addition3 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testCase = Integer.parseInt(br.readLine());
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= testCase; i++) {
      // 1. split => 14136 kb	124 ms
      // String[] input = br.readLine().split(" ");
      // sb.append("Case #").append(i).append(": ").append(Integer.parseInt(input[0]) + Integer.parseInt(input[1])).append("\n");

      // 2. charAt => 14152 kb	120 ms
      // charAt()은 해당 문자열 위치를 char로 반환한다
      // 0 이라는 문자열을 반환하면 ASCII 코드값 48이 나옴
      // 정수로 변경하려면 0의 ASCII 코드값인 48 을 빼주면 됨 또는 -'0' 으로 해도됨
      String input = br.readLine();
      sb.append("Case #").append(i).append(": ").append((input.charAt(0)-'0') + (input.charAt(2)-'0')).append("\n");
    }
    br.close();
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}
