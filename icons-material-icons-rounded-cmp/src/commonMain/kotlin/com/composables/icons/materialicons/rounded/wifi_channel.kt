package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Wifi_channel: ImageVector
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
                    moveTo(4.13f, 21f)
                    curveToRelative(0.5f, 0f, 0.92f, -0.38f, 0.99f, -0.87f)
                    curveToRelative(0.65f, -4.89f, 1.95f, -9.01f, 2.88f, -10f)
                    curveToRelative(0.91f, 0.98f, 2.19f, 5.01f, 2.86f, 9.82f)
                    curveToRelative(0.08f, 0.6f, 0.59f, 1.05f, 1.19f, 1.05f)
                    curveToRelative(0.54f, 0f, 1.02f, -0.36f, 1.16f, -0.89f)
                    curveTo(13.83f, 17.73f, 15.11f, 15f, 16f, 15f)
                    curveToRelative(0.9f, 0f, 2.19f, 2.83f, 2.81f, 5.2f)
                    curveToRelative(0.12f, 0.48f, 0.56f, 0.8f, 1.05f, 0.8f)
                    curveToRelative(0.62f, 0f, 1.12f, -0.52f, 1.09f, -1.14f)
                    curveTo(20.75f, 15.89f, 19.81f, 3f, 16f, 3f)
                    curveToRelative(-2.51f, 0f, -3.77f, 5.61f, -4.4f, 10.57f)
                    curveTo(10.79f, 10.66f, 9.61f, 8f, 8f, 8f)
                    curveToRelative(-2.92f, 0f, -4.41f, 8.71f, -4.85f, 11.87f)
                    curveTo(3.06f, 20.47f, 3.53f, 21f, 4.13f, 21f)
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

