package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Signal_wifi_statusbar_connected_no_internet_3: ImageVector
    get() {
        if (_Signal_wifi_statusbar_connected_no_internet_3 != null) return _Signal_wifi_statusbar_connected_no_internet_3!!
        
        _Signal_wifi_statusbar_connected_no_internet_3 = ImageVector.Builder(
            name = "signal_wifi_statusbar_connected_no_internet_3",
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
                    moveTo(17f, 9f)
                    verticalLineTo(8f)
                    horizontalLineToRelative(5.92f)
                    curveTo(19.97f, 5.51f, 16.16f, 4f, 12f, 4f)
                    curveTo(7.31f, 4f, 3.07f, 5.9f, 0f, 8.98f)
                    lineToRelative(2.82f, 2.82f)
                    curveTo(5.17f, 9.45f, 8.41f, 8f, 12f, 8f)
                    curveTo(13.77f, 8f, 15.46f, 8.36f, 17f, 9f)
                    close()
                }
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2.82f, 11.8f)
                        lineTo(12f, 21f)
                        lineToRelative(5f, -5.01f)
                        verticalLineTo(9f)
                        curveToRelative(-1.54f, -0.64f, -3.23f, -1f, -5f, -1f)
                        curveTo(8.41f, 8f, 5.17f, 9.45f, 2.82f, 11.8f)
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
        }.build()
        
        return _Signal_wifi_statusbar_connected_no_internet_3!!
    }

private var _Signal_wifi_statusbar_connected_no_internet_3: ImageVector? = null

