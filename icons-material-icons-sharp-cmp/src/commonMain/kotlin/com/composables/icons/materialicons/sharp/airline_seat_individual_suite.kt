package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Airline_seat_individual_suite: ImageVector
    get() {
        if (_Airline_seat_individual_suite != null) return _Airline_seat_individual_suite!!
        
        _Airline_seat_individual_suite = ImageVector.Builder(
            name = "airline_seat_individual_suite",
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
                moveTo(7f, 13f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                reflectiveCurveTo(8.65f, 7f, 7f, 7f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                close()
                moveToRelative(16f, -6f)
                horizontalLineTo(11f)
                verticalLineToRelative(7f)
                horizontalLineTo(3f)
                verticalLineTo(7f)
                horizontalLineTo(1f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(22f)
                verticalLineTo(7f)
                close()
            }
        }.build()
        
        return _Airline_seat_individual_suite!!
    }

private var _Airline_seat_individual_suite: ImageVector? = null

