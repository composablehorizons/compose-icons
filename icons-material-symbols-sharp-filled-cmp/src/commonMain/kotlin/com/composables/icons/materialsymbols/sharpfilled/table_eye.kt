package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Table_eye: ImageVector
    get() {
        if (_Table_eye != null) return _Table_eye!!
        
        _Table_eye = ImageVector.Builder(
            name = "table_eye",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(120f, 840f)
                verticalLineToRelative(-720f)
                horizontalLineToRelative(720f)
                verticalLineToRelative(413f)
                quadToRelative(-19f, -11f, -38.5f, -20f)
                reflectiveQuadTo(760f, 497f)
                verticalLineToRelative(-57f)
                horizontalLineTo(627f)
                verticalLineToRelative(40f)
                quadToRelative(-21f, 1f, -41f, 3f)
                reflectiveQuadToRelative(-39f, 7f)
                verticalLineToRelative(-50f)
                horizontalLineTo(413f)
                verticalLineToRelative(111f)
                quadToRelative(-24f, 18f, -45.5f, 40.5f)
                reflectiveQuadTo(328f, 640f)
                horizontalLineTo(200f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(82f)
                quadToRelative(10f, 22f, 21.5f, 42f)
                reflectiveQuadToRelative(24.5f, 38f)
                horizontalLineTo(120f)
                close()
                moveToRelative(80f, -280f)
                horizontalLineToRelative(133f)
                verticalLineToRelative(-120f)
                horizontalLineTo(200f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(0f, -200f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-160f)
                horizontalLineTo(200f)
                verticalLineToRelative(160f)
                close()
                moveTo(640f, 920f)
                quadToRelative(-91f, 0f, -168f, -48f)
                reflectiveQuadTo(360f, 740f)
                quadToRelative(35f, -84f, 112f, -132f)
                reflectiveQuadToRelative(168f, -48f)
                quadToRelative(91f, 0f, 168f, 48f)
                reflectiveQuadToRelative(112f, 132f)
                quadToRelative(-35f, 84f, -112f, 132f)
                reflectiveQuadTo(640f, 920f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                quadToRelative(0f, -42f, -29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                quadToRelative(-42f, 0f, -71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                quadToRelative(0f, 42f, 29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                close()
                moveToRelative(0f, -40f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(580f, 740f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(640f, 680f)
                quadToRelative(25f, 0f, 42.5f, 17.5f)
                reflectiveQuadTo(700f, 740f)
                quadToRelative(0f, 25f, -17.5f, 42.5f)
                reflectiveQuadTo(640f, 800f)
                close()
            }
        }.build()
        
        return _Table_eye!!
    }

private var _Table_eye: ImageVector? = null

