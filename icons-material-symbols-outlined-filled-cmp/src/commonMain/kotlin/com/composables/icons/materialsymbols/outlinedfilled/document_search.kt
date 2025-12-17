package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Document_search: ImageVector
    get() {
        if (_Document_search != null) return _Document_search!!
        
        _Document_search = ImageVector.Builder(
            name = "document_search",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(660f, 760f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                close()
                moveTo(864f, 920f)
                lineTo(756f, 813f)
                quadToRelative(-21f, 13f, -45.5f, 20f)
                reflectiveQuadToRelative(-50.5f, 7f)
                quadToRelative(-75f, 0f, -127.5f, -52.5f)
                reflectiveQuadTo(480f, 660f)
                quadToRelative(0f, -75f, 52.5f, -127.5f)
                reflectiveQuadTo(660f, 480f)
                quadToRelative(75f, 0f, 127.5f, 52.5f)
                reflectiveQuadTo(840f, 660f)
                quadToRelative(0f, 27f, -7.5f, 51.5f)
                reflectiveQuadTo(812f, 757f)
                lineTo(920f, 864f)
                lineToRelative(-56f, 56f)
                close()
                moveTo(200f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 80f)
                horizontalLineToRelative(320f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(100f)
                quadToRelative(-24f, -10f, -49f, -15f)
                reflectiveQuadToRelative(-51f, -5f)
                quadToRelative(-123f, 0f, -192.5f, 81.5f)
                reflectiveQuadTo(398f, 663f)
                quadToRelative(0f, 62f, 29.5f, 120f)
                reflectiveQuadTo(521f, 880f)
                horizontalLineTo(200f)
                close()
                moveToRelative(280f, -520f)
                horizontalLineToRelative(200f)
                lineTo(480f, 160f)
                lineToRelative(200f, 200f)
                lineToRelative(-200f, -200f)
                verticalLineToRelative(200f)
                close()
            }
        }.build()
        
        return _Document_search!!
    }

private var _Document_search: ImageVector? = null

