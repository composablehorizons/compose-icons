package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Signal_wifi_statusbar_connected_no_internet_4: ImageVector
    get() {
        if (_Signal_wifi_statusbar_connected_no_internet_4 != null) return _Signal_wifi_statusbar_connected_no_internet_4!!
        
        _Signal_wifi_statusbar_connected_no_internet_4 = ImageVector.Builder(
            name = "signal_wifi_statusbar_connected_no_internet_4",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22.92f, 8f)
                horizontalLineTo(17f)
                verticalLineToRelative(7.99f)
                lineToRelative(-4.29f, 4.3f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.42f, 0f)
                lineTo(0.73f, 9.71f)
                curveTo(0.32f, 9.3f, 0.35f, 8.63f, 0.79f, 8.24f)
                curveTo(3.78f, 5.6f, 7.7f, 4f, 12f, 4f)
                curveTo(16.16f, 4f, 19.97f, 5.51f, 22.92f, 8f)
                close()
                moveTo(20f, 18f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveTo(20.55f, 18f, 20f, 18f)
                close()
                moveTo(20f, 10f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4f)
                curveTo(21f, 10.45f, 20.55f, 10f, 20f, 10f)
                close()
            }
        }.build()
        
        return _Signal_wifi_statusbar_connected_no_internet_4!!
    }

private var _Signal_wifi_statusbar_connected_no_internet_4: ImageVector? = null

