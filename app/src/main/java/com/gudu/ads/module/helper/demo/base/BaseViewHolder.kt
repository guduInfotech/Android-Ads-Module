package com.gudu.ads.module.helper.demo.base

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding

abstract class BaseViewHolder<VB: ViewBinding>(val fBinding: VB): RecyclerView.ViewHolder(fBinding.root)