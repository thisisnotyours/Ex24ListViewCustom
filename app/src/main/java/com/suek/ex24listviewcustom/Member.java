package com.suek.ex24listviewcustom;

public class Member {

    // 1) Member 클래스를 만들고 클래스의 멤버변수 생성
    String name;   //전현무
    String nation; //대한민국
    int imgId;    //R.drawable.flag_Korea -> 이미지의 저장위치 (그래서 int 형임)=> R로 시작하는 것은 무조건 위치..


    // 2) 어떤 객체를 생성(new)할때 자동으로 실행되는 메소드
    //   :생성메소드
    public Member(String name, String nation, int imgid){
        // 멤버변수에 값 대입
        this.name= name;
        this.nation= nation;
        this.imgId= imgid;

    }


}
