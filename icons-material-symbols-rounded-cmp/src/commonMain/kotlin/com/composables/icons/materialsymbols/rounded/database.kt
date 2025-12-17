package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Database: ImageVector
    get() {
        if (_Database != null) return _Database!!
        
        _Database = ImageVector.Builder(
            name = "database",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 840f)
                quadToRelative(-151f, 0f, -255.5f, -46.5f)
                reflectiveQuadTo(120f, 680f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -66f, 105.5f, -113f)
                reflectiveQuadTo(480f, 120f)
                quadToRelative(149f, 0f, 254.5f, 47f)
                reflectiveQuadTo(840f, 280f)
                verticalLineToRelative(400f)
                quadToRelative(0f, 67f, -104.5f, 113.5f)
                reflectiveQuadTo(480f, 840f)
                close()
                moveToRelative(0f, -479f)
                quadToRelative(89f, 0f, 179f, -25.5f)
                reflectiveQuadTo(760f, 281f)
                quadToRelative(-11f, -29f, -100.5f, -55f)
                reflectiveQuadTo(480f, 200f)
                quadToRelative(-91f, 0f, -178.5f, 25.5f)
                reflectiveQuadTo(200f, 281f)
                quadToRelative(14f, 30f, 101.5f, 55f)
                reflectiveQuadTo(480f, 361f)
                close()
                moveToRelative(0f, 199f)
                quadToRelative(42f, 0f, 81f, -4f)
                reflectiveQuadToRelative(74.5f, -11.5f)
                quadToRelative(35.5f, -7.5f, 67f, -18.5f)
                reflectiveQuadToRelative(57.5f, -25f)
                verticalLineToRelative(-120f)
                quadToRelative(-26f, 14f, -57.5f, 25f)
                reflectiveQuadToRelative(-67f, 18.5f)
                quadTo(600f, 432f, 561f, 436f)
                reflectiveQuadToRelative(-81f, 4f)
                quadToRelative(-42f, 0f, -82f, -4f)
                reflectiveQuadToRelative(-75.5f, -11.5f)
                quadTo(287f, 417f, 256f, 406f)
                reflectiveQuadToRelative(-56f, -25f)
                verticalLineToRelative(120f)
                quadToRelative(25f, 14f, 56f, 25f)
                reflectiveQuadToRelative(66.5f, 18.5f)
                quadTo(358f, 552f, 398f, 556f)
                reflectiveQuadToRelative(82f, 4f)
                close()
                moveToRelative(0f, 200f)
                quadToRelative(46f, 0f, 93.5f, -7f)
                reflectiveQuadToRelative(87.5f, -18.5f)
                quadToRelative(40f, -11.5f, 67f, -26f)
                reflectiveQuadToRelative(32f, -29.5f)
                verticalLineToRelative(-98f)
                quadToRelative(-26f, 14f, -57.5f, 25f)
                reflectiveQuadToRelative(-67f, 18.5f)
                quadTo(600f, 632f, 561f, 636f)
                reflectiveQuadToRelative(-81f, 4f)
                quadToRelative(-42f, 0f, -82f, -4f)
                reflectiveQuadToRelative(-75.5f, -11.5f)
                quadTo(287f, 617f, 256f, 606f)
                reflectiveQuadToRelative(-56f, -25f)
                verticalLineToRelative(99f)
                quadToRelative(5f, 15f, 31.5f, 29f)
                reflectiveQuadToRelative(66.5f, 25.5f)
                quadToRelative(40f, 11.5f, 88f, 18.5f)
                reflectiveQuadToRelative(94f, 7f)
                close()
            }
        }.build()
        
        return _Database!!
    }

private var _Database: ImageVector? = null

