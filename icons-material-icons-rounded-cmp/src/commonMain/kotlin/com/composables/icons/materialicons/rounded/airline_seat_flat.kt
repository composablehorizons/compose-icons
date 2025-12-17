package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Airline_seat_flat: ImageVector
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
                moveTo(22f, 11f)
                verticalLineToRelative(2f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(7f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                close()
                moveTo(2f, 15f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineTo(3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveToRelative(5.14f, -2.9f)
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

