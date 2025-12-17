package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Signal_wifi_2_bar_lock: ImageVector
    get() {
        if (_Signal_wifi_2_bar_lock != null) return _Signal_wifi_2_bar_lock!!
        
        _Signal_wifi_2_bar_lock = ImageVector.Builder(
            name = "signal_wifi_2_bar_lock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.5f, 14.5f)
                curveToRelative(0f, -2.8f, 2.2f, -5f, 5f, -5f)
                curveToRelative(0.36f, 0f, 0.71f, 0.04f, 1.05f, 0.11f)
                lineTo(23.64f, 7f)
                curveToRelative(-0.45f, -0.34f, -4.93f, -4f, -11.64f, -4f)
                curveTo(5.28f, 3f, 0.81f, 6.66f, 0.36f, 7f)
                lineTo(12f, 21.5f)
                lineToRelative(3.5f, -4.36f)
                verticalLineTo(14.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.5f, 14.5f)
                curveToRelative(0f, -1.34f, 0.51f, -2.53f, 1.34f, -3.42f)
                curveTo(15.62f, 10.51f, 13.98f, 10f, 12f, 10f)
                curveToRelative(-4.1f, 0f, -6.8f, 2.2f, -7.2f, 2.5f)
                lineToRelative(7.2f, 9f)
                lineToRelative(3.5f, -4.38f)
                verticalLineTo(14.5f)
                close()
                moveTo(23f, 16f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.4f, -1.1f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveTo(18f, 13.1f, 18f, 14.5f)
                verticalLineTo(16f)
                curveToRelative(-0.5f, 0f, -1f, 0.5f, -1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.5f, 0.5f, 1f, 1f, 1f)
                horizontalLineToRelative(5f)
                curveToRelative(0.5f, 0f, 1f, -0.5f, 1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.5f, -0.5f, -1f, -1f, -1f)
                close()
                moveToRelative(-1f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.8f, 0.7f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.7f, 1.5f, 1.5f)
                verticalLineTo(16f)
                close()
            }
        }.build()
        
        return _Signal_wifi_2_bar_lock!!
    }

private var _Signal_wifi_2_bar_lock: ImageVector? = null

