package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Signal_wifi_statusbar_null: ImageVector
    get() {
        if (_Signal_wifi_statusbar_null != null) return _Signal_wifi_statusbar_null!!
        
        _Signal_wifi_statusbar_null = ImageVector.Builder(
            name = "signal_wifi_statusbar_null",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
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
                    curveTo(7.7f, 4f, 3.78f, 5.6f, 0.79f, 8.24f)
                    curveTo(0.35f, 8.63f, 0.32f, 9.3f, 0.73f, 9.71f)
                    lineToRelative(10.56f, 10.58f)
                    curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.42f, 0f)
                    lineTo(23.27f, 9.71f)
                    curveToRelative(0.41f, -0.41f, 0.38f, -1.08f, -0.06f, -1.47f)
                    curveTo(20.22f, 5.6f, 16.3f, 4f, 12f, 4f)
                    close()
                    moveTo(2.92f, 9.07f)
                    curveTo(5.51f, 7.08f, 8.67f, 6f, 12f, 6f)
                    curveToRelative(3.33f, 0f, 6.49f, 1.08f, 9.08f, 3.07f)
                    lineTo(12f, 18.17f)
                    lineTo(2.92f, 9.07f)
                    close()
                }
            }
        }.build()
        
        return _Signal_wifi_statusbar_null!!
    }

private var _Signal_wifi_statusbar_null: ImageVector? = null

