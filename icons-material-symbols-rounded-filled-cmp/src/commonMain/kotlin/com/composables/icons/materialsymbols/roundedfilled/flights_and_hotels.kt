package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Flights_and_hotels: ImageVector
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
                moveTo(200f, 920f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(160f, 880f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(200f, 520f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(240f, 560f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(520f, 560f)
                horizontalLineToRelative(200f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(800f, 640f)
                verticalLineToRelative(240f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(760f, 920f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(720f, 880f)
                verticalLineToRelative(-40f)
                horizontalLineTo(240f)
                verticalLineToRelative(40f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(200f, 920f)
                close()
                moveToRelative(312f, -614f)
                lineTo(406f, 412f)
                lineToRelative(9f, 58f)
                quadToRelative(1f, 5f, -0.5f, 9f)
                reflectiveQuadToRelative(-5.5f, 8f)
                lineToRelative(-4f, 4f)
                quadToRelative(-8f, 8f, -17.5f, 6f)
                reflectiveQuadTo(373f, 486f)
                lineToRelative(-34f, -64f)
                lineToRelative(-68f, -37f)
                quadToRelative(-8f, -4f, -9f, -12.5f)
                reflectiveQuadToRelative(5f, -14.5f)
                lineToRelative(8f, -8f)
                quadToRelative(2f, -2f, 14f, -5f)
                lineToRelative(60f, 8f)
                lineToRelative(106f, -106f)
                lineToRelative(-188f, -102f)
                quadToRelative(-11f, -5f, -12f, -17f)
                reflectiveQuadToRelative(7f, -20f)
                lineToRelative(7f, -7f)
                quadToRelative(5f, -5f, 10.5f, -6.5f)
                reflectiveQuadToRelative(11.5f, 0.5f)
                lineToRelative(251f, 65f)
                lineToRelative(108f, -108f)
                quadToRelative(12f, -12f, 29f, -12f)
                reflectiveQuadToRelative(29f, 12f)
                quadToRelative(12f, 12f, 12f, 29f)
                reflectiveQuadToRelative(-12f, 29f)
                lineTo(600f, 218f)
                lineToRelative(64f, 250f)
                quadToRelative(2f, 7f, 0.5f, 13f)
                reflectiveQuadToRelative(-6.5f, 11f)
                lineToRelative(-4f, 4f)
                quadToRelative(-9f, 9f, -22f, 7f)
                reflectiveQuadToRelative(-19f, -13f)
                lineTo(512f, 306f)
                close()
            }
        }.build()
        
        return _Flights_and_hotels!!
    }

private var _Flights_and_hotels: ImageVector? = null

