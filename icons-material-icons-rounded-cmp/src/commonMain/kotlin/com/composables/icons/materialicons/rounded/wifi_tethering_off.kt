package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Wifi_tethering_off: ImageVector
    get() {
        if (_Wifi_tethering_off != null) return _Wifi_tethering_off!!
        
        _Wifi_tethering_off = ImageVector.Builder(
            name = "wifi_tethering_off",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2.11f, 3.51f)
                        lineTo(2.11f, 3.51f)
                        curveTo(1.71f, 3.9f, 1.71f, 4.54f, 2.1f, 4.93f)
                        lineToRelative(1.98f, 1.98f)
                        curveTo(2.78f, 8.6f, 2f, 10.71f, 2f, 13f)
                        curveToRelative(0f, 2.36f, 0.82f, 4.53f, 2.19f, 6.24f)
                        curveToRelative(0.37f, 0.47f, 1.07f, 0.5f, 1.5f, 0.08f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.36f, -0.36f, 0.39f, -0.92f, 0.08f, -1.32f)
                        curveTo(4.66f, 16.63f, 4f, 14.89f, 4f, 13f)
                        curveToRelative(0f, -1.75f, 0.57f, -3.35f, 1.51f, -4.66f)
                        lineToRelative(1.43f, 1.43f)
                        curveTo(6.35f, 10.7f, 6f, 11.81f, 6f, 13f)
                        curveToRelative(0f, 1.25f, 0.38f, 2.4f, 1.03f, 3.35f)
                        curveToRelative(0.34f, 0.5f, 1.08f, 0.54f, 1.51f, 0.11f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.35f, -0.35f, 0.37f, -0.88f, 0.1f, -1.29f)
                        curveTo(8.24f, 14.54f, 8f, 13.8f, 8f, 13f)
                        curveToRelative(0f, -0.63f, 0.15f, -1.23f, 0.41f, -1.76f)
                        lineToRelative(1.61f, 1.61f)
                        curveToRelative(0f, 0.05f, -0.02f, 0.1f, -0.02f, 0.15f)
                        curveToRelative(0f, 0.55f, 0.23f, 1.05f, 0.59f, 1.41f)
                        curveTo(10.95f, 14.77f, 11.45f, 15f, 12f, 15f)
                        curveToRelative(0.05f, 0f, 0.1f, -0.01f, 0.16f, -0.02f)
                        lineToRelative(6.91f, 6.91f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                        lineTo(3.51f, 3.51f)
                        curveTo(3.12f, 3.12f, 2.49f, 3.12f, 2.11f, 3.51f)
                        close()
                        moveTo(17.7f, 14.87f)
                        curveTo(17.89f, 14.28f, 18f, 13.65f, 18f, 13f)
                        curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                        curveToRelative(-0.65f, 0f, -1.28f, 0.1f, -1.87f, 0.3f)
                        lineToRelative(1.71f, 1.71f)
                        curveTo(11.89f, 9f, 11.95f, 9f, 12f, 9f)
                        curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                        curveToRelative(0f, 0.05f, 0f, 0.11f, -0.01f, 0.16f)
                        lineTo(17.7f, 14.87f)
                        close()
                        moveTo(12f, 5f)
                        curveToRelative(4.42f, 0f, 8f, 3.58f, 8f, 8f)
                        curveToRelative(0f, 1.22f, -0.27f, 2.37f, -0.77f, 3.4f)
                        lineToRelative(1.49f, 1.49f)
                        curveTo(21.53f, 16.45f, 22f, 14.78f, 22f, 13f)
                        curveToRelative(0f, -5.52f, -4.48f, -10f, -10f, -10f)
                        curveToRelative(-1.78f, 0f, -3.44f, 0.46f, -4.89f, 1.28f)
                        lineToRelative(1.48f, 1.48f)
                        curveTo(9.63f, 5.27f, 10.78f, 5f, 12f, 5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Wifi_tethering_off!!
    }

private var _Wifi_tethering_off: ImageVector? = null

