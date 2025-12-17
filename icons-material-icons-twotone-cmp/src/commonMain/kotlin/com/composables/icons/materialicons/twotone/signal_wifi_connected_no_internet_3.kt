package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Signal_wifi_connected_no_internet_3: ImageVector
    get() {
        if (_Signal_wifi_connected_no_internet_3 != null) return _Signal_wifi_connected_no_internet_3!!
        
        _Signal_wifi_connected_no_internet_3 = ImageVector.Builder(
            name = "signal_wifi_connected_no_internet_3",
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
                        moveTo(21.18f, 11.8f)
                        lineTo(24f, 8.98f)
                        curveTo(20.93f, 5.9f, 16.69f, 4f, 12f, 4f)
                        curveTo(7.31f, 4f, 3.07f, 5.9f, 0f, 8.98f)
                        lineToRelative(2.82f, 2.82f)
                        curveTo(5.17f, 9.45f, 8.41f, 8f, 12f, 8f)
                        reflectiveCurveTo(18.83f, 9.45f, 21.18f, 11.8f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(21.18f, 11.8f)
                        curveTo(18.83f, 9.45f, 15.59f, 8f, 12f, 8f)
                        reflectiveCurveToRelative(-6.83f, 1.45f, -9.18f, 3.8f)
                        lineTo(12f, 21f)
                        verticalLineToRelative(-9f)
                        horizontalLineToRelative(8.99f)
                        lineTo(21.18f, 11.8f)
                        close()
                        moveTo(19.59f, 14f)
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
                        lineTo(19.59f, 14f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Signal_wifi_connected_no_internet_3!!
    }

private var _Signal_wifi_connected_no_internet_3: ImageVector? = null

