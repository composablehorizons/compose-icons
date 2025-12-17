package com.composables.icons.materialsymbols.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.Sharp.Airline_seat_legroom_normal: ImageVector
    get() {
        if (_Airline_seat_legroom_normal != null) return _Airline_seat_legroom_normal!!
        
        _Airline_seat_legroom_normal = ImageVector.Builder(
            name = "airline_seat_legroom_normal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 840f)
                verticalLineToRelative(-280f)
                horizontalLineTo(240f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(280f)
                verticalLineToRelative(360f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(120f)
                horizontalLineTo(640f)
                close()
                moveToRelative(-80f, -160f)
                horizontalLineTo(120f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        
        return _Airline_seat_legroom_normal!!
    }

private var _Airline_seat_legroom_normal: ImageVector? = null

