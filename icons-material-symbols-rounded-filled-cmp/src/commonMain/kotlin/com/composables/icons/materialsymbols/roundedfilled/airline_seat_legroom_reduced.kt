package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Airline_seat_legroom_reduced: ImageVector
    get() {
        if (_Airline_seat_legroom_reduced != null) return _Airline_seat_legroom_reduced!!
        
        _Airline_seat_legroom_reduced = ImageVector.Builder(
            name = "airline_seat_legroom_reduced",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(620f, 840f)
                quadToRelative(-32f, 0f, -54.5f, -26f)
                reflectiveQuadTo(551f, 757f)
                lineToRelative(49f, -197f)
                horizontalLineTo(320f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 480f)
                verticalLineToRelative(-320f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 120f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(480f, 160f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(197f)
                quadToRelative(40f, 0f, 64f, 32f)
                reflectiveQuadToRelative(13f, 70f)
                lineToRelative(-74f, 258f)
                horizontalLineToRelative(58f)
                quadToRelative(27f, 0f, 44.5f, 16.5f)
                reflectiveQuadTo(800f, 780f)
                quadToRelative(0f, 27f, -16.5f, 43.5f)
                reflectiveQuadTo(740f, 840f)
                horizontalLineTo(620f)
                close()
                moveTo(200f, 680f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 600f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(200f, 160f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(240f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(480f, 640f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(440f, 680f)
                horizontalLineTo(200f)
                close()
            }
        }.build()
        
        return _Airline_seat_legroom_reduced!!
    }

private var _Airline_seat_legroom_reduced: ImageVector? = null

