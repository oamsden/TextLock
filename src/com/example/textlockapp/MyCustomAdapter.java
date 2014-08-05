package com.example.textlockapp;


import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


public class MyCustomAdapter extends BaseAdapter {
 
        private static final int TYPE_SENT = 0;
        private static final int TYPE_REC = 1;
        private static final int TYPE_MAX_COUNT = TYPE_REC + 1;
 
        private ArrayList<ArrayList<String>> mData = new ArrayList<ArrayList<String>>();
        private LayoutInflater mInflater;
 
        public MyCustomAdapter(Context context) {
            mInflater = LayoutInflater.from(context);
        }
 
        public void addMessage(final ArrayList<String> message) {
            mData.add(message);
            notifyDataSetChanged();
        }
        
        public void removeMessage(int position) {
        	mData.remove(position);
        	notifyDataSetChanged();
        }
 
        @Override
        public int getItemViewType(int position) {
            if (mData.get(position).get(0) == "0") {
            	return TYPE_SENT;
            }
            else {
            	return TYPE_REC;
            }
        }
 
        @Override
        public int getViewTypeCount() {
            return TYPE_MAX_COUNT;
        }
 
        @Override
        public int getCount() {
            return mData.size();
        }
 
        @Override
        public String getItem(int position) {
            return mData.get(position).get(1);
        }
 
        @Override
        public long getItemId(int position) {
            return position;
        }
 
        static class ViewHolder {
        	public TextView text;
        }

        
        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
 
            ViewHolder holder = null;
            int type = getItemViewType(position);
 
            if (convertView == null) {
                holder = new ViewHolder();
                switch (type) {
                    case TYPE_SENT:
                        convertView = mInflater.inflate(R.layout.sent_layout, parent, false);
                        holder.text = (TextView)convertView.findViewById(R.id.sent_message);
                        break;
                    case TYPE_REC:
                        convertView = mInflater.inflate(R.layout.rec_layout, parent, false);
                        holder.text = (TextView)convertView.findViewById(R.id.rec_message);
                        break;
                }
               
                convertView.setTag(holder);
            }
            
            else {
            	holder = (ViewHolder)convertView.getTag();
            }
            
            holder.text.setText(mData.get(position).get(1));
            
            return convertView;
        }
}
	
