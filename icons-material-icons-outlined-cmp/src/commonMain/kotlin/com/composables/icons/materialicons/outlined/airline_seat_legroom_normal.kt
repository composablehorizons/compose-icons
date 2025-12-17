package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Airline_seat_legroom_normal: ImageVector
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
                moveTo(5f, 12f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineTo(8f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                close()
                moveToRelative(15.5f, 6f)
                horizontalLineTo(19f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-5f)
                verticalLineTo(3f)
                horizontalLineTo(6f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.build()
        
        return _Airline_seat_legroom_normal!!
    }

private var _Airline_seat_legroom_normal: ImageVector? = null

