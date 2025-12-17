package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Keyboard_double_arrow_up: ImageVector
    get() {
        if (_Keyboard_double_arrow_up != null) return _Keyboard_double_arrow_up!!
        
        _Keyboard_double_arrow_up = ImageVector.Builder(
            name = "keyboard_double_arrow_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(296f, 736f)
                lineToRelative(-56f, -56f)
                lineToRelative(240f, -240f)
                lineToRelative(240f, 240f)
                lineToRelative(-56f, 56f)
                lineToRelative(-184f, -183f)
                lineToRelative(-184f, 183f)
                close()
                moveToRelative(0f, -240f)
                lineToRelative(-56f, -56f)
                lineToRelative(240f, -240f)
                lineToRelative(240f, 240f)
                lineToRelative(-56f, 56f)
                lineToRelative(-184f, -183f)
                lineToRelative(-184f, 183f)
                close()
            }
        }.build()
        
        return _Keyboard_double_arrow_up!!
    }

private var _Keyboard_double_arrow_up: ImageVector? = null

