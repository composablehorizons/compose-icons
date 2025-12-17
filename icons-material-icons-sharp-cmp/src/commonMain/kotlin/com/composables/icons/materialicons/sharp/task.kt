package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Task: ImageVector
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
                    moveTo(14f, 2f)
                    horizontalLineTo(4f)
                    verticalLineToRelative(20f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(8f)
                    lineTo(14f, 2f)
                    close()
                    moveTo(10.94f, 18f)
                    lineTo(7.4f, 14.46f)
                    lineToRelative(1.41f, -1.41f)
                    lineToRelative(2.12f, 2.12f)
                    lineToRelative(4.24f, -4.24f)
                    lineToRelative(1.41f, 1.41f)
                    lineTo(10.94f, 18f)
                    close()
                    moveTo(13f, 9f)
                    verticalLineTo(3.5f)
                    lineTo(18.5f, 9f)
                    horizontalLineTo(13f)
                    close()
                }
            }
        }.build()
        
        return _Task!!
    }

private var _Task: ImageVector? = null

