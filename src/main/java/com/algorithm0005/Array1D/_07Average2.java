package com.algorithm0005.Array1D;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 문제 번호 : 4344번
 문제 :
  대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다.
  당신은 그들에게 슬픈 진실을 알려줘야 한다.
 시간제한 : 1 초
 메모리 제한 : 256 MB
 입력 :
  첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
  둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고,
  이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
 제한 :
 Study Goal :
  각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
*/
public class _07Average2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringBuilder sb = new StringBuilder();
    int testCase = Integer.parseInt(br.readLine());

    // 	15656 kb 168 ms
    for (int i = 0; i < testCase; i++) {
      String[] inputArray = br.readLine().split(" ");

      double sum = 0; // 합계
      double average = 0; // 평균
      double count = 0; // 평균 이상인 사람
      int length = inputArray.length - 1;

      for (int j = 1; j < inputArray.length; j++) {
        sum += Integer.parseInt(inputArray[j]);
      }
      average = sum / length;

      for (int j = 1; j < inputArray.length; j++) {
        if (average < Integer.parseInt(inputArray[j])) {
          count++;
        }
      }
      sb.append(String.format("%.3f", (count / length) * 100)).append("%").append("\n");
    }

    bw.write(sb.toString());
    br.close();
    bw.flush();
    bw.close();
  }
}
