package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Task: ImageVector
    get() {
        if (_Task != null) return _Task!!
        
        _Task = ImageVector.Builder(
            name = "task",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(13f, 9f)
                    verticalLineTo(4f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(16f)
                    horizontalLineToRelative(12f)
                    verticalLineTo(9f)
                    horizontalLineTo(13f)
                    close()
                    moveTo(10.94f, 18f)
                    lineTo(7.4f, 14.46f)
                    lineToRelative(1.41f, -1.41f)
                    lineToRelative(2.12f, 2.12f)
                    lineToRelative(4.24f, -4.24f)
                    lineToRelative(1.41f, 1.41f)
                    lineTo(10.94f, 18f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(14f, 2f)
                    horizontalLineTo(6f)
                    curveTo(4.9f, 2f, 4.01f, 2.9f, 4.01f, 4f)
                    lineTo(4f, 20f)
                    curveToRelative(0f, 1.1f, 0.89f, 2f, 1.99f, 2f)
                    horizontalLineTo(18f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(8f)
                    lineTo(14f, 2f)
                    close()
                    moveTo(18f, 20f)
                    horizontalLineTo(6f)
                    verticalLineTo(4f)
                    horizontalLineToRelative(7f)
                    verticalLineToRelative(5f)
                    horizontalLineToRelative(5f)
                    verticalLineTo(20f)
                    close()
                    moveTo(8.82f, 13.05f)
                    lineTo(7.4f, 14.46f)
                    lineTo(10.94f, 18f)
                    lineToRelative(5.66f, -5.66f)
                    lineToRelative(-1.41f, -1.41f)
                    lineToRelative(-4.24f, 4.24f)
                    lineTo(8.82f, 13.05f)
                    close()
                }
            }
        }.build()
        
        return _Task!!
    }

private var _Task: ImageVector? = null

