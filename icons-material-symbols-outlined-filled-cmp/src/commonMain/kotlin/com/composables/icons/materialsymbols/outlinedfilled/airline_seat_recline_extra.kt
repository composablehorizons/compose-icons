package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Airline_seat_recline_extra: ImageVector
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
                moveToRelative(220f, 560f)
                horizontalLineTo(302f)
                quadToRelative(-33f, 0f, -60.5f, -23.5f)
                reflectiveQuadTo(207f, 720f)
                lineToRelative(-87f, -440f)
                horizontalLineToRelative(82f)
                lineToRelative(88f, 440f)
                horizontalLineToRelative(270f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(220f, 80f)
                lineTo(664f, 680f)
                horizontalLineTo(386f)
                quadToRelative(-29f, 0f, -50.5f, -17.5f)
                reflectiveQuadTo(308f, 616f)
                lineToRelative(-44f, -214f)
                quadToRelative(-11f, -48f, 22.5f, -85f)
                reflectiveQuadToRelative(81.5f, -37f)
                quadToRelative(35f, 0f, 63.5f, 21f)
                reflectiveQuadToRelative(36.5f, 57f)
                lineToRelative(44f, 202f)
                horizontalLineToRelative(130f)
                quadToRelative(21f, 0f, 39f, 11f)
                reflectiveQuadToRelative(29f, 29f)
                lineToRelative(140f, 240f)
                lineToRelative(-70f, 40f)
                close()
            }
        }.build()
        
        return _Airline_seat_recline_extra!!
    }

private var _Airline_seat_recline_extra: ImageVector? = null

