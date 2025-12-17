package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Airline_seat_individual_suite: ImageVector
    get() {
        if (_Airline_seat_individual_suite != null) return _Airline_seat_individual_suite!!
        
        _Airline_seat_individual_suite = ImageVector.Builder(
            name = "airline_seat_individual_suite",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(840f, 680f)
                horizontalLineTo(120f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(40f, 600f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(80f, 280f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(120f, 320f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-240f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(520f, 280f)
                horizontalLineToRelative(240f)
                quadToRelative(66f, 0f, 113f, 47f)
                reflectiveQuadToRelative(47f, 113f)
                verticalLineToRelative(160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(840f, 680f)
                close()
                moveToRelative(-320f, -80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-160f)
                quadToRelative(0f, -33f, -23.5f, -56.5f)
                reflectiveQuadTo(760f, 360f)
                horizontalLineTo(520f)
                verticalLineToRelative(240f)
                close()
                moveToRelative(0f, -240f)
                verticalLineToRelative(240f)
                verticalLineToRelative(-240f)
                close()
                moveTo(280f, 560f)
                quadToRelative(50f, 0f, 85f, -35f)
                reflectiveQuadToRelative(35f, -85f)
                quadToRelative(0f, -50f, -35f, -85f)
                reflectiveQuadToRelative(-85f, -35f)
                quadToRelative(-50f, 0f, -85f, 35f)
                reflectiveQuadToRelative(-35f, 85f)
                quadToRelative(0f, 50f, 35f, 85f)
                reflectiveQuadToRelative(85f, 35f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(240f, 440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(280f, 400f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(320f, 440f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(280f, 480f)
                close()
                moveToRelative(0f, -40f)
                close()
            }
        }.build()
        
        return _Airline_seat_individual_suite!!
    }

private var _Airline_seat_individual_suite: ImageVector? = null

