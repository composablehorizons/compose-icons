package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Wifi_lock: ImageVector
    get() {
        if (_Wifi_lock != null) return _Wifi_lock!!
        
        _Wifi_lock = ImageVector.Builder(
            name = "wifi_lock",
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
                        moveTo(21.98f, 11f)
                        lineTo(24f, 8.98f)
                        curveTo(20.93f, 5.9f, 16.69f, 4f, 12f, 4f)
                        curveTo(7.31f, 4f, 3.07f, 5.9f, 0f, 8.98f)
                        lineToRelative(6.35f, 6.36f)
                        lineTo(12f, 21f)
                        lineToRelative(3.05f, -3.05f)
                        verticalLineTo(15f)
                        curveToRelative(0f, -0.45f, 0.09f, -0.88f, 0.23f, -1.29f)
                        curveToRelative(0.54f, -1.57f, 2.01f, -2.71f, 3.77f, -2.71f)
                        horizontalLineTo(21.98f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(22f, 15.11f)
                        curveToRelative(0f, -1f, -0.68f, -1.92f, -1.66f, -2.08f)
                        curveToRelative(-0.12f, -0.02f, -0.24f, -0.02f, -0.36f, -0.02f)
                        lineToRelative(0f, 0f)
                        curveToRelative(0f, 0f, -0.01f, 0f, -0.01f, 0f)
                        curveTo(18.88f, 13.03f, 18f, 13.91f, 18f, 15f)
                        verticalLineToRelative(1f)
                        curveToRelative(-0.55f, 0f, -1f, 0f, -1f, 0f)
                        verticalLineToRelative(5f)
                        horizontalLineToRelative(6f)
                        verticalLineToRelative(-5f)
                        curveToRelative(0f, 0f, -0.45f, 0f, -1f, 0f)
                        verticalLineTo(15.11f)
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
        
        return _Wifi_lock!!
    }

private var _Wifi_lock: ImageVector? = null

