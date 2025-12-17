package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Text_to_speech: ImageVector
    get() {
        if (_Text_to_speech != null) return _Text_to_speech!!
        
        _Text_to_speech = ImageVector.Builder(
            name = "text_to_speech",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 160f)
                horizontalLineTo(160f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(640f, 720f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 760f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(600f, 880f)
                horizontalLineTo(160f)
                close()
                moveToRelative(120f, -160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 680f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 640f)
                horizontalLineToRelative(200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 680f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 720f)
                horizontalLineTo(280f)
                close()
                moveToRelative(0f, -120f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 560f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 520f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 560f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 600f)
                horizontalLineTo(280f)
                close()
                moveToRelative(100f, -160f)
                quadToRelative(-25f, 0f, -42.5f, -17.5f)
                reflectiveQuadTo(320f, 380f)
                verticalLineToRelative(-80f)
                quadToRelative(0f, -25f, 17.5f, -42.5f)
                reflectiveQuadTo(380f, 240f)
                horizontalLineToRelative(60f)
                lineToRelative(92f, -92f)
                quadToRelative(5f, -5f, 12.5f, -8.5f)
                reflectiveQuadTo(560f, 136f)
                quadToRelative(17f, 0f, 28.5f, 12f)
                reflectiveQuadToRelative(11.5f, 29f)
                verticalLineToRelative(326f)
                quadToRelative(0f, 17f, -11.5f, 29f)
                reflectiveQuadTo(560f, 544f)
                quadToRelative(-8f, 0f, -15.5f, -3.5f)
                reflectiveQuadTo(532f, 532f)
                lineToRelative(-92f, -92f)
                horizontalLineToRelative(-60f)
                close()
                moveToRelative(380f, -100f)
                quadToRelative(0f, 33f, -13f, 63f)
                reflectiveQuadToRelative(-37f, 53f)
                quadToRelative(-8f, 8f, -19f, 3f)
                reflectiveQuadToRelative(-11f, -18f)
                verticalLineToRelative(-202f)
                quadToRelative(0f, -12f, 11f, -17.5f)
                reflectiveQuadToRelative(19f, 2.5f)
                quadToRelative(24f, 23f, 37f, 53f)
                reflectiveQuadToRelative(13f, 63f)
                close()
                moveToRelative(80f, 0f)
                quadToRelative(0f, -66f, -33.5f, -122f)
                reflectiveQuadTo(715f, 130f)
                quadToRelative(-15f, -8f, -21f, -23.5f)
                reflectiveQuadToRelative(0f, -30.5f)
                quadToRelative(6f, -16f, 21.5f, -22.5f)
                reflectiveQuadTo(745f, 55f)
                quadToRelative(81f, 42f, 128f, 118f)
                reflectiveQuadToRelative(47f, 167f)
                quadToRelative(0f, 91f, -47f, 167f)
                reflectiveQuadTo(745f, 625f)
                quadToRelative(-14f, 8f, -29.5f, 1.5f)
                reflectiveQuadTo(694f, 604f)
                quadToRelative(-6f, -15f, 0f, -30.5f)
                reflectiveQuadToRelative(21f, -23.5f)
                quadToRelative(58f, -32f, 91.5f, -88f)
                reflectiveQuadTo(840f, 340f)
                close()
            }
        }.build()
        
        return _Text_to_speech!!
    }

private var _Text_to_speech: ImageVector? = null

