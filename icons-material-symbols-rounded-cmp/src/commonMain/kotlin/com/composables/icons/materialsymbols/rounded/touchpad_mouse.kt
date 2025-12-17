package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Touchpad_mouse: ImageVector
    get() {
        if (_Touchpad_mouse != null) return _Touchpad_mouse!!
        
        _Touchpad_mouse = ImageVector.Builder(
            name = "touchpad_mouse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(660f, 800f)
                quadToRelative(58f, 0f, 99f, -41f)
                reflectiveQuadToRelative(41f, -99f)
                verticalLineToRelative(-60f)
                horizontalLineTo(520f)
                verticalLineToRelative(60f)
                quadToRelative(0f, 58f, 41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                close()
                moveTo(521f, 520f)
                horizontalLineToRelative(99f)
                verticalLineToRelative(-114f)
                quadToRelative(-38f, 11f, -65.5f, 42f)
                reflectiveQuadTo(521f, 520f)
                close()
                moveToRelative(179f, 0f)
                horizontalLineToRelative(99f)
                quadToRelative(-6f, -41f, -33.5f, -72f)
                reflectiveQuadTo(700f, 406f)
                verticalLineToRelative(114f)
                close()
                moveTo(660f, 880f)
                quadToRelative(-92f, 0f, -156f, -64f)
                reflectiveQuadToRelative(-64f, -156f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -92f, 64f, -156f)
                reflectiveQuadToRelative(156f, -64f)
                quadToRelative(92f, 0f, 156f, 64f)
                reflectiveQuadToRelative(64f, 156f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 92f, -64f, 156f)
                reflectiveQuadTo(660f, 880f)
                close()
                moveToRelative(-500f, -80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(680f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 240f)
                horizontalLineTo(160f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(161f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(361f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(321f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -80f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Touchpad_mouse!!
    }

private var _Touchpad_mouse: ImageVector? = null

