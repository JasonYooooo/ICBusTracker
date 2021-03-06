package com.tetrahedronTech.ICBusTracker;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class listViewTwoPartsImageAdapter extends ArrayAdapter<String>{
	
	//values contains the data you want to display in a list
	private final Context context;
	private final List<String> values;
	
	//a custom adapter
	public listViewTwoPartsImageAdapter(Context listFragment, List<String> values) {
		super(listFragment, R.layout.listview_two_parts_image, values);
		this.context = listFragment;
		this.values = values;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		//inflate the layout, and find a specific view by id
		LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView=inflater.inflate(R.layout.listview_two_parts_image, parent, false);
		TextView textView1=(TextView) rowView.findViewById(R.id.listview_two_parts_image_textView);
		//TextView textView2=(TextView) rowView.findViewById(R.id.listview_stops_textView2);
		//ImageView imageView=(ImageView) rowView.findViewById(R.id.listview_stops_textView3);
		
		//set what you want to display in the view
		textView1.setText(values.get(position));

		return rowView;
	}
}
