package com.example.testtab03_weichat;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

//���� ���� ��Ƭ
public class FrdFragment extends Fragment {

	private ListView listView2;
	private List<Show> frd_showlist = new ArrayList<Show>();

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
		View view = inflater.inflate(R.layout.tab02, container, false);
		return view;
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		final MainActivity activity2 = (MainActivity) getActivity();
		listView2 = (ListView) activity2.findViewById(R.id.listview_tab2);

//		ititShow();
		ShowAdapter adapter = new ShowAdapter(activity2,
				R.layout.show_item_tab1, frd_showlist);
		listView2.setAdapter(adapter);
		
		final Intent intent=new Intent(activity2, Person_info.class);
		
		listView2.setOnItemClickListener(new OnItemClickListener() {

			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				//ͨ��position �����жϳ��û��������һ������
				Show show=frd_showlist.get(position);
				startActivity(intent);
			}
		});

		// Button button1=(Button) activity.findViewById(R.id.button1_tab2);
		// button1.setOnClickListener(new OnClickListener() {
		// public void onClick(View v) {
		// // TODO Auto-generated method stub
		// // Toast.makeText(activity, "������", 1).show();
		// Log.d("tag", "������Tab2");
		// Toast.makeText(activity, "������Tab2", 1).show();
		// }
		// });
	}

	private void ititShow() {
		Show item1 = new Show("����1","Poter_Liu");
		frd_showlist.add(item1);

		Show item2 = new Show("����2",R.drawable.afj);
		frd_showlist.add(item2);

		Show item3 = new Show("����3","MrLiu",R.drawable.afj);
		frd_showlist.add(item3);

		Show item4 = new Show("����4");
		frd_showlist.add(item4);
	}

}
