package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Airline_seat_flat_angled: ImageVector
    get() {
        if (_Airline_seat_flat_angled != null) return _Airline_seat_flat_angled!!
        
        _Airline_seat_flat_angled = ImageVector.Builder(
            name = "airline_seat_flat_angled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(851f, 687f)
                lineTo(362f, 509f)
                lineToRelative(96f, -263f)
                lineToRelative(489f, 178f)
                lineToRelative(-96f, 263f)
                close()
                moveTo(506f, 349f)
                lineToRelative(-41f, 112f)
                lineToRelative(41f, -112f)
                close()
                moveToRelative(304f, 451f)
                lineTo(58f, 526f)
                lineToRelative(27f, -75f)
                lineToRelative(752f, 274f)
                lineToRelative(-27f, 75f)
                close()
                moveTo(253f, 462f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                quadToRelative(0f, -50f, 35f, -85f)
                reflectiveQuadToRelative(85f, -35f)
                quadToRelative(50f, 0f, 85f, 35f)
                reflectiveQuadToRelative(35f, 85f)
                quadToRelative(0f, 50f, -35f, 85f)
                reflectiveQuadToRelative(-85f, 35f)
                close()
                moveToRelative(0f, -80f)
                quadToRelative(17f, 0f, 28.5f, -11.5f)
                reflectiveQuadTo(293f, 342f)
                quadToRelative(0f, -17f, -11.5f, -28.5f)
                reflectiveQuadTo(253f, 302f)
                quadToRelative(-17f, 0f, -28.5f, 11.5f)
                reflectiveQuadTo(213f, 342f)
                quadToRelative(0f, 17f, 11.5f, 28.5f)
                reflectiveQuadTo(253f, 382f)
                close()
                moveToRelative(212f, 79f)
                lineToRelative(338f, 124f)
                lineToRelative(42f, -114f)
                lineToRelative(-339f, -122f)
                lineToRelative(-41f, 112f)
                close()
                moveTo(253f, 343f)
                close()
            }
        }.build()
        
        return _Airline_seat_flat_angled!!
    }

private var _Airline_seat_flat_angled: ImageVector? = null

