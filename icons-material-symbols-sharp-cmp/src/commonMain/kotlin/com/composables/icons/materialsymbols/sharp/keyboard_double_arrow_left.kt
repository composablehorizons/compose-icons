package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Keyboard_double_arrow_left: ImageVector
    get() {
        if (_Keyboard_double_arrow_left != null) return _Keyboard_double_arrow_left!!
        
        _Keyboard_double_arrow_left = ImageVector.Builder(
            name = "keyboard_double_arrow_left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 720f)
                lineTo(200f, 480f)
                lineToRelative(240f, -240f)
                lineToRelative(56f, 56f)
                lineToRelative(-183f, 184f)
                lineToRelative(183f, 184f)
                lineToRelative(-56f, 56f)
                close()
                moveToRelative(264f, 0f)
                lineTo(464f, 480f)
                lineToRelative(240f, -240f)
                lineToRelative(56f, 56f)
                lineToRelative(-183f, 184f)
                lineToRelative(183f, 184f)
                lineToRelative(-56f, 56f)
                close()
            }
        }.build()
        
        return _Keyboard_double_arrow_left!!
    }

private var _Keyboard_double_arrow_left: ImageVector? = null

