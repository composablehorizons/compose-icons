package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Terminal: ImageVector
    get() {
        if (_Terminal != null) return _Terminal!!
        
        _Terminal = ImageVector.Builder(
            name = "terminal",
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
                    moveTo(2f, 4f)
                    verticalLineToRelative(16f)
                    horizontalLineToRelative(20f)
                    verticalLineTo(4f)
                    horizontalLineTo(2f)
                    close()
                    moveTo(20f, 18f)
                    horizontalLineTo(4f)
                    verticalLineTo(8f)
                    horizontalLineToRelative(16f)
                    verticalLineTo(18f)
                    close()
                    moveTo(18f, 17f)
                    horizontalLineToRelative(-6f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(6f)
                    verticalLineTo(17f)
                    close()
                    moveTo(7.5f, 17f)
                    lineToRelative(-1.41f, -1.41f)
                    lineTo(8.67f, 13f)
                    lineToRelative(-2.59f, -2.59f)
                    lineTo(7.5f, 9f)
                    lineToRelative(4f, 4f)
                    lineTo(7.5f, 17f)
                    close()
                }
            }
        }.build()
        
        return _Terminal!!
    }

private var _Terminal: ImageVector? = null

