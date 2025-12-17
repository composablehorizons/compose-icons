package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Shortcut: ImageVector
    get() {
        if (_Shortcut != null) return _Shortcut!!
        
        _Shortcut = ImageVector.Builder(
            name = "shortcut",
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
                    moveTo(21f, 11f)
                    lineToRelative(-6f, -6f)
                    verticalLineToRelative(5f)
                    horizontalLineTo(8f)
                    curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-4f)
                    curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                    horizontalLineToRelative(7f)
                    verticalLineToRelative(5f)
                    lineTo(21f, 11f)
                    close()
                }
            }
        }.build()
        
        return _Shortcut!!
    }

private var _Shortcut: ImageVector? = null

