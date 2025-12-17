package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Numbers: ImageVector
    get() {
        if (_Numbers != null) return _Numbers!!
        
        _Numbers = ImageVector.Builder(
            name = "numbers",
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
                    moveTo(20.5f, 10f)
                    lineTo(21f, 8f)
                    horizontalLineToRelative(-4f)
                    lineToRelative(1f, -4f)
                    horizontalLineToRelative(-2f)
                    lineToRelative(-1f, 4f)
                    horizontalLineToRelative(-4f)
                    lineToRelative(1f, -4f)
                    horizontalLineToRelative(-2f)
                    lineTo(9f, 8f)
                    horizontalLineTo(5f)
                    lineToRelative(-0.5f, 2f)
                    horizontalLineToRelative(4f)
                    lineToRelative(-1f, 4f)
                    horizontalLineToRelative(-4f)
                    lineTo(3f, 16f)
                    horizontalLineToRelative(4f)
                    lineToRelative(-1f, 4f)
                    horizontalLineToRelative(2f)
                    lineToRelative(1f, -4f)
                    horizontalLineToRelative(4f)
                    lineToRelative(-1f, 4f)
                    horizontalLineToRelative(2f)
                    lineToRelative(1f, -4f)
                    horizontalLineToRelative(4f)
                    lineToRelative(0.5f, -2f)
                    horizontalLineToRelative(-4f)
                    lineToRelative(1f, -4f)
                    horizontalLineTo(20.5f)
                    close()
                    moveTo(13.5f, 14f)
                    horizontalLineToRelative(-4f)
                    lineToRelative(1f, -4f)
                    horizontalLineToRelative(4f)
                    lineTo(13.5f, 14f)
                    close()
                }
            }
        }.build()
        
        return _Numbers!!
    }

private var _Numbers: ImageVector? = null

