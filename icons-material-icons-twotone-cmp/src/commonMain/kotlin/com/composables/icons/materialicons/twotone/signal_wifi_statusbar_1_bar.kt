package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Signal_wifi_statusbar_1_bar: ImageVector
    get() {
        if (_Signal_wifi_statusbar_1_bar != null) return _Signal_wifi_statusbar_1_bar!!
        
        _Signal_wifi_statusbar_1_bar = ImageVector.Builder(
            name = "signal_wifi_statusbar_1_bar",
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
                        moveTo(17.65f, 15.34f)
                        lineTo(24f, 8.98f)
                        curveTo(20.93f, 5.9f, 16.69f, 4f, 12f, 4f)
                        curveTo(7.31f, 4f, 3.07f, 5.9f, 0f, 8.98f)
                        lineToRelative(6.35f, 6.36f)
                        curveTo(7.8f, 13.89f, 9.79f, 13f, 12f, 13f)
                        reflectiveCurveTo(16.2f, 13.89f, 17.65f, 15.34f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(17.65f, 15.34f)
                        curveTo(16.2f, 13.89f, 14.21f, 13f, 12f, 13f)
                        reflectiveCurveToRelative(-4.2f, 0.89f, -5.65f, 2.34f)
                        lineTo(12f, 21f)
                        lineTo(17.65f, 15.34f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Signal_wifi_statusbar_1_bar!!
    }

private var _Signal_wifi_statusbar_1_bar: ImageVector? = null

