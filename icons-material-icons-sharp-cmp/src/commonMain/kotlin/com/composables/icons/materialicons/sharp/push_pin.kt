package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Push_pin: ImageVector
    get() {
        if (_Push_pin != null) return _Push_pin!!
        
        _Push_pin = ImageVector.Builder(
            name = "push_pin",
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
                    moveTo(16f, 9f)
                    verticalLineTo(4f)
                    lineToRelative(2f, 0f)
                    verticalLineTo(2f)
                    horizontalLineTo(6f)
                    verticalLineToRelative(2f)
                    lineToRelative(2f, 0f)
                    verticalLineToRelative(5f)
                    curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                    horizontalLineToRelative(0f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(5.97f)
                    verticalLineToRelative(7f)
                    lineToRelative(1f, 1f)
                    lineToRelative(1f, -1f)
                    verticalLineToRelative(-7f)
                    horizontalLineTo(19f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(0f)
                    curveTo(17.34f, 12f, 16f, 10.66f, 16f, 9f)
                    close()
                }
            }
        }.build()
        
        return _Push_pin!!
    }

private var _Push_pin: ImageVector? = null

