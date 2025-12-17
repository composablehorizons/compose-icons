package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Keyboard_control_key: ImageVector
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
                moveTo(480f, 313f)
                lineTo(284f, 508f)
                quadToRelative(-11f, 11f, -27.5f, 11.5f)
                reflectiveQuadTo(228f, 508f)
                quadToRelative(-11f, -11f, -11f, -28f)
                reflectiveQuadToRelative(11f, -28f)
                lineToRelative(224f, -224f)
                quadToRelative(12f, -12f, 28f, -12f)
                reflectiveQuadToRelative(28f, 12f)
                lineToRelative(224f, 224f)
                quadToRelative(11f, 11f, 11.5f, 27.5f)
                reflectiveQuadTo(732f, 508f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(480f, 313f)
                close()
            }
        }.build()
        
        return _Keyboard_control_key!!
    }

private var _Keyboard_control_key: ImageVector? = null

