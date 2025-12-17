package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Keyboard_option_key: ImageVector
    get() {
        if (_Keyboard_option_key != null) return _Keyboard_option_key!!
        
        _Keyboard_option_key = ImageVector.Builder(
            name = "keyboard_option_key",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(591f, 760f)
                lineTo(314f, 280f)
                horizontalLineTo(120f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                lineToRelative(277f, 480f)
                horizontalLineToRelative(203f)
                verticalLineToRelative(80f)
                horizontalLineTo(591f)
                close()
                moveToRelative(9f, -480f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                horizontalLineTo(600f)
                close()
            }
        }.build()
        
        return _Keyboard_option_key!!
    }

private var _Keyboard_option_key: ImageVector? = null

