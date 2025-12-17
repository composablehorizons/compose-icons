package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Signal_wifi_connected_no_internet_4: ImageVector
    get() {
        if (_Signal_wifi_connected_no_internet_4 != null) return _Signal_wifi_connected_no_internet_4!!
        
        _Signal_wifi_connected_no_internet_4 = ImageVector.Builder(
            name = "signal_wifi_connected_no_internet_4",
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
                    moveTo(24f, 8.98f)
                    curveTo(20.93f, 5.9f, 16.69f, 4f, 12f, 4f)
                    curveTo(7.31f, 4f, 3.07f, 5.9f, 0f, 8.98f)
                    lineTo(12f, 21f)
                    verticalLineToRelative(-9f)
                    horizontalLineToRelative(8.99f)
                    lineTo(24f, 8.98f)
                    close()
                    moveTo(19.59f, 14f)
                    lineToRelative(-2.09f, 2.09f)
                    lineToRelative(-0.3f, -0.3f)
                    lineTo(15.41f, 14f)
                    lineTo(14f, 15.41f)
                    lineToRelative(1.79f, 1.79f)
                    lineToRelative(0.3f, 0.3f)
                    lineTo(14f, 19.59f)
                    lineTo(15.41f, 21f)
                    lineToRelative(2.09f, -2.08f)
                    lineTo(19.59f, 21f)
                    lineTo(21f, 19.59f)
                    lineToRelative(-2.08f, -2.09f)
                    lineTo(21f, 15.41f)
                    lineTo(19.59f, 14f)
                    close()
                }
            }
        }.build()
        
        return _Signal_wifi_connected_no_internet_4!!
    }

private var _Signal_wifi_connected_no_internet_4: ImageVector? = null

