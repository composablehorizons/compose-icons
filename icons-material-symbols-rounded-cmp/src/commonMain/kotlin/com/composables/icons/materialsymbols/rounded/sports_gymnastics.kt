package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Sports_gymnastics: ImageVector
    get() {
        if (_Sports_gymnastics != null) return _Sports_gymnastics!!
        
        _Sports_gymnastics = ImageVector.Builder(
            name = "sports_gymnastics",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(478f, 842f)
                lineToRelative(-18f, -362f)
                lineToRelative(-140f, -40f)
                horizontalLineTo(80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(40f, 400f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 360f)
                horizontalLineToRelative(200f)
                lineToRelative(250f, -179f)
                quadToRelative(13f, -9f, 28f, -7f)
                reflectiveQuadToRelative(26f, 14f)
                quadToRelative(11f, 14f, 9f, 30.5f)
                reflectiveQuadTo(577f, 246f)
                lineToRelative(-131f, 94f)
                horizontalLineToRelative(114f)
                lineToRelative(286f, -165f)
                quadToRelative(11f, -7f, 24.5f, -4f)
                reflectiveQuadToRelative(24.5f, 16f)
                quadToRelative(11f, 12f, 9f, 27.5f)
                reflectiveQuadTo(889f, 240f)
                lineTo(580f, 480f)
                lineToRelative(-18f, 362f)
                quadToRelative(-1f, 16f, -13f, 27f)
                reflectiveQuadToRelative(-31f, 11f)
                quadToRelative(-16f, 0f, -27.5f, -11f)
                reflectiveQuadTo(478f, 842f)
                close()
                moveTo(240f, 320f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 240f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 160f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(320f, 240f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(240f, 320f)
                close()
            }
        }.build()
        
        return _Sports_gymnastics!!
    }

private var _Sports_gymnastics: ImageVector? = null

