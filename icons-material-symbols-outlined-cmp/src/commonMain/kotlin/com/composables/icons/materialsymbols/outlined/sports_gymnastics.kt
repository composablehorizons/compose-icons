package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Sports_gymnastics: ImageVector
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
                moveTo(480f, 880f)
                lineToRelative(-20f, -400f)
                lineToRelative(-140f, -40f)
                horizontalLineTo(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(240f)
                lineToRelative(280f, -200f)
                lineToRelative(52f, 61f)
                lineToRelative(-166f, 119f)
                horizontalLineToRelative(114f)
                lineToRelative(312f, -180f)
                lineToRelative(48f, 56f)
                lineToRelative(-340f, 264f)
                lineToRelative(-20f, 400f)
                horizontalLineToRelative(-80f)
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

