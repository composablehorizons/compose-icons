package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Speech_to_text: ImageVector
    get() {
        if (_Speech_to_text != null) return _Speech_to_text!!
        
        _Speech_to_text = ImageVector.Builder(
            name = "speech_to_text",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(680f, 400f)
                quadToRelative(-33f, 0f, -56.5f, -23f)
                reflectiveQuadTo(600f, 320f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -34f, 23.5f, -57f)
                reflectiveQuadToRelative(56.5f, -23f)
                quadToRelative(34f, 0f, 57f, 23f)
                reflectiveQuadToRelative(23f, 57f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 34f, -23f, 57f)
                reflectiveQuadToRelative(-57f, 23f)
                close()
                moveTo(200f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 80f)
                horizontalLineToRelative(280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 120f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 160f)
                horizontalLineTo(200f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(440f)
                verticalLineToRelative(-40f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(680f, 720f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(720f, 760f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(640f, 880f)
                horizontalLineTo(200f)
                close()
                moveToRelative(320f, -160f)
                horizontalLineTo(320f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 680f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 640f)
                horizontalLineToRelative(200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(560f, 680f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(520f, 720f)
                close()
                moveToRelative(-80f, -120f)
                horizontalLineTo(320f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 560f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(320f, 520f)
                horizontalLineToRelative(120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(480f, 560f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(440f, 600f)
                close()
                moveToRelative(240f, -140f)
                quadToRelative(48f, 0f, 84f, -27.5f)
                reflectiveQuadToRelative(50f, -70.5f)
                quadToRelative(5f, -17f, 17f, -29.5f)
                reflectiveQuadToRelative(29f, -12.5f)
                quadToRelative(17f, 0f, 28.5f, 13.5f)
                reflectiveQuadTo(896f, 364f)
                quadToRelative(-14f, 66f, -61.5f, 113f)
                reflectiveQuadTo(720f, 536f)
                verticalLineToRelative(64f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 640f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 600f)
                verticalLineToRelative(-64f)
                quadToRelative(-66f, -12f, -114f, -59f)
                reflectiveQuadToRelative(-62f, -113f)
                quadToRelative(-4f, -17f, 7.5f, -30.5f)
                reflectiveQuadTo(500f, 320f)
                quadToRelative(17f, 0f, 29f, 12.5f)
                reflectiveQuadToRelative(17f, 29.5f)
                quadToRelative(14f, 43f, 50.5f, 70.5f)
                reflectiveQuadTo(680f, 460f)
                close()
            }
        }.build()
        
        return _Speech_to_text!!
    }

private var _Speech_to_text: ImageVector? = null

