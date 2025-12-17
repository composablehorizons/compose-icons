package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Airline_seat_recline_normal: ImageVector
    get() {
        if (_Airline_seat_recline_normal != null) return _Airline_seat_recline_normal!!
        
        _Airline_seat_recline_normal = ImageVector.Builder(
            name = "airline_seat_recline_normal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 800f)
                horizontalLineTo(320f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 720f)
                verticalLineToRelative(-400f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(320f, 320f)
                verticalLineToRelative(400f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(600f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(560f, 800f)
                close()
                moveTo(460f, 240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(380f, 160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(460f, 80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(540f, 160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(460f, 240f)
                close()
                moveToRelative(180f, 600f)
                verticalLineToRelative(-160f)
                horizontalLineTo(440f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(360f, 600f)
                verticalLineToRelative(-220f)
                quadToRelative(0f, -42f, 29f, -71f)
                reflectiveQuadToRelative(71f, -29f)
                quadToRelative(42f, 0f, 71f, 29f)
                reflectiveQuadToRelative(29f, 71f)
                verticalLineToRelative(180f)
                horizontalLineToRelative(80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(720f, 640f)
                verticalLineToRelative(200f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(680f, 880f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 840f)
                close()
            }
        }.build()
        
        return _Airline_seat_recline_normal!!
    }

private var _Airline_seat_recline_normal: ImageVector? = null

