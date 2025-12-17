package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Wifi_channel: ImageVector
    get() {
        if (_Wifi_channel != null) return _Wifi_channel!!
        
        _Wifi_channel = ImageVector.Builder(
            name = "wifi_channel",
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(16f, 3f)
                    curveToRelative(-2.51f, 0f, -3.77f, 5.61f, -4.4f, 10.57f)
                    curveTo(10.79f, 10.66f, 9.61f, 8f, 8f, 8f)
                    curveTo(4.43f, 8f, 3f, 21f, 3f, 21f)
                    horizontalLineToRelative(2.01f)
                    curveToRelative(0.61f, -5.27f, 2f, -9.82f, 2.99f, -10.87f)
                    curveToRelative(0.98f, 1.05f, 2.38f, 5.61f, 2.99f, 10.87f)
                    horizontalLineTo(13f)
                    curveToRelative(0.5f, -2.53f, 2f, -6f, 3f, -6f)
                    reflectiveCurveToRelative(2.5f, 3.53f, 3f, 6f)
                    horizontalLineToRelative(2f)
                    curveTo(21f, 21f, 20.5f, 3f, 16f, 3f)
                    close()
                    moveTo(16f, 13f)
                    curveToRelative(-0.99f, 0f, -1.82f, 0.62f, -2.5f, 1.5f)
                    curveToRelative(0.57f, -4.77f, 1.54f, -8.62f, 2.5f, -9.44f)
                    curveToRelative(0.97f, 0.81f, 1.91f, 4.67f, 2.49f, 9.43f)
                    curveTo(17.81f, 13.62f, 16.98f, 13f, 16f, 13f)
                    close()
                }
            }
        }.build()
        
        return _Wifi_channel!!
    }

private var _Wifi_channel: ImageVector? = null

