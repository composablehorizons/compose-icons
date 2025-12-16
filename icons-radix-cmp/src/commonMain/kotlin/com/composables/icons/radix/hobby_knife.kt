package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.HobbyKnife: ImageVector
    get() {
        if (_HobbyKnife != null) return _HobbyKnife!!
        
        _HobbyKnife = ImageVector.Builder(
            name = "hobby-knife",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.225f, 13.918f)
                curveTo(12.419f, 14.046f, 12.6831f, 14.0243f, 12.8539f, 13.8535f)
                lineTo(14.3539f, 12.3535f)
                lineTo(14.4183f, 12.2754f)
                curveTo(14.5281f, 12.1091f, 14.5281f, 11.8909f, 14.4183f, 11.7246f)
                lineTo(14.3539f, 11.6465f)
                lineTo(8.60389f, 5.8965f)
                curveTo(8.57262f, 5.86523f, 8.53689f, 5.84063f, 8.50038f, 5.81935f)
                verticalLineTo(5.50002f)
                curveTo(8.50038f, 5.35911f, 8.44059f, 5.22466f, 8.33631f, 5.1299f)
                lineTo(2.93592f, 0.229508f)
                curveTo(2.76679f, 0.0761776f, 2.51513f, 0.056922f, 2.32459f, 0.182633f)
                curveTo(2.13397f, 0.308725f, 2.05225f, 0.548791f, 2.12733f, 0.764665f)
                lineTo(4.52772f, 7.66408f)
                lineTo(4.55897f, 7.73634f)
                curveTo(4.64495f, 7.89691f, 4.81408f, 8f, 5.00038f, 8.00002f)
                horizontalLineTo(6.31874f)
                curveTo(6.34005f, 8.03673f, 6.36542f, 8.07209f, 6.39686f, 8.10353f)
                lineTo(12.1469f, 13.8535f)
                lineTo(12.225f, 13.918f)
                close()
                moveTo(3.7162f, 2.28908f)
                lineTo(7.50038f, 5.7217f)
                verticalLineTo(5.79298f)
                lineTo(6.29334f, 7.00002f)
                horizontalLineTo(5.35487f)
                lineTo(3.7162f, 2.28908f)
                close()
                moveTo(7.45741f, 7.75002f)
                lineTo(8.25038f, 6.95705f)
                lineTo(13.2933f, 12f)
                lineTo(12.5004f, 12.793f)
                lineTo(7.45741f, 7.75002f)
                close()
            }
        }.build()
        
        return _HobbyKnife!!
    }

private var _HobbyKnife: ImageVector? = null

