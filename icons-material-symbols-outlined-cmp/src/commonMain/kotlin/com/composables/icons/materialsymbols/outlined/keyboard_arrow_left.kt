package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Keyboard_arrow_left: ImageVector
    get() {
        if (_Keyboard_arrow_left != null) return _Keyboard_arrow_left!!
        
        _Keyboard_arrow_left = ImageVector.Builder(
            name = "keyboard_arrow_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 720f)
                lineTo(320f, 480f)
                lineToRelative(240f, -240f)
                lineToRelative(56f, 56f)
                lineToRelative(-184f, 184f)
                lineToRelative(184f, 184f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Keyboard_arrow_left!!
    }

private var _Keyboard_arrow_left: ImageVector? = null

