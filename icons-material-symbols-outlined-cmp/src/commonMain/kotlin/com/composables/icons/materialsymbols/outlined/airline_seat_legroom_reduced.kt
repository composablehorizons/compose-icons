package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Airline_seat_legroom_reduced: ImageVector
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
                moveTo(560f, 840f)
                verticalLineToRelative(-120f)
                lineToRelative(40f, -160f)
                horizontalLineTo(320f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(240f, 480f)
                verticalLineToRelative(-360f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(200f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 440f)
                lineToRelative(-80f, 280f)
                horizontalLineToRelative(58f)
                quadToRelative(27f, 0f, 44.5f, 16.5f)
                reflectiveQuadTo(800f, 780f)
                quadToRelative(0f, 27f, -16.5f, 43.5f)
                reflectiveQuadTo(740f, 840f)
                horizontalLineTo(560f)
                close()
                moveToRelative(-80f, -160f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 600f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Airline_seat_legroom_reduced!!
    }

private var _Airline_seat_legroom_reduced: ImageVector? = null

