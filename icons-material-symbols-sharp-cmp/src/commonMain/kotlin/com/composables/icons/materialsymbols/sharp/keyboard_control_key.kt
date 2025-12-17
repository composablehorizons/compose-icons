package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Keyboard_control_key: ImageVector
    get() {
        if (_Keyboard_control_key != null) return _Keyboard_control_key!!
        
        _Keyboard_control_key = ImageVector.Builder(
            name = "keyboard_control_key",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 536f)
                lineToRelative(-56f, -56f)
                lineToRelative(280f, -280f)
                lineToRelative(280f, 280f)
                lineToRelative(-56f, 56f)
                lineToRelative(-224f, -223f)
                lineToRelative(-224f, 223f)
                close()
            }
        }.build()
        
        return _Keyboard_control_key!!
    }

private var _Keyboard_control_key: ImageVector? = null

