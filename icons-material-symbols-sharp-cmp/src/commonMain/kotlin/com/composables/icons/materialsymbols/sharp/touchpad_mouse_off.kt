package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Touchpad_mouse_off: ImageVector
    get() {
        if (_Touchpad_mouse_off != null) return _Touchpad_mouse_off!!
        
        _Touchpad_mouse_off = ImageVector.Builder(
            name = "touchpad_mouse_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(660f, 601f)
                close()
                moveToRelative(0f, 0f)
                close()
                moveTo(819f, 932f)
                lineTo(27f, 140f)
                lineToRelative(57f, -57f)
                lineTo(876f, 875f)
                lineToRelative(-57f, 57f)
                close()
                moveTo(660f, 601f)
                close()
                moveToRelative(0f, 0f)
                close()
                moveToRelative(0f, 279f)
                quadToRelative(-92f, 0f, -156f, -64f)
                reflectiveQuadToRelative(-64f, -156f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -23f, 4.5f, -43.5f)
                reflectiveQuadTo(457f, 456f)
                lineToRelative(144f, 144f)
                horizontalLineToRelative(-81f)
                verticalLineToRelative(60f)
                quadToRelative(0f, 58f, 41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                quadToRelative(29f, 0f, 54.5f, -11f)
                reflectiveQuadToRelative(44.5f, -31f)
                lineToRelative(57f, 57f)
                quadToRelative(-30f, 30f, -70f, 47.5f)
                reflectiveQuadTo(660f, 880f)
                close()
                moveToRelative(202f, -133f)
                lineToRelative(-64f, -64f)
                quadToRelative(1f, -6f, 1.5f, -11.5f)
                reflectiveQuadToRelative(0.5f, -11.5f)
                verticalLineToRelative(-60f)
                horizontalLineToRelative(-85f)
                lineToRelative(-95f, -95f)
                verticalLineToRelative(-99f)
                quadToRelative(-17f, 5f, -32.5f, 14.5f)
                reflectiveQuadTo(559f, 444f)
                lineToRelative(-57f, -57f)
                quadToRelative(30f, -31f, 70.5f, -49f)
                reflectiveQuadToRelative(87.5f, -18f)
                quadToRelative(92f, 0f, 156f, 64f)
                reflectiveQuadToRelative(64f, 156f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 23f, -5f, 45f)
                reflectiveQuadToRelative(-13f, 42f)
                close()
                moveTo(700f, 520f)
                horizontalLineToRelative(99f)
                quadToRelative(-6f, -41f, -33.5f, -72f)
                reflectiveQuadTo(700f, 406f)
                verticalLineToRelative(114f)
                close()
                moveTo(397f, 396f)
                close()
                moveTo(80f, 800f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(81f)
                lineToRelative(80f, 80f)
                horizontalLineToRelative(-81f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(206f)
                quadToRelative(5f, 21f, 11.5f, 41f)
                reflectiveQuadToRelative(16.5f, 39f)
                horizontalLineTo(80f)
                close()
                moveToRelative(275f, -560f)
                lineToRelative(-80f, -80f)
                horizontalLineToRelative(605f)
                verticalLineToRelative(80f)
                horizontalLineTo(355f)
                close()
                moveToRelative(96f, 96f)
                close()
            }
        }.build()
        
        return _Touchpad_mouse_off!!
    }

private var _Touchpad_mouse_off: ImageVector? = null

