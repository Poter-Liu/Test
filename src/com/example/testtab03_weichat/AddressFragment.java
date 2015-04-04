package com.example.testtab03_weichat;


import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

//定义 发现  碎片
public class AddressFragment extends Fragment implements OnItemClickListener {
	
	private ListView listView3;
	private List<Show> address_showlist = new ArrayList<Show>();

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
		View view = inflater.inflate(R.layout.tab03, container, false);
		return view;
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		final MainActivity activity3=(MainActivity) getActivity();
		
		listView3 = (ListView) activity3.findViewById(R.id.listview_tab3);

//		ititShow();
		ShowAdapter adapter = new ShowAdapter(activity3,
				R.layout.show_item_tab1, address_showlist);
		listView3.setAdapter(adapter);
		
		listView3.setOnItemClickListener(this);
		
//		Button button1=(Button) activity.findViewById(R.id.button1_tab3);
//		button1.setOnClickListener(new OnClickListener() {
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
////				Toast.makeText(activity, "哈哈哈", 1).show();
//				Log.d("tag", "这里是Tab3");
//				Toast.makeText(activity, "我终于弄到你了", 1).show();
//			}
//		});
//		Button button2=(Button) activity.findViewById(R.id.button2_tab3);
//		button2.setOnClickListener(new OnClickListener() {
//			@Override
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				Toast.makeText(activity, "这里是Tab2,不然呢？", 1).show();
//			}
//		});
	}
	
	private void ititShow() {
		Show item1 = new Show("朋友圈");
		address_showlist.add(item1);

		Show item2 = new Show("扫一扫");
		address_showlist.add(item2);

		Show item3 = new Show("摇一摇");
		address_showlist.add(item3);

		Show item4 = new Show("附近的人");
		address_showlist.add(item4);

		Show item5 = new Show("漂流瓶");
		address_showlist.add(item5);

		Show item6 = new Show("购物");
		address_showlist.add(item6);

		Show item7 = new Show("游戏");
		address_showlist.add(item7);
	}
	
	//响应每列的点击事件
		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,long id) {
			//通过position 参数判断出用户点击了哪一个子项
			Show show=address_showlist.get(position);
			String str=show.getName();
			
			if(str.equals("朋友圈")){
				Toast.makeText(getActivity(), "朋友圈", 1).show();
			}
			else if(str.equals("扫一扫")){
				Toast.makeText(getActivity(), "扫一扫", 1).show();
			}
			else if(str.equals("摇一摇")){
				Toast.makeText(getActivity(), "摇一摇", 1).show();
			}
			else if(str.equals("附近的人")){
				Toast.makeText(getActivity(), "附近的人", 1).show();
			}
			else if(str.equals("漂流瓶")){
				Toast.makeText(getActivity(), "漂流瓶", 1).show();
			}
			else if(str.equals("购物")){
				Toast.makeText(getActivity(), "购物", 1).show();
			}
			else if(str.equals("游戏")){
				Toast.makeText(getActivity(), "游戏", 1).show();
			}
		}

}
