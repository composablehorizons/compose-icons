package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Height: ImageVector
    get() {
        if (_Height != null) return _Height!!
        
        _Height = ImageVector.Builder(
            name = "height",
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
                group {
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(13f, 6.99f)
                    horizontalLineToRelative(1.79f)
                    curveToRelative(0.45f, 0f, 0.67f, -0.54f, 0.35f, -0.85f)
                    lineToRelative(-2.79f, -2.78f)
                    curveToRelative(-0.2f, -0.19f, -0.51f, -0.19f, -0.71f, 0f)
                    lineTo(8.86f, 6.14f)
                    curveTo(8.54f, 6.45f, 8.76f, 6.99f, 9.21f, 6.99f)
                    horizontalLineTo(11f)
                    verticalLineToRelative(10.02f)
                    horizontalLineTo(9.21f)
                    curveToRelative(-0.45f, 0f, -0.67f, 0.54f, -0.35f, 0.85f)
                    lineToRelative(2.79f, 2.78f)
                    curveToRelative(0.2f, 0.19f, 0.51f, 0.19f, 0.71f, 0f)
                    lineToRelative(2.79f, -2.78f)
                    curveToRelative(0.32f, -0.31f, 0.09f, -0.85f, -0.35f, -0.85f)
                    horizontalLineTo(13f)
                    verticalLineTo(6.99f)
                    close()
                }
            }
        }.build()
        
        return _Height!!
    }

private var _Height: ImageVector? = null

