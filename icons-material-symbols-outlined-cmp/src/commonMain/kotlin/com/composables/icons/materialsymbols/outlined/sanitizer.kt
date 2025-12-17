package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Sanitizer: ImageVector
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
                quadToRelative(0f, -17f, 17f, -45f)
                reflectiveQuadToRelative(43f, -55f)
                quadToRelative(26f, 27f, 43f, 55f)
                reflectiveQuadToRelative(17f, 45f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(680f, 320f)
                close()
                moveToRelative(100f, 280f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -35f, 31f, -86.5f)
                reflectiveQuadToRelative(69f, -93.5f)
                quadToRelative(38f, 42f, 69f, 93.5f)
                reflectiveQuadToRelative(31f, 86.5f)
                quadToRelative(0f, 42f, -29f, 71f)
                reflectiveQuadToRelative(-71f, 29f)
                close()
                moveTo(360f, 720f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                close()
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -90f, 57f, -156f)
                reflectiveQuadToRelative(143f, -80f)
                verticalLineToRelative(-84f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                quadToRelative(34f, 0f, 64f, 10.5f)
                reflectiveQuadToRelative(56f, 29.5f)
                lineToRelative(-58f, 58f)
                quadToRelative(-14f, -8f, -29.5f, -13f)
                reflectiveQuadToRelative(-32.5f, -5f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(84f)
                quadToRelative(86f, 14f, 143f, 80f)
                reflectiveQuadToRelative(57f, 156f)
                verticalLineToRelative(320f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(560f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(0f, -80f)
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
            }
        }.build()
        
        return _Sanitizer!!
    }

private var _Sanitizer: ImageVector? = null

