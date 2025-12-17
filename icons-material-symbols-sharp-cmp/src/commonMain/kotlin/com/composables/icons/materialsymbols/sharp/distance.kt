package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Distance: ImageVector
    get() {
        if (_Distance != null) return _Distance!!
        
        _Distance = ImageVector.Builder(
            name = "distance",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 880f)
                quadToRelative(-106f, 0f, -173f, -33.5f)
                reflectiveQuadTo(240f, 760f)
                quadToRelative(0f, -35f, 29f, -61f)
                reflectiveQuadToRelative(80f, -41f)
                lineToRelative(23f, 76f)
                quadToRelative(-17f, 5f, -31f, 12.5f)
                reflectiveQuadTo(322f, 760f)
                quadToRelative(13f, 16f, 60f, 28f)
                reflectiveQuadToRelative(98f, 12f)
                quadToRelative(51f, 0f, 98.5f, -12f)
                reflectiveQuadToRelative(60.5f, -28f)
                quadToRelative(-5f, -6f, -19f, -13.5f)
                reflectiveQuadTo(589f, 734f)
                lineToRelative(23f, -76f)
                quadToRelative(51f, 15f, 79.5f, 41f)
                reflectiveQuadToRelative(28.5f, 61f)
                quadToRelative(0f, 53f, -67f, 86.5f)
                reflectiveQuadTo(480f, 880f)
                close()
                moveToRelative(0f, -267f)
                quadToRelative(18f, -33f, 38f, -60.5f)
                reflectiveQuadToRelative(39f, -52.5f)
                quadToRelative(37f, -48f, 59f, -86.5f)
                reflectiveQuadToRelative(22f, -95.5f)
                quadToRelative(0f, -66f, -46f, -112f)
                reflectiveQuadToRelative(-112f, -46f)
                quadToRelative(-66f, 0f, -112f, 46f)
                reflectiveQuadToRelative(-46f, 112f)
                quadToRelative(0f, 57f, 22f, 95.5f)
                reflectiveQuadToRelative(59f, 86.5f)
                quadToRelative(19f, 25f, 39f, 52.5f)
                reflectiveQuadToRelative(38f, 60.5f)
                close()
                moveToRelative(0f, 147f)
                quadToRelative(-11f, 0f, -20f, -6.5f)
                reflectiveQuadTo(447f, 736f)
                quadToRelative(-23f, -71f, -58f, -119f)
                reflectiveQuadToRelative(-68f, -92f)
                quadToRelative(-32f, -44f, -55.5f, -91f)
                reflectiveQuadTo(242f, 318f)
                quadToRelative(0f, -100f, 69f, -169f)
                reflectiveQuadToRelative(169f, -69f)
                quadToRelative(100f, 0f, 169f, 69f)
                reflectiveQuadToRelative(69f, 169f)
                quadToRelative(0f, 69f, -23f, 116f)
                reflectiveQuadToRelative(-56f, 91f)
                quadToRelative(-32f, 44f, -67.5f, 92f)
                reflectiveQuadTo(513f, 736f)
                quadToRelative(-4f, 11f, -13f, 17.5f)
                reflectiveQuadToRelative(-20f, 6.5f)
                close()
                moveToRelative(0f, -357f)
                quadToRelative(35f, 0f, 60f, -25f)
                reflectiveQuadToRelative(25f, -60f)
                quadToRelative(0f, -35f, -25f, -60f)
                reflectiveQuadToRelative(-60f, -25f)
                quadToRelative(-35f, 0f, -60f, 25f)
                reflectiveQuadToRelative(-25f, 60f)
                quadToRelative(0f, 35f, 25f, 60f)
                reflectiveQuadToRelative(60f, 25f)
                close()
                moveToRelative(0f, -85f)
                close()
            }
        }.build()
        
        return _Distance!!
    }

private var _Distance: ImageVector? = null

