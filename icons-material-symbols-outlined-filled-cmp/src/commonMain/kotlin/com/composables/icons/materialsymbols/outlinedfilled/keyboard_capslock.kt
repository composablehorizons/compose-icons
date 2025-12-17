package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Keyboard_capslock: ImageVector
    get() {
        if (_Keyboard_capslock != null) return _Keyboard_capslock!!
        
        _Keyboard_capslock = ImageVector.Builder(
            name = "keyboard_capslock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 720f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                close()
                moveToRelative(240f, -496f)
                lineToRelative(240f, 240f)
                lineToRelative(-56f, 56f)
                lineToRelative(-184f, -184f)
                lineToRelative(-184f, 184f)
                lineToRelative(-56f, -56f)
                lineToRelative(240f, -240f)
                close()
            }
        }.build()
        
        return _Keyboard_capslock!!
    }

private var _Keyboard_capslock: ImageVector? = null

