package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Airline_seat_recline_extra: ImageVector
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
                moveToRelative(180f, 560f)
                horizontalLineTo(302f)
                quadToRelative(-33f, 0f, -60.5f, -23.5f)
                reflectiveQuadTo(207f, 720f)
                lineToRelative(-78f, -392f)
                quadToRelative(-4f, -19f, 8f, -33.5f)
                reflectiveQuadToRelative(32f, -14.5f)
                quadToRelative(14f, 0f, 25f, 9f)
                reflectiveQuadToRelative(14f, 23f)
                lineToRelative(82f, 408f)
                horizontalLineToRelative(230f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(560f, 760f)
                quadToRelative(0f, 17f, -11.5f, 28.5f)
                reflectiveQuadTo(520f, 800f)
                close()
                moveToRelative(240f, 45f)
                lineToRelative(-96f, -165f)
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
                lineToRelative(120f, 205f)
                quadToRelative(8f, 14f, 3.5f, 30.5f)
                reflectiveQuadTo(815f, 860f)
                quadToRelative(-14f, 8f, -30.5f, 3.5f)
                reflectiveQuadTo(760f, 845f)
                close()
            }
        }.build()
        
        return _Airline_seat_recline_extra!!
    }

private var _Airline_seat_recline_extra: ImageVector? = null

