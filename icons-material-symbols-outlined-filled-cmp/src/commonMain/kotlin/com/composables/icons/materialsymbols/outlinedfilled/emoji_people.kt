package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Emoji_people: ImageVector
    get() {
        if (_Emoji_people != null) return _Emoji_people!!
        
        _Emoji_people = ImageVector.Builder(
            name = "emoji_people",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 880f)
                verticalLineToRelative(-529f)
                quadToRelative(-91f, -24f, -145.5f, -100.5f)
                reflectiveQuadTo(160f, 80f)
                horizontalLineToRelative(80f)
                quadToRelative(0f, 83f, 53.5f, 141.5f)
                reflectiveQuadTo(430f, 280f)
                horizontalLineToRelative(100f)
                quadToRelative(30f, 0f, 56f, 11f)
                reflectiveQuadToRelative(47f, 32f)
                lineToRelative(181f, 181f)
                lineToRelative(-56f, 56f)
                lineToRelative(-158f, -158f)
                verticalLineToRelative(478f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-240f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(120f, -640f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(400f, 160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(480f, 80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(560f, 160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(480f, 240f)
                close()
            }
        }.build()
        
        return _Emoji_people!!
    }

private var _Emoji_people: ImageVector? = null

