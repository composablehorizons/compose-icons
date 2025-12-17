package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Format_color_fill: ImageVector
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(16.56f, 8.94f)
                    lineTo(7.62f, 0f)
                    lineTo(6.21f, 1.41f)
                    lineToRelative(2.38f, 2.38f)
                    lineTo(3.44f, 8.94f)
                    curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0f, 2.12f)
                    lineToRelative(5.5f, 5.5f)
                    curveTo(9.23f, 16.85f, 9.62f, 17f, 10f, 17f)
                    reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
                    lineToRelative(5.5f, -5.5f)
                    curveTo(17.15f, 10.48f, 17.15f, 9.53f, 16.56f, 8.94f)
                    close()
                    moveTo(5.21f, 10f)
                    lineTo(10f, 5.21f)
                    lineTo(14.79f, 10f)
                    horizontalLineTo(5.21f)
                    close()
                    moveTo(19f, 11.5f)
                    curveToRelative(0f, 0f, -2f, 2.17f, -2f, 3.5f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                    curveTo(21f, 13.67f, 19f, 11.5f, 19f, 11.5f)
                    close()
                    moveTo(2f, 20f)
                    horizontalLineToRelative(20f)
                    verticalLineToRelative(4f)
                    horizontalLineTo(2f)
                    verticalLineTo(20f)
                    close()
                }
            }
        }.build()
        
        return _Format_color_fill!!
    }

private var _Format_color_fill: ImageVector? = null

