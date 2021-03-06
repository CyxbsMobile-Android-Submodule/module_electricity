package com.mredrock.cyxbs.discover.electricity.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mredrock.cyxbs.common.service.ServiceManager
import com.mredrock.cyxbs.common.service.account.IAccountService
import com.mredrock.cyxbs.common.ui.BaseFeedFragment
import com.mredrock.cyxbs.electricity.R
import kotlinx.android.synthetic.main.electricity_discover_feed_unbound.view.*

class ElectricityFeedUnboundAdapter : BaseFeedFragment.Adapter() {
    override fun onCreateView(context: Context, parent: ViewGroup): View =
            LayoutInflater.from(context).inflate(R.layout.electricity_discover_feed_unbound, parent, false).apply {
                if (!ServiceManager.getService(IAccountService::class.java).getVerifyService().isLogin())
                    this.tv_electricity_no_account.text = context.getString(R.string.electricity_ask_login_string)
            }
}