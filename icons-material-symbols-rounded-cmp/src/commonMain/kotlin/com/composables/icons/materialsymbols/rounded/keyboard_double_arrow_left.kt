package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Keyboard_double_arrow_left: ImageVector
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
                moveTo(313f, 480f)
                lineToRelative(155f, 156f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(468f, 692f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(228f, 508f)
                quadToRelative(-6f, -6f, -8.5f, -13f)
                reflectiveQuadToRelative(-2.5f, -15f)
                quadToRelative(0f, -8f, 2.5f, -15f)
                reflectiveQuadToRelative(8.5f, -13f)
                lineToRelative(184f, -184f)
                quadToRelative(11f, -11f, 27.5f, -11.5f)
                reflectiveQuadTo(468f, 268f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineTo(313f, 480f)
                close()
                moveToRelative(264f, 0f)
                lineToRelative(155f, 156f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(732f, 692f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(492f, 508f)
                quadToRelative(-6f, -6f, -8.5f, -13f)
                reflectiveQuadToRelative(-2.5f, -15f)
                quadToRelative(0f, -8f, 2.5f, -15f)
                reflectiveQuadToRelative(8.5f, -13f)
                lineToRelative(184f, -184f)
                quadToRelative(11f, -11f, 27.5f, -11.5f)
                reflectiveQuadTo(732f, 268f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                lineTo(577f, 480f)
                close()
            }
        }.build()
        
        return _Keyboard_double_arrow_left!!
    }

private var _Keyboard_double_arrow_left: ImageVector? = null

