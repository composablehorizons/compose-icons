package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Signal_wifi_3_bar: ImageVector
    get() {
        if (_Signal_wifi_3_bar != null) return _Signal_wifi_3_bar!!
        
        _Signal_wifi_3_bar = ImageVector.Builder(
            name = "signal_wifi_3_bar",
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
                lineTo(12f, 21.5f)
                lineTo(23.64f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.53f, 10.95f)
                lineTo(12f, 21.5f)
                lineToRelative(8.47f, -10.55f)
                curveTo(20.04f, 10.62f, 16.81f, 8f, 12f, 8f)
                reflectiveCurveToRelative(-8.04f, 2.62f, -8.47f, 2.95f)
                close()
            }
        }.build()
        
        return _Signal_wifi_3_bar!!
    }

private var _Signal_wifi_3_bar: ImageVector? = null

