package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Landscape_2: ImageVector
    get() {
        if (_Landscape_2 != null) return _Landscape_2!!
        
        _Landscape_2 = ImageVector.Builder(
            name = "landscape_2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(46f, 800f)
                lineToRelative(138f, -276f)
                quadToRelative(10f, -20f, 28.5f, -32f)
                reflectiveQuadToRelative(41.5f, -12f)
                quadToRelative(24f, 0f, 44f, 12.5f)
                reflectiveQuadToRelative(29f, 35.5f)
                lineToRelative(27f, 66f)
                quadToRelative(2f, 6f, 9f, 5.5f)
                reflectiveQuadToRelative(9f, -6.5f)
                lineToRelative(86f, -287f)
                quadToRelative(14f, -48f, 53.5f, -77f)
                reflectiveQuadToRelative(89.5f, -29f)
                quadToRelative(49f, 0f, 87.5f, 28.5f)
                reflectiveQuadTo(742f, 303f)
                lineToRelative(173f, 497f)
                horizontalLineToRelative(-85f)
                lineTo(666f, 328f)
                quadToRelative(-8f, -23f, -25f, -35.5f)
                reflectiveQuadTo(601f, 280f)
                quadToRelative(-23f, 0f, -40.5f, 13f)
                reflectiveQuadTo(535f, 329f)
                lineToRelative(-86f, 287f)
                quadToRelative(-9f, 28f, -32.5f, 46f)
                reflectiveQuadTo(363f, 680f)
                quadToRelative(-27f, 0f, -50f, -14.5f)
                reflectiveQuadTo(280f, 625f)
                lineToRelative(-27f, -66f)
                lineToRelative(-118f, 241f)
                horizontalLineTo(46f)
                close()
                moveToRelative(194f, -400f)
                quadToRelative(-50f, 0f, -85f, -35.5f)
                reflectiveQuadTo(120f, 280f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 49f, -35f, 84.5f)
                reflectiveQuadTo(240f, 400f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(280f, 280f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(240f, 240f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(200f, 280f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(240f, 320f)
                close()
                moveToRelative(123f, 360f)
                close()
                moveTo(240f, 280f)
                close()
            }
        }.build()
        
        return _Landscape_2!!
    }

private var _Landscape_2: ImageVector? = null

