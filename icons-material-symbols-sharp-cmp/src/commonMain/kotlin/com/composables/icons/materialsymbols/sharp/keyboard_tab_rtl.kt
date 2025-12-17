package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Keyboard_tab_rtl: ImageVector
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
                moveTo(160f, 720f)
                horizontalLineTo(80f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(480f)
                close()
                moveToRelative(320f, 0f)
                lineTo(240f, 480f)
                lineToRelative(240f, -240f)
                lineToRelative(56f, 56f)
                lineToRelative(-143f, 144f)
                horizontalLineToRelative(487f)
                verticalLineToRelative(80f)
                horizontalLineTo(393f)
                lineToRelative(144f, 144f)
                lineToRelative(-57f, 56f)
                close()
            }
        }.build()
        
        return _Keyboard_tab_rtl!!
    }

private var _Keyboard_tab_rtl: ImageVector? = null

