package com.suek.ex24listviewcustom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    // Member class 를 .java 문서에 만들고 나서,
    // 1) 대량의 데이터 (Member)객체 생성하기
    ArrayList<Member> members= new ArrayList<>();

    // 2)
    MyAdapter adapter;

    // 6)
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 1.1) 대량의 데이터 추가작업
        members.add(new Member("전현무", "대한민국", R.drawable.flag_korea));
        members.add(new Member("기욤패트리", "캐나다", R.drawable.flag_canada));
        members.add(new Member("장위안", "중국", R.drawable.flag_china));
        members.add(new Member("샘오취리", "가나", R.drawable.flag_ghana));
        members.add(new Member("타일러", "미국", R.drawable.flag_usa));
        members.add(new Member("전현무", "대한민국", R.drawable.flag_korea));
        members.add(new Member("기욤패트리", "캐나다", R.drawable.flag_canada));
        members.add(new Member("장위안", "중국", R.drawable.flag_china));
        members.add(new Member("샘오취리", "가나", R.drawable.flag_ghana));
        members.add(new Member("타일러", "미국", R.drawable.flag_usa));

        // 2.1) 대량의 데이터를 적합한 뷰들로 만들어주는 객체
        LayoutInflater inflater= getLayoutInflater();    // MyAdopter.java 4) 참고
        adapter= new MyAdapter(members, inflater); //대량의 데이터들, LayoutInflater

        listView= findViewById(R.id.listview);

        // 6)
        // 리스트뷰에 아답터 설정
        listView.setAdapter(adapter);

        // 8) 리스트뷰에 아이템 클릭에 반응하는 리스너 추가
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, members.get(position).name, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
