package com.jessicathornsby.gridview;

import android.widget.BaseAdapter;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ImageView;
import android.widget.GridView;


public class ImageAdapter extends BaseAdapter {
    private Context mContext;


    public Integer[] photoAlbum = {
            R.drawable.drawable1, R.drawable.drawable2, R.drawable.drawable3,
            R.drawable.drawable4, R.drawable.drawable5, R.drawable.drawable6,
            R.drawable.drawable7, R.drawable.drawable8, R.drawable.drawable9,
            R.drawable.drawable10, R.drawable.drawable11, R.drawable.drawable12,
            R.drawable.drawable13, R.drawable.drawable14, R.drawable.drawable15,};

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return photoAlbum.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(300, 300));

            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);

        } else {

            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(photoAlbum[position]);
        return imageView;


    }
}