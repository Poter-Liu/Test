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
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class SettingFragment extends Fragment implements OnItemClickListener {

	private ListView listView4;
	private List<Show> setting_showlist = new ArrayList<Show>();

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
		View view = inflater.inflate(R.layout.tab04, container, false);
		return view;
	}
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		final MainActivity activity4=(MainActivity) getActivity();
		
		listView4 = (ListView) activity4.findViewById(R.id.listview_tab4);

//		ititShow();
		ShowAdapter adapter = new ShowAdapter(activity4,
				R.layout.show_item_tab1, setting_showlist);
		listView4.setAdapter(adapter);
		
		listView4.setOnItemClickListener(this);

//		editText1=(EditText) activity.findViewById(R.id.editText1_tab4);
//		Button button1=(Button) activity.findViewById(R.id.button1_tab4);
//		button1.setOnClickListener(new OnClickListener() {
//			public void onClick(View v) {
//				String str=editText1.getText().toString();
//				Toast.makeText(activity, str, 1).show();
//			}
//		});
	}
	
	private void ititShow() {
		Show item1 = new Show("自己");
		setting_showlist.add(item1);

		Show item2 = new Show("相册");
		setting_showlist.add(item2);

		Show item3 = new Show("收藏");
		setting_showlist.add(item3);

		Show item4 = new Show("钱包");
		setting_showlist.add(item4);

		Show item5 = new Show("设置");
		setting_showlist.add(item5);
	}
	
	//响应每列的点击事件
		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,long id) {
			Show show=setting_showlist.get(position);
			String str=show.getName();
			
			if(str.equals("自己")){
				Toast.makeText(getActivity(), "自己", 1).show();
			}
			else if(str.equals("相册")){
				Toast.makeText(getActivity(), "相册", 1).show();
			}
			else if(str.equals("收藏")){
				Toast.makeText(getActivity(), "收藏", 1).show();
			}
			else if(str.equals("钱包")){
				Toast.makeText(getActivity(), "钱包", 1).show();
			}
			else if(str.equals("设置")){
				Toast.makeText(getActivity(), "设置", 1).show();
			}
		}

}
