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

//���� ����  ��Ƭ
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
////				Toast.makeText(activity, "������", 1).show();
//				Log.d("tag", "������Tab3");
//				Toast.makeText(activity, "������Ū������", 1).show();
//			}
//		});
//		Button button2=(Button) activity.findViewById(R.id.button2_tab3);
//		button2.setOnClickListener(new OnClickListener() {
//			@Override
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				Toast.makeText(activity, "������Tab2,��Ȼ�أ�", 1).show();
//			}
//		});
	}
	
	private void ititShow() {
		Show item1 = new Show("����Ȧ");
		address_showlist.add(item1);

		Show item2 = new Show("ɨһɨ");
		address_showlist.add(item2);

		Show item3 = new Show("ҡһҡ");
		address_showlist.add(item3);

		Show item4 = new Show("��������");
		address_showlist.add(item4);

		Show item5 = new Show("Ư��ƿ");
		address_showlist.add(item5);

		Show item6 = new Show("����");
		address_showlist.add(item6);

		Show item7 = new Show("��Ϸ");
		address_showlist.add(item7);
	}
	
	//��Ӧÿ�еĵ���¼�
		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,long id) {
			//ͨ��position �����жϳ��û��������һ������
			Show show=address_showlist.get(position);
			String str=show.getName();
			
			if(str.equals("����Ȧ")){
				Toast.makeText(getActivity(), "����Ȧ", 1).show();
			}
			else if(str.equals("ɨһɨ")){
				Toast.makeText(getActivity(), "ɨһɨ", 1).show();
			}
			else if(str.equals("ҡһҡ")){
				Toast.makeText(getActivity(), "ҡһҡ", 1).show();
			}
			else if(str.equals("��������")){
				Toast.makeText(getActivity(), "��������", 1).show();
			}
			else if(str.equals("Ư��ƿ")){
				Toast.makeText(getActivity(), "Ư��ƿ", 1).show();
			}
			else if(str.equals("����")){
				Toast.makeText(getActivity(), "����", 1).show();
			}
			else if(str.equals("��Ϸ")){
				Toast.makeText(getActivity(), "��Ϸ", 1).show();
			}
		}

}
