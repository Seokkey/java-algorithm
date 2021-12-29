package com.algorithm0001.arithmetic;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

/*
 문제 : 고양이 출력
 \    /\
  )  ( ')
 (  /  )
  \(__)|
 시간제한 : 1초
 메모리 제한 : 256 MB
 입력 : X
 Study Goal : 고양이 그림을 출력
*/
public class _03PrintCat {
  public static void main(String[] args) {
    // Escape Sequance 에 주의
    // Escape Sequance는 백슬래시(\) + 문자

    // 1.System.out.println
    System.out.println("\\    /\\");
    System.out.println(" )  ( ')");
    System.out.println("(  /  )");
    System.out.println(" \\(__)|");

    // 2.StringBuffer
    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append("\\    /\\\n");
    stringBuffer.append(" )  ( ')\n");
    stringBuffer.append("(  /  )\n");
    stringBuffer.append(" \\(__)|\n");
    System.out.println(stringBuffer);

    // 3.StringBuilder
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("\\    /\\\n");
    stringBuilder.append(" )  ( ')\n");
    stringBuilder.append("(  /  )\n");
    stringBuilder.append(" \\(__)|\n");
    System.out.println(stringBuilder);

    // 4.BufferedWriter
//    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//    bw.write("\\    /\\");
//    bw.newLine();	// 줄 구분자
//
//    bw.write(" )  ( ')");
//    bw.newLine();
//
//    bw.write("(  /  )");
//    bw.newLine();
//
//    bw.write(" \\(__)|");
//
//    bw.flush();
//    bw.close();

  }
}
