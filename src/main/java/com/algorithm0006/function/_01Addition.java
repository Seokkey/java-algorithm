package com.algorithm0006.function;

import java.util.Arrays;

/*
 문제 번호 : 15596번
 문제 :
  정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
  작성해야 하는 함수는 다음과 같다.
  Java: long sum(int[] a); (클래스 이름: Test)
  a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
  리턴값: a에 포함되어 있는 정수 n개의 합
 시간제한 : 0.1 초
 메모리 제한 : 512 MB
 입력 : -
 제한 : -
 Study Goal :
  정수 n개가 주어졌을 때, n개의 합을 구하는 함수 작성
*/
public class _01Addition {
  public static void main(String[] a) {
    System.out.println(sum(new int[] {1, 1, 1, 1}));
  }

  private static long sum(int[] a) {
    // 1. for => 422916 kb	28ms
    // long sum = 0;
    // for (int n : a) {
    //   sum += n;
    // }
    // return sum;

    // 2. Stream sum() => 425036 kb	180ms
    // return Arrays.stream(a).mapToLong(value -> value).sum();

    // 3. Stream reduce() => 	424660 kb	184 ms
    return Arrays.stream(a).mapToLong(value -> value).reduce(0, (pre, next) -> pre + next);
  }
}
