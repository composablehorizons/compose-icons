package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Airline_seat_flat_angled: ImageVector
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
                moveTo(362f, 509f)
                lineToRelative(96f, -263f)
                lineToRelative(338f, 123f)
                quadToRelative(63f, 23f, 91f, 82.5f)
                reflectiveQuadToRelative(5f, 122.5f)
                lineToRelative(-41f, 113f)
                lineToRelative(-489f, -178f)
                close()
                moveToRelative(144f, -160f)
                quadToRelative(-8f, 20f, -14.5f, 37.5f)
                reflectiveQuadTo(478f, 424f)
                lineToRelative(-13f, 37f)
                lineToRelative(41f, -112f)
                close()
                moveTo(58f, 526f)
                lineToRelative(27f, -75f)
                lineToRelative(752f, 274f)
                lineToRelative(-27f, 75f)
                lineTo(58f, 526f)
                close()
                moveToRelative(195f, -64f)
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

