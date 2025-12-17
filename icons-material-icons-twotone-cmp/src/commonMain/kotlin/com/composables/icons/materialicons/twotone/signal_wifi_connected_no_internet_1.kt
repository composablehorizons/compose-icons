package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Signal_wifi_connected_no_internet_1: ImageVector
    get() {
        if (_Signal_wifi_connected_no_internet_1 != null) return _Signal_wifi_connected_no_internet_1!!
        
        _Signal_wifi_connected_no_internet_1 = ImageVector.Builder(
            name = "signal_wifi_connected_no_internet_1",
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
                        moveTo(12f, 12f)
                        horizontalLineToRelative(8.99f)
                        lineTo(24f, 8.98f)
                        curveTo(20.93f, 5.9f, 16.69f, 4f, 12f, 4f)
                        curveTo(7.31f, 4f, 3.07f, 5.9f, 0f, 8.98f)
                        lineToRelative(6.35f, 6.36f)
                        curveTo(7.79f, 13.89f, 9.79f, 13f, 12f, 13f)
                        verticalLineTo(12f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(12f, 21f)
                        verticalLineToRelative(-8f)
                        curveToRelative(-2.21f, 0f, -4.2f, 0.89f, -5.65f, 2.34f)
                        lineTo(12f, 21f)
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
        
        return _Signal_wifi_connected_no_internet_1!!
    }

private var _Signal_wifi_connected_no_internet_1: ImageVector? = null

