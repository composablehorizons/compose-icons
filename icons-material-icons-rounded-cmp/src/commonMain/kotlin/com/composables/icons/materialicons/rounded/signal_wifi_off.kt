package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Signal_wifi_off: ImageVector
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
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(23.64f, 7f)
                curveToRelative(-0.45f, -0.34f, -4.93f, -4f, -11.64f, -4f)
                curveToRelative(-1.32f, 0f, -2.55f, 0.14f, -3.69f, 0.38f)
                lineTo(18.43f, 13.5f)
                lineTo(23.64f, 7f)
                close()
                moveTo(4.12f, 2.01f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(1.35f, 1.35f)
                curveTo(1.91f, 5.76f, 0.59f, 6.82f, 0.36f, 7f)
                lineToRelative(10.08f, 12.56f)
                curveToRelative(0.8f, 1f, 2.32f, 1f, 3.12f, 0f)
                lineToRelative(2.35f, -2.93f)
                lineToRelative(2.61f, 2.61f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                lineTo(4.12f, 2.01f)
                close()
            }
        }.build()
        
        return _Signal_wifi_off!!
    }

private var _Signal_wifi_off: ImageVector? = null

