package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Airline_seat_recline_normal: ImageVector
    get() {
        if (_Airline_seat_recline_normal != null) return _Airline_seat_recline_normal!!
        
        _Airline_seat_recline_normal = ImageVector.Builder(
            name = "airline_seat_recline_normal",
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
                moveTo(7.59f, 5.41f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0f, -2.83f)
                reflectiveCurveToRelative(2.05f, -0.78f, 2.83f, 0f)
                reflectiveCurveToRelative(0.78f, 2.05f, 0f, 2.83f)
                curveToRelative(-0.79f, 0.79f, -2.05f, 0.79f, -2.83f, 0f)
                close()
                moveTo(6f, 16f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineTo(9f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                close()
                moveToRelative(14f, 4.07f)
                lineTo(14.93f, 15f)
                horizontalLineTo(11.5f)
                verticalLineToRelative(-3.68f)
                curveToRelative(1.4f, 1.15f, 3.6f, 2.16f, 5.5f, 2.16f)
                verticalLineToRelative(-2.16f)
                curveToRelative(-1.66f, 0.02f, -3.61f, -0.87f, -4.67f, -2.04f)
                lineToRelative(-1.4f, -1.55f)
                curveToRelative(-0.19f, -0.21f, -0.43f, -0.38f, -0.69f, -0.5f)
                curveToRelative(-0.29f, -0.14f, -0.62f, -0.23f, -0.96f, -0.23f)
                horizontalLineToRelative(-0.03f)
                curveTo(8.01f, 7f, 7f, 8.01f, 7f, 9.25f)
                verticalLineTo(15f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(5.07f)
                lineToRelative(3.5f, 3.5f)
                lineTo(20f, 20.07f)
                close()
            }
        }.build()
        
        return _Airline_seat_recline_normal!!
    }

private var _Airline_seat_recline_normal: ImageVector? = null

