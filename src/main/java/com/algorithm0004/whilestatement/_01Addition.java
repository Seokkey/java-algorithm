package com.algorithm0004.whilestatement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 문제 번호 : 10952번
 문제 :
  두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 시간제한 : 1 초
 메모리 제한 : 256 MB
 입력 :
  입력은 여러 개의 테스트 케이스로 이루어져 있다.
  각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
  입력의 마지막에는 0 두 개가 들어온다.
 제한 :
 Study Goal :
  각 테스트 케이스마다 A+B를 출력한다.
*/
public class _01Addition {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();

    while (true) {
      // 1. split 14244kb	124 ms
      String[] input = br.readLine().split(" ");
      int a = Integer.parseInt(input[0]);
      int b = Integer.parseInt(input[1]);

      // 2. charAt 14108 kb 120 ms
      // String input = br.readLine();
      // int a = input.charAt(0)-'0';
      // int b = input.charAt(2)-'0';

      if (a == 0 && b==0) {
        br.close();
        break;
      } else {
        sb.append(a+b).append("\n");
      }
    }

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}
