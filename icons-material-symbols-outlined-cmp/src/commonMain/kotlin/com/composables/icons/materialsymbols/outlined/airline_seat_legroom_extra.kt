package com.composables.icons.materialsymbols.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Outlined.Airline_seat_legroom_extra: ImageVector
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
                moveTo(520f, 680f)
                horizontalLineTo(160f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(80f, 600f)
                verticalLineToRelative(-480f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(216f, 160f)
                lineTo(600f, 560f)
                horizontalLineTo(340f)
                quadToRelative(-50f, 0f, -85f, -35f)
                reflectiveQuadToRelative(-35f, -85f)
                verticalLineToRelative(-320f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(120f)
                quadToRelative(23f, 0f, 42f, 12.5f)
                reflectiveQuadToRelative(30f, 33.5f)
                lineToRelative(136f, 278f)
                lineToRelative(44f, -20f)
                quadToRelative(23f, -11f, 46.5f, -3.5f)
                reflectiveQuadTo(914f, 690f)
                quadToRelative(12f, 23f, 3.5f, 47f)
                reflectiveQuadTo(886f, 772f)
                lineToRelative(-150f, 68f)
                close()
            }
        }.build()
        
        return _Airline_seat_legroom_extra!!
    }

private var _Airline_seat_legroom_extra: ImageVector? = null

