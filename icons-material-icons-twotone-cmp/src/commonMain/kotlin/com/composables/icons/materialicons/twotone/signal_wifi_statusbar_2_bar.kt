package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Signal_wifi_statusbar_2_bar: ImageVector
    get() {
        if (_Signal_wifi_statusbar_2_bar != null) return _Signal_wifi_statusbar_2_bar!!
        
        _Signal_wifi_statusbar_2_bar = ImageVector.Builder(
            name = "signal_wifi_statusbar_2_bar",
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
                        moveTo(19.77f, 13.22f)
                        lineTo(24f, 8.98f)
                        curveTo(20.93f, 5.9f, 16.69f, 4f, 12f, 4f)
                        curveTo(7.31f, 4f, 3.07f, 5.9f, 0f, 8.98f)
                        lineToRelative(4.23f, 4.24f)
                        curveTo(6.22f, 11.23f, 8.97f, 10f, 12f, 10f)
                        reflectiveCurveTo(17.78f, 11.23f, 19.77f, 13.22f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19.77f, 13.22f)
                        curveTo(17.78f, 11.23f, 15.03f, 10f, 12f, 10f)
                        reflectiveCurveToRelative(-5.78f, 1.23f, -7.77f, 3.22f)
                        lineTo(12f, 21f)
                        lineTo(19.77f, 13.22f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Signal_wifi_statusbar_2_bar!!
    }

private var _Signal_wifi_statusbar_2_bar: ImageVector? = null

