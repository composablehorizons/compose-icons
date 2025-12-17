package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Photo_frame: ImageVector
    get() {
        if (_Photo_frame != null) return _Photo_frame!!
        
        _Photo_frame = ImageVector.Builder(
            name = "photo_frame",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 840f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(200f, 800f)
                verticalLineToRelative(-40f)
                horizontalLineToRelative(-80f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 680f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(120f, 160f)
                horizontalLineToRelative(720f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(920f, 240f)
                verticalLineToRelative(440f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 760f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(720f, 840f)
                horizontalLineTo(240f)
                close()
                moveToRelative(1f, -240f)
                horizontalLineToRelative(479f)
                quadToRelative(12f, 0f, 18f, -11f)
                reflectiveQuadToRelative(-2f, -21f)
                lineTo(596f, 381f)
                quadToRelative(-6f, -8f, -16f, -8f)
                reflectiveQuadToRelative(-16f, 8f)
                lineTo(440f, 540f)
                lineToRelative(-84f, -101f)
                quadToRelative(-6f, -8f, -15.5f, -7.5f)
                reflectiveQuadTo(325f, 440f)
                lineTo(225f, 568f)
                quadToRelative(-8f, 10f, -2.5f, 21f)
                reflectiveQuadToRelative(18.5f, 11f)
                close()
            }
        }.build()
        
        return _Photo_frame!!
    }

private var _Photo_frame: ImageVector? = null

