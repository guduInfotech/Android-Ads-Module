package com.gudu.ads.module.helper.demo.activitys

import android.util.Log
import android.view.View
import com.gudu.ads.module.helper.demo.R
import com.gudu.ads.module.helper.demo.base.BaseActivity
import com.gudu.ads.module.helper.demo.base.BaseBindingActivity
import com.gudu.ads.module.helper.demo.base.utils.getDrawableRes
import com.gudu.ads.module.helper.demo.base.utils.gone
import com.gudu.ads.module.helper.demo.databinding.ActivityNativeAdsBinding
import com.gudu.ads.module.helper.NativeAdsSize
import com.gudu.ads.module.helper.interstitialad.InterstitialAdHelper
import com.gudu.ads.module.helper.interstitialad.InterstitialAdHelper.showInterstitialAd
import com.gudu.ads.module.helper.nativead.NativeAdModelHelper
import com.gudu.ads.module.helper.purchase.AdsManager

class NativeAdsActivity : BaseBindingActivity<ActivityNativeAdsBinding>() {
    var nativeModeHelper: NativeAdModelHelper? = null
    var nativeModeHelper1: NativeAdModelHelper? = null
    var nativeModeHelper2: NativeAdModelHelper? = null

    override fun getActivityContext(): BaseActivity {
        return this@NativeAdsActivity
    }

    override fun setBinding(): ActivityNativeAdsBinding {
        return ActivityNativeAdsBinding.inflate(layoutInflater)
    }

    override fun initAds() {
        super.initAds()

        InterstitialAdHelper.loadAd(fContext = mActivity)
//        nativeModeHelper= NativeAdModelHelper(this)
//        nativeModeHelper?.loadNativeAdvancedAd(
//            fSize = NativeAdsSize.Big,
//            fLayout = mBinding.flNativeAdPlaceHolderBig,
//            isAddVideoOptions = intent?.extras?.getBoolean("is_add_video_options") ?: false,
//            onAdLoaded = {
//                Log.e(TAG, "gudu initAds: onAdLoaded: Load Native Ad -> Big")
//            },
//            onAdClosed = {
//                Log.e(TAG, "gudu initAds: onAdClosed: Load Native Ad -> Big")
//            },
//            onAdFailed = {
//                Log.e(TAG, "gudu initAds: onAdFailed: Load Native Ad -> Big")
//            }
//        )
        nativeModeHelper2 = NativeAdModelHelper(this)
        nativeModeHelper2?.loadNativeAdvancedAd(
            fSize = NativeAdsSize.VOICE_GPS,
            fLayout = mBinding.flNativeAdPlaceHolderVoiceGps,
            isNeedToShowShimmerLayout = true,
            topMargin = 10,
            startMargin = 100,
            bottomMargin = 50,
            endMargin = 50,
            isAddVideoOptions = intent?.extras?.getBoolean("is_add_video_options") ?: false,
            onAdLoaded = {
                Log.e(TAG, "gudu initAds: onAdLoaded: Load Native Ad -> Big")
            },
            onAdClosed = {
                Log.e(TAG, "gudu initAds: onAdClosed: Load Native Ad -> Big")
            },
            onAdFailed = {
                Log.e(TAG, "gudu initAds: onAdFailed: Load Native Ad -> Big")
            }
        )
        nativeModeHelper1 = NativeAdModelHelper((mActivity))
        nativeModeHelper1?.loadNativeAdvancedAd(
            fSize = NativeAdsSize.Medium,
            fLayout = mBinding.flNativeAdPlaceHolderMedium,
            isAddVideoOptions = intent?.extras?.getBoolean("is_add_video_options") ?: false,
            onAdLoaded = {
                Log.e(TAG, "gudu initAds: onAdLoaded: Load Native Ad -> Medium")
            },
            onAdClosed = {
                Log.e(TAG, "gudu initAds: onAdClosed: Load Native Ad -> Medium")
            },
            onAdFailed = {
                Log.e(TAG, "gudu initAds: onAdFailed: Load Native Ad -> Medium")
            }
        )

//        NativeAdvancedModelHelper(mActivity).loadNativeAdvancedAd(
//            NativeAdsSize.Big,
//            mBinding.flNativeAdPlaceHolderBig,
//            isAddVideoOptions = intent?.extras?.getBoolean("is_add_video_options") ?: false,
//        )
//
//        NativeAdvancedModelHelper(mActivity).loadNativeAdvancedAd(
//            NativeAdsSize.Medium,
//            mBinding.flNativeAdPlaceHolderMedium,
//            isAddVideoOptions = intent?.extras?.getBoolean("is_add_video_options") ?: false,
//        )
    }

    override fun initView() {
        super.initView()
        mBinding.layoutHeader.txtHeaderTitle.text = "Native Ads"
        mBinding.layoutHeader.ivHeaderBack.setImageDrawable(mActivity.getDrawableRes(R.drawable.ic_new_header_back))
        mBinding.layoutHeader.ivHeaderRightIcon.gone
    }


    override fun onResume() {
        super.onResume()
//        nativeModeHelper?.manageShimmerLayoutVisibility(
//            AdsManager(this).isNeedToShowAds(),
//            NativeAdsSize.Medium,
//            mBinding.flNativeAdPlaceHolderMedium,
//            null,
//            true
//        )
        nativeModeHelper1?.manageShimmerLayoutVisibility(
            AdsManager(this).isNeedToShowAds(),
            NativeAdsSize.VOICE_GPS,
            mBinding.flNativeAdPlaceHolderMedium
        )
        nativeModeHelper2?.manageShimmerLayoutVisibility(
            AdsManager(this).isNeedToShowAds(),
            NativeAdsSize.Medium,
            mBinding.flNativeAdPlaceHolderVoiceGps
        )
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
        mActivity.showInterstitialAd { _, _ ->
            finish()
        }
    }
}