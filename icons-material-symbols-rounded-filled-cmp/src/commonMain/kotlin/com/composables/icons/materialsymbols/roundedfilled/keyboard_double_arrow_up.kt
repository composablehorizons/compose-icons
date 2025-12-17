package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Keyboard_double_arrow_up: ImageVector
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
                moveTo(480f, 553f)
                lineTo(324f, 708f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(268f, 708f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(184f, -184f)
                quadToRelative(6f, -6f, 13f, -8.5f)
                reflectiveQuadToRelative(15f, -2.5f)
                quadToRelative(8f, 0f, 15f, 2.5f)
                reflectiveQuadToRelative(13f, 8.5f)
                lineToRelative(184f, 184f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(692f, 708f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(480f, 553f)
                close()
                moveToRelative(0f, -240f)
                lineTo(324f, 468f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(268f, 468f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(184f, -184f)
                quadToRelative(6f, -6f, 13f, -8.5f)
                reflectiveQuadToRelative(15f, -2.5f)
                quadToRelative(8f, 0f, 15f, 2.5f)
                reflectiveQuadToRelative(13f, 8.5f)
                lineToRelative(184f, 184f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(692f, 468f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(480f, 313f)
                close()
            }
        }.build()
        
        return _Keyboard_double_arrow_up!!
    }

private var _Keyboard_double_arrow_up: ImageVector? = null

