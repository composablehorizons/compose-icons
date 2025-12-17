package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Keyboard_double_arrow_right: ImageVector
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
                lineTo(228f, 324f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(228f, 268f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(184f, 184f)
                quadToRelative(6f, 6f, 8.5f, 13f)
                reflectiveQuadToRelative(2.5f, 15f)
                quadToRelative(0f, 8f, -2.5f, 15f)
                reflectiveQuadToRelative(-8.5f, 13f)
                lineTo(284f, 692f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(228f, 692f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(155f, -156f)
                close()
                moveToRelative(264f, 0f)
                lineTo(492f, 324f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(492f, 268f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                lineToRelative(184f, 184f)
                quadToRelative(6f, 6f, 8.5f, 13f)
                reflectiveQuadToRelative(2.5f, 15f)
                quadToRelative(0f, 8f, -2.5f, 15f)
                reflectiveQuadToRelative(-8.5f, 13f)
                lineTo(548f, 692f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(492f, 692f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(155f, -156f)
                close()
            }
        }.build()
        
        return _Keyboard_double_arrow_right!!
    }

private var _Keyboard_double_arrow_right: ImageVector? = null

