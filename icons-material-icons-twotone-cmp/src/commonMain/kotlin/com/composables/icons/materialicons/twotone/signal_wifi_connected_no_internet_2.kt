package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Signal_wifi_connected_no_internet_2: ImageVector
    get() {
        if (_Signal_wifi_connected_no_internet_2 != null) return _Signal_wifi_connected_no_internet_2!!
        
        _Signal_wifi_connected_no_internet_2 = ImageVector.Builder(
            name = "signal_wifi_connected_no_internet_2",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18.31f, 12f)
                        horizontalLineToRelative(2.67f)
                        lineTo(24f, 8.98f)
                        curveTo(20.93f, 5.9f, 16.69f, 4f, 12f, 4f)
                        curveTo(7.31f, 4f, 3.07f, 5.9f, 0f, 8.98f)
                        lineToRelative(4.23f, 4.24f)
                        curveTo(6.22f, 11.23f, 8.97f, 10f, 12f, 10f)
                        curveTo(14.35f, 10f, 16.52f, 10.74f, 18.31f, 12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 10f)
                        curveToRelative(-3.03f, 0f, -5.78f, 1.23f, -7.77f, 3.22f)
                        lineTo(12f, 21f)
                        verticalLineToRelative(-9f)
                        horizontalLineToRelative(6.32f)
                        curveTo(16.52f, 10.74f, 14.35f, 10f, 12f, 10f)
                        close()
                        moveTo(21f, 15.41f)
                        lineTo(19.59f, 14f)
                        lineToRelative(-2.09f, 2.09f)
                        lineTo(15.41f, 14f)
                        lineTo(14f, 15.41f)
                        lineToRelative(2.09f, 2.09f)
                        lineTo(14f, 19.59f)
                        lineTo(15.41f, 21f)
                        lineToRelative(2.09f, -2.08f)
                        lineTo(19.59f, 21f)
                        lineTo(21f, 19.59f)
                        lineToRelative(-2.08f, -2.09f)
                        lineTo(21f, 15.41f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Signal_wifi_connected_no_internet_2!!
    }

private var _Signal_wifi_connected_no_internet_2: ImageVector? = null

