package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Format_color_fill: ImageVector
    get() {
        if (_Format_color_fill != null) return _Format_color_fill!!
        
        _Format_color_fill = ImageVector.Builder(
            name = "format_color_fill",
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
                        moveTo(10f, 17.62f)
                        lineTo(17.62f, 10f)
                        lineToRelative(-10f, -10f)
                        lineTo(6.21f, 1.41f)
                        lineToRelative(2.38f, 2.38f)
                        lineTo(2.38f, 10f)
                        lineTo(10f, 17.62f)
                        close()
                        moveTo(10f, 5.21f)
                        lineTo(14.79f, 10f)
                        horizontalLineTo(5.21f)
                        lineTo(10f, 5.21f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(19f, 17f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        curveToRelative(0f, -1.33f, -2f, -3.5f, -2f, -3.5f)
                        reflectiveCurveToRelative(-2f, 2.17f, -2f, 3.5f)
                        curveTo(17f, 16.1f, 17.9f, 17f, 19f, 17f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(2f, 20f)
                        horizontalLineTo(22f)
                        verticalLineTo(24f)
                        horizontalLineTo(2f)
                        verticalLineTo(20f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Format_color_fill!!
    }

private var _Format_color_fill: ImageVector? = null

