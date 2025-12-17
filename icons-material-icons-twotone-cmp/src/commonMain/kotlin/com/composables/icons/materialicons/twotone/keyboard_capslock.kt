package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Keyboard_capslock: ImageVector
    get() {
        if (_Keyboard_capslock != null) return _Keyboard_capslock!!
        
        _Keyboard_capslock = ImageVector.Builder(
            name = "keyboard_capslock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 8.41f)
                lineTo(16.59f, 13f)
                lineTo(18f, 11.59f)
                lineToRelative(-6f, -6f)
                lineToRelative(-6f, 6f)
                lineTo(7.41f, 13f)
                lineTo(12f, 8.41f)
                close()
                moveTo(6f, 18f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                close()
            }
        }.build()
        
        return _Keyboard_capslock!!
    }

private var _Keyboard_capslock: ImageVector? = null

