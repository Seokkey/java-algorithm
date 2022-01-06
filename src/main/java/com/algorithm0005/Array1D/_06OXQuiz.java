package com.algorithm0005.Array1D;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.sql.Array;
import java.util.Arrays;

/*
 문제 번호 : 8958번
 문제 :
  "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다.
  O는 문제를 맞은 것이고, X는 문제를 틀린 것이다.
  문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다.
  예를 들어, 10번 문제의 점수는 3이 된다.
  "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
  OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
 시간제한 : 1 초
 메모리 제한 : 128 MB
 입력 :
  첫째 줄에 테스트 케이스의 개수가 주어진다.
  각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이 주어진다.
  문자열은 O와 X만으로 이루어져 있다.
 제한 :
 Study Goal :
  각 테스트 케이스마다 점수를 출력한다.
*/
public class _06OXQuiz {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    int testCase = Integer.parseInt(br.readLine());

    // 1. 문자열 배열 활용 => 	14424 kb	128 ms
    // String[] inputArray = new String[testCase]; // 배열을 전에 생성에 놓고 할당해주는게 조금 더 빠름
    // for (int i = 0; i < testCase; i ++) {
    //   inputArray[i] = br.readLine();
    //   int count = 0; // 연속 횟수
    //   int sum = 0; // 누적 합산
    //   for (int j = 0; j < inputArray[i].length(); j++) {
    //     if (inputArray[i].charAt(j) == 'O') {
    //       count++;
    //     } else {
    //       count = 0;
    //     }
    //     sum += count;
    //   }
    //   sb.append(sum).append('\n');
    // }

    // 2. getBytes() => 14232 kb 128ms
    // for (int i = 0; i < testCase; i ++) {
    //   int count = 0; // 연속 횟수
    //   int sum = 0; // 누적 합산
    //   // string.getBytes() 문자열을 바이트코드로 인코딩 배열로 리턴, 인수로 캐릿터셋 넘길 수 있음
    //   for (byte value : br.readLine().getBytes()) {
    //     if (value == 'O') {
    //       count++;
    //     } else {
    //       count = 0;
    //     }
    //     sum += count;
    //   }
    //   sb.append(sum).append('\n');
    // }

    // 3. split => 15040 kb	148 ms
    // split 으로 문자열 배열 이용
    for (int i = 0; i < testCase; i ++) {
      int count = 0; // 연속 횟수
      int sum = 0; // 누적 합산
      for (String s: br.readLine().split("")) {
        if ("O".equals(s)) {
          count++;
        } else {
          count = 0;
        }
        sum += count;
      }
      sb.append(sum).append('\n');
    }

    bw.write(sb.toString());
    br.close();
    bw.flush();
    bw.close();
  }
}
