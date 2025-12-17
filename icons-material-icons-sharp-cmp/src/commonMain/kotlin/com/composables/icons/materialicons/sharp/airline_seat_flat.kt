package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Airline_seat_flat: ImageVector
    get() {
        if (_Airline_seat_flat != null) return _Airline_seat_flat!!
        
        _Airline_seat_flat = ImageVector.Builder(
            name = "airline_seat_flat",
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
                moveTo(22f, 7f)
                verticalLineToRelative(6f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineToRelative(13f)
                close()
                moveTo(2f, 14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineTo(2f)
                close()
                moveToRelative(5.14f, -1.9f)
                curveToRelative(1.16f, -1.19f, 1.14f, -3.08f, -0.04f, -4.24f)
                curveToRelative(-1.19f, -1.16f, -3.08f, -1.14f, -4.24f, 0.04f)
                curveToRelative(-1.16f, 1.19f, -1.14f, 3.08f, 0.04f, 4.24f)
                curveToRelative(1.19f, 1.16f, 3.08f, 1.14f, 4.24f, -0.04f)
                close()
            }
        }.build()
        
        return _Airline_seat_flat!!
    }

private var _Airline_seat_flat: ImageVector? = null

