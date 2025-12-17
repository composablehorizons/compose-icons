package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Emoji_people: ImageVector
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
                moveTo(360f, 840f)
                verticalLineToRelative(-489f)
                quadToRelative(-83f, -22f, -135.5f, -88f)
                reflectiveQuadTo(162f, 113f)
                quadToRelative(-2f, -14f, 10f, -23.5f)
                reflectiveQuadToRelative(28f, -9.5f)
                quadToRelative(16f, 0f, 28f, 8.5f)
                reflectiveQuadToRelative(14f, 23.5f)
                quadToRelative(11f, 72f, 62f, 120f)
                reflectiveQuadToRelative(126f, 48f)
                horizontalLineToRelative(100f)
                quadToRelative(30f, 0f, 56f, 11f)
                reflectiveQuadToRelative(47f, 32f)
                lineToRelative(153f, 153f)
                quadToRelative(11f, 11f, 11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-11f, 11f, -28f, 11f)
                reflectiveQuadToRelative(-28f, -11f)
                lineTo(600f, 402f)
                verticalLineToRelative(438f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(520f, 840f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(400f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(360f, 840f)
                close()
                moveToRelative(120f, -600f)
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

