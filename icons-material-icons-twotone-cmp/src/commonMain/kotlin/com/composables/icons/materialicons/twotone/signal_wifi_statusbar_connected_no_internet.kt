package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Signal_wifi_statusbar_connected_no_internet: ImageVector
    get() {
        if (_Signal_wifi_statusbar_connected_no_internet != null) return _Signal_wifi_statusbar_connected_no_internet!!
        
        _Signal_wifi_statusbar_connected_no_internet = ImageVector.Builder(
            name = "signal_wifi_statusbar_connected_no_internet",
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
                        moveTo(19f, 18f)
                        horizontalLineTo(21f)
                        verticalLineTo(20f)
                        horizontalLineTo(19f)
                        verticalLineTo(18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 10f)
                        horizontalLineTo(21f)
                        verticalLineTo(16f)
                        horizontalLineTo(19f)
                        verticalLineTo(10f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17f, 8f)
                        horizontalLineToRelative(5.92f)
                        curveTo(19.97f, 5.51f, 16.16f, 4f, 12f, 4f)
                        curveTo(7.31f, 4f, 3.07f, 5.9f, 0f, 8.98f)
                        lineTo(12f, 21f)
                        lineToRelative(5f, -5.01f)
                        verticalLineTo(8f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Signal_wifi_statusbar_connected_no_internet!!
    }

private var _Signal_wifi_statusbar_connected_no_internet: ImageVector? = null

