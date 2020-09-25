package com.suek.ex24listviewcustom;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;



// 3)  MyAdapter 뷰가 할 기능 4개
public class MyAdapter extends BaseAdapter {

    // 4.1) 멤버변수 생성
    ArrayList<Member> members;

    // 5)
    LayoutInflater inflater;



    // 3.1) 생성자메소드: 대량의 데이터를 전달받기
    public MyAdapter(ArrayList<Member> members, LayoutInflater inflater){   //(ArrayList<Member> members)= 파라미터.- members 전달받기-> MainActivity.java 에서
        // 4) 전달받은 데이터를 멤버변수에 대입
        this.members= members;
        // 5)
        this.inflater= inflater;
    }


    // 4.1) 이 아답터가 만들어야 하는 총 아이템 개수를 리턴하는 메소드
    @Override
    public int getCount() {
        return members.size();       //member 의 총 개수 (arraylist 라 size())
    }


    // 4.2) 포지션 position 번째의 데이터를 리턴하는 기능
    @Override
    public Object getItem(int position) {
        //return members.get(position);  //굳이 식별자 필요없음
        return position;
    }

    // 4.3)
    @Override
    public long getItemId(int position) {
        return position;
    }

    // // 4.4) 뷰를 만들어서 '아답터뷰'에게 리턴하는 메소드
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // 4.4.1)  new View 뷰만들기   (현수막 만드는 작업)

        // 6) 재활용할 뷰가 없냐?? [이 메소드의 2번재 파라미터= View convertView]
        if(convertView==null){
            convertView= inflater.inflate(R.layout.listview_item, null);
        }

        //         res/layout/listview_item.xml 문서를 읽어와서
        //         View 객체로 만들어주는(부풀리다) 객체(LayoutInflater)를 이용하여 View 생성--->  LayoutInflater 는 운영체제(MainActivity, context)가 가지고 있는 기능


        // 4.4.2)  binding 뷰안에 값들 설정하기

        // 7) 만들어진 뷰(convertView)안에 있는 View 들을 참조하기
        ImageView iv= convertView.findViewById(R.id.iv);
        TextView tvName= convertView.findViewById(R.id.tv_name);
        TextView tvNation= convertView.findViewById(R.id.tv_nation);

        Member member= members.get(position);
        iv.setImageResource(member.imgId);
        tvName.setText(member.name);
        tvNation.setText(member.nation);


        return convertView;
    }
}
