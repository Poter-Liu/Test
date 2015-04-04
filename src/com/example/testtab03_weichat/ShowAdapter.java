package com.example.testtab03_weichat;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowAdapter extends ArrayAdapter<Show> {
	private int resourceId;

	public ShowAdapter(Context context, int textViewResourceId,
			List<Show> objects) {
		super(context, textViewResourceId, objects);
		resourceId = textViewResourceId;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Show show = getItem(position);
		View view;

		// 阻止每次都重新加载布局 添加重复内容 -> 同时也提升ListView的运行效率
		ViewHolder viewHolder;
		if (convertView == null) {
			view = LayoutInflater.from(getContext()).inflate(resourceId, null);
			viewHolder = new ViewHolder();
			viewHolder.itemView = (TextView) view.findViewById(R.id.item_tab1);
			viewHolder.infoView = (TextView) view.findViewById(R.id.info_tab1);
			viewHolder.imgView = (ImageView) view.findViewById(R.id.img_tab1);

			view.setTag(viewHolder);
		} else {
			view = convertView;
			viewHolder = (ViewHolder) view.getTag();
		}

		viewHolder.itemView.setText(show.getName());
		viewHolder.infoView.setText(show.getInfo());
		viewHolder.imgView.setImageResource(show.getImageId());

		return view;
	}

	class ViewHolder {
		TextView itemView;
		TextView infoView;
		ImageView imgView;
	}

}
