package com.composables.icons.materialsymbols.roundedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.RoundedFilled.Airline_seat_flat_angled: ImageVector
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
                moveToRelative(395f, 315f)
                lineTo(94f, 540f)
                quadToRelative(-16f, -5f, -22.5f, -20f)
                reflectiveQuadTo(70f, 489f)
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
            }
        }.build()
        
        return _Airline_seat_flat_angled!!
    }

private var _Airline_seat_flat_angled: ImageVector? = null

