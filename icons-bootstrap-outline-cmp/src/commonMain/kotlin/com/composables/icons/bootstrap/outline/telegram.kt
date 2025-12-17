package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Telegram: ImageVector
    get() {
        if (_Telegram != null) return _Telegram!!
        
        _Telegram = ImageVector.Builder(
            name = "telegram",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 8f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveTo(8.287f, 5.906f)
                quadToRelative(-1.168f, 0.486f, -4.666f, 2.01f)
                quadToRelative(-0.567f, 0.225f, -0.595f, 0.442f)
                curveToRelative(-0.03f, 0.243f, 0.275f, 0.339f, 0.69f, 0.47f)
                lineToRelative(0.175f, 0.055f)
                curveToRelative(0.408f, 0.133f, 0.958f, 0.288f, 1.243f, 0.294f)
                quadToRelative(0.39f, 0.01f, 0.868f, -0.32f)
                quadToRelative(3.269f, -2.206f, 3.374f, -2.23f)
                curveToRelative(0.05f, -0.012f, 0.12f, -0.026f, 0.166f, 0.016f)
                reflectiveCurveToRelative(0.042f, 0.12f, 0.037f, 0.141f)
                curveToRelative(-0.03f, 0.129f, -1.227f, 1.241f, -1.846f, 1.817f)
                curveToRelative(-0.193f, 0.18f, -0.33f, 0.307f, -0.358f, 0.336f)
                arcToRelative(8f, 8f, 0f, false, true, -0.188f, 0.186f)
                curveToRelative(-0.38f, 0.366f, -0.664f, 0.64f, 0.015f, 1.088f)
                curveToRelative(0.327f, 0.216f, 0.589f, 0.393f, 0.85f, 0.571f)
                curveToRelative(0.284f, 0.194f, 0.568f, 0.387f, 0.936f, 0.629f)
                quadToRelative(0.14f, 0.092f, 0.27f, 0.187f)
                curveToRelative(0.331f, 0.236f, 0.63f, 0.448f, 0.997f, 0.414f)
                curveToRelative(0.214f, -0.02f, 0.435f, -0.22f, 0.547f, -0.82f)
                curveToRelative(0.265f, -1.417f, 0.786f, -4.486f, 0.906f, -5.751f)
                arcToRelative(1.4f, 1.4f, 0f, false, false, -0.013f, -0.315f)
                arcToRelative(0.34f, 0.34f, 0f, false, false, -0.114f, -0.217f)
                arcToRelative(0.53f, 0.53f, 0f, false, false, -0.31f, -0.093f)
                curveToRelative(-0.3f, 0.005f, -0.763f, 0.166f, -2.984f, 1.09f)
            }
        }.build()
        
        return _Telegram!!
    }

private var _Telegram: ImageVector? = null

