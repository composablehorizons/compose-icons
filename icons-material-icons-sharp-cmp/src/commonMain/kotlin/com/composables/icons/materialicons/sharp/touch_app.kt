package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Touch_app: ImageVector
    get() {
        if (_Touch_app != null) return _Touch_app!!
        
        _Touch_app = ImageVector.Builder(
            name = "touch_app",
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
                        moveTo(8.25f, 9.24f)
                        verticalLineTo(5.5f)
                        curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                        reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                        verticalLineToRelative(3.74f)
                        curveToRelative(1.21f, -0.81f, 2f, -2.18f, 2f, -3.74f)
                        curveToRelative(0f, -2.49f, -2.01f, -4.5f, -4.5f, -4.5f)
                        reflectiveCurveToRelative(-4.5f, 2.01f, -4.5f, 4.5f)
                        curveTo(6.25f, 7.06f, 7.04f, 8.43f, 8.25f, 9.24f)
                        close()
                        moveTo(13.33f, 11.5f)
                        horizontalLineToRelative(-1.08f)
                        verticalLineToRelative(-6f)
                        curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                        reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                        verticalLineToRelative(10.74f)
                        lineToRelative(-4.04f, -0.85f)
                        lineTo(4f, 16.62f)
                        lineTo(9.38f, 22f)
                        horizontalLineToRelative(8.67f)
                        lineToRelative(1.07f, -7.62f)
                        lineTo(13.33f, 11.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Touch_app!!
    }

private var _Touch_app: ImageVector? = null

