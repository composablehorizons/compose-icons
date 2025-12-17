package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Format_color_text: ImageVector
    get() {
        if (_Format_color_text != null) return _Format_color_text!!
        
        _Format_color_text = ImageVector.Builder(
            name = "format_color_text",
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
                        moveTo(20f, 20f)
                        horizontalLineTo(4f)
                        curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                        reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(16f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        reflectiveCurveTo(21.1f, 20f, 20f, 20f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(7.11f, 17f)
                        lineTo(7.11f, 17f)
                        curveToRelative(0.48f, 0f, 0.91f, -0.3f, 1.06f, -0.75f)
                        lineToRelative(1.01f, -2.83f)
                        horizontalLineToRelative(5.65f)
                        lineToRelative(0.99f, 2.82f)
                        curveTo(15.98f, 16.7f, 16.41f, 17f, 16.89f, 17f)
                        curveToRelative(0.79f, 0f, 1.33f, -0.79f, 1.05f, -1.52f)
                        lineTo(13.69f, 4.17f)
                        curveTo(13.43f, 3.47f, 12.75f, 3f, 12f, 3f)
                        reflectiveCurveToRelative(-1.43f, 0.47f, -1.69f, 1.17f)
                        lineTo(6.06f, 15.48f)
                        curveTo(5.78f, 16.21f, 6.33f, 17f, 7.11f, 17f)
                        close()
                        moveTo(11.94f, 5.6f)
                        horizontalLineToRelative(0.12f)
                        lineToRelative(2.03f, 5.79f)
                        horizontalLineTo(9.91f)
                        lineTo(11.94f, 5.6f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Format_color_text!!
    }

private var _Format_color_text: ImageVector? = null

