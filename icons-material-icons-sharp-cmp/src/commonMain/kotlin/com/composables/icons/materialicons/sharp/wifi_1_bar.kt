package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Wifi_1_bar: ImageVector
    get() {
        if (_Wifi_1_bar != null) return _Wifi_1_bar!!
        
        _Wifi_1_bar = ImageVector.Builder(
            name = "wifi_1_bar",
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
                    moveTo(15.53f, 17.46f)
                    lineTo(12f, 21f)
                    lineToRelative(-3.53f, -3.54f)
                    curveTo(9.37f, 16.56f, 10.62f, 16f, 12f, 16f)
                    reflectiveCurveTo(14.63f, 16.56f, 15.53f, 17.46f)
                    close()
                }
            }
        }.build()
        
        return _Wifi_1_bar!!
    }

private var _Wifi_1_bar: ImageVector? = null

