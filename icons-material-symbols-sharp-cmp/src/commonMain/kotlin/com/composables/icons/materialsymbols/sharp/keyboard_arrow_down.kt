package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Keyboard_arrow_down: ImageVector
    get() {
        if (_Keyboard_arrow_down != null) return _Keyboard_arrow_down!!
        
        _Keyboard_arrow_down = ImageVector.Builder(
            name = "keyboard_arrow_down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 616f)
                lineTo(240f, 376f)
                lineToRelative(56f, -56f)
                lineToRelative(184f, 184f)
                lineToRelative(184f, -184f)
                lineToRelative(56f, 56f)
                lineToRelative(-240f, 240f)
                close()
            }
        }.build()
        
        return _Keyboard_arrow_down!!
    }

private var _Keyboard_arrow_down: ImageVector? = null

