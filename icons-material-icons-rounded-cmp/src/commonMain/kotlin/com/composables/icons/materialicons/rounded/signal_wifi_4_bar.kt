package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Signal_wifi_4_bar: ImageVector
    get() {
        if (_Signal_wifi_4_bar != null) return _Signal_wifi_4_bar!!
        
        _Signal_wifi_4_bar = ImageVector.Builder(
            name = "signal_wifi_4_bar",
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
                moveTo(23.64f, 7f)
                curveToRelative(-0.45f, -0.34f, -4.93f, -4f, -11.64f, -4f)
                curveTo(5.28f, 3f, 0.81f, 6.66f, 0.36f, 7f)
                lineToRelative(10.08f, 12.56f)
                curveToRelative(0.8f, 1f, 2.32f, 1f, 3.12f, 0f)
                lineTo(23.64f, 7f)
                close()
            }
        }.build()
        
        return _Signal_wifi_4_bar!!
    }

private var _Signal_wifi_4_bar: ImageVector? = null

