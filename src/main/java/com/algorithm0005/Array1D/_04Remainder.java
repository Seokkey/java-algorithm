package com.algorithm0005.Array1D;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;

/*
 문제 번호 : 3052번
 문제 :
  두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다.
  예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
  수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다.
  그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
 시간제한 : 1 초
 메모리 제한 : 128 MB
 입력 :
  첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
 제한 :
 Study Goal :
  첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
*/
public class _04Remainder {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    // 1. HashSet 사용 => 14120 kb 120 ms
    // HashSet 은 자바 Collection 중 Set 의 파생클래스
    // HashSet 은 중복되는 원소를 넣을 경우 하나만 저장한다.
    // HashSet 은 순서 개념이 없다. 따라서 Collections.sort() 메소드를 사용할 수 없다.
    // HashSet<Integer> resultSet = new HashSet<>();
    // for (int i = 0; i < 10; i ++){
    //   resultSet.add(Integer.parseInt(br.readLine()) % 42);
    // }
    // bw.write(Integer.toString(resultSet.size()));

    // 2. 배열 사용 	14164 kb	120 ms
    // 나머지가 나올 수 있는 수는 0~41 이므로 길이가 42 인 boolean 배열을 생성
    boolean[] arr = new boolean[42];
    for(int i = 0 ; i < 10 ; i++) {
      // 나머지 값에 해당하는 인덱스에 true 값 지정
      arr[Integer.parseInt(br.readLine()) % 42] = true;
    }

    int count = 0;
    for(boolean value : arr) {
      if(value){
        // true 값 수 만큼 카운트
        count++;
      }
    }

    bw.write(Integer.toString(count));
    br.close();
    bw.flush();
    bw.close();
  }
}
