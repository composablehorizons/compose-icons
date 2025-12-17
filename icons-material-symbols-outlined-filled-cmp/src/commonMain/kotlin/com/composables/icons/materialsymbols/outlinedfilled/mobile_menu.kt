package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Mobile_menu: ImageVector
    get() {
        if (_Mobile_menu != null) return _Mobile_menu!!
        
        _Mobile_menu = ImageVector.Builder(
            name = "mobile_menu",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 920f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 880f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 840f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(360f, 880f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(320f, 920f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 880f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 840f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 880f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 920f)
                close()
                moveToRelative(160f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 880f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 840f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 880f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(640f, 920f)
                close()
                moveTo(480f, 240f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 200f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 240f)
                close()
                moveToRelative(240f, -120f)
                verticalLineToRelative(82f)
                quadToRelative(17f, 3f, 28.5f, 16.5f)
                reflectiveQuadTo(760f, 249f)
                verticalLineToRelative(62f)
                quadToRelative(0f, 17f, -11.5f, 30.5f)
                reflectiveQuadTo(720f, 358f)
                verticalLineToRelative(322f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 760f)
                horizontalLineTo(320f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 680f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 40f)
                horizontalLineToRelative(320f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 120f)
                close()
            }
        }.build()
        
        return _Mobile_menu!!
    }

private var _Mobile_menu: ImageVector? = null

