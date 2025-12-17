package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Network_wifi_3_bar: ImageVector
    get() {
        if (_Network_wifi_3_bar != null) return _Network_wifi_3_bar!!
        
        _Network_wifi_3_bar = ImageVector.Builder(
            name = "network_wifi_3_bar",
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
                    moveTo(12f, 4f)
                    curveTo(7.31f, 4f, 3.07f, 5.9f, 0f, 8.98f)
                    lineTo(12f, 21f)
                    lineTo(24f, 8.98f)
                    curveTo(20.93f, 5.9f, 16.69f, 4f, 12f, 4f)
                    close()
                    moveTo(2.92f, 9.07f)
                    curveTo(5.51f, 7.08f, 8.67f, 6f, 12f, 6f)
                    reflectiveCurveToRelative(6.49f, 1.08f, 9.08f, 3.07f)
                    lineToRelative(-2.85f, 2.86f)
                    curveTo(16.46f, 10.71f, 14.31f, 10f, 12f, 10f)
                    curveToRelative(-2.31f, 0f, -4.46f, 0.71f, -6.23f, 1.93f)
                    lineTo(2.92f, 9.07f)
                    close()
                }
            }
        }.build()
        
        return _Network_wifi_3_bar!!
    }

private var _Network_wifi_3_bar: ImageVector? = null

