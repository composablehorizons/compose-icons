package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Ssid_chart: ImageVector
    get() {
        if (_Ssid_chart != null) return _Ssid_chart!!
        
        _Ssid_chart = ImageVector.Builder(
            name = "ssid_chart",
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
                    moveTo(3f, 9.03f)
                    curveToRelative(0f, -0.32f, 0.15f, -0.62f, 0.41f, -0.81f)
                    lineTo(7.14f, 5.5f)
                    curveToRelative(0.4f, -0.29f, 0.95f, -0.25f, 1.3f, 0.1f)
                    lineToRelative(3.78f, 3.78f)
                    lineToRelative(7.2f, -5.23f)
                    curveTo(20.07f, 3.67f, 21f, 4.14f, 21f, 4.96f)
                    curveToRelative(0f, 0.32f, -0.15f, 0.62f, -0.41f, 0.81f)
                    lineToRelative(-7.9f, 5.73f)
                    curveToRelative(-0.4f, 0.29f, -0.95f, 0.25f, -1.29f, -0.1f)
                    lineTo(7.62f, 7.62f)
                    lineTo(4.59f, 9.84f)
                    curveTo(3.93f, 10.32f, 3f, 9.85f, 3f, 9.03f)
                    close()
                    moveTo(21f, 16f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(-3.35f)
                    curveToRelative(-0.23f, 0f, -0.45f, 0.08f, -0.62f, 0.22f)
                    lineToRelative(-3.9f, 3.12f)
                    lineTo(6.6f, 12.99f)
                    curveToRelative(-0.35f, -0.34f, -0.88f, -0.38f, -1.27f, -0.1f)
                    lineToRelative(-1.9f, 1.35f)
                    curveTo(3.16f, 14.43f, 3f, 14.74f, 3f, 15.06f)
                    curveToRelative(0f, 0.81f, 0.92f, 1.29f, 1.58f, 0.81f)
                    lineTo(5.8f, 15f)
                    lineToRelative(5.57f, 5.39f)
                    curveToRelative(0.36f, 0.35f, 0.93f, 0.38f, 1.32f, 0.06f)
                    lineTo(17f, 17f)
                    horizontalLineToRelative(3f)
                    curveTo(20.55f, 17f, 21f, 16.55f, 21f, 16f)
                    close()
                }
            }
        }.build()
        
        return _Ssid_chart!!
    }

private var _Ssid_chart: ImageVector? = null

