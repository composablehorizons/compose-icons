package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Keyboard_arrow_up: ImageVector
    get() {
        if (_Keyboard_arrow_up != null) return _Keyboard_arrow_up!!
        
        _Keyboard_arrow_up = ImageVector.Builder(
            name = "keyboard_arrow_up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 432f)
                lineTo(324f, 588f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(184f, -184f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(184f, 184f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(480f, 432f)
                close()
            }
        }.build()
        
        return _Keyboard_arrow_up!!
    }

private var _Keyboard_arrow_up: ImageVector? = null

