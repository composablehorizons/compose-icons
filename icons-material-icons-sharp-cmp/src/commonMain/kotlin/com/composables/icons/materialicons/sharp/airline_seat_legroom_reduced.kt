package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Airline_seat_legroom_reduced: ImageVector
    get() {
        if (_Airline_seat_legroom_reduced != null) return _Airline_seat_legroom_reduced!!
        
        _Airline_seat_legroom_reduced = ImageVector.Builder(
            name = "airline_seat_legroom_reduced",
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
                moveTo(19.97f, 21f)
                horizontalLineTo(14f)
                verticalLineToRelative(-3f)
                lineToRelative(1f, -4f)
                horizontalLineTo(6f)
                verticalLineTo(3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                lineToRelative(-2f, 7f)
                horizontalLineToRelative(2.97f)
                verticalLineToRelative(3f)
                close()
                moveTo(5f, 15f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-2f)
                horizontalLineTo(5f)
                close()
            }
        }.build()
        
        return _Airline_seat_legroom_reduced!!
    }

private var _Airline_seat_legroom_reduced: ImageVector? = null

