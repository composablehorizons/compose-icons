package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Ssid_chart: ImageVector
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
                    moveTo(21f, 5.47f)
                    lineTo(12f, 12f)
                    lineTo(7.62f, 7.62f)
                    lineTo(3f, 11f)
                    verticalLineTo(8.52f)
                    lineTo(7.83f, 5f)
                    lineToRelative(4.38f, 4.38f)
                    lineTo(21f, 3f)
                    lineTo(21f, 5.47f)
                    close()
                    moveTo(21f, 15f)
                    horizontalLineToRelative(-4.7f)
                    lineToRelative(-4.17f, 3.34f)
                    lineTo(6f, 12.41f)
                    lineToRelative(-3f, 2.13f)
                    lineTo(3f, 17f)
                    lineToRelative(2.8f, -2f)
                    lineToRelative(6.2f, 6f)
                    lineToRelative(5f, -4f)
                    horizontalLineToRelative(4f)
                    verticalLineTo(15f)
                    close()
                }
            }
        }.build()
        
        return _Ssid_chart!!
    }

private var _Ssid_chart: ImageVector? = null

