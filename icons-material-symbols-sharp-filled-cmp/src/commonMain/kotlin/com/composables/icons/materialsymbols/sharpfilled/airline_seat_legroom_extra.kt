package com.composables.icons.materialsymbols.sharpfilled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialsymbols.MaterialSymbols
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialSymbols.SharpFilled.Airline_seat_legroom_extra: ImageVector
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
                horizontalLineTo(80f)
                verticalLineToRelative(-560f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(480f)
                horizontalLineToRelative(360f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(216f, 160f)
                lineTo(600f, 560f)
                horizontalLineTo(220f)
                verticalLineToRelative(-440f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(240f)
                horizontalLineToRelative(169f)
                lineToRelative(159f, 324f)
                lineToRelative(98f, -45f)
                lineToRelative(57f, 105f)
                lineToRelative(-207f, 96f)
                close()
            }
        }.build()
        
        return _Airline_seat_legroom_extra!!
    }

private var _Airline_seat_legroom_extra: ImageVector? = null

