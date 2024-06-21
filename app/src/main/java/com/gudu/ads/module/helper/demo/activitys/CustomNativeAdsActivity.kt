package com.gudu.ads.module.helper.demo.activitys

import android.view.LayoutInflater
import android.view.View
import com.gudu.ads.module.helper.demo.R
import com.gudu.ads.module.helper.demo.base.BaseActivity
import com.gudu.ads.module.helper.demo.base.BaseBindingActivity
import com.gudu.ads.module.helper.demo.base.utils.getDrawableRes
import com.gudu.ads.module.helper.demo.base.utils.gone
import com.gudu.ads.module.helper.demo.databinding.ActivityCustomNativeAdsBinding
import com.gudu.ads.module.helper.NativeAdsSize
import com.gudu.ads.module.helper.interstitialad.InterstitialAdHelper
import com.gudu.ads.module.helper.interstitialad.InterstitialAdHelper.showInterstitialAd
import com.gudu.ads.module.helper.nativead.NativeAdModelHelper
import com.gudu.ads.module.helper.purchase.AdsManager

class CustomNativeAdsActivity : BaseBindingActivity<ActivityCustomNativeAdsBinding>() {


    var nativeModeHelper: NativeAdModelHelper? = null
    override fun getActivityContext(): BaseActivity {
        return this@CustomNativeAdsActivity
    }

    override fun setBinding(): ActivityCustomNativeAdsBinding {
        return ActivityCustomNativeAdsBinding.inflate(layoutInflater)
    }

    override fun initAds() {
        super.initAds()

        InterstitialAdHelper.loadAd(
            fContext = mActivity,
            onAdLoaded = {
                // Call When Open Ad Loaded Successfully
                // Perform your Action
            }
        )
        nativeModeHelper = NativeAdModelHelper((mActivity))

        nativeModeHelper?.loadNativeAdvancedAd(
            fSize = NativeAdsSize.Custom,
            fLayout = mBinding.flNativeAdPlaceHolderCustom,
            fCustomAdView = LayoutInflater.from(this).inflate(
                com.gudu.ads.module.helper.R.layout.layout_google_native_ad_custom_sample,
                null
            ),
            fCustomShimmerView = LayoutInflater.from(this).inflate(
                com.gudu.ads.module.helper.R.layout.layout_shimmer_google_native_ad_custom_sample,
                null
            ),
            isAddVideoOptions = intent?.extras?.getBoolean("is_add_video_options") ?: false,
        )
    }

    override fun initView() {
        super.initView()
        mBinding.layoutHeader.txtHeaderTitle.text = "Custom Native Ads"
        mBinding.layoutHeader.ivHeaderBack.setImageDrawable(mActivity.getDrawableRes(R.drawable.ic_new_header_back))
        mBinding.layoutHeader.ivHeaderRightIcon.gone
    }

    override fun initViewListener() {
        super.initViewListener()
        setClickListener(
            mBinding.layoutHeader.ivHeaderBack
        )
    }

    override fun onClick(v: View) {
        super.onClick(v)

        when (v) {
            mBinding.layoutHeader.ivHeaderBack -> {
                onBackPressed()
            }
        }
    }


    override fun onBackPressed() {
        mActivity.showInterstitialAd(fIsShowFullScreenNativeAd = true) { _, _ ->
            finish()
        }
    }

    override fun onResume() {
        super.onResume()
        nativeModeHelper?.manageShimmerLayoutVisibility(
            AdsManager(this).isNeedToShowAds(),
            NativeAdsSize.Custom,
            mBinding.flNativeAdPlaceHolderCustom,
            LayoutInflater.from(this).inflate(
                com.gudu.ads.module.helper.R.layout.layout_shimmer_google_native_ad_custom_sample,
                null
            ),
        )
    }
}