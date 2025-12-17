package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Photo_album: ImageVector
    get() {
        if (_Photo_album != null) return _Photo_album!!
        
        _Photo_album = ImageVector.Builder(
            name = "photo_album",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(480f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 160f)
                verticalLineToRelative(640f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(720f, 880f)
                horizontalLineTo(240f)
                close()
                moveToRelative(200f, -200f)
                lineToRelative(-49f, -65f)
                quadToRelative(-6f, -8f, -16.5f, -8f)
                reflectiveQuadToRelative(-16.5f, 8f)
                lineToRelative(-55f, 74f)
                quadToRelative(-7f, 10f, -1.5f, 20.5f)
                reflectiveQuadTo(319f, 720f)
                horizontalLineToRelative(321f)
                quadToRelative(12f, 0f, 17.5f, -10.5f)
                reflectiveQuadTo(656f, 688f)
                lineToRelative(-95f, -126f)
                quadToRelative(-6f, -8f, -16f, -8f)
                reflectiveQuadToRelative(-16f, 8f)
                lineToRelative(-89f, 118f)
                close()
                moveToRelative(0f, -520f)
                verticalLineToRelative(245f)
                quadToRelative(0f, 12f, 9.5f, 17.5f)
                reflectiveQuadToRelative(20.5f, -0.5f)
                lineToRelative(49f, -29f)
                quadToRelative(10f, -6f, 20.5f, -6f)
                reflectiveQuadToRelative(20.5f, 6f)
                lineToRelative(49f, 29f)
                quadToRelative(11f, 6f, 21f, 0.5f)
                reflectiveQuadToRelative(10f, -17.5f)
                verticalLineToRelative(-245f)
                horizontalLineTo(440f)
                close()
            }
        }.build()
        
        return _Photo_album!!
    }

private var _Photo_album: ImageVector? = null

