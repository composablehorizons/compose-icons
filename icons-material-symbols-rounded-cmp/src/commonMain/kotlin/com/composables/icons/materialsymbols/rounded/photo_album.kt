package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Photo_album: ImageVector
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
                moveToRelative(0f, -80f)
                horizontalLineToRelative(480f)
                verticalLineToRelative(-640f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(245f)
                quadToRelative(0f, 12f, -10f, 17.5f)
                reflectiveQuadToRelative(-20f, -0.5f)
                lineToRelative(-49f, -30f)
                quadToRelative(-10f, -6f, -20.5f, -6f)
                reflectiveQuadToRelative(-20.5f, 6f)
                lineToRelative(-49f, 30f)
                quadToRelative(-10f, 6f, -20.5f, 0.5f)
                reflectiveQuadTo(440f, 405f)
                verticalLineToRelative(-245f)
                horizontalLineTo(240f)
                verticalLineToRelative(640f)
                close()
                moveToRelative(200f, -120f)
                lineToRelative(-49f, -66f)
                quadToRelative(-6f, -8f, -16f, -8f)
                reflectiveQuadToRelative(-16f, 8f)
                lineToRelative(-55f, 74f)
                quadToRelative(-8f, 10f, -2f, 21f)
                reflectiveQuadToRelative(18f, 11f)
                horizontalLineToRelative(320f)
                quadToRelative(12f, 0f, 18f, -11f)
                reflectiveQuadToRelative(-2f, -21f)
                lineToRelative(-95f, -127f)
                quadToRelative(-6f, -8f, -16f, -8f)
                reflectiveQuadToRelative(-16f, 8f)
                lineToRelative(-89f, 119f)
                close()
                moveTo(240f, 800f)
                verticalLineToRelative(-640f)
                verticalLineToRelative(640f)
                close()
                moveToRelative(200f, -395f)
                quadToRelative(0f, 12f, 10.5f, 17.5f)
                reflectiveQuadToRelative(20.5f, -0.5f)
                lineToRelative(49f, -30f)
                quadToRelative(10f, -6f, 20.5f, -6f)
                reflectiveQuadToRelative(20.5f, 6f)
                lineToRelative(49f, 30f)
                quadToRelative(10f, 6f, 20f, 0.5f)
                reflectiveQuadToRelative(10f, -17.5f)
                quadToRelative(0f, 12f, -10f, 17.5f)
                reflectiveQuadToRelative(-20f, -0.5f)
                lineToRelative(-49f, -30f)
                quadToRelative(-10f, -6f, -20.5f, -6f)
                reflectiveQuadToRelative(-20.5f, 6f)
                lineToRelative(-49f, 30f)
                quadToRelative(-10f, 6f, -20.5f, 0.5f)
                reflectiveQuadTo(440f, 405f)
                close()
            }
        }.build()
        
        return _Photo_album!!
    }

private var _Photo_album: ImageVector? = null

