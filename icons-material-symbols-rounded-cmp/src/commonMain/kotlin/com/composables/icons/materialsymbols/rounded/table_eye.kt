package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Table_eye: ImageVector
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
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(282f)
                quadToRelative(0f, 17f, -11.5f, 28f)
                reflectiveQuadTo(800f, 521f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(760f, 481f)
                verticalLineToRelative(-41f)
                horizontalLineTo(627f)
                verticalLineToRelative(42f)
                quadToRelative(0f, 17f, -11.5f, 28f)
                reflectiveQuadTo(587f, 521f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(547f, 481f)
                verticalLineToRelative(-41f)
                horizontalLineTo(413f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(333f, 640f)
                horizontalLineTo(200f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(80f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(320f, 800f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(280f, 840f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(0f, -280f)
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
                quadToRelative(-79f, 0f, -147.5f, -36f)
                reflectiveQuadTo(382f, 782f)
                quadToRelative(-6f, -9f, -9f, -19.5f)
                reflectiveQuadToRelative(-3f, -21.5f)
                quadToRelative(0f, -11f, 3f, -22f)
                reflectiveQuadToRelative(9f, -21f)
                quadToRelative(42f, -66f, 110.5f, -102f)
                reflectiveQuadTo(640f, 560f)
                quadToRelative(79f, 0f, 147.5f, 36f)
                reflectiveQuadTo(898f, 698f)
                quadToRelative(6f, 10f, 9f, 20.5f)
                reflectiveQuadToRelative(3f, 21.5f)
                quadToRelative(0f, 11f, -3f, 21.5f)
                reflectiveQuadToRelative(-9f, 20.5f)
                quadToRelative(-42f, 66f, -110.5f, 102f)
                reflectiveQuadTo(640f, 920f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(57f, 0f, 107.5f, -26f)
                reflectiveQuadToRelative(82.5f, -74f)
                quadToRelative(-32f, -48f, -82.5f, -74f)
                reflectiveQuadTo(640f, 640f)
                quadToRelative(-57f, 0f, -107.5f, 26f)
                reflectiveQuadTo(450f, 740f)
                quadToRelative(32f, 48f, 82.5f, 74f)
                reflectiveQuadTo(640f, 840f)
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

