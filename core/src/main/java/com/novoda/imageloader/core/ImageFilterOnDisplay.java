package com.novoda.imageloader.core;

import android.content.Context;
import android.graphics.Bitmap;

public interface ImageFilterOnDisplay {


	public Bitmap applyFilter(Context context, Bitmap image);

}
