package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Wifi_2_bar: ImageVector
    get() {
        if (_Wifi_2_bar != null) return _Wifi_2_bar!!
        
        _Wifi_2_bar = ImageVector.Builder(
            name = "wifi_2_bar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 16f)
                    curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                    reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                    reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                    reflectiveCurveTo(13.1f, 16f, 12f, 16f)
                    close()
                    moveTo(5.38f, 14.37f)
                    curveToRelative(-0.63f, -0.63f, -0.59f, -1.71f, 0.13f, -2.24f)
                    curveTo(7.33f, 10.79f, 9.57f, 10f, 12f, 10f)
                    curveToRelative(2.43f, 0f, 4.67f, 0.79f, 6.49f, 2.13f)
                    curveToRelative(0.72f, 0.53f, 0.76f, 1.6f, 0.13f, 2.24f)
                    curveToRelative(-0.53f, 0.54f, -1.37f, 0.57f, -1.98f, 0.12f)
                    curveTo(15.33f, 13.55f, 13.73f, 13f, 12f, 13f)
                    curveToRelative(-1.73f, 0f, -3.33f, 0.55f, -4.64f, 1.49f)
                    curveTo(6.75f, 14.93f, 5.91f, 14.9f, 5.38f, 14.37f)
                    close()
                }
            }
        }.build()
        
        return _Wifi_2_bar!!
    }

private var _Wifi_2_bar: ImageVector? = null

