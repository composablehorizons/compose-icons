package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Pan_tool_alt: ImageVector
    get() {
        if (_Pan_tool_alt != null) return _Pan_tool_alt!!
        
        _Pan_tool_alt = ImageVector.Builder(
            name = "pan_tool_alt",
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
                    moveTo(5.2f, 15.43f)
                    curveToRelative(0f, -0.65f, 0.6f, -1.13f, 1.24f, -0.99f)
                    lineTo(10f, 15.24f)
                    verticalLineTo(4.5f)
                    curveTo(10f, 3.67f, 10.67f, 3f, 11.5f, 3f)
                    reflectiveCurveTo(13f, 3.67f, 13f, 4.5f)
                    verticalLineToRelative(6f)
                    horizontalLineToRelative(0.91f)
                    curveToRelative(0.31f, 0f, 0.62f, 0.07f, 0.89f, 0.21f)
                    lineToRelative(4.09f, 2.04f)
                    curveToRelative(0.77f, 0.38f, 1.21f, 1.22f, 1.09f, 2.07f)
                    lineToRelative(-0.63f, 4.46f)
                    curveTo(19.21f, 20.27f, 18.36f, 21f, 17.37f, 21f)
                    horizontalLineToRelative(-6.16f)
                    curveToRelative(-0.53f, 0f, -1.29f, -0.21f, -1.66f, -0.59f)
                    lineToRelative(-4.07f, -4.29f)
                    curveTo(5.3f, 15.94f, 5.2f, 15.69f, 5.2f, 15.43f)
                    close()
                }
            }
        }.build()
        
        return _Pan_tool_alt!!
    }

private var _Pan_tool_alt: ImageVector? = null

