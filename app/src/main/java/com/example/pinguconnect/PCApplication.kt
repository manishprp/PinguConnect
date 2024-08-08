package com.example.pinguconnect

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp // Here we register it at the App Level
class PCApplication : Application()