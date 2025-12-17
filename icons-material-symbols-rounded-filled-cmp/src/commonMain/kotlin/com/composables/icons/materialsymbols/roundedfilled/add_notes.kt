package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Add_notes: ImageVector
    get() {
        if (_Add_notes != null) return _Add_notes!!
        
        _Add_notes = ImageVector.Builder(
            name = "add_notes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(700f, 740f)
                verticalLineToRelative(80f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                quadToRelative(8f, 0f, 14f, -6f)
                reflectiveQuadToRelative(6f, -14f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -8f, -6f, -14f)
                reflectiveQuadToRelative(-14f, -6f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                quadToRelative(-8f, 0f, -14f, 6f)
                reflectiveQuadToRelative(-6f, 14f)
                quadToRelative(0f, 8f, 6f, 14f)
                reflectiveQuadToRelative(14f, 6f)
                horizontalLineToRelative(80f)
                close()
                moveToRelative(20f, 180f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 920f)
                close()
                moveTo(320f, 360f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(680f, 320f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(640f, 280f)
                horizontalLineTo(320f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(280f, 320f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 360f)
                close()
                moveTo(200f, 840f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 760f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 120f)
                horizontalLineToRelative(560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 200f)
                verticalLineToRelative(218f)
                quadToRelative(0f, 18f, -15f, 28f)
                reflectiveQuadToRelative(-32f, 4f)
                quadToRelative(-17f, -5f, -35.5f, -7.5f)
                reflectiveQuadTo(720f, 440f)
                quadToRelative(-11f, 0f, -20.5f, 0.5f)
                reflectiveQuadTo(680f, 443f)
                quadToRelative(-9f, -2f, -20f, -2.5f)
                reflectiveQuadToRelative(-20f, -0.5f)
                horizontalLineTo(320f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(280f, 480f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 520f)
                horizontalLineToRelative(205f)
                quadToRelative(-18f, 17f, -32.5f, 37f)
                reflectiveQuadTo(467f, 600f)
                horizontalLineTo(320f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(280f, 640f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(320f, 680f)
                horizontalLineToRelative(123f)
                quadToRelative(-2f, 10f, -2.5f, 19.5f)
                reflectiveQuadTo(440f, 720f)
                quadToRelative(0f, 20f, 2f, 38f)
                reflectiveQuadToRelative(7f, 35f)
                quadToRelative(5f, 17f, -5f, 32f)
                reflectiveQuadToRelative(-27f, 15f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Add_notes!!
    }

private var _Add_notes: ImageVector? = null

