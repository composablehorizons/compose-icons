package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Wifi_2_bar: ImageVector
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 10f)
                    curveToRelative(3.03f, 0f, 5.78f, 1.23f, 7.76f, 3.22f)
                    lineToRelative(-2.12f, 2.12f)
                    curveTo(16.2f, 13.9f, 14.2f, 13f, 12f, 13f)
                    curveToRelative(-2.2f, 0f, -4.2f, 0.9f, -5.64f, 2.35f)
                    lineToRelative(-2.12f, -2.12f)
                    curveTo(6.22f, 11.23f, 8.97f, 10f, 12f, 10f)
                    close()
                    moveTo(12f, 16f)
                    curveToRelative(-1.38f, 0f, -2.63f, 0.56f, -3.53f, 1.46f)
                    lineTo(12f, 21f)
                    lineToRelative(3.53f, -3.54f)
                    curveTo(14.63f, 16.56f, 13.38f, 16f, 12f, 16f)
                    close()
                }
            }
        }.build()
        
        return _Wifi_2_bar!!
    }

private var _Wifi_2_bar: ImageVector? = null

