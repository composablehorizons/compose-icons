package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Keyboard_return: ImageVector
    get() {
        if (_Keyboard_return != null) return _Keyboard_return!!
        
        _Keyboard_return = ImageVector.Builder(
            name = "keyboard_return",
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
                horizontalLineToRelative(488f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineTo(272f)
                lineToRelative(144f, 144f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Keyboard_return!!
    }

private var _Keyboard_return: ImageVector? = null

