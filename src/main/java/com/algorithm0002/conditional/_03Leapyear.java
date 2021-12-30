package com.algorithm0002.conditional;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 문제 번호 : 2753
 문제 :
  연도가 주어졌을 때, 윤년이면 1, 아니면 0을 출력하는 프로그램을 작성하시오.
  윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
  예를 들어, 2012년은 4의 배수이면서 100의 배수가 아니라서 윤년이다.
  1900년은 100의 배수이고 400의 배수는 아니기 때문에 윤년이 아니다.
  하지만, 2000년은 400의 배수이기 때문에 윤년이다.
 시간제한 : 1 초
 메모리 제한 : 128 MB
 입력 : 첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
 제한 :
 Study Goal :
  첫째 줄에 윤년이면 1, 아니면 0을 출력한다.
*/
public class _03Leapyear {
  public static void main(String[] args) throws IOException {
    // 1. BufferedReader, BufferedWriter => 14184 kb	124	ms
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int year = Integer.parseInt(br.readLine());
    br.close();

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    if ((year%4 == 0 && year%100 != 0) || year%400 == 0) {
      bw.write("1"); // 윤년
    } else {
      bw.write("0"); // 윤년아님
    }
    bw.flush();
    bw.close();
  }
}
