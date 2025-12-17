package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Keyboard_backspace: ImageVector
    get() {
        if (_Keyboard_backspace != null) return _Keyboard_backspace!!
        
        _Keyboard_backspace = ImageVector.Builder(
            name = "keyboard_backspace",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 11f)
                horizontalLineTo(6.83f)
                lineToRelative(3.58f, -3.59f)
                lineTo(9f, 6f)
                lineToRelative(-6f, 6f)
                lineToRelative(6f, 6f)
                lineToRelative(1.41f, -1.41f)
                lineTo(6.83f, 13f)
                horizontalLineTo(21f)
                close()
            }
        }.build()
        
        return _Keyboard_backspace!!
    }

private var _Keyboard_backspace: ImageVector? = null

