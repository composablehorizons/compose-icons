package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Signal_wifi_statusbar_connected_no_internet_1: ImageVector
    get() {
        if (_Signal_wifi_statusbar_connected_no_internet_1 != null) return _Signal_wifi_statusbar_connected_no_internet_1!!
        
        _Signal_wifi_statusbar_connected_no_internet_1 = ImageVector.Builder(
            name = "signal_wifi_statusbar_connected_no_internet_1",
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
                        moveTo(17f, 14.76f)
                        verticalLineTo(8f)
                        horizontalLineToRelative(5.92f)
                        curveTo(19.97f, 5.51f, 16.16f, 4f, 12f, 4f)
                        curveTo(7.31f, 4f, 3.07f, 5.9f, 0f, 8.98f)
                        lineToRelative(6.35f, 6.36f)
                        curveTo(7.8f, 13.89f, 9.79f, 13f, 12f, 13f)
                        curveTo(13.89f, 13f, 15.63f, 13.66f, 17f, 14.76f)
                        close()
                    }
                    group {
                        path(
                            fill = SolidColor(Color(0xFF000000))
                        ) {
                            moveTo(6.35f, 15.34f)
                            lineTo(12f, 21f)
                            lineToRelative(5f, -5.01f)
                            verticalLineToRelative(-1.23f)
                            curveToRelative(-1.37f, -1.1f, -3.11f, -1.76f, -5f, -1.76f)
                            curveTo(9.79f, 13f, 7.8f, 13.89f, 6.35f, 15.34f)
                            close()
                        }
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
                    }
                }
            }
        }.build()
        
        return _Signal_wifi_statusbar_connected_no_internet_1!!
    }

private var _Signal_wifi_statusbar_connected_no_internet_1: ImageVector? = null

