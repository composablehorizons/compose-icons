package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Fan_indirect: ImageVector
    get() {
        if (_Fan_indirect != null) return _Fan_indirect!!
        
        _Fan_indirect = ImageVector.Builder(
            name = "fan_indirect",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(520f, 727f)
                lineToRelative(15f, -15f)
                quadToRelative(11f, -11f, 27.5f, -11f)
                reflectiveQuadToRelative(28.5f, 11f)
                quadToRelative(12f, 12f, 12f, 28.5f)
                reflectiveQuadTo(591f, 769f)
                lineToRelative(-83f, 83f)
                quadToRelative(-12f, 12f, -28f, 12f)
                reflectiveQuadToRelative(-28f, -12f)
                lineToRelative(-84f, -84f)
                quadToRelative(-11f, -11f, -11.5f, -27.5f)
                reflectiveQuadTo(368f, 712f)
                quadToRelative(11f, -11f, 27.5f, -11.5f)
                reflectiveQuadTo(424f, 711f)
                lineToRelative(16f, 16f)
                verticalLineToRelative(-207f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(480f, 480f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 520f)
                verticalLineToRelative(207f)
                close()
                moveToRelative(-327f, -67f)
                lineToRelative(16f, 16f)
                quadToRelative(11f, 11f, 11f, 27.5f)
                reflectiveQuadTo(208f, 732f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(40f, 620f)
                lineToRelative(112f, -112f)
                quadToRelative(12f, -12f, 28f, -11.5f)
                reflectiveQuadToRelative(28f, 12.5f)
                quadToRelative(11f, 12f, 11.5f, 28f)
                reflectiveQuadTo(208f, 565f)
                lineToRelative(-15f, 15f)
                horizontalLineToRelative(87f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 360f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(360f, 400f)
                verticalLineToRelative(180f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(280f, 660f)
                horizontalLineToRelative(-87f)
                close()
                moveToRelative(574f, 0f)
                horizontalLineToRelative(-87f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(600f, 580f)
                verticalLineToRelative(-180f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 360f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 400f)
                verticalLineToRelative(180f)
                horizontalLineToRelative(87f)
                lineToRelative(-15f, -15f)
                quadToRelative(-12f, -11f, -12f, -28f)
                reflectiveQuadToRelative(12f, -29f)
                quadToRelative(12f, -12f, 28.5f, -12f)
                reflectiveQuadToRelative(28.5f, 12f)
                lineToRelative(83f, 84f)
                quadToRelative(12f, 12f, 12f, 28f)
                reflectiveQuadToRelative(-12f, 28f)
                lineToRelative(-84f, 84f)
                quadToRelative(-11f, 11f, -27.5f, 11f)
                reflectiveQuadTo(752f, 732f)
                quadToRelative(-12f, -12f, -12f, -28.5f)
                reflectiveQuadToRelative(12f, -28.5f)
                lineToRelative(15f, -15f)
                close()
                moveTo(80f, 200f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 120f)
                horizontalLineToRelative(640f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 200f)
                verticalLineToRelative(188f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(840f, 428f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(800f, 388f)
                verticalLineToRelative(-188f)
                horizontalLineTo(160f)
                verticalLineToRelative(188f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(120f, 428f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(80f, 388f)
                verticalLineToRelative(-188f)
                close()
            }
        }.build()
        
        return _Fan_indirect!!
    }

private var _Fan_indirect: ImageVector? = null

