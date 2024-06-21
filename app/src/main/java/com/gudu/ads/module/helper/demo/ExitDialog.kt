package com.gudu.ads.module.helper

import android.app.Activity
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Gravity
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.Window
import com.gudu.ads.module.helper.demo.base.utils.displayWidth
import com.gudu.ads.module.helper.demo.databinding.DialogExitBinding

class ExitDialog(private val mContext: Activity): Dialog(mContext) {

    private var mBinding: DialogExitBinding

    private var onYesButtonClick: () -> Unit = {}

    init {
        requestWindowFeature(Window.FEATURE_NO_TITLE)

        mBinding = DialogExitBinding.inflate(LayoutInflater.from(context))
        setContentView(mBinding.root)

        window?.let {

            it.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            it.setLayout(
                (mContext.displayWidth * 0.90).toInt(), ViewGroup.LayoutParams.WRAP_CONTENT
            )

            it.setGravity(Gravity.CENTER)
        }

        setCancelable(false)
        setCanceledOnTouchOutside(false)

        setOnDismissListener {
            isInterstitialAdShow = false
        }

        mBinding.btnNo.setOnClickListener {
            dismiss()
        }

        mBinding.btnYes.setOnClickListener {
            onYesButtonClick.invoke()
            dismiss()
        }
    }

    fun showExitDialog(onYesButtonClick: () -> Unit) {
        if (!mContext.isFinishing && !isShowing) {
            this.onYesButtonClick = onYesButtonClick
            show()
        }
    }

}