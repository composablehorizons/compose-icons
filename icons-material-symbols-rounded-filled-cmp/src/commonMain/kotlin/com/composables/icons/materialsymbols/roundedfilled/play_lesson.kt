package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Play_lesson: ImageVector
    get() {
        if (_Play_lesson != null) return _Play_lesson!!
        
        _Play_lesson = ImageVector.Builder(
            name = "play_lesson",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(380f, 380f)
                lineToRelative(70f, 42f)
                quadToRelative(10f, 6f, 20f, 0.5f)
                reflectiveQuadToRelative(10f, -17.5f)
                verticalLineToRelative(-205f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(440f, 160f)
                horizontalLineTo(320f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(280f, 200f)
                verticalLineToRelative(205f)
                quadToRelative(0f, 12f, 10f, 17.5f)
                reflectiveQuadToRelative(20f, -0.5f)
                lineToRelative(70f, -42f)
                close()
                moveTo(720f, 920f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(520f, 720f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(720f, 520f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(920f, 720f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(720f, 920f)
                close()
                moveToRelative(-19f, -119f)
                lineToRelative(102f, -64f)
                quadToRelative(10f, -6f, 10f, -17f)
                reflectiveQuadToRelative(-10f, -17f)
                lineToRelative(-102f, -64f)
                quadToRelative(-10f, -6f, -20.5f, -0.5f)
                reflectiveQuadTo(670f, 656f)
                verticalLineToRelative(128f)
                quadToRelative(0f, 12f, 10.5f, 17.5f)
                reflectiveQuadToRelative(20.5f, -0.5f)
                close()
                moveTo(200f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 80f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 160f)
                verticalLineToRelative(253.09f)
                quadToRelative(0f, 11.91f, -8.5f, 19.99f)
                quadToRelative(-8.5f, 8.09f, -20.5f, 8.09f)
                quadToRelative(-60f, -1.01f, -112f, 17.17f)
                quadToRelative(-52f, 18.19f, -97f, 63.66f)
                quadToRelative(-38f, 38.12f, -60f, 88.77f)
                quadToRelative(-22f, 50.66f, -22f, 108.83f)
                quadToRelative(0f, 29.09f, 6.5f, 57.68f)
                reflectiveQuadToRelative(17.5f, 54.67f)
                quadToRelative(8f, 17.05f, -1f, 32.55f)
                quadTo(454f, 880f, 436f, 880f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Play_lesson!!
    }

private var _Play_lesson: ImageVector? = null

