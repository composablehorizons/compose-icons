package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Grocery: ImageVector
    get() {
        if (_Grocery != null) return _Grocery!!
        
        _Grocery = ImageVector.Builder(
            name = "grocery",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 880f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadToRelative(-70f, -170f)
                quadToRelative(0f, -100f, 70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                quadToRelative(100f, 0f, 170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                quadToRelative(0f, 100f, -70f, 170f)
                reflectiveQuadTo(640f, 880f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(66f, 0f, 113f, -47f)
                reflectiveQuadToRelative(47f, -113f)
                quadToRelative(0f, -66f, -47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                quadToRelative(-66f, 0f, -113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                quadToRelative(0f, 66f, 47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                close()
                moveToRelative(-560f, 0f)
                verticalLineToRelative(-402f)
                lineToRelative(86f, -198f)
                horizontalLineToRelative(-46f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-46f)
                lineToRelative(66f, 152f)
                quadToRelative(-19f, 10f, -36f, 21f)
                reflectiveQuadToRelative(-32f, 25f)
                lineToRelative(-84f, -198f)
                horizontalLineToRelative(-96f)
                lineToRelative(-92f, 216f)
                verticalLineToRelative(304f)
                horizontalLineToRelative(170f)
                quadToRelative(5f, 21f, 13.5f, 41.5f)
                reflectiveQuadTo(364f, 800f)
                horizontalLineTo(80f)
                close()
                moveToRelative(560f, -440f)
                quadToRelative(-42f, 0f, -71f, -29f)
                reflectiveQuadToRelative(-29f, -71f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                verticalLineToRelative(200f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                horizontalLineTo(640f)
                close()
            }
        }.build()
        
        return _Grocery!!
    }

private var _Grocery: ImageVector? = null

