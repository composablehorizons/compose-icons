package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Keyboard_option_key: ImageVector
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
                moveTo(637f, 760f)
                quadToRelative(-22f, 0f, -40f, -10.5f)
                reflectiveQuadTo(568f, 720f)
                lineTo(314f, 280f)
                horizontalLineTo(160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 240f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 200f)
                horizontalLineToRelative(154f)
                quadToRelative(22f, 0f, 40f, 10.5f)
                reflectiveQuadToRelative(29f, 29.5f)
                lineToRelative(254f, 440f)
                horizontalLineToRelative(163f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 720f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 760f)
                horizontalLineTo(637f)
                close()
                moveToRelative(3f, -480f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 240f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 200f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 280f)
                horizontalLineTo(640f)
                close()
            }
        }.build()
        
        return _Keyboard_option_key!!
    }

private var _Keyboard_option_key: ImageVector? = null

