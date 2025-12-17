package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Format_color_fill: ImageVector
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
                        moveTo(8.94f, 16.56f)
                        curveTo(9.23f, 16.85f, 9.62f, 17f, 10f, 17f)
                        reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
                        lineToRelative(5.5f, -5.5f)
                        curveToRelative(0.59f, -0.58f, 0.59f, -1.53f, 0f, -2.12f)
                        lineTo(8.32f, 0.7f)
                        curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                        curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                        lineToRelative(1.68f, 1.68f)
                        lineTo(3.44f, 8.94f)
                        curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0f, 2.12f)
                        lineTo(8.94f, 16.56f)
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
                        moveTo(20f, 20f)
                        horizontalLineTo(4f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(16f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        reflectiveCurveTo(21.1f, 20f, 20f, 20f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Format_color_fill!!
    }

private var _Format_color_fill: ImageVector? = null

