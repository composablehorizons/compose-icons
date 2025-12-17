package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Airline_seat_legroom_extra: ImageVector
    get() {
        if (_Airline_seat_legroom_extra != null) return _Airline_seat_legroom_extra!!
        
        _Airline_seat_legroom_extra = ImageVector.Builder(
            name = "airline_seat_legroom_extra",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 680f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 600f)
                verticalLineToRelative(-440f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(120f, 120f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(160f, 160f)
                verticalLineToRelative(440f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(520f, 640f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(480f, 680f)
                close()
                moveToRelative(120f, -120f)
                horizontalLineTo(340f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-280f)
                quadToRelative(0f, -17f, 11.5f, -28.5f)
                reflectiveQuadTo(260f, 120f)
                horizontalLineToRelative(160f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(460f, 160f)
                verticalLineToRelative(200f)
                horizontalLineToRelative(120f)
                quadToRelative(23f, 0f, 42f, 12.5f)
                reflectiveQuadToRelative(30f, 33.5f)
                lineToRelative(136f, 278f)
                lineToRelative(44f, -20f)
                quadToRelative(23f, -11f, 46.5f, -3.5f)
                reflectiveQuadTo(914f, 690f)
                quadToRelative(12f, 23f, 3.5f, 47f)
                reflectiveQuadTo(886f, 772f)
                lineToRelative(-115f, 52f)
                quadToRelative(-15f, 7f, -30f, 1f)
                reflectiveQuadToRelative(-22f, -20f)
                lineTo(600f, 560f)
                close()
            }
        }.build()
        
        return _Airline_seat_legroom_extra!!
    }

private var _Airline_seat_legroom_extra: ImageVector? = null

