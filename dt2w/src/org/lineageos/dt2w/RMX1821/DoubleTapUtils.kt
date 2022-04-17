/*
 * Copyright (C) 2022 StatiX
 * SPDX-License-Identifier: GPL-2.0-only
 */

package org.lineageos.dt2w.RMX1821

import android.content.Context
import android.content.Intent
import android.os.UserHandle
import android.util.Log

object DoubleTapUtils {
    private const val TAG = "DT2WServiceRMX1821"

    fun startService(context: Context) {
        Log.d(TAG, "Starting service")
        context.startServiceAsUser(Intent(context, DoubleTapService::class.java), UserHandle.CURRENT)
    }

    private fun stopService(context: Context) {
        Log.d(TAG, "Stopping service")
        context.stopServiceAsUser(Intent(context, DoubleTapService::class.java), UserHandle.CURRENT)
    }
}  
