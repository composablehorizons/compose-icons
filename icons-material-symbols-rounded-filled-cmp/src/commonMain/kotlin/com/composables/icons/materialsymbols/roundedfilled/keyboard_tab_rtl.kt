package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Keyboard_tab_rtl: ImageVector
    get() {
        if (_Keyboard_tab_rtl != null) return _Keyboard_tab_rtl!!
        
        _Keyboard_tab_rtl = ImageVector.Builder(
            name = "keyboard_tab_rtl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 720f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 680f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(160f, 280f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(120f, 720f)
                close()
                moveToRelative(273f, -200f)
                lineToRelative(115f, 115f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(508f, 692f)
                quadToRelative(-12f, 11f, -28.5f, 11f)
                reflectiveQuadTo(452f, 692f)
                lineTo(268f, 508f)
                quadToRelative(-6f, -6f, -8.5f, -13f)
                reflectiveQuadToRelative(-2.5f, -15f)
                quadToRelative(0f, -8f, 2.5f, -15f)
                reflectiveQuadToRelative(8.5f, -13f)
                lineToRelative(184f, -184f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                quadToRelative(12f, 12f, 11.5f, 28.5f)
                reflectiveQuadTo(508f, 324f)
                lineTo(393f, 440f)
                horizontalLineToRelative(447f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 480f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 520f)
                horizontalLineTo(393f)
                close()
            }
        }.build()
        
        return _Keyboard_tab_rtl!!
    }

private var _Keyboard_tab_rtl: ImageVector? = null

