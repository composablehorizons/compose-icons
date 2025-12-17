package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Quiz: ImageVector
    get() {
        if (_Quiz != null) return _Quiz!!
        
        _Quiz = ImageVector.Builder(
            name = "quiz",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 600f)
                quadToRelative(17f, 0f, 29.5f, -12.5f)
                reflectiveQuadTo(602f, 558f)
                quadToRelative(0f, -17f, -12.5f, -29.5f)
                reflectiveQuadTo(560f, 516f)
                quadToRelative(-17f, 0f, -29.5f, 12.5f)
                reflectiveQuadTo(518f, 558f)
                quadToRelative(0f, 17f, 12.5f, 29.5f)
                reflectiveQuadTo(560f, 600f)
                close()
                moveToRelative(0f, -128f)
                quadToRelative(11f, 0f, 20.5f, -8f)
                reflectiveQuadToRelative(11.5f, -21f)
                quadToRelative(2f, -12f, 8.5f, -22f)
                reflectiveQuadToRelative(23.5f, -27f)
                quadToRelative(30f, -30f, 40f, -48.5f)
                reflectiveQuadToRelative(10f, -43.5f)
                quadToRelative(0f, -45f, -31.5f, -73.5f)
                reflectiveQuadTo(560f, 200f)
                quadToRelative(-33f, 0f, -60f, 15f)
                reflectiveQuadToRelative(-43f, 43f)
                quadToRelative(-6f, 10f, -1f, 21f)
                reflectiveQuadToRelative(17f, 16f)
                quadToRelative(11f, 5f, 21.5f, 1f)
                reflectiveQuadToRelative(17.5f, -14f)
                quadToRelative(9f, -13f, 21f, -19.5f)
                reflectiveQuadToRelative(27f, -6.5f)
                quadToRelative(24f, 0f, 39f, 13.5f)
                reflectiveQuadToRelative(15f, 36.5f)
                quadToRelative(0f, 14f, -8f, 26.5f)
                reflectiveQuadTo(578f, 364f)
                quadToRelative(-29f, 25f, -37f, 38.5f)
                reflectiveQuadTo(531f, 442f)
                quadToRelative(-1f, 12f, 7.5f, 21f)
                reflectiveQuadToRelative(21.5f, 9f)
                close()
                moveTo(320f, 720f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 640f)
                verticalLineToRelative(-480f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(320f, 80f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(880f, 160f)
                verticalLineToRelative(480f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(800f, 720f)
                horizontalLineTo(320f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-480f)
                horizontalLineTo(320f)
                verticalLineToRelative(480f)
                close()
                moveTo(160f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-520f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(160f, 280f)
                verticalLineToRelative(520f)
                horizontalLineToRelative(520f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 880f)
                horizontalLineTo(160f)
                close()
                moveToRelative(160f, -720f)
                verticalLineToRelative(480f)
                verticalLineToRelative(-480f)
                close()
            }
        }.build()
        
        return _Quiz!!
    }

private var _Quiz: ImageVector? = null

