package com.composables.icons.materialsymbols.outlinedfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.OutlinedFilled.Airline_seat_flat_angled: ImageVector
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
                moveTo(361f, 509f)
                lineToRelative(96f, -263f)
                lineToRelative(338f, 123f)
                quadToRelative(63f, 23f, 91f, 82.5f)
                reflectiveQuadToRelative(5f, 122.5f)
                lineToRelative(-41f, 113f)
                lineToRelative(-489f, -178f)
                close()
                moveTo(57f, 526f)
                lineToRelative(27f, -75f)
                lineToRelative(752f, 274f)
                lineToRelative(-27f, 75f)
                lineTo(57f, 526f)
                close()
                moveToRelative(196f, -64f)
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

