package com.composables.icons.materialsymbols.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Rounded.Airline_seat_flat_angled: ImageVector
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
                moveTo(376f, 471f)
                lineToRelative(55f, -150f)
                quadToRelative(11f, -31f, 41f, -45f)
                reflectiveQuadToRelative(61f, -3f)
                lineToRelative(263f, 96f)
                quadToRelative(63f, 23f, 91f, 82.5f)
                reflectiveQuadToRelative(5f, 122.5f)
                lineToRelative(-27f, 75f)
                quadToRelative(-6f, 16f, -21f, 23f)
                reflectiveQuadToRelative(-31f, 1f)
                lineTo(400f, 523f)
                quadToRelative(-16f, -6f, -23f, -21f)
                reflectiveQuadToRelative(-1f, -31f)
                close()
                moveToRelative(130f, -122f)
                quadToRelative(-8f, 20f, -14.5f, 37.5f)
                reflectiveQuadTo(478f, 424f)
                lineToRelative(-13f, 37f)
                lineToRelative(41f, -112f)
                close()
                moveToRelative(266f, 437f)
                lineTo(95f, 540f)
                quadToRelative(-16f, -5f, -22.5f, -20f)
                reflectiveQuadTo(71f, 489f)
                quadToRelative(5f, -16f, 20.5f, -23f)
                reflectiveQuadToRelative(31.5f, -1f)
                lineToRelative(677f, 246f)
                quadToRelative(16f, 5f, 22.5f, 20f)
                reflectiveQuadToRelative(1.5f, 31f)
                quadToRelative(-5f, 16f, -20.5f, 23f)
                reflectiveQuadToRelative(-31.5f, 1f)
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
                lineToRelative(14f, -38f)
                quadToRelative(11f, -32f, -2.5f, -62f)
                reflectiveQuadTo(769f, 444f)
                lineToRelative(-263f, -95f)
                lineToRelative(-41f, 112f)
                close()
                moveTo(253f, 343f)
                close()
            }
        }.build()
        
        return _Airline_seat_flat_angled!!
    }

private var _Airline_seat_flat_angled: ImageVector? = null

