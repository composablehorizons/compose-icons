package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Pan_tool_alt: ImageVector
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(20.18f, 13.4f)
                    lineTo(19.1f, 21f)
                    horizontalLineToRelative(-9f)
                    lineTo(5f, 15.62f)
                    lineToRelative(1.22f, -1.23f)
                    lineTo(10f, 15.24f)
                    verticalLineTo(4.5f)
                    curveTo(10f, 3.67f, 10.67f, 3f, 11.5f, 3f)
                    reflectiveCurveTo(13f, 3.67f, 13f, 4.5f)
                    verticalLineToRelative(6f)
                    horizontalLineToRelative(1.38f)
                    lineTo(20.18f, 13.4f)
                    close()
                }
            }
        }.build()
        
        return _Pan_tool_alt!!
    }

private var _Pan_tool_alt: ImageVector? = null

