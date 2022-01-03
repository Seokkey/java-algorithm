package com.algorithm0004.whilestatement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 문제 번호 : 1110번
 문제 :
  0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다.
  먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다.
  그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.
  26부터 시작한다. 2+6 = 8이다.
  새로운 수는 68이다. 6+8 = 14이다.
  새로운 수는 84이다. 8+4 = 12이다.
  새로운 수는 42이다. 4+2 = 6이다.
  새로운 수는 26이다.
  위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
  N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
 시간제한 : 2 초
 메모리 제한 : 128 MB
 입력 :
  첫째 줄에 N이 주어진다. N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.
 제한 :
 Study Goal :
  첫째 줄에 N의 사이클 길이를 출력한다.
*/
public class _03AdditionCycle {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int count = 0;

    // 1. StringBuilder로 앞에 0을 붙여서 짠거 => 14212 kb	128ms
    // StringBuilder sb = new StringBuilder();
    // String input = br.readLine();
    // String result = input;
    // if (input.length() == 1) {
    //   input = sb.append("0").append(input).toString();
    //   result = input;
    //   sb.setLength(0);
    // }
    //
    // while (true) {
    //   int a = result.charAt(0)-'0';
    //   int b = result.charAt(1)-'0';
    //   String sum = Integer.toString(a+b);
    //   result = sb.append(b).append(sum.charAt(sum.length()-1)).toString();
    //   sb.setLength(0);
    //   count ++;
    //   if (result.equals(input)) {
    //     break;
    //   }
    // }

    // 2. 앞에 0을 붙일 필요 없이 1의 자리를 10의 자리로만 만들어주면 됨.
    int input = Integer.parseInt(br.readLine());
    int result = input;
    do {
      // xx%10 = 1의 자리 구하기
      // xx/10 = 10의 자리 구하기
      result = ((result % 10) * 10) + (((result / 10) + (result % 10)) % 10);
      count++;
    } while (result != input);

    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    bw.write(Integer.toString(count));
    bw.flush();
    bw.close();
  }
}
