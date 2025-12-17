package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Keyboard_onscreen: ImageVector
    get() {
        if (_Keyboard_onscreen != null) return _Keyboard_onscreen!!
        
        _Keyboard_onscreen = ImageVector.Builder(
            name = "keyboard_onscreen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 680f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(640f, 640f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(600f, 600f)
                horizontalLineTo(360f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 640f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 680f)
                close()
                moveTo(160f, 800f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 160f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 240f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 800f)
                horizontalLineTo(160f)
                close()
                moveToRelative(0f, -440f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-120f)
                horizontalLineTo(160f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(80f, 200f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(280f, 520f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(240f, 480f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(200f, 520f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(240f, 560f)
                close()
                moveToRelative(120f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(400f, 520f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(360f, 480f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(320f, 520f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(360f, 560f)
                close()
                moveToRelative(120f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 520f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 480f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 520f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 560f)
                close()
                moveToRelative(120f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(640f, 520f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(600f, 480f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(560f, 520f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(600f, 560f)
                close()
                moveToRelative(120f, 0f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(760f, 520f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(720f, 480f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(680f, 520f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(720f, 560f)
                close()
            }
        }.build()
        
        return _Keyboard_onscreen!!
    }

private var _Keyboard_onscreen: ImageVector? = null

