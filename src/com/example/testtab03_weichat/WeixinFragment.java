package com.example.testtab03_weichat;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;

//定义 微信 碎片
public class WeixinFragment extends Fragment implements OnItemClickListener {

	private ListView listView1;
	private List<Show> weixin_showlist = new ArrayList<Show>();

	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);
		
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		ititShow();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
//		if (savedInstanceState == null) {
//		    getFragmentManager().beginTransaction().add(android.R.id.content,new UIFragment()).commit();
//		}
		
		View view = inflater.inflate(R.layout.tab01, container, false);
		return view;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		final MainActivity activity1 = (MainActivity) getActivity();
		listView1 = (ListView) activity1.findViewById(R.id.listview_tab1);

//		ititShow();
		
		ShowAdapter adapter = new ShowAdapter(activity1,R.layout.show_item_tab1, weixin_showlist);
		listView1.setAdapter(adapter);
		
		final Intent intent=new Intent(activity1, ChatActivity.class);
		
		Show show=new Show(null);
		show.getName();
		
		listView1.setOnItemClickListener(this);
		listView1.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
				//通过position 参数判断出用户点击了哪一个子项
				Show show=weixin_showlist.get(position);
				startActivity(intent);
			}
		});

		// button1.setOnClickListener(new OnClickListener() {
		// public void onClick(View v) {
		// // Toast.makeText(activity, "这里是Tab1", 1).show();
		// String str=editText1.getText().toString();
		// Toast.makeText(activity, str, 1).show();
		// }
		// });

		// FrdFragment fragment=getFragmentManager().findFragmentById(R.id.)
	}

	//初始化每一列内容
	private void ititShow() {
		Show item1 = new Show("張三","哈哈哈哈哈哈");
		weixin_showlist.add(item1);

		Show item2 = new Show("李四","今天中了500萬，太高興了,哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈");
		weixin_showlist.add(item2);

		Show item3 = new Show("王五","你好",R.drawable.a6b);
		weixin_showlist.add(item3);
	}

	//响应每列的点击事件
	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,long id) {
		Show show=weixin_showlist.get(position);
		String str=show.getName();
	}

}
