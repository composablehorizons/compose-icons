package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HandSpock: ImageVector
    get() {
        if (_HandSpock != null) return _HandSpock!!
        
        _HandSpock = ImageVector.Builder(
            name = "hand-spock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(510.9005f, 145.27026f)
                lineTo(442.604f, 432.0939f)
                arcTo(103.99507f, 103.99507f, 0f, false, true, 341.43744f, 512f)
                horizontalLineTo(214.074f)
                arcToRelative(135.96968f, 135.96968f, 0f, false, true, -93.18489f, -36.95291f)
                lineTo(12.59072f, 373.12723f)
                arcToRelative(39.992f, 39.992f, 0f, false, true, 54.8122f, -58.24988f)
                lineToRelative(60.59342f, 57.02528f)
                verticalLineToRelative(0f)
                arcToRelative(283.2485f, 283.2485f, 0f, false, false, -11.6703f, -80.46734f)
                lineTo(73.63726f, 147.3601f)
                arcToRelative(40.00575f, 40.00575f, 0f, true, true, 76.71833f, -22.7187f)
                lineToRelative(37.15458f, 125.39477f)
                arcToRelative(8.33113f, 8.33113f, 0f, false, false, 16.05656f, -4.4414f)
                lineTo(153.26183f, 49.95406f)
                arcTo(39.99638f, 39.99638f, 0f, true, true, 230.73015f, 30.0166f)
                lineToRelative(56.09491f, 218.15825f)
                arcToRelative(10.42047f, 10.42047f, 0f, false, false, 20.30018f, -0.501f)
                lineTo(344.80765f, 63.96966f)
                arcToRelative(40.052f, 40.052f, 0f, false, true, 51.30245f, -30.0893f)
                curveToRelative(19.86073f, 6.2998f, 30.86262f, 27.67378f, 26.67564f, 48.08487f)
                lineToRelative(-33.83869f, 164.966f)
                arcToRelative(7.55172f, 7.55172f, 0f, false, false, 14.74406f, 3.2666f)
                lineToRelative(29.3973f, -123.45874f)
                arcToRelative(39.99414f, 39.99414f, 0f, true, true, 77.81208f, 18.53121f)
                close()
            }
        }.build()
        
        return _HandSpock!!
    }

private var _HandSpock: ImageVector? = null

