package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Keyboard_double_arrow_right: ImageVector
    get() {
        if (_Keyboard_double_arrow_right != null) return _Keyboard_double_arrow_right!!
        
        _Keyboard_double_arrow_right = ImageVector.Builder(
            name = "keyboard_double_arrow_right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(383f, 480f)
                lineTo(200f, 296f)
                lineToRelative(56f, -56f)
                lineToRelative(240f, 240f)
                lineToRelative(-240f, 240f)
                lineToRelative(-56f, -56f)
                lineToRelative(183f, -184f)
                close()
                moveToRelative(264f, 0f)
                lineTo(464f, 296f)
                lineToRelative(56f, -56f)
                lineToRelative(240f, 240f)
                lineToRelative(-240f, 240f)
                lineToRelative(-56f, -56f)
                lineToRelative(183f, -184f)
                close()
            }
        }.build()
        
        return _Keyboard_double_arrow_right!!
    }

private var _Keyboard_double_arrow_right: ImageVector? = null

