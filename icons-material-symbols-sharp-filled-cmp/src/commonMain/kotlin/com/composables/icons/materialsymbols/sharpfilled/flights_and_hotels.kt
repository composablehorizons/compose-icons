package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Flights_and_hotels: ImageVector
    get() {
        if (_Flights_and_hotels != null) return _Flights_and_hotels!!
        
        _Flights_and_hotels = ImageVector.Builder(
            name = "flights_and_hotels",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(360f, 720f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(280f, 640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(360f, 560f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(440f, 640f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(360f, 720f)
                close()
                moveTo(160f, 920f)
                verticalLineToRelative(-400f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(240f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(-80f)
                close()
                moveToRelative(470f, -400f)
                lineTo(512f, 306f)
                lineTo(406f, 412f)
                lineToRelative(10f, 68f)
                lineToRelative(-30f, 30f)
                lineToRelative(-47f, -88f)
                lineToRelative(-88f, -48f)
                lineToRelative(30f, -30f)
                lineToRelative(68f, 9f)
                lineToRelative(106f, -106f)
                lineToRelative(-215f, -117f)
                lineToRelative(38f, -38f)
                lineToRelative(264f, 68f)
                lineToRelative(108f, -108f)
                quadToRelative(12f, -12f, 29f, -12f)
                reflectiveQuadToRelative(29f, 12f)
                quadToRelative(12f, 12f, 12f, 29f)
                reflectiveQuadToRelative(-12f, 29f)
                lineTo(600f, 218f)
                lineToRelative(68f, 264f)
                lineToRelative(-38f, 38f)
                close()
            }
        }.build()
        
        return _Flights_and_hotels!!
    }

private var _Flights_and_hotels: ImageVector? = null

