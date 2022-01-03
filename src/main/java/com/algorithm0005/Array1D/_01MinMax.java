package com.algorithm0005.Array1D;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 문제 번호 : 10818번
 문제 :
  N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 시간제한 : 1 초
 메모리 제한 : 256 MB
 입력 :
  첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다.
  둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
  모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 제한 :
 Study Goal :
  첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
*/
public class _01MinMax {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder sb = new StringBuilder();
    int count = Integer.parseInt(br.readLine()); // 필요없다, 변수 할당 없이 그냥 입력만 받아도 됨

    // 1. 배열, 포문 사용 => 105944 kb	520 ms
    // String[] input = br.readLine().split(" ");
    // int min = 1000001;
    // int max = -1000001;
    // br.close();
    //
    // for (String s : input) {
    //   int n = Integer.parseInt(s);
    //   if (n > max) {
    //     max = n;
    //   }
    //   if (n < min) {
    //     min = n;
    //   }
    // }
    // sb.append(min).append(" ").append(max);

    // 2. Stream sorted() 사용 => 130020 kb	1332 ms
    // int[] sortedArray =
    //     Arrays.stream(br.readLine().split(" "))
    //         .mapToInt(Integer::parseInt)
    //         .sorted()
    //         .toArray();
    // sb.append(sortedArray[0]).append(" ").append(sortedArray[sortedArray.length - 1]);

    // 3. 배열 X, StringTokenizer 사용 => 89260 kb	580 ms
    // 메모리를 덜 쓰지만 조금 느리다.
    StringTokenizer st = new StringTokenizer(br.readLine()," ");

    int max = -1000001;
    int min = 1000001;

    while(st.hasMoreTokens()) {
      int val = Integer.parseInt(st.nextToken());
      if(val>max) {
        max = val;
      }
      if(val<min) {
        min = val;
      }
    }
    sb.append(min).append(" ").append(max);

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}
