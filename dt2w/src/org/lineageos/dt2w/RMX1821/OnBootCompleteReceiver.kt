package org.lineageos.dt2w.RMX1821

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class OnBootCompleteReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent?) {
        val sIntent = Intent(context, DT2WServiceRMX1821::class.java)
        context.startServiceAsUser(sIntent, UserHandle.CURRENT)
    }
}  
