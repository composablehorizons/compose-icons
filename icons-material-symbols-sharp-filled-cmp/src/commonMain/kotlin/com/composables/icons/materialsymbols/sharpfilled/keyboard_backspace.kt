package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Keyboard_backspace: ImageVector
    get() {
        if (_Keyboard_backspace != null) return _Keyboard_backspace!!
        
        _Keyboard_backspace = ImageVector.Builder(
            name = "keyboard_backspace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 720f)
                lineTo(120f, 480f)
                lineToRelative(240f, -240f)
                lineToRelative(56f, 56f)
                lineToRelative(-144f, 144f)
                horizontalLineToRelative(568f)
                verticalLineToRelative(80f)
                horizontalLineTo(272f)
                lineToRelative(144f, 144f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Keyboard_backspace!!
    }

private var _Keyboard_backspace: ImageVector? = null

