package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Signal_wifi_off: ImageVector
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
                moveTo(3.41f, 1.31f)
                lineTo(2f, 2.72f)
                lineToRelative(2.05f, 2.05f)
                curveTo(1.91f, 5.76f, 0.59f, 6.82f, 0.36f, 7f)
                lineTo(12f, 21.5f)
                lineToRelative(3.91f, -4.87f)
                lineToRelative(3.32f, 3.32f)
                lineToRelative(1.41f, -1.41f)
                lineTo(3.41f, 1.31f)
                close()
            }
        }.build()
        
        return _Signal_wifi_off!!
    }

private var _Signal_wifi_off: ImageVector? = null

