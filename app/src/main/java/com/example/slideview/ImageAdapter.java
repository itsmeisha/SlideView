package com.example.slideview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class ImageAdapter extends PagerAdapter {
   private Context m;
   private int[] images ={R.drawable.bts,R.drawable.bts1,R.drawable.bts2};
   ImageAdapter(Context context)
   {
       m=context;
   }
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
       ImageView image =new ImageView(m);
       image.setScaleType(ImageView.ScaleType.CENTER_CROP);
       image.setImageResource(images[position]);
       container.addView(image,0);
       return image;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ImageView)object);
    }
}
