package com.novoda.imageloader.core;

import android.graphics.Bitmap;
import android.widget.ImageView;

public interface OnImageLoadedListener {

    void onImageLoaded(ImageView imageView, Bitmap bitmap);
}
