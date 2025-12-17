package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Airline_seat_recline_extra: ImageVector
    get() {
        if (_Airline_seat_recline_extra != null) return _Airline_seat_recline_extra!!
        
        _Airline_seat_recline_extra = ImageVector.Builder(
            name = "airline_seat_recline_extra",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(340f, 240f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(260f, 160f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(340f, 80f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(420f, 160f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(340f, 240f)
                close()
                moveTo(223f, 800f)
                lineTo(120f, 280f)
                horizontalLineToRelative(82f)
                lineToRelative(88f, 440f)
                horizontalLineToRelative(270f)
                verticalLineToRelative(80f)
                horizontalLineTo(223f)
                close()
                moveToRelative(557f, 80f)
                lineTo(664f, 680f)
                horizontalLineTo(321f)
                lineToRelative(-57f, -278f)
                quadToRelative(-11f, -48f, 22.5f, -85f)
                reflectiveQuadToRelative(81.5f, -37f)
                quadToRelative(35f, 0f, 63.5f, 21f)
                reflectiveQuadToRelative(36.5f, 57f)
                lineToRelative(44f, 202f)
                horizontalLineToRelative(175f)
                lineToRelative(163f, 280f)
                lineToRelative(-70f, 40f)
                close()
            }
        }.build()
        
        return _Airline_seat_recline_extra!!
    }

private var _Airline_seat_recline_extra: ImageVector? = null

