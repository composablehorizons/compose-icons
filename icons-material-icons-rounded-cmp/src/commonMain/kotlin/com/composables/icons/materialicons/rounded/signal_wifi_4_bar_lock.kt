package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Signal_wifi_4_bar_lock: ImageVector
    get() {
        if (_Signal_wifi_4_bar_lock != null) return _Signal_wifi_4_bar_lock!!
        
        _Signal_wifi_4_bar_lock = ImageVector.Builder(
            name = "signal_wifi_4_bar_lock",
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
                        moveTo(23.21f, 8.24f)
                        curveTo(20.22f, 5.6f, 16.3f, 4f, 12f, 4f)
                        reflectiveCurveTo(3.78f, 5.6f, 0.79f, 8.24f)
                        curveTo(0.35f, 8.63f, 0.32f, 9.3f, 0.73f, 9.71f)
                        lineToRelative(5.62f, 5.63f)
                        lineToRelative(4.94f, 4.95f)
                        curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.42f, 0f)
                        lineToRelative(2.34f, -2.34f)
                        verticalLineTo(15f)
                        curveToRelative(0f, -0.45f, 0.09f, -0.88f, 0.23f, -1.29f)
                        curveToRelative(0.54f, -1.57f, 2.01f, -2.71f, 3.77f, -2.71f)
                        horizontalLineToRelative(2.94f)
                        lineToRelative(1.29f, -1.29f)
                        curveTo(23.68f, 9.3f, 23.65f, 8.63f, 23.21f, 8.24f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22f, 16f)
                        verticalLineToRelative(-1f)
                        curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                        reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                        verticalLineToRelative(1f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(3f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(4f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-3f)
                        curveTo(23f, 16.45f, 22.55f, 16f, 22f, 16f)
                        close()
                        moveTo(21f, 16f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(-1f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                        verticalLineTo(16f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Signal_wifi_4_bar_lock!!
    }

private var _Signal_wifi_4_bar_lock: ImageVector? = null

