package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Airline_seat_legroom_normal: ImageVector
    get() {
        if (_Airline_seat_legroom_normal != null) return _Airline_seat_legroom_normal!!
        
        _Airline_seat_legroom_normal = ImageVector.Builder(
            name = "airline_seat_legroom_normal",
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
                moveTo(5f, 15f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-2f)
                horizontalLineTo(5f)
                close()
                moveToRelative(17f, 3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-5f)
                verticalLineTo(3f)
                horizontalLineTo(6f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                close()
            }
        }.build()
        
        return _Airline_seat_legroom_normal!!
    }

private var _Airline_seat_legroom_normal: ImageVector? = null

