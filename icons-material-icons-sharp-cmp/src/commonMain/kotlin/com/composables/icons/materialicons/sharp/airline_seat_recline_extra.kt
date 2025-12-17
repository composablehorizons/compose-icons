package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Airline_seat_recline_extra: ImageVector
    get() {
        if (_Airline_seat_recline_extra != null) return _Airline_seat_recline_extra!!
        
        _Airline_seat_recline_extra = ImageVector.Builder(
            name = "airline_seat_recline_extra",
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
                moveTo(5.35f, 5.64f)
                curveToRelative(-0.9f, -0.64f, -1.12f, -1.88f, -0.49f, -2.79f)
                curveToRelative(0.63f, -0.9f, 1.88f, -1.12f, 2.79f, -0.49f)
                curveToRelative(0.9f, 0.64f, 1.12f, 1.88f, 0.49f, 2.79f)
                curveToRelative(-0.64f, 0.9f, -1.88f, 1.12f, -2.79f, 0.49f)
                close()
                moveTo(16f, 19f)
                horizontalLineTo(6.5f)
                lineTo(4f, 7f)
                horizontalLineTo(2f)
                lineToRelative(2.85f, 14f)
                horizontalLineTo(16f)
                verticalLineToRelative(-2f)
                close()
                moveToRelative(0.23f, -4f)
                horizontalLineToRelative(-4.88f)
                lineToRelative(-1.03f, -4.1f)
                curveToRelative(1.58f, 0.89f, 3.28f, 1.54f, 5.15f, 1.22f)
                verticalLineTo(9.99f)
                curveToRelative(-1.63f, 0.31f, -3.44f, -0.27f, -4.69f, -1.25f)
                lineTo(9.14f, 7.47f)
                curveToRelative(-0.23f, -0.18f, -0.49f, -0.3f, -0.76f, -0.38f)
                curveToRelative(-0.32f, -0.09f, -0.66f, -0.12f, -0.99f, -0.06f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-1.23f, 0.22f, -2.05f, 1.39f, -1.84f, 2.61f)
                lineTo(7.44f, 18f)
                horizontalLineToRelative(9.24f)
                lineToRelative(3.82f, 3f)
                lineToRelative(1.5f, -1.5f)
                lineToRelative(-5.77f, -4.5f)
                close()
            }
        }.build()
        
        return _Airline_seat_recline_extra!!
    }

private var _Airline_seat_recline_extra: ImageVector? = null

