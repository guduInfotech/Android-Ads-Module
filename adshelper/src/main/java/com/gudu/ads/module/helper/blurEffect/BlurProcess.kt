package com.gudu.ads.module.helper.blurEffect

import android.graphics.Bitmap

interface BlurProcess {
    fun blur(original: Bitmap, radius: Float): Bitmap?
}