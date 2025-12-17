package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Airline_seat_legroom_extra: ImageVector
    get() {
        if (_Airline_seat_legroom_extra != null) return _Airline_seat_legroom_extra!!
        
        _Airline_seat_legroom_extra = ImageVector.Builder(
            name = "airline_seat_legroom_extra",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 3f)
                horizontalLineTo(2f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-2f)
                horizontalLineTo(4f)
                close()
                moveToRelative(18.24f, 12.96f)
                lineToRelative(-2.53f, 1.15f)
                lineToRelative(-3.41f, -6.98f)
                curveTo(15.96f, 9.45f, 15.27f, 9f, 14.51f, 9f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                horizontalLineTo(5f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(10f)
                lineToRelative(3.41f, 7f)
                lineToRelative(5.07f, -2.32f)
                lineToRelative(-1.24f, -2.72f)
                close()
            }
        }.build()
        
        return _Airline_seat_legroom_extra!!
    }

private var _Airline_seat_legroom_extra: ImageVector? = null

