package com.zhangteng.videopicker.imageloader;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.zhangteng.videopicker.R;

/**
 * Created by swing on 2018/4/18.
 */
public class GlideImageLoader implements ImageLoader {
    @Override
    public void loadImage(Context context, ImageView imageView, String uri) {
        Glide.with(context)
                .load(uri)
                .placeholder(R.mipmap.video_picker_photo)
                .centerCrop()
                .into(imageView);
    }
}
