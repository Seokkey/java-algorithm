package com.algorithm0001.arithmetic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/*
 문제 번호 : 2588
 문제 :
  (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
        472 ... (1)
      x 385 ... (2)
      -----
       2360 ... (3)
      3776  ... (4)
     1416   ... (5)
     ------
     181720 ... (6)
  (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
 시간제한 : 1 초
 메모리 제한 : 128 MB
 입력 : 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
 Study Goal : 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
*/
public class _11Multiplication2 {
  public static void main(String[] args) throws IOException {
    // 1. Scanner 문자열 입력, charAt() 활용 => 17624kb	232ms
    // Scanner in = new Scanner(System.in);
    // int a = in.nextInt();
    // String b = in.next();
    // in.close();
    // b.charAt(2) 으로 반환되는 값은 아스키코드값인 문자 (char) -'0' 으로 아스키 코드를 10진수로 변경
    // System.out.println(b.charAt(2)); // 아스키 코드
    // System.out.println((b.charAt(2) - '0')); // 10진수 변경
    // System.out.println(a * (b.charAt(2) - '0'));
    // System.out.println(a * (b.charAt(1) - '0'));
    // System.out.println(a * (b.charAt(0) - '0'));
    // System.out.println(a * Integer.parseInt(b));

    // 2. Scanner 정수 입력, modulo 연산 활용 => 17624kb	232ms
    // 일의 자리 5의 경우 385 % 10 을 해주면 10으로 나눠준 값의 나머지를 구하니 5가 반환이 될 것이다.
    // 십의자리 8은 385%100 을 해주면 85 가 나오고 이걸 10으로 나누면, 즉 85/10 을 하면 8이 반환 될 것이다.
    // 백의자리 3은 385/100 을 하면 3이 나온다.
    // Scanner in = new Scanner(System.in);
    // int a = in.nextInt();
    // int b = in.nextInt();
    // in.close();
    // System.out.println(a*(b%10));
    // System.out.println(a*(b%100/10));
    // System.out.println(a*(b/100));
    // System.out.println(a*b);

    // 3. BufferedReader, modulo 연산 활용 => 14244kb	120ms
    // Scanner 로 입력받는것과 BufferedReader 로 입력받는 것은 성능차이가 확연하게 난다.
    // 버퍼를 사용하지 않는 입력은, 키보드의 입력이 키를 누르는 즉시 바로 프로그램에 전달된다.
    // 반면 버퍼를 사용하는 입력은, 키보드의 입력이 있을 때마다 한 문자씩 버퍼로 전송한다. 버퍼가 가득 차거나 혹은 개행 문자가 나타나면 버퍼의 내용을 한 번에 프로그램에 전달한다.
    // 버퍼 사이즈도 Scanner가 1024 char인데 비해, BufferedReader는 8192 char(16,384byte) 이기 때문에 입력이 많을 때 BufferedReader가 유리
    // 또한 Scanner 자체가 입력을 받으면 구문분석을 위해 정규식을 거치게 되고 BufferedReader은 그런 특별한 구문분석이 없어서 속도차이가 발생 할 수 밖에 없다.
    // JAVA 입력 뜯어보기 :: https://st-lab.tistory.com/41
    // Scanner VS BufferedReader 비교 :: https://rlakuku-program.tistory.com/33
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // InputStreamReader :: byte Stream에서 문자열 Stream으로 변환
    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    br.close();
    // 어지간하면 StringBuilder 나 BufferedWriter 로 문자열 출력
    StringBuilder sb = new StringBuilder();
    sb.append(a * (b % 10));
    sb.append('\n');
    sb.append(a * ((b % 100) / 10));
    sb.append('\n');
    sb.append(a * (b / 100));
    sb.append('\n');
    sb.append(a * b);
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    bw.write(sb.toString());
    bw.flush();
    bw.close();
  }
}
