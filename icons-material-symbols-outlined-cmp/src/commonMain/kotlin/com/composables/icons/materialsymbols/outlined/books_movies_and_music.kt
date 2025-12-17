package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Books_movies_and_music: ImageVector
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
                moveTo(160f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(120f, 840f)
                verticalLineToRelative(-558f)
                quadToRelative(0f, -15f, 6f, -25.5f)
                reflectiveQuadToRelative(20f, -16.5f)
                lineToRelative(400f, -160f)
                quadToRelative(20f, -8f, 37f, 5.5f)
                reflectiveQuadToRelative(17f, 34.5f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(40f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(680f, 280f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(207f)
                lineToRelative(80f, 80f)
                horizontalLineTo(160f)
                close()
                moveToRelative(200f, -640f)
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
                moveToRelative(-50f, -100f)
                lineToRelative(160f, -100f)
                lineToRelative(-160f, -100f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(-430f, 20f)
                verticalLineToRelative(-480f)
                verticalLineToRelative(480f)
                close()
            }
        }.build()
        
        return _Books_movies_and_music!!
    }

private var _Books_movies_and_music: ImageVector? = null

