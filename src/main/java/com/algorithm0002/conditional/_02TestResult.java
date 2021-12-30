package com.algorithm0002.conditional;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 문제 번호 : 9498
 문제 :
  시험 점수를 입력받아 90 ~ 100점은 A,
  80 ~ 89점은 B,
  70 ~ 79점은 C,
  60 ~ 69점은 D,
  나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 시간제한 : 1 초
 메모리 제한 : 128 MB
 입력 : 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 제한 :
 Study Goal :
  시험 성적을 출력한다.
*/
public class _02TestResult {
  public static void main(String[] args) throws IOException {
    // 1. BufferedReader, BufferedWriter => 14236kb	124ms
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int testScore = Integer.parseInt(br.readLine());
    br.close();
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    if (testScore >= 90) {
      bw.write("A");
    } else if (testScore >= 80 && testScore <= 89 ) {
      bw.write("B");
    } else if (testScore >= 70 && testScore <= 79 ) {
      bw.write("C");
    } else if (testScore >= 60 && testScore <= 69 ) {
      bw.write("D");
    } else {
      bw.write("F");
    }
    bw.flush();
    bw.close();
  }
}
