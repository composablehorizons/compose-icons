package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Screen_rotation_alt: ImageVector
    get() {
        if (_Screen_rotation_alt != null) return _Screen_rotation_alt!!
        
        _Screen_rotation_alt = ImageVector.Builder(
            name = "screen_rotation_alt",
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
                    moveTo(4f, 7.59f)
                    lineToRelative(6.41f, -6.41f)
                    lineTo(20.24f, 11f)
                    horizontalLineToRelative(-2.83f)
                    lineTo(10.4f, 4f)
                    lineTo(5.41f, 9f)
                    horizontalLineTo(8f)
                    verticalLineToRelative(2f)
                    horizontalLineTo(2f)
                    verticalLineTo(5f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(7.59f)
                    close()
                    moveTo(20f, 19f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-6f)
                    horizontalLineToRelative(-6f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(2.59f)
                    lineToRelative(-4.99f, 5f)
                    lineToRelative(-7.01f, -7f)
                    horizontalLineTo(3.76f)
                    lineToRelative(9.83f, 9.83f)
                    lineTo(20f, 16.41f)
                    verticalLineTo(19f)
                    close()
                }
            }
        }.build()
        
        return _Screen_rotation_alt!!
    }

private var _Screen_rotation_alt: ImageVector? = null

