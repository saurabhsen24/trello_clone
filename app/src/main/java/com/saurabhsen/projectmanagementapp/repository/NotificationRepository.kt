package com.saurabhsen.projectmanagementapp.repository

import com.saurabhsen.projectmanagementapp.api.RetrofitInstance
import com.saurabhsen.projectmanagementapp.models.PushNotification

class NotificationRepository {
    suspend fun postNotification(notification: PushNotification) = RetrofitInstance.api.postNotification(notification)
}