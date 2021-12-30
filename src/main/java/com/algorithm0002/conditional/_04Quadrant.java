package com.algorithm0002.conditional;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 문제 번호 : 14681
 문제 :
  흔한 수학 문제 중 하나는 주어진 점이 어느 사분면에 속하는지 알아내는 것이다.
  사분면은 아래 그림처럼 1부터 4까지 번호를 갖는다. "Quadrant n"은 "제 n 사분면" 이라는 뜻이다.
      Quadrant2    | Quadrant1
                   |
      B(-12,5) ⚉   | ⚉ A(12,5)
      -------------------------
      C(-12,-5)⚉   | ⚉ D(12,-5)
                   |
      Quadrant3    | Quadrant4
  예를 들어, 좌표가 (12, 5)인 점 A는 x좌표와 y좌표가 모두 양수이므로 제1사분면에 속한다.
  점 B는 x좌표가 음수이고 y좌표가 양수이므로 제2사분면에 속한다.
  점의 좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램을 작성하시오.
  단, x좌표와 y좌표는 모두 양수나 음수라고 가정한다.
 시간제한 : 1 초
 메모리 제한 : 512 MB
 입력 : 첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다. (−1000 ≤ y ≤ 1000; y ≠ 0)
 입력 예제 : 10 10
 출력 예제 : 9 25
 제한 :
 Study Goal :
  점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.
*/
public class _04Quadrant {
  public static void main(String[] args) throws IOException {
    // 1. BufferedReader, BufferedWriter => 14096 kb	124	ms
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int x = Integer.parseInt(br.readLine());
    int y = Integer.parseInt(br.readLine());
    br.close();

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    if (x > 0) {
      if (y > 0) {
        bw.write("1");
      } else {
        bw.write("4");
      }
    } else {
      if (y > 0) {
        bw.write("2");
      } else {
        bw.write("3");
      }
    }
    bw.flush();
    bw.close();
  }
}
