package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Books_movies_and_music: ImageVector
    get() {
        if (_Books_movies_and_music != null) return _Books_movies_and_music!!
        
        _Books_movies_and_music = ImageVector.Builder(
            name = "books_movies_and_music",
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
                verticalLineToRelative(-495f)
                quadToRelative(0f, -25f, 13.5f, -45.5f)
                reflectiveQuadTo(170f, 230f)
                lineToRelative(320f, -128f)
                quadToRelative(40f, -16f, 75f, 8f)
                reflectiveQuadToRelative(35f, 67f)
                verticalLineToRelative(63f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(680f, 320f)
                verticalLineToRelative(80f)
                quadToRelative(-117f, 0f, -198.5f, 81.5f)
                reflectiveQuadTo(400f, 680f)
                quadToRelative(0f, 57f, 22f, 109f)
                reflectiveQuadToRelative(63f, 91f)
                horizontalLineTo(200f)
                close()
                moveToRelative(160f, -640f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(-62f)
                lineToRelative(-160f, 62f)
                close()
                moveTo(680f, 880f)
                quadToRelative(-83f, 0f, -141.5f, -58.5f)
                reflectiveQuadTo(480f, 680f)
                quadToRelative(0f, -83f, 58.5f, -141.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(83f, 0f, 141.5f, 58.5f)
                reflectiveQuadTo(880f, 680f)
                quadToRelative(0f, 83f, -58.5f, 141.5f)
                reflectiveQuadTo(680f, 880f)
                close()
                moveToRelative(-19f, -119f)
                lineToRelative(102f, -64f)
                quadToRelative(10f, -6f, 10f, -17f)
                reflectiveQuadToRelative(-10f, -17f)
                lineToRelative(-102f, -64f)
                quadToRelative(-10f, -6f, -20.5f, -0.5f)
                reflectiveQuadTo(630f, 616f)
                verticalLineToRelative(128f)
                quadToRelative(0f, 12f, 10.5f, 17.5f)
                reflectiveQuadToRelative(20.5f, -0.5f)
                close()
            }
        }.build()
        
        return _Books_movies_and_music!!
    }

private var _Books_movies_and_music: ImageVector? = null

