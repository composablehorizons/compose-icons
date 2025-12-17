package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Signal_wifi_0_bar: ImageVector
    get() {
        if (_Signal_wifi_0_bar != null) return _Signal_wifi_0_bar!!
        
        _Signal_wifi_0_bar = ImageVector.Builder(
            name = "signal_wifi_0_bar",
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
                moveTo(12f, 6f)
                lineTo(12f, 6f)
                curveToRelative(3.33f, 0f, 6.49f, 1.08f, 9.08f, 3.07f)
                lineTo(12f, 18.17f)
                lineToRelative(-9.08f, -9.1f)
                curveTo(5.51f, 7.08f, 8.67f, 6f, 12f, 6f)
                moveTo(12f, 4f)
                curveTo(7.31f, 4f, 3.07f, 5.9f, 0f, 8.98f)
                lineTo(12f, 21f)
                lineTo(24f, 8.98f)
                curveTo(20.93f, 5.9f, 16.69f, 4f, 12f, 4f)
                lineTo(12f, 4f)
                close()
            }
        }.build()
        
        return _Signal_wifi_0_bar!!
    }

private var _Signal_wifi_0_bar: ImageVector? = null

