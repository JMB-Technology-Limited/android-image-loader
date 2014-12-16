package com.novoda.imageloader.core;

import android.graphics.Bitmap;
import android.widget.ImageView;

/**
 * This is called BEFORE the bitmap is actually placed into the imageView
 */
public interface OnImageLoadedListener {

    void onImageLoaded(ImageView imageView, Bitmap bitmap);
}
