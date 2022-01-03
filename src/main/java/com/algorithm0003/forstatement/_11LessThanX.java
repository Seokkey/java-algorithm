package com.algorithm0003.forstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
public class _11LessThanX {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 1. BufferedWriter, split 조합 => 15828 kb 168ms
    // String[] input = br.readLine().split(" ");
    // int count = Integer.parseInt(input[0]);
    // int x = Integer.parseInt(input[1]);
    // String[] sequenceList = br.readLine().split(" ");
    // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    // StringBuilder sb = new StringBuilder();
    // br.close();
    //
    // for (int i = 0; i < count; i++) {
    //   if (Integer.parseInt(sequenceList[i]) < x){
    //     sb.append(sequenceList[i]);
    //     sb.append(" ");
    //   }
    // }
    // bw.write(sb.toString());
    // bw.flush();
    // bw.close();

    // 2. System.out, StringTokenizer 조합 => 15300 kb 172 ms
    // StringTokenizer 는 레거시 이다.
    // StringTokenizer is a legacy class that is retained for compatibility reasons although
    // its use is discouraged in new code. It is recommended that anyone seeking this functionality
    // use the split method of String instead.
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");

    int N = Integer.parseInt(st.nextToken());
    int X = Integer.parseInt(st.nextToken());

    StringBuilder sb = new StringBuilder();

    st = new StringTokenizer(br.readLine(), " ");

    for (int i = 0; i < N; i++) {
      int value = Integer.parseInt(st.nextToken());

      if (value < X)
        sb.append(value).append(' ');
    }
    System.out.println(sb);
  }
}
