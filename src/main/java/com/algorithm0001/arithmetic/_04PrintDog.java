package com.algorithm0001.arithmetic;

/*
 문제 번호 : 10172
 문제 : 개 출력
 |\_/|
 |q p|   /}
 ( 0 )"""\
 |"^"`    |
 ||_/=\\__|

 시간제한 : 1초
 메모리 제한 : 256 MB
 입력 : X
 Study Goal : 개 그림을 출력
*/
public class _04PrintDog {
  public static void main(String[] args) {
    /**
     * Escape Sequance 종류
     * \n : 개행(줄바꿈). 스크린 커서 위치를 다음줄의 처음으로 옮기,  아스키코드 : 10
     * \t : 수평탭. 스크린 커서를 다음 탭으로 옮김
     * \r : 캐리지리턴. 스크린커서의 위치를 현재 줄의 처음으로 옮긴다. 개행하지 않는다. 이 기호 다음에 오는 문자를 덮어 쒸운다. 아스키코드 : 13
     * \\ : 역슬래시 문자를 출력할때 사용.
     * \" : 큰 따옴표를 출력할때 사용
     * \' : 작은 따옴표를 출력할때 사용
     * \b : 백스페이스
    */

    System.out.println("||_/=\\\\__|");
    System.out.println("|\\_/|");
    System.out.println("|q p|   /}");
    System.out.println("( 0 )\"\"\"\\");
    System.out.println("|\"^\"`    |");
    System.out.println("||_/=\\\\__|");
  }
}
