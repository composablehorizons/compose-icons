package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Table_sign: ImageVector
    get() {
        if (_Table_sign != null) return _Table_sign!!
        
        _Table_sign = ImageVector.Builder(
            name = "table_sign",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 840f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(240f, 800f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-110f)
                quadToRelative(-18f, -11f, -29f, -29f)
                reflectiveQuadToRelative(-11f, -41f)
                quadToRelative(0f, -33f, 23f, -56.5f)
                reflectiveQuadToRelative(57f, -23.5f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 620f)
                quadToRelative(0f, 23f, -11f, 40.5f)
                reflectiveQuadTo(520f, 689f)
                verticalLineToRelative(111f)
                horizontalLineToRelative(200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(400f, -560f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(680f, 280f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(640f, 240f)
                horizontalLineTo(320f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(280f, 280f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 320f)
                horizontalLineToRelative(320f)
                close()
                moveTo(200f, 640f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 560f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 80f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 160f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 640f)
                horizontalLineToRelative(-92f)
                quadToRelative(-12f, 0f, -20f, -9f)
                reflectiveQuadToRelative(-8f, -21f)
                quadToRelative(-2f, -27f, -12.5f, -51f)
                reflectiveQuadTo(600f, 515f)
                quadToRelative(-9f, -11f, -20f, -19.5f)
                reflectiveQuadTo(557f, 480f)
                horizontalLineToRelative(83f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(680f, 440f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(640f, 400f)
                horizontalLineTo(320f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(280f, 440f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 480f)
                horizontalLineToRelative(82f)
                quadToRelative(-12f, 7f, -23f, 15f)
                reflectiveQuadToRelative(-20f, 19f)
                quadToRelative(-17f, 20f, -27f, 44.5f)
                reflectiveQuadTo(320f, 610f)
                quadToRelative(-1f, 12f, -8.5f, 21f)
                reflectiveQuadToRelative(-19.5f, 9f)
                horizontalLineToRelative(-92f)
                close()
            }
        }.build()
        
        return _Table_sign!!
    }

private var _Table_sign: ImageVector? = null

