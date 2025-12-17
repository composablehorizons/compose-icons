package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Demography: ImageVector
    get() {
        if (_Demography != null) return _Demography!!
        
        _Demography = ImageVector.Builder(
            name = "demography",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(720f, 720f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(780f, 660f)
                quadToRelative(0f, -25f, -17.5f, -42.5f)
                reflectiveQuadTo(720f, 600f)
                quadToRelative(-25f, 0f, -42.5f, 17.5f)
                reflectiveQuadTo(660f, 660f)
                quadToRelative(0f, 25f, 17.5f, 42.5f)
                reflectiveQuadTo(720f, 720f)
                close()
                moveToRelative(0f, 120f)
                quadToRelative(30f, 0f, 56f, -14f)
                reflectiveQuadToRelative(43f, -39f)
                quadToRelative(-23f, -14f, -48f, -20.5f)
                reflectiveQuadToRelative(-51f, -6.5f)
                quadToRelative(-26f, 0f, -51f, 6.5f)
                reflectiveQuadTo(621f, 787f)
                quadToRelative(17f, 25f, 43f, 39f)
                reflectiveQuadToRelative(56f, 14f)
                close()
                moveToRelative(0f, 80f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 920f)
                close()
                moveTo(280f, 360f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(187f, 480f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(268f)
                quadToRelative(-29f, -14f, -58.5f, -21f)
                reflectiveQuadToRelative(-61.5f, -7f)
                quadToRelative(-11f, 0f, -20.5f, 0.5f)
                reflectiveQuadTo(680f, 443f)
                verticalLineToRelative(-3f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(245f)
                quadToRelative(-18f, 17f, -32.5f, 37f)
                reflectiveQuadTo(467f, 600f)
                horizontalLineTo(280f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(163f)
                quadToRelative(-2f, 10f, -2.5f, 19.5f)
                reflectiveQuadTo(440f, 720f)
                quadToRelative(0f, 33f, 6f, 61.5f)
                reflectiveQuadToRelative(21f, 58.5f)
                close()
            }
        }.build()
        
        return _Demography!!
    }

private var _Demography: ImageVector? = null

