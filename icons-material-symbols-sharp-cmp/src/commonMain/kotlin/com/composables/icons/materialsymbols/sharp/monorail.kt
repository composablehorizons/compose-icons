package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Monorail: ImageVector
    get() {
        if (_Monorail != null) return _Monorail!!
        
        _Monorail = ImageVector.Builder(
            name = "monorail",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(440f, 680f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(80f)
                horizontalLineTo(240f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(200f)
                verticalLineToRelative(-120f)
                close()
                moveTo(320f, 80f)
                horizontalLineToRelative(320f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                verticalLineToRelative(380f)
                quadToRelative(0f, 59f, -41f, 99.5f)
                reflectiveQuadTo(660f, 760f)
                horizontalLineTo(560f)
                verticalLineToRelative(-120f)
                horizontalLineTo(400f)
                verticalLineToRelative(120f)
                horizontalLineTo(300f)
                quadToRelative(-59f, 0f, -99.5f, -40.5f)
                reflectiveQuadTo(160f, 620f)
                verticalLineToRelative(-380f)
                quadToRelative(0f, -66f, 46.5f, -113f)
                reflectiveQuadTo(320f, 80f)
                close()
                moveToRelative(-80f, 400f)
                verticalLineToRelative(140f)
                quadToRelative(0f, 26f, 17f, 43f)
                reflectiveQuadToRelative(43f, 17f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(20f)
                quadToRelative(25f, 0f, 42.5f, -17f)
                reflectiveQuadToRelative(17.5f, -43f)
                verticalLineToRelative(-140f)
                horizontalLineTo(240f)
                close()
                moveToRelative(0f, -200f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-120f)
                horizontalLineTo(240f)
                close()
                moveToRelative(80f, -120f)
                quadToRelative(-23f, 0f, -40.5f, 11f)
                reflectiveQuadTo(251f, 200f)
                horizontalLineToRelative(458f)
                quadToRelative(-11f, -18f, -29f, -29f)
                reflectiveQuadToRelative(-40f, -11f)
                horizontalLineTo(320f)
                close()
                moveToRelative(-80f, 320f)
                horizontalLineToRelative(480f)
                horizontalLineToRelative(-480f)
                close()
                moveToRelative(80f, -280f)
                horizontalLineToRelative(389f)
                horizontalLineToRelative(-458f)
                horizontalLineToRelative(69f)
                close()
            }
        }.build()
        
        return _Monorail!!
    }

private var _Monorail: ImageVector? = null

