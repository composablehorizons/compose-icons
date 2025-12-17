package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Key_off: ImageVector
    get() {
        if (_Key_off != null) return _Key_off!!
        
        _Key_off = ImageVector.Builder(
            name = "key_off",
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
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
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
                        moveTo(10.7f, 13.53f)
                        lineToRelative(-1.71f, -1.71f)
                        curveTo(9f, 11.88f, 9f, 11.94f, 9f, 12f)
                        curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                        reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                        reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                        curveToRelative(0.06f, 0f, 0.12f, 0f, 0.18f, 0.01f)
                        lineTo(5.47f, 8.3f)
                        curveTo(4.02f, 8.9f, 3f, 10.33f, 3f, 12f)
                        curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                        curveTo(8.67f, 16f, 10.1f, 14.98f, 10.7f, 13.53f)
                        close()
                        moveTo(12.19f, 15.02f)
                        curveTo(11.15f, 16.8f, 9.21f, 18f, 7f, 18f)
                        curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                        curveToRelative(0f, -2.21f, 1.2f, -4.15f, 2.98f, -5.19f)
                        lineTo(1.39f, 4.22f)
                        lineToRelative(1.41f, -1.41f)
                        lineToRelative(18.38f, 18.38f)
                        lineToRelative(-1.41f, 1.41f)
                        lineTo(12.19f, 15.02f)
                        close()
                        moveTo(16.26f, 13.43f)
                        lineToRelative(1.24f, -0.93f)
                        lineToRelative(1.81f, 1.36f)
                        lineTo(21.17f, 12f)
                        lineToRelative(-1f, -1f)
                        lineToRelative(-6.34f, 0f)
                        lineToRelative(-2f, -2f)
                        lineTo(21f, 9f)
                        lineToRelative(0f, 0f)
                        lineToRelative(3f, 3f)
                        lineToRelative(-4.5f, 4.5f)
                        lineToRelative(-0.69f, -0.51f)
                        lineTo(16.26f, 13.43f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Key_off!!
    }

private var _Key_off: ImageVector? = null

