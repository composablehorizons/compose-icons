package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Signal_wifi_off: ImageVector
    get() {
        if (_Signal_wifi_off != null) return _Signal_wifi_off!!
        
        _Signal_wifi_off = ImageVector.Builder(
            name = "signal_wifi_off",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(23.64f, 7f)
                curveToRelative(-0.45f, -0.34f, -4.93f, -4f, -11.64f, -4f)
                curveToRelative(-1.5f, 0f, -2.89f, 0.19f, -4.15f, 0.48f)
                lineTo(18.18f, 13.8f)
                lineTo(23.64f, 7f)
                close()
                moveToRelative(-6.6f, 8.22f)
                lineTo(3.27f, 1.44f)
                lineTo(2f, 2.72f)
                lineToRelative(2.05f, 2.06f)
                curveTo(1.91f, 5.76f, 0.59f, 6.82f, 0.36f, 7f)
                lineToRelative(11.63f, 14.49f)
                lineToRelative(0.01f, 0.01f)
                lineToRelative(0.01f, -0.01f)
                lineToRelative(3.9f, -4.86f)
                lineToRelative(3.32f, 3.32f)
                lineToRelative(1.27f, -1.27f)
                lineToRelative(-3.46f, -3.46f)
                close()
            }
        }.build()
        
        return _Signal_wifi_off!!
    }

private var _Signal_wifi_off: ImageVector? = null

