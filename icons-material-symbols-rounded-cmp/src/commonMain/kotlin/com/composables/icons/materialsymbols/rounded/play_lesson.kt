package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Play_lesson: ImageVector
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
                moveTo(200f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 80f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 160f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 440f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(680f, 400f)
                verticalLineToRelative(-240f)
                horizontalLineTo(480f)
                verticalLineToRelative(245f)
                quadToRelative(0f, 11f, -10f, 17f)
                reflectiveQuadToRelative(-20f, 0f)
                lineToRelative(-70f, -42f)
                lineToRelative(-70f, 42f)
                quadToRelative(-10f, 6f, -20f, 0f)
                reflectiveQuadToRelative(-10f, -17f)
                verticalLineToRelative(-245f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(200f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(440f, 840f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 880f)
                horizontalLineTo(200f)
                close()
                moveToRelative(520f, 40f)
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
                moveTo(290f, 160f)
                horizontalLineToRelative(200f)
                horizontalLineToRelative(-200f)
                close()
                moveToRelative(-90f, 640f)
                verticalLineToRelative(-640f)
                verticalLineToRelative(262.5f)
                verticalLineToRelative(-42.5f)
                verticalLineToRelative(42.5f)
                verticalLineTo(160f)
                verticalLineToRelative(640f)
                close()
            }
        }.build()
        
        return _Play_lesson!!
    }

private var _Play_lesson: ImageVector? = null

