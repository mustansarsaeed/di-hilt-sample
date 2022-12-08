package com.example.android.hilt.data

import javax.inject.Qualifier


interface LoggerDataSource {
    fun addLog(message: String);
    fun getAllLogs(callback: (List<Log>) -> Unit);
    fun removeLogs()
}