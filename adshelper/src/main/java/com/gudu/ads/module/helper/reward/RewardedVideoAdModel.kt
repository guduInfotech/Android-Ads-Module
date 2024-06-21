package com.gudu.ads.module.helper.reward

import com.gudu.ads.module.helper.AdMobAdsListener
import com.google.android.gms.ads.rewarded.RewardedAd

data class RewardedVideoAdModel(
    var rewardedAd: RewardedAd? = null,
    var adsID: String = "",
    var listener: AdMobAdsListener? = null,
    var isAdLoadingRunning: Boolean = false
)
