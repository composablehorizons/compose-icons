package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Sanitizer: ImageVector
    get() {
        if (_Sanitizer != null) return _Sanitizer!!
        
        _Sanitizer = ImageVector.Builder(
            name = "sanitizer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 320f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(620f, 260f)
                quadToRelative(0f, -19f, 16.5f, -44f)
                reflectiveQuadToRelative(28.5f, -39f)
                quadToRelative(6f, -7f, 15f, -7f)
                reflectiveQuadToRelative(15f, 7f)
                quadToRelative(12f, 14f, 28.5f, 39f)
                reflectiveQuadToRelative(16.5f, 44f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(680f, 320f)
                close()
                moveToRelative(100f, 280f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -35f, 27.5f, -80.5f)
                reflectiveQuadTo(757f, 348f)
                quadToRelative(9f, -11f, 23f, -11f)
                reflectiveQuadToRelative(23f, 11f)
                quadToRelative(22f, 26f, 49.5f, 71.5f)
                reflectiveQuadTo(880f, 500f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                close()
                moveToRelative(-420f, 40f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(400f, 720f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(440f, 680f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 600f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 560f)
                horizontalLineToRelative(-40f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(400f, 480f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(360f, 520f)
                verticalLineToRelative(40f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(280f, 600f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 640f)
                horizontalLineToRelative(40f)
                close()
                moveTo(240f, 800f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                verticalLineToRelative(320f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(320f)
                horizontalLineToRelative(-320f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -90f, 57f, -156f)
                reflectiveQuadToRelative(143f, -80f)
                verticalLineToRelative(-84f)
                horizontalLineToRelative(-40f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 120f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 80f)
                horizontalLineToRelative(200f)
                quadToRelative(26f, 0f, 50.5f, 6.5f)
                reflectiveQuadTo(617f, 105f)
                quadToRelative(11f, 5f, 17f, 15f)
                reflectiveQuadToRelative(6f, 22f)
                quadToRelative(0f, 17f, -12f, 28.5f)
                reflectiveQuadTo(599f, 182f)
                quadToRelative(-8f, 0f, -22f, -7f)
                quadToRelative(-13f, -7f, -27f, -11f)
                reflectiveQuadToRelative(-30f, -4f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(84f)
                quadToRelative(86f, 14f, 143f, 80f)
                reflectiveQuadToRelative(57f, 156f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(560f, 880f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        
        return _Sanitizer!!
    }

private var _Sanitizer: ImageVector? = null

