package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Wifi_lock: ImageVector
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
        
        return _Wifi_lock!!
    }

private var _Wifi_lock: ImageVector? = null

