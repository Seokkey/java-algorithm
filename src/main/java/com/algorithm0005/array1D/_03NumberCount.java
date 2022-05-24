package com.algorithm0005.array1D;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 문제 번호 : 2577번
 문제 :
  세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
  예를 들어 A = 150, B = 266, C = 427 이라면
  A × B × C = 150 × 266 × 427 = 17037300 이 되고,
  계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
 시간제한 : 1 초
 메모리 제한 : 128 MB
 입력 :
  첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. A, B, C는 모두 100보다 크거나 같고, 1,000보다 작은 자연수이다.
 제한 :
 Study Goal :
  첫째 줄에는 A × B × C의 결과에 0 이 몇 번 쓰였는지 출력한다.
  마찬가지로 둘째 줄부터 열 번째 줄까지 A × B × C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.
*/
public class _03NumberCount {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    // A x b x c 바로 계산
    int input = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine());
    br.close();
    // 각 숫자의 개수를 담아줄 길이가 10인 배열 생성
    int[] countArray = new int[10];

    // 1. 문자열 활용 => 14236 kb	124 ms
    // 문자열로 변환해서
    // String str = String.valueOf(input);
    // 각 문자의 값에 해당되는 배열 인덱스의 값 증가
    // for (int i = 0; i < str.length(); i++) {
    //   countArray[(str.charAt(i) - 48)]++;
    // }

    // 2. 숫자 연산, 자릿수 활용 => 14100 kb	124 ms
    while(input!=0) {
      // 숫자의 1의 자리만 구해서 해당 인덱스 값 증가
      countArray[input%10]++;
      // 정수에 10을 나눠서 자릿수 감소시킴
      // 최종적으로 처음 숫자의 자릿수가 소수점 첫째 자리로 줄어들면(정수 0이 되면) 반복문 종료
      input/=10;
    }

    for (int v : countArray) {
      sb.append(v).append("\n");
    }

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}
