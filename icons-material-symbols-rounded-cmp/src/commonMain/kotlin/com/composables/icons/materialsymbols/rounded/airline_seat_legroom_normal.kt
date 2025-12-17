package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Airline_seat_legroom_normal: ImageVector
    get() {
        if (_Airline_seat_legroom_normal != null) return _Airline_seat_legroom_normal!!
        
        _Airline_seat_legroom_normal = ImageVector.Builder(
            name = "airline_seat_legroom_normal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 560f)
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
                horizontalLineToRelative(200f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(760f, 440f)
                verticalLineToRelative(280f)
                horizontalLineToRelative(60f)
                quadToRelative(26f, 0f, 43f, 17f)
                reflectiveQuadToRelative(17f, 43f)
                quadToRelative(0f, 26f, -17f, 43f)
                reflectiveQuadToRelative(-43f, 17f)
                horizontalLineTo(680f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(640f, 800f)
                verticalLineToRelative(-240f)
                close()
                moveTo(520f, 680f)
                horizontalLineTo(200f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 600f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(160f, 120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(200f, 160f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(560f, 640f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(520f, 680f)
                close()
            }
        }.build()
        
        return _Airline_seat_legroom_normal!!
    }

private var _Airline_seat_legroom_normal: ImageVector? = null

