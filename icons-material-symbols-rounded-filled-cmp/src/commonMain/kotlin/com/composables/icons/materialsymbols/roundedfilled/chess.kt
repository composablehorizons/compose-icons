package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Chess: ImageVector
    get() {
        if (_Chess != null) return _Chess!!
        
        _Chess = ImageVector.Builder(
            name = "chess",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 840f)
                verticalLineToRelative(-120f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 640f)
                horizontalLineToRelative(52f)
                lineToRelative(22f, -160f)
                horizontalLineToRelative(-74f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 400f)
                horizontalLineToRelative(560f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 480f)
                horizontalLineToRelative(-74f)
                lineToRelative(22f, 160f)
                horizontalLineToRelative(52f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 720f)
                verticalLineToRelative(120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(800f, 880f)
                horizontalLineTo(160f)
                close()
                moveToRelative(130f, -540f)
                quadToRelative(-14f, 0f, -25f, -8.5f)
                reflectiveQuadTo(251f, 309f)
                lineToRelative(-33f, -149f)
                quadToRelative(-2f, -11f, 1.5f, -19.5f)
                reflectiveQuadTo(231f, 127f)
                quadToRelative(8f, -5f, 18f, -5.5f)
                reflectiveQuadToRelative(19f, 5.5f)
                quadToRelative(18f, 10f, 37f, 16f)
                reflectiveQuadToRelative(40f, 6f)
                quadToRelative(29f, 0f, 55f, -12f)
                reflectiveQuadToRelative(49f, -30f)
                quadToRelative(7f, -5f, 15f, -7.5f)
                reflectiveQuadToRelative(16f, -2.5f)
                quadToRelative(8f, 0f, 16f, 2.5f)
                reflectiveQuadToRelative(15f, 7.5f)
                quadToRelative(23f, 18f, 49f, 30f)
                reflectiveQuadToRelative(55f, 12f)
                quadToRelative(21f, 0f, 40f, -6.5f)
                reflectiveQuadToRelative(37f, -16.5f)
                quadToRelative(10f, -5f, 19.5f, -4f)
                reflectiveQuadToRelative(17.5f, 6f)
                quadToRelative(8f, 5f, 12f, 13.5f)
                reflectiveQuadToRelative(2f, 18.5f)
                lineToRelative(-33f, 149f)
                quadToRelative(-3f, 14f, -14f, 22.5f)
                reflectiveQuadToRelative(-25f, 8.5f)
                horizontalLineTo(290f)
                close()
            }
        }.build()
        
        return _Chess!!
    }

private var _Chess: ImageVector? = null

