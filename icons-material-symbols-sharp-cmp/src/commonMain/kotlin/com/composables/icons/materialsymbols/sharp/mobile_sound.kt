package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Mobile_sound: ImageVector
    get() {
        if (_Mobile_sound != null) return _Mobile_sound!!
        
        _Mobile_sound = ImageVector.Builder(
            name = "mobile_sound",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(280f, 530f)
                verticalLineToRelative(310f)
                verticalLineToRelative(-720f)
                verticalLineToRelative(410f)
                close()
                moveTo(200f, 920f)
                verticalLineToRelative(-880f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(160f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(280f)
                verticalLineToRelative(720f)
                horizontalLineToRelative(400f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                horizontalLineTo(200f)
                close()
                moveToRelative(280f, -680f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(520f, 200f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(480f, 160f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(440f, 200f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(480f, 240f)
                close()
                moveToRelative(173f, 354f)
                lineToRelative(-58f, -58f)
                quadToRelative(12f, -11f, 18.5f, -25.5f)
                reflectiveQuadTo(620f, 480f)
                quadToRelative(0f, -16f, -6.5f, -30.5f)
                reflectiveQuadTo(595f, 424f)
                lineToRelative(58f, -58f)
                quadToRelative(23f, 23f, 35f, 52.5f)
                reflectiveQuadToRelative(12f, 61.5f)
                quadToRelative(0f, 32f, -12f, 61.5f)
                reflectiveQuadTo(653f, 594f)
                close()
                moveToRelative(98f, 98f)
                lineToRelative(-56f, -56f)
                quadToRelative(31f, -31f, 48f, -71f)
                reflectiveQuadToRelative(17f, -85f)
                quadToRelative(0f, -45f, -17f, -85f)
                reflectiveQuadToRelative(-48f, -71f)
                lineToRelative(56f, -56f)
                quadToRelative(43f, 42f, 66f, 97f)
                reflectiveQuadToRelative(23f, 115f)
                quadToRelative(0f, 60f, -23f, 115f)
                reflectiveQuadToRelative(-66f, 97f)
                close()
            }
        }.build()
        
        return _Mobile_sound!!
    }

private var _Mobile_sound: ImageVector? = null

